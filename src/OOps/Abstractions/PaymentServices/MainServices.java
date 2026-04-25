package OOps.Abstractions.PaymentServices;

public class MainServices {

    public static  void main(String[] args){
        PaymentRequest pr = new PaymentRequest(1000, "Nilesh");
        System.out.println( pr.getAmountDetails());
        System.out.println( pr.getName());



        PaymentServices card = new CardServices();
        card.pay(100);
        card.paymentSuccess();

        PaymentServices  upi = new CardServices();
        upi.pay(20000);
        upi.paymentSuccess();


    }
}
