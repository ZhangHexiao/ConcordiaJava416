/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author zhanghexiao
 */
public class BankAccount {

    public static void main(String[] args) {
        BankAccount java416 = new BankAccount();

        java416.creatAccount();
        java416.bankMenu();

    }

    public void bankMenu() {
        System.out.println("Bank Menu\n" + "A: Savings" + "\n" + "B: Checking" + "\n" + "C: Exit");

    }

    public void creatAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please set the Startingbalance and Annualinterest for Saving account ");
        double savingAccountBalance = getStartingBalance();
        double savingInterest = getAnnualInterest();
        System.out.println("Please set the Startingbalance and Annualinterest for Checking account ");
        double checkingAccountBalance = getStartingBalance();
        double checkingInterest = getAnnualInterest();

        SavingAccount userSavingAccount = new SavingAccount(savingAccountBalance, savingInterest);
        CheckingAccount userCheckingAccount = new CheckingAccount(checkingAccountBalance, checkingInterest);

        mainMenu(userSavingAccount, userCheckingAccount);

    }

    public void mainMenu(SavingAccount saving, CheckingAccount checking) {
        boolean run = true;
        while (run) {
            bankMenu();
            String type = getOperationType("mainmenu");
            char x = type.charAt(0);
            switch (x) {
                case 'a':
                    savingOperation(saving);
                    break;
                case 'b':
                    checkingOperation(checking);
                    break;
                case 'c':
                    run = false;
                    break;
            }

        }

    }

    public void savingOperation(SavingAccount account) {
        System.out.println("Savings Menu");
        operation(account);

    }

    public void checkingOperation(CheckingAccount account) {
        System.out.println("Checking Menu");
        operation(account);
    }

    public void operation(BasicBankSystem account) {
        boolean run = true;
        while (run) {
            System.out.println("A: Deposit" + "\n" + "B: Withdrawal" + "\n" + "C: Report\n" + "D: Return to Bank Menu");
            String operationType = getOperationType("submenu");
            char x = operationType.charAt(0);
            switch (x) {
                case 'a':
                    double amountDeposit = getAmountOfMoney();
                    account.makeDeposit(amountDeposit);
                    break;
                case 'b':
                    double amountWithdraw = getAmountOfMoney();
                    account.makeWithdraw(amountWithdraw);
                    break;
                case 'c':
                    account.doMonthlyReport();
                    break;
                case 'd':
                    run = false;
                    break;

            }
        }

    }

    public double getAnnualInterest() {
        System.out.print("Please input the annual interest of the account");
        Scanner sc = new Scanner(System.in);
        double interest = 0;
        while (true) {
            if (sc.hasNextDouble()) {
                interest = sc.nextDouble();
                if (interest >= 0) {
                    break;
                }
            } else {
                String interestString = sc.next();
                if (interestString.contains("%")) {

                    String interestString2 = interestString.substring(0, interestString.length() - 1);
                    if (isNumeric(interestString2)) {
                        interest = Double.valueOf(interestString2) / 100;
                        break;
                    }
                }

            }
            System.out.println("Unvalid interest, please input again ");
            sc.nextLine();

        }
        System.out.println("The annual interest is " + interest);
        return interest;

    }

    public double getStartingBalance() {
        System.out.print("Please input the starting balance of the account");
        Scanner sc = new Scanner(System.in);
        double startingBalance;
        while (true) {
            if (sc.hasNextDouble()) {
                startingBalance = sc.nextDouble();
                if (startingBalance >= 0) {
                    break;
                }
            }
            System.out.println("Unvalid starting balance, please input again ");
            sc.nextLine();

        }
        System.out.println("The starting balance is " + startingBalance);
        return startingBalance;
    }

    public boolean isNumeric(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public double getAmountOfMoney() {
        System.out.print("Please input the amount of Money");
        Scanner sc = new Scanner(System.in);
        double money;
        while (true) {
            if (sc.hasNextDouble()) {
                money = sc.nextDouble();
                if (money >= 0) {
                    break;
                }
            }
            System.out.println("Unvalid amonut, please input again ");
            sc.nextLine();

        }
        return money;
    }

    public String getOperationType(String menu) {
        System.out.print("Please input the operation you choose(in upper or lower case)");
        Scanner sc = new Scanner(System.in);
        String type;
        String input;
        while (true) {
            input = sc.next();
            type = input.toLowerCase();
            if (menu.equals("mainmenu")) {
                if (type.equals("a") || type.equals("b") || type.equals("c")) {
                    break;

                } else {
                    System.out.println("Unvalid operation, please input again ");
                }
            }
            if (menu.equals("submenu")) {
                if (type.equals("a") || type.equals("b") || type.equals("c") || type.equals("d")) {
                    break;

                } else {
                    System.out.println("Unvalid operation, please input again ");
                }

            }

            sc.nextLine();
        }
        return type;
    }

}
