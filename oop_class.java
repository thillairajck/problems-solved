public class oop_class {
    public static void main(String[] args) {
        String a="swiss";
        
        for(int i=0;i<a.length();i++){
            int count=0;
            for(int j=0;j<a.length();j++){
                if((a.charAt(i)==(a.charAt(j)))){
                     count+=1;
                }
            }
            if(count==1){
                System.out.println(a.charAt(i));
                break;
            }
                
        }
        
    }
}
