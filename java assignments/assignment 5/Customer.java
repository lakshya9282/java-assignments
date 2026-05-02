// Account.java
public class Account {
    protected String accNo;
    protected double balance;
    protected String accType;

    public Account(String accNo, double balance, String accType) {
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void createFD(double amount, double years) {
        System.out.println("FD account opened with amount " + amount + " for " + years + " years");
    }

    public void closeAccount() {
        if (balance == 0) {
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Withdraw all money before closing account!");
        }
    }
}