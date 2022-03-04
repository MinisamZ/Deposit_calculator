package Loan;

public class SecondTierBank {
    private static final double fixedBankReward = 0.02;
    private Calculator calculator;

    public SecondTierBank() {
        calculator = new Calculator();
    }

    public double calculateDeposit(double money, int amountOfDays, String person) {
        return calculator.depositReward(money, amountOfDays, person) * fixedBankReward;
    }

//    modifier modifier datatype FIXEDBANKREWARD = value;
//    modifier datatype calculator;
//
//    public SecondTierBank(){
//        /*instantiate Calculator object here */
//    }
//
//    modifier returntype calculateDeposit(param1, param2, param3){
//        return calculator.depositReward(param1, param2, param3)* FIXEDBANKREWARD;
//    }


}
