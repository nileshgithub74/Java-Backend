package OOps.Abstractions.PaymentServices;

public abstract class PaymentServices {

    abstract void pay(int amount);


    public void paymentSuccess() {
        System.out.println("Payment successfull.");
    }

}
