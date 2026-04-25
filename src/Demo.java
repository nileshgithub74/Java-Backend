public class Demo {
    public static  void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mysql");
    }

}

class Mysql {
    static {
        System.out.println("static block called"); // run once when the classes  load in the memory;
    }

    {
        System.out.println("Non static block called");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }

}