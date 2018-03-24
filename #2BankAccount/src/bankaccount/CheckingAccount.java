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
public class CheckingAccount extends BasicBankSystem {

    public CheckingAccount(double startingBalance, double annualInteresRate) {
        super(startingBalance, annualInteresRate);
    }

    @Override
    public void makeWithdraw(double amount) {
        if (amount > currentBalance) {
            serviceCharge = serviceCharge + 15;
            System.out.println(" The funds is insufficient, the withdraw is failed");
        } else {
            super.makeWithdraw(amount);
        }

    }

    @Override
    public void doMonthlyReport() {
        serviceCharge = serviceCharge + 5 + 0.10 * numberOfWithdrawals;
        super.doMonthlyReport();

    }
    
    

}
