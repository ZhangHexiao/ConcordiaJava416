/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author zhanghexiao
 */
public abstract class BasicBankSystem {

    protected boolean accountStatus = true;
    protected double startingBalance;
    protected double currentBalance;
    protected double annualInteresRate;
    protected double totalOfDeposites = 0;
    protected int numberOfDeposits = 0;
    protected double totalOfWithdrawals = 0;
    protected int numberOfWithdrawals = 0;
    protected double serviceCharge = 0;

    BasicBankSystem(double startingBalance, double annualInteresRate) {
        this.startingBalance = startingBalance;
        this.annualInteresRate = annualInteresRate;
        currentBalance = startingBalance;
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;

    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getTotalOfDeposites() {
        return totalOfDeposites;
    }

    public void setTotalOfDeposites(double totalOfDeposites) {
        this.totalOfDeposites = totalOfDeposites;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public void setNumberOfDeposits(int numberOfDeposits) {
        this.numberOfDeposits = numberOfDeposits;
    }

    public double getTotalOfWithdrawals() {
        return totalOfWithdrawals;
    }

    public void setTotalOfWithdrawals(double totalOfWithdrawals) {
        this.totalOfWithdrawals = totalOfWithdrawals;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getAccountStatus() {
        if (accountStatus)
            return "active";
        else
        return "inactive";
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void makeDeposit(double amount) {
        numberOfDeposits++;
        currentBalance = currentBalance + amount;
        totalOfDeposites = totalOfDeposites + amount;
        System.out.println("Deposit "+moneyformat(amount)+" Successfully");
    }

    public void makeWithdraw(double amount) {
        numberOfWithdrawals++;
        currentBalance = currentBalance - amount;
        totalOfWithdrawals = totalOfWithdrawals + amount;
        System.out.println("Withdraw "+moneyformat(amount)+" Successfully");
    }

    public void calculateInterest() {
        currentBalance = currentBalance + currentBalance * annualInteresRate / 12;

    }
    
    public double getInterest(){
        double interest;
        interest = currentBalance * annualInteresRate / 12;
        return interest;
    }
    
       private String moneyformat(double amountOfMoney) {
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        money.setMaximumFractionDigits(2);
        money.setMinimumFractionDigits(2);
        String localFormatOfMoney = money.format(amountOfMoney);
        return localFormatOfMoney;

    } 
    
    

    public void doMonthlyReport() {
        currentBalance = currentBalance - serviceCharge;
        calculateInterest();
        System.out.println("\n");
        System.out.println("The starting balance is "+moneyformat(startingBalance));
        System.out.println("The current balance is "+moneyformat(currentBalance));
        System.out.println("The total of deposites is "+moneyformat(totalOfDeposites));
        System.out.println("The total of withdrawals is "+moneyformat(totalOfWithdrawals));
        System.out.println("The service charge is "+moneyformat(serviceCharge));
        System.out.println("The interests is "+moneyformat(getInterest()));
        System.out.println("The account status is "+getAccountStatus());
        System.out.println("The number of deposits is "+numberOfDeposits);
        System.out.println("The number of withdrawals "+numberOfWithdrawals);
        
        setStartingBalance(currentBalance);
        setTotalOfDeposites(0);
        setTotalOfWithdrawals(0);
        setNumberOfDeposits(0);
        setNumberOfWithdrawals(0);
        setServiceCharge(0);   
        
        System.out.println("End");

    }

}
