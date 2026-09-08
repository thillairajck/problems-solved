import java.util.Scanner;

public class count_vowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String 1:");
        String s=sc.next();
        System.out.print("Enter the String 2:");
        String t=sc.next();
        if(s.equals(t)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}