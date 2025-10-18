/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE1
LAB3
 */

package Exercise1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[2];


        Scanner scanner = new Scanner(System.in);  // Prompt the user to enter the type of insurance and its monthly fee

        for (int i = 0; i < insurances.length; i++) {
            System.out.println("Enter the type of insurance: ");
            String typeOfInsurance = scanner.nextLine();
            System.out.println("Enter the monthly fee: ");
            double monthlyCost = scanner.nextDouble();
            scanner.nextLine();


            if (typeOfInsurance.equals("Health")) {
                insurances[i] = new Health();
            } else if (typeOfInsurance.equals("Life")) {
                insurances[i] = new Life();
            } else {
                System.out.println("Invalid type of insurance");
                return;
            }


            insurances[i].setInsuranceCost(monthlyCost);
        }
    }
}