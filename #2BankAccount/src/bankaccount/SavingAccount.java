/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author zhanghexiao
 */
public class SavingAccount extends BasicBankSystem {

    SavingAccount(double startingBalance, double annualInteresRate) {
        super(startingBalance, annualInteresRate);
    }

    public void checkAccountStatus() {
        if (currentBalance < 25) {
            System.out.println("Current balacne is below 25, and the account is inactive.");
            setAccountStatus(false);
        }

    }

    @Override
    public void makeWithdraw(double amount) {
        checkAccountStatus();
        if (accountStatus) {
            super.makeWithdraw(amount);
        } else {
            System.out.println("The account is inactive, the withdraw is not permitted!");
        }

    }

    @Override
    public void makeDeposit(double amount) {
        checkAccountStatus();
        if (accountStatus || amount + currentBalance > 25) {
            setAccountStatus(true);
            super.makeDeposit(amount);
        } else {
            System.out.println("The account is inactive, the deposit is not permitted!");
        }
    }

    @Override
    public void doMonthlyReport() {
        if (numberOfWithdrawals > 4) {
            serviceCharge = serviceCharge + 1 * (numberOfWithdrawals - 4);
        }
        super.doMonthlyReport();
    }

}
