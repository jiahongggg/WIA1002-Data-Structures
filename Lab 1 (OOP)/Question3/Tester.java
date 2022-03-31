package Question3;

public class Tester {

    public static void main(String[] args) {

        Account acc = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println(acc.toString());

    }
}
