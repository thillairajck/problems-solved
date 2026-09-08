import java.util.Scanner;
 class Student {
    String name;
    int rollNo; 
    int m1, m2, m3;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();
    }
    void displayResult() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
        String grade;
        if(avg >= 90)
            grade = "A";
        else if(avg >= 75)
            grade = "B";
        else if(avg >= 50)
            grade = "C";
        else 
            grade = "F";
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade : " + grade);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.displayResult(); 
    } 
}