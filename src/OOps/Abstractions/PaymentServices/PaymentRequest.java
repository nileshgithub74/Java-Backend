package OOps.Abstractions.PaymentServices;

public class PaymentRequest {
    private int amount;
    private String name;

    public PaymentRequest(int amount, String name) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmountDetails() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
