package Online_Payment_Gateway.Payments;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(int amount) {
        System.out.println("PayPal Payment Processed: " + amount + "₸");
        return amount <= 3000;
    }
}
