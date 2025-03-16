package Online_Payment_Gateway.Payments;

public class CryptoPayment implements PaymentMethod {
    @Override
    public boolean processPayment(int amount) {
        System.out.println("Crypto Payment Processed: " + amount + "₸");
        return Math.random() > 0.33;
    }
}
