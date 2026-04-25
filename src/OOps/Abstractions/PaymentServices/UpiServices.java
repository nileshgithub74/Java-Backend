package OOps.Abstractions.PaymentServices;

class UpiServices extends  PaymentServices {


    @Override
    void pay(int amount){
        System.out.println("Amount :"+ amount +" is paid using upi");
    }

}
