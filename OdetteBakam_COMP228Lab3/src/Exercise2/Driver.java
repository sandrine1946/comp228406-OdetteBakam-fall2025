/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE2
LAB3
 */
package Exercise2;


import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of game testers to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        GameTester[] testers = new GameTester[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter game tester name: ");
            String name = scanner.nextLine();

            System.out.print("Enter tester type (FullTime/PartTime): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("FullTime")) {
                testers[i] = new FullTimeGameTester(name);
            } else if (type.equalsIgnoreCase("PartTime")) {
                System.out.print("Enter hours worked: ");
                int hours = scanner.nextInt();
                scanner.nextLine(); // consume newline
                testers[i] = new PartTimeGameTester(name, hours);
            } else {
                System.out.println("Invalid type. Defaulting to FullTime.");
                testers[i] = new FullTimeGameTester(name);
            }
        }

        // Display all game tester info
        System.out.println("\n--- Game Tester Information ---");
        for (GameTester tester : testers) {
            tester.displayInfo();
        }

        scanner.close();
    }
}
