package Online_Payment_Gateway;

import Online_Payment_Gateway.Payments.CreditCardPayment;
import Online_Payment_Gateway.Payments.CryptoPayment;
import Online_Payment_Gateway.Payments.PayPalPayment;
import Online_Payment_Gateway.Payments.PaymentMethod;

public class PaymentFactory {
    public static PaymentMethod createPayment(String paymentMethod) {
        return switch (paymentMethod.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            default -> throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        };
    }
}
