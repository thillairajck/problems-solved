import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dsa_class1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String a=sc.next();
        System.out.print("Enter the second string:");
        String b=sc.next();
        Set<Character> set=new HashSet<>();
        boolean f1=true;
        boolean f2=true;
        for(char c:b.toCharArray()){
            boolean f=false;
            for(char d:a.toCharArray()){
                if(c==d){
                    f=true;
                    break;
                }
            }if(f){
                set.add(c);
            }
            else{
                f1=false;
                break;
            }
        }
        for(char c:a.toCharArray()){
            if(!set.contains(c)){
                f2=false;
                break;
            }
        }
        if(f1 && f2){
            System.out.print("Rotation");
        }
        else{
             System.out.print("Not Rotation");
        }
    }
}
