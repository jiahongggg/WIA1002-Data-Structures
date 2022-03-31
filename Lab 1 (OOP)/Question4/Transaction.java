package Question4;

import java.util.Date;

public class Transaction {

    private Date date;
    private char type;
    private double amount, balance;
    private String description;

    public Transaction(Date date, char type, double amount, double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nTransaction Date: " + date +
                "\nTransaction Type: " + type +
                "\nAmount: RM" + amount +
                "\nBalance: RM" + balance +
                "\nDescription: " + description;
    }
}
