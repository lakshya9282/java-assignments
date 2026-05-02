
// LoanAccount.java
public class LoanAccount extends Account {
    private double loanAmount;

    public LoanAccount(String accNo, double loanAmount) {
        super(accNo, 0, "Loan");
        this.loanAmount = loanAmount;
    }

    public void takeLoan(double amount) {
        loanAmount += amount;
        System.out.println("Loan taken: " + amount);
    }

    public void payLoan(double amount) {
        if (amount <= loanAmount) {
            loanAmount -= amount;
            System.out.println("Loan paid: " + amount);
        } else {
            System.out.println("Amount exceeds loan!");
        }
    }

    public void showLoan() {
        System.out.println("Remaining Loan: " + loanAmount);
    }
}