package Question4;

import Question3.Account;

import java.util.ArrayList;

public class Account1 extends Account {

    private String name;
    private ArrayList<Transaction> transactions;

    public Account1(String name) {
        this.name = name;
    }

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<>();
    }

    @Override
    public boolean deposit(double money) {
        if (money < 0) {
            return false;
        }
        super.deposit(money);
        transactions.add(new Transaction(getDateCreated(), 'W', money, getBalance(), "RM" + money + " is deposited."));
        return true;
    }

    @Override
    public boolean withdraw(double money) {
        if (money > getBalance()) {
            return false;
        }
        super.withdraw(money);
        transactions.add(new Transaction(getDateCreated(), 'D', money, getBalance(), "RM" + money + " is withdrawn."));
        return true;
    }

    @Override
    public String toString() {
        String str = "Bank Account\n" + "Name: " + name + super.toString();
        for (Transaction e : transactions) {
            str += e.toString() + "\n";
        }
        return str;
    }
}
