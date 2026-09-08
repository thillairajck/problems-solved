import java.util.Scanner;
class BankAccount { 
    int accNo;
    double balance;
    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }
    void withdraw(double amount) {
        if(amount <= balance){ 
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else { 
            System.out.println("Insufficient Balance"); 
        }
    }
void displayBalance()
{ System.out.println("Current Balance: " + balance);

} 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Account Number: ");
    int accNo = sc.nextInt();
    System.out.print("Enter Initial Balance: ");
    double balance = sc.nextDouble();
    BankAccount acc = new BankAccount(accNo, balance);
    int choice;
    do { 
        System.out.println("\n1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Exit");
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();
        switch(choice) {
             case 1:
                System.out.print("Enter Deposit Amount: ");
                acc.deposit(sc.nextDouble());
                break;
            case 2:
                System.out.print("Enter Withdrawal Amount: ");
                acc.withdraw(sc.nextDouble());
                break;
            case 3:
                acc.displayBalance();
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
            }
        }while(choice != 4);
    }
}