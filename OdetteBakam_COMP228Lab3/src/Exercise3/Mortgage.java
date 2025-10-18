package Exercise3;

abstract class Mortgage implements MortgageConstants {
    private final int mortgageNumber;
    private final String customerName;
    private final double mortgageAmount;
    private double interestRate;
    private final int term;

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        // Check if the term is valid, set to one year if not
        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        } else {
            this.term = term;
        }

        // Check if the mortgage amount is within limits
        if (mortgageAmount > maxMortgageAmount) {
            this.mortgageAmount = maxMortgageAmount;
        } else {
            this.mortgageAmount = mortgageAmount;
        }
    }

    protected void setBaseInterestRate(double rate) {
        this.interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateTotalAmountOwed() {
        double monthlyInterestRate = interestRate / 12 / 100;
        int numberOfPayments = term * 12;
        return mortgageAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public void getMortgageInfo() {
        System.out.println("Mortgage Number: " + mortgageNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mortgage Amount: $" + mortgageAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + term + " years");
        System.out.println("Total Amount Owed: $" + calculateTotalAmountOwed());
    }
    public abstract void setInterestRate(double rate);
}