package Online_Payment_Gateway.Payments;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean processPayment(int amount) {
        System.out.println("Credit Card Payment Processed: " + amount + "₸");
        return true;
    }
}
