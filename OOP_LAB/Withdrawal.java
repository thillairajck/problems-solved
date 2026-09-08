import java.util.Scanner;
class WithdrawalCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance, withdraw;
        double minimumBalance = 1000;
        System.out.print("Enter Current Balance: ");
        balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        withdraw = sc.nextDouble();
        if(balance - withdraw >= minimumBalance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        else {
            System.out.println("Withdrawal Denied");
            System.out.println("Minimum Balance Must Be Maintained");
        }
    }
}
