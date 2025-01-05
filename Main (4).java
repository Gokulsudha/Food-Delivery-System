import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our swiggy food Delivery System");
        System.out.print("Enter the food item what you want to search: ");
        String foodItem = scanner.nextLine();

        System.out.println("Top Hotels for your " + foodItem + ":");
        System.out.println("1. Hotel 1: ANNAPOORNA");
        System.out.println("2. Hotel 2: VALARMATHI");
        System.out.println("3. Hotel 3: GOWRI SHANKAR");

        System.out.print("Enter the hotel number you want to choose: ");
        int hotelChoice = scanner.nextInt();

        switch (hotelChoice) {
            case 1:
                hotel1(scanner, foodItem);
                break;
            case 2:
                hotel2(scanner, foodItem);
                break;
            case 3:
                hotel3(scanner, foodItem);
                break;
            default:
                System.out.println("Invalid choice, Please try again.");
        }
    }

    static void hotel1(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 1: ANNAPOORNA");
        System.out.println("4/5 stars having good rating");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 250");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 10%");
            System.out.println("Total amount: Rs. 150");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 200");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 250));
        System.out.println("THANKS FOR YOUR ORDER,CONTACT US IF ANY ISSUE");
        System.out.println("CONTACT Number : 1256789123");
    }

    static void hotel2(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 2: VALARMATHI");
        System.out.println("5/5 stars");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 120");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 15%");
            System.out.println("Total amount: Rs. 100");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 120");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 120));
        System.out.println("THANKS FOR YOUR ORDER,CONTACT US IF ANY ISSUE");
        System.out.println("CONTACT NUMBER : 9763518298" );
        
    }

    static void hotel3(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 3: GOWRI SHANKAR");
        System.out.println("3/5 stars");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 150");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 20%");
            System.out.println("Total amount: Rs. 120");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 150");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 150));
        System.out.println("THANKS FOR YOUR ORDER,CONTACT US IF ANY ISSUE");
        System.out.println("CONTACT NUMBER : 356712355" );
    }
}