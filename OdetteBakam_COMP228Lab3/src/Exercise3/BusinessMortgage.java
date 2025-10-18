package Exercise3;

// BusinessMortgage class
class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(0.01); // 1% over the current prime rate
    }

    @Override
    public void setInterestRate(double rate) {
        setBaseInterestRate(rate);
    }
}
