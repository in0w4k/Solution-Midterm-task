package Online_Payment_Gateway.Payments;

public interface PaymentMethod {
    boolean processPayment(int amount);
}
