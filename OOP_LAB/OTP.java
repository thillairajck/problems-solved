import java.util.Scanner;
class OTPVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otp = (int)(Math.random() * 9000) + 1000;
        int enteredOtp;
        int attempts = 3;
        System.out.println("Generated OTP: " + otp);
        while(attempts > 0) {
            System.out.print("Enter OTP: ");
            enteredOtp = sc.nextInt();
            if(enteredOtp == otp) {
                System.out.println("OTP Verification Successful");
                return;
            }
            else {
                attempts--;
                System.out.println("Incorrect OTP");
                System.out.println("Remaining Attempts: " + attempts);
            }
        }
        System.out.println("OTP Verification Failed");
    }
}