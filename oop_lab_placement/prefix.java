import java.util.Scanner;

public class prefix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(sc.nextLine());
        sb.delete(0,5);
        System.out.print(sb);
    }
}
