import java.util.Scanner;

public class dash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i*=2){
            sb.setCharAt(i,'*');
        }
        System.out.println(s);
    }
}
