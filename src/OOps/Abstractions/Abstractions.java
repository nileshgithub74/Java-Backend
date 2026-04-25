package OOps.Abstractions;


// abstraction -  it is acheived by  abstract claases or interfacecs;


abstract class Student {
    public String name;
    private int balance;
    protected int id;

    public void display() {
        System.out.println("hello ");
    }

    public abstract void viewmarks();
}


interface payement {
    // method :   by default -.> public + abstract, but before java 8 _> static and default
    // variables : only public static and fina System.out.println(account.getBalance());;

    public static final int balance = 2000;


    public abstract void pay();

    public static void show() {
        System.out.println("Static methods");
    }

    public static void info() {
        System.out.println("ABout the payment details  : ");
    }


}


public class Abstractions {

    public static void main(String[] args) {


    }
}
