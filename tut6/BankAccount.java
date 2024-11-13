package PR1.tut6;

public class BankAccount {
    double balance;
    int transactions;
    double interestRate; //lãi suất
    String holderName;
    double amount;

    public BankAccount(double initial, double interestRate, String holderName) {
        this.balance = initial; //số tiền tối thiểu phải gửi vào
        this.transactions = 1;
        this.interestRate = interestRate;
        this.holderName = holderName;
    }
    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }
    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }
    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest() {
        double interest = balance + interestRate/100; //đại diện số tiền nhận đc
        balance += interest; //balance = balance + interest
    }

    public String toString() {
        String output = holderName + ", ";
        if (balance < 0) {
            output += "-$" + String.format("%.2f", -balance);
        } else {
            output += "$" + String.format("%.2f", balance);
        }
        return output;
    }

    public void transfer (BankAccount receiver, double amount) {
        double total = amount + 0.5;
        if (balance < total) {
            System.out.print("Insufficient fund to transfer $" + amount + " to " + receiver.holderName);
        } else {
            this.withdraw(total);
            receiver.deposit(amount);
            System.out.println("Successfully transfer $" + amount + " to " + receiver.holderName + " with $0.5fee");
        }
    }
}