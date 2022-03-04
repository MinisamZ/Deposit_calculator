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

//    modifier modifier datatype FIXEDBANKREWARD = value;
//    modifier datatype calculator;
//
//    public NationalBank(){
//        /*instantiate Calculator object here */
//    }
//
//    modifier returntype calculateDeposit(param1, param2, param3){
//        return calculator.depositReward(param1, param2, param3)* FIXEDBANKREWARD;
//    }


}
