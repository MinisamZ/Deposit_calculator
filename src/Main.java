import Loan.NationalBank;
import Loan.SecondTierBank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NationalBank nationalBank = new NationalBank();
        SecondTierBank secondTierBank = new SecondTierBank();
        Scanner scan = new Scanner(System.in);
        String input;
        double money;
        int amountOfDays;
        while (true) {
            System.out.println("================");
            System.out.println("В каком банке вы хотите открыть депозит?" +
                    "\n1. National Bank" +
                    "\n2. Second tier Bank");
            input = scan.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Вы выбрали National Bank! Добро пожаловать!");
                    System.out.println("Введите сумму депозита на которую хотите открыть:");
                    money = scan.nextDouble();
                    System.out.println("Выберите количество дней на которое хотите открыть депозин" +
                            "\n1. 30 дней" +
                            "\n2. 60 дней" +
                            "\n3. 120 дней" +
                            "\n4. 180 дней" +
                            "\n5. 1 год");
                    amountOfDays = scan.nextInt();
                    switch (amountOfDays) {
                        case 1:
                            amountOfDays = 30;
                            break;
                        case 2:
                            amountOfDays = 60;
                            break;
                        case 3:
                            amountOfDays = 120;
                            break;
                        case 4:
                            amountOfDays = 180;
                            break;
                        case 5:
                            amountOfDays = 365;
                            break;
                        default:
                            System.err.println("Неправильный ввод!");
                    }
                    System.out.println("На юр лицо или на физическое лицо" +
                            "\n1. Юр" +
                            "\n2. Физ");
                    scan.nextLine();
                    input = scan.nextLine();
                    System.out.println("Ваша выгода с депозита составляет:");
                    if (input.equals("1"))
                        System.out.println(nationalBank.calculateDeposit(money, amountOfDays, "legalEntity"));
                    else if (input.equals("2"))
                        System.out.println(nationalBank.calculateDeposit(money, amountOfDays, "individual"));
                    else
                        System.err.println("Неправильный ввод!");
                    break;
                case "2":
                    System.out.println("Вы выбрали Second tier Bank! Добро пожаловать!");
                    System.out.println("Введите сумму депозита на которую хотите открыть:");
                    money = scan.nextDouble();
                    System.out.println("Выберите количество дней на которое хотите открыть депозин" +
                            "\n1. 30 дней" +
                            "\n2. 60 дней" +
                            "\n3. 120 дней" +
                            "\n4. 180 дней" +
                            "\n5. 1 год");
                    amountOfDays = scan.nextInt();
                    switch (amountOfDays) {
                        case 1:
                            amountOfDays = 30;
                            break;
                        case 2:
                            amountOfDays = 60;
                            break;
                        case 3:
                            amountOfDays = 120;
                            break;
                        case 4:
                            amountOfDays = 180;
                            break;
                        case 5:
                            amountOfDays = 365;
                            break;
                        default:
                            System.err.println("Неправильный ввод!");
                    }
                    System.out.println("На юр лицо или на физическое лицо" +
                            "\n1. Юр" +
                            "\n2. Физ");
                    scan.nextLine();
                    input = scan.nextLine();
                    System.out.println("Ваша выгода с депозита составляет:");
                    if (input.equals("1"))
                        System.out.println(secondTierBank.calculateDeposit(money, amountOfDays, "legalEntity"));
                    else if (input.equals("2"))
                        System.out.println(secondTierBank.calculateDeposit(money, amountOfDays, "individual"));
                    else
                        System.err.println("Неправильный ввод!");
                    break;
                default:
                    System.err.println("Неправильный ввод!");
            }
        }
        // write your code here
    }
}
