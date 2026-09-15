import java.util.*;

public class matrix {
    static Scanner sc=new Scanner(System.in);
    public static void wavetraversal(int[][] a){
        System.out.println("Wave Traversal:");
        for(int j=0;j<a.length;j++){
            if(j%2==0){
                for(int i=0;i<a.length;i++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for(int i=a.length-1;i>=0;i--){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
    public static int[][] rowtocolumnzero(int[][] a){
        System.out.println("Row to Column Zero executed for given matrix.");
        boolean[] row=new boolean[a.length];
        boolean[] col=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
        }
    }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i] || col[j])
                    a[i][j]=0;
            }
        }
        return a;
    }
    public static void antidiagonal(int[][] a){
        System.out.println("Anti Diagonal:");
        int l;
        if(a.length==3){
            l=5;
        }
        else{
            l=7;
        }
        for(int k=0;k<l;k++){
            for(int i=0;i<a.length;i++){
                int j=k-i;
                if((j>=0 && j<3) ||(j>=0 && j<4) ){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void minordiagonalsum(int[][] a){
        int sum=0;
        int j=a.length-1;
        for(int i=0;i<a.length;i++){
            sum+=a[i][j];
            j--;
        }
        System.out.println("Minor Diagonal Sum:"+sum);
    }
    public static void maindiagonalsum(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i][i];
        }
        System.out.println("Main Diagonal sum:"+ sum);
    }
    public static void diagonal(int[][]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i][i]+" ");
        }
    }
    public static void transpose(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void multiply(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int s=0;
                for(int k=0;k<a[i].length;k++){
                    s+=a[i][k]*b[k][j];
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static void addition(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void subraction(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]-b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void display(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rowsum(int[][] a){
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void colsum(int[][] a){
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[j][i];
            }
            System.out.println(sum);
        }
    }
    public static int[][] getmatrix(int a,int b){
        int[][] m=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Enter the value for Matrix["+i+"]["+j+"]:");
                m[i][j]=sc.nextInt();
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("!!! Welcome to matrix calculator !!!");
        System.out.print("Enter the no.of matrix:");
        int d=sc.nextInt();
        System.out.print("Enter the no.of rows for all matrix:");
        int r=sc.nextInt();
        System.out.print("Enter the no.of column for all matrix:");
        int col=sc.nextInt();
        int[][][] array=new int[d][r][col];
        do{
            System.out.print("Enter your option (Type 'exit' for stop):");
            String c=sc.next().toLowerCase();
            switch(c){
                case"getmatrix":
                    for(int i=0;i<d;i++){
                        System.out.println("Enter the matrix "+(i+1)+" :");
                        array[i]=getmatrix(r,col);
                    }                    
                    break;
                case"display":
                    for(int i=0;i<d;i++){
                        System.out.println("matrix "+(i+1)+" :");
                        display(array[i]);
                    }
                    break;
                case"rowsum":
                    for(int i=0;i<d;i++){
                        System.out.println("matrix "+(i+1)+" :");
                        rowsum(array[i]);
                    }
                    break;
                case"colsum":
                    for(int i=0;i<d;i++){
                        System.out.println("matrix "+(i+1)+" :");
                        colsum(array[i]);
                    }
                    break;
                case"addition":
                    System.out.print("Enter matrix 1 number:");
                    int t=sc.nextInt();
                    System.out.print("Enter matrix 2 number:");
                    int y=sc.nextInt();
                    addition(array[t-1],array[y-1]);
                    break;
                case"subraction":
                    System.out.print("Enter matrix 1 number:");
                    int t1=sc.nextInt();
                    System.out.print("Enter matrix 2 number:");
                    int y1=sc.nextInt();
                    subraction(array[t1-1],array[y1-1]);
                    break;
                case"transpose":
                    System.out.print("Enter the matrix number:");
                    int t3=sc.nextInt();
                    transpose(array[t3-1]);
                    break;
                case"multiply":
                    System.out.print("Enter the first matrix number:");
                    int t2=sc.nextInt();
                    System.out.print("Enter the second matrix number:");
                    int y2=sc.nextInt();
                    multiply(array[t2-1],array[y2-1]);
                    break;
                case"maindiagonalsum":
                    System.out.print("Enter the matrix number:");
                    int t4=sc.nextInt();
                    maindiagonalsum(array[t4-1]);
                    break;
                case"minordiagonalsum":
                    System.out.print("Enter the matrix number:");
                    int t5=sc.nextInt();
                    minordiagonalsum(array[t5-1]);
                    break;
                case"antidiagonal":
                    System.out.print("Enter the matrix number:");
                    int t6=sc.nextInt();
                    antidiagonal(array[t6-1]);
                    break;
                case"rowtocolumnzero":
                    System.out.print("Enter the matrix number:");
                    int t7=sc.nextInt();
                    array[t7-1]=rowtocolumnzero(array[t7-1]);
                    break;
                case"wave":
                    System.out.print("Enter the matrix number:");
                    int t8=sc.nextInt();
                    wavetraversal(array[t8-1]);
                    break;
                case"exit":
                    break;
                default:
                    System.out.println("!!! Invaild Input !!!");
            }
            if(c.equals("exit")){
                System.out.println("Thank You!!! for using matrix calculator.");
                break;
            }

        }while(true);
        
    }
}