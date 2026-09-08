import java.util.Scanner;

public class dsa_class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String:");
        String number=sc.next();
        String r="";
        int l=number.length();
        StringBuilder sb=new StringBuilder(r);
        for(int i=0;i<l-4;i++){
            sb.append('*');
        }
        for(int i=l-4;i<l;i++){
            sb.append(number.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
