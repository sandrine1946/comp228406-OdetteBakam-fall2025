package Exercise3;

// PersonalMortgage class
class PersonalMortgage extends Mortgage {
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(0.02); // 2% over the current prime rate
    }

    @Override
    public void setInterestRate(double rate) {
        setBaseInterestRate(rate);
    }
}

