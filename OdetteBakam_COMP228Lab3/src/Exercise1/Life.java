/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE1
LAB3
 */

package Exercise1;

class Life extends Insurance {

    public Life() {
        super("Life Insurance", 80);
    }

    @Override
    public void setInsuranceCost(double cost) {
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
