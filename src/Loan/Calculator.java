package Loan;

class Calculator {
    private static final double rateForLegalEntities = 0.08;
    private static final double rateForIndividuals = 0.1;

    protected double depositReward(double money, int amountOfDays, String person) {
        if (person.equals("legalEntity")) {
            return money + money * rateForLegalEntities * amountOfDays / 12.0;

        } else if (person.equals("individual")) {
            return money + money * rateForIndividuals * amountOfDays / 12.0;

        } else {
            System.err.println("error!");
            return 0;
        }
    }


//    modifier modifier datatype RATEFORLEGALENTITIES = value;
//    modifier modifier datatype RATEFORINDIVIDUALS = value;
//    modifier returntype depositReward(param1, param2, param3){
//        if(param3 /*check equality here*/ ("individual")){
//            return param1+ param1*RATEFORINDIVIDUALS* param2/12.0;
//        }else if (param3 /*check equality here*/ ("legalEntity")){
//            return param1+ param1*RATEFORLEGALENTITIES* param2/12.0;
//        }else{
//            System.out.println("error!");
//            return 0;
//        }
//    }


}
