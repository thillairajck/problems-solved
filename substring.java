import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String a=sc.next();
        System.out.print("Enter the index start:");
        int start=sc.nextInt();
        System.out.print("Enter the index end:");
        int end=sc.nextInt();
        String sub=a.substring(start,end);
        System.out.println("The substring is:"+sub);
    }
}
