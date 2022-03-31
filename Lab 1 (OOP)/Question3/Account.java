package Question3;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return java.util.Calendar.getInstance().getTime();
    }

    public Double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }

    public Double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public boolean withdraw(double money) {
        if (money > balance) {
            return false;
        }
        balance -= money;
        return true;
    }

    public boolean deposit(double money) {
        if (money < 0) {
            return false;
        }
        balance += money;
        return true;
    }

    @Override
    public String toString() {
        return "\nAccount number: " + id +
                "\nBalance: RM" + balance +
                "\nMonthly Interest Rate: RM" + getMonthlyInterest() +
                "\nDate Created: " + getDateCreated();
    }
}
