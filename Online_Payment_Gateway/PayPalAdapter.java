package Online_Payment_Gateway;
import Online_Payment_Gateway.Payments.PaymentMethod;

public class PayPalAdapter implements PaymentMethod {
    private final PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public boolean processPayment(int amount) {
        return payPalAPI.sendPayment(amount);
    }
}