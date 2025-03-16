package Online_Payment_Gateway;
import Online_Payment_Gateway.Payments.PaymentMethod;
import java.util.Scanner;

public class OnlinePaymentDEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card\n2. PayPal\n3. Crypto");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        String paymentType;
        switch (choice) {
            case 1 -> paymentType = "creditcard";
            case 2 -> paymentType = "paypal";
            case 3 -> paymentType = "crypto";
            default -> {
                System.out.println("Invalid choice.");
                sc.close();
                return;
            }
        };

        PaymentMethod payment = PaymentFactory.createPayment(paymentType);

        System.out.print("Enter payment amount: ");
        int amount = sc.nextInt();

        boolean success = payment.processPayment(amount);
        TransactionLogger.log(paymentType, amount, success);

        System.out.print("View transaction history? (y/n): ");
        String viewHistory = sc.next();
        if (viewHistory.equalsIgnoreCase("y")) {
            TransactionLogger.showHistory();
        }

        sc.close();
    }
}
