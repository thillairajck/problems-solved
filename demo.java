
import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        int[] arr=new int[50];
        int n;
        String C;
        int pos;
        int val;
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n=sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("enter the value for element "+(i+1)+" : ");    
            arr[i]=sc.nextInt();
        }
        do{
            System.out.println("Enter the your choice:");
            C=sc.next();
            C=C.toLowerCase();
            switch(C){
                case "display":
                    for (int j = 0; j < n; j++)
                        System.out.println("arr["+j+"] is "+arr[j]);
                    break;
                case "insert":
                    System.out.println("Enter the position:");
                    pos=sc.nextInt();
                    System.out.println("Enter the value to insert:");
                    val=sc.nextInt();
                    for (int i=n;i>pos;i--)
                        arr[i]=arr[i-1];
                    arr[pos]=val;
                    n++;
                    break;
                case "delete":
                    System.out.println("Enter the position to delete:");
                    pos=sc.nextInt();
                    for(int i=pos;i<n-1;i--)
                        arr[i]=arr[i+1];
                    n--;
                    break;
                case "update":
                    System.out.println("Enter the position to update:");
                    pos=sc.nextInt();
                    System.out.println("Enter the value for position "+pos+" :");
                    val=sc.nextInt();
                    arr[pos]=val;
                    break;
                case "search":
                    System.out.println("enter the value to search:");
                    key=sc.nextInt();
                    boolean flag=false;
                    for (int i = 0; i < n; i++) {
                        if(arr[i]==key){
                            System.out.println("The value is found in index "+i+".");
                            flag=true;
                            break;
                        }
                    }
                    if(!flag)
                        System.out.println("Element not found in array.");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("!!! Invalid input !!!");
                    break;
            }
            if(C.equals("exit"))
                break;
        }while(true);
    } 
}