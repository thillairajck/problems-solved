import java.util.*;

public class evenindex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String a=sc.next();
        for(int i=0;i<a.length();i+=2){
            System.out.print(a.charAt(i));
        }
    }
}
