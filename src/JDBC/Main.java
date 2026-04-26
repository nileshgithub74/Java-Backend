import java.sql.*;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // load and the register the drivers;

        Class.forName("com.mysql.cj.jdbc.Driver"); //oad a class into memory at runtime

        // establish the connections

        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Itsnileshsreyansh@12";
        Connection conn = DriverManager.getConnection(url, user, password);


        // creating the statement

        Statement statement = conn.createStatement();

        // query executions
        String sqlInsert = "INSERT INTO empolyee VALUES ('123', 'Sreyansh', 'Punjab', 'sreyansh@gmail.com')";
        int rowAffect = statement.executeUpdate(sqlInsert);

        if (rowAffect == 0) {
            System.out.println("Unable to insert the data");
        } else {
            System.out.println("Data inserted successfully..!!");
        }


        // close resource
        statement.close();
        conn.close();


    }
}