package Loan;

public class NationalBank {
    private static final double fixedBankReward = 0.01;
    private Calculator calculator;

    public NationalBank() {
        calculator = new Calculator();
    }

    public double calculateDeposit(double money, int amountOfDays, String person) {
        return calculator.depositReward(money, amountOfDays, person) * fixedBankReward;
    }
}
