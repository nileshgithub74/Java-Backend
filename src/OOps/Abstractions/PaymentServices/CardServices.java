package OOps.Abstractions.PaymentServices;

public class CardServices extends PaymentServices {
    @Override
    void pay(int amount) {
        System.out.println("Paid : " + amount + " using Card");
    }
}
