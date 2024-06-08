import java.util.Scanner;

public class LabQuiz2SetB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of tickets
        System.out.println("Enter the number of tickets:");
        int numberOfTickets = scanner.nextInt();

        // Base price of the tickets
        double basePrice = 50.0;

        double totalCost = 0.0;

        for (int i = 1; i <= numberOfTickets; i++) {
            // Ask for the age of the ticket holder
            System.out.println("Enter age for ticket " + i + ":");
            int age = scanner.nextInt();

            double finalPrice = basePrice;
            // Check age for discounts
            if (age < 18 || age > 65) {
                finalPrice *= 0.8;  // Apply a 20% discount
            }

            // Print out the final price after discount for this ticket
            System.out.println("Ticket for age " + age + " is priced at " + finalPrice + " after discount.");
            totalCost += finalPrice;
        }

        // Print the total cost
        System.out.println("Total cost for all tickets: " + totalCost);

        scanner.close();
    }
}
