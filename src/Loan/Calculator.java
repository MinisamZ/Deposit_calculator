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
}
