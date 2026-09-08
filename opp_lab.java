import java.util.Scanner;
public class opp_lab {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find the factorial:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println("Factorial of "+n+":"+fact);
    }
}