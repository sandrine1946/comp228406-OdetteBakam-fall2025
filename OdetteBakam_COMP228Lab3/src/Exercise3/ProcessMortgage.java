package Exercise3;
import java.util.Scanner;


// ProcessMortgage class
public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current interest rate: ");
        double currentInterestRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter mortgage details for Mortgage #" + (i + 1));
            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int mortgageType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter mortgage amount: $");
            double mortgageAmount = scanner.nextDouble();

            System.out.print("Enter term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = scanner.nextInt();

            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(i + 1, customerName, mortgageAmount, term);
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(i + 1, customerName, mortgageAmount, term);
            }

            scanner.nextLine(); // Consume newline
        }

        scanner.close();

        System.out.println("\nMortgage Details for " + MortgageConstants.bankName + ":");
        for (Mortgage mortgage : mortgages) {
            mortgage.getMortgageInfo();
            System.out.println();
        }
    }
}
