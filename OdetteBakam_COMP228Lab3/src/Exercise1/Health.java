/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE1
LAB3
 */
package Exercise1;

class Health extends Insurance {

    public Health() {
        super("Health Insurance", 20);
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

