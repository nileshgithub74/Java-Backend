package OOps.Encapsulation;

class Employees {
    public int id;
    public String name;
    private int accountBalance;

    // constructor
    public Employees() {
    }

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return this.accountBalance;

    }
}


public class Encapsulation {

    public static void main(String[] args) {

        Employees e = new Employees(13, "Nilesh");
        e.setAccountBalance(12323);
        int res = e.getAccountBalance();
        System.out.println(res);


    }
}

