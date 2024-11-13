package PR1.tut6;

public class BankAccountDemo {
    public static void main (String[] arg) {
        BankAccount acc1 = new BankAccount(300, 6.5, "John");
        BankAccount acc2 = new BankAccount(200, 6, "Ann");
        acc1.deposit(60);
        acc1.withdraw(100);
        acc1.annualInterest();
        acc1.monthlyFee();
        acc1.transfer(acc2, 20);
        System.out.println(acc1.toString());
        System.out.print(acc2.toString());
    }
}