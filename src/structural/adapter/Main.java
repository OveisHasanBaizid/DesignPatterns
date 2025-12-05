package structural.adapter;

public class Main {

    public static void main(String[] args) {
        OldPaymentService oldService = new OldPaymentService();
        PaymentProcessor processor = new PaymentAdapter(oldService);
        processor.pay(10000);
    }
}