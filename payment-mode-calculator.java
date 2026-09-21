import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String customerName;
        System.out.println("Customer Name:");
        customerName = scanner.nextLine();

        String productId;
        System.out.println("Product ID:");
        productId = scanner.nextLine();

        String productDescription;
        System.out.println("Product Description:");
        productDescription = scanner.nextLine();

        int amount;
        System.out.println("Amount:");
        amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("***************************");
        int paymentMode;
        System.out.println("Enter Mode of Payment:");
        paymentMode = scanner.nextInt();
        System.out.println("***************************");

        double totalPayment;

        switch (paymentMode) {
            case 1:
                System.out.println("Cash payment");
                System.out.println("Customer Name: " + customerName);
                System.out.println("Total: " + amount);
                break;

            case 2:
                System.out.println("6 months Installment (5% interest)");
                System.out.println("Customer Name: " + customerName);
                totalPayment = amount + (amount * 0.05);
                System.out.println("Total: " + totalPayment);
                System.out.println("Monthly Dues: " + totalPayment / 6);
                break;

            case 3:
                System.out.println("12 months Installment (10% interest)");
                System.out.println("Customer Name: " + customerName);
                totalPayment = amount + (amount * 0.10);
                System.out.println("Total: " + totalPayment);
                System.out.println("Monthly Dues: " + totalPayment / 12);
                break;

            default:
                System.out.println("INVALID!");
                break;
        }
    }
}
