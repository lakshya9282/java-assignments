// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new SavingsAccount("101", 5000, 4.5, 1000);
        Customer c1 = new Customer(1, "Rahul", "PAN123", "AAD123",
                "Mumbai", "01-01-2000", "9999999999");

        LoanAccount loanAcc = new LoanAccount("L101", 0);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Add Nominee\n5. Display Customer\n6. Take Loan\n7. Pay Loan\n8. Close Account\n9. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.credit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    acc.debit(sc.nextDouble());
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter nominee name: ");
                    c1.addNominees(sc.nextLine());
                    break;

                case 5:
                    c1.displayCustomer();
                    break;

                case 6:
                    System.out.print("Enter loan amount: ");
                    loanAcc.takeLoan(sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Enter amount to pay: ");
                    loanAcc.payLoan(sc.nextDouble());
                    break;

                case 8:
                    acc.closeAccount();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}