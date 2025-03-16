package Online_Payment_Gateway;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private static final List<String> log = new ArrayList<>();

    public static void log(String method, double amount, boolean success) {
        String status;
        if (success) {
            status = "Success";
        } else {
            status = "Failed";
        }
        log.add(method + " | " + amount + "₸ | " + status);
        System.out.println(method + " payment: " + status);
    }

    public static void showHistory() {
        System.out.println("\nTransaction History:");
        log.forEach(System.out::println);
    }
}
