package OOps.Encapsulation;


class BankAccount {
    private double balance;

    public BankAccount(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = balance;
        }
    }

    // deposit money

    public void depositMoney(double balance) {
        if (balance > 0) {
            this.balance += balance;
        }
    }

    // withdraw

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }

    }

    // view balance ;
    public double getBalance() {
        return balance;
    }


}


public class BankApplication {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial amount : " + account.getBalance());
        account.depositMoney(2000);
        System.out.println("Total amount: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Balance :" + account.getBalance());


    }

}
