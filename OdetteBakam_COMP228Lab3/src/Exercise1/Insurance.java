
/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE1
LAB3
 */

package Exercise1;

abstract class Insurance {
    private final String typeOfInsurance;
    private double monthlyCost;

    public Insurance(String typeOfInsurance, double monthlyCost) {
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }
    // Abstract methods
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();


    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }


    protected void setMonthlyCost(double cost) {
        this.monthlyCost = cost;
    }
}