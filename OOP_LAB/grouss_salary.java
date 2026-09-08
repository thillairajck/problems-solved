import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;
        double deduction = gross * 0.05;
        double net = gross - deduction;
        System.out.println("\nSalary Details");
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Deduction : " + deduction);
        System.out.println("Net Salary : " + net);
    }
}