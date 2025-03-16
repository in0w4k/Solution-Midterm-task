package Online_Payment_Gateway;

public class PayPalAPI {
    public boolean sendPayment(double amount) {
        System.out.println("Sending request to PayPal API for amount: " + amount);
        return Math.random() > 0.1;
    }
}
