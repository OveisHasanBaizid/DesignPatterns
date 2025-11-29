package adapter;

public class PaymentAdapter implements PaymentProcessor {

    private final OldPaymentService oldService;

    public PaymentAdapter(OldPaymentService oldService) {
        this.oldService = oldService;
    }

    @Override
    public void pay(int amount) {
        oldService.payInRials(amount);
    }
}