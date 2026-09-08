
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class main{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        for(char b:s.toCharArray()){
            if(!map.containsKey(b)){
                map.put(b,1);
            }
            else{
                map.put(b,map.getOrDefault(b,0)+1);
            }
        }
        for(char b:s.toCharArray()){
            if(map.get(b)==1){
                System.out.println(b);
                break;
            }
        }
    }
}