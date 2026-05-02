// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;
    private double minBalance;

    public SavingsAccount(String accNo, double balance, double interestRate, double minBalance) {
        super(accNo, balance, "Savings");
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    @Override
    public void debit(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance violation!");
        }
    }
}