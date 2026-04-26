package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

        Students students = new Students();
        students.setId(1);
        students.setName("Nilesh");
        students.setTech("Java Spring Boot");

        System.out.println(students);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Students.class);
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        //  START transaction FIRST
        Transaction transaction = session.beginTransaction();

        //  THEN persist
        session.persist(students);


        transaction.commit();

        session.close();
        factory.close();
    }
}