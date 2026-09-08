import java.util.Scanner;
class Employee {
    String name;
    int empId;
    double basicSalary;
    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }
    void calculateSalary() {
        System.out.println("Salary Calculation");
    }
}
class Payroll extends Employee {
    Payroll(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }
    @Override void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;
        System.out.println("\nEmployee Payroll");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Gross Salary : " + grossSalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Basic Salary: "); 
        double salary = sc.nextDouble(); 
        Payroll p = new Payroll(name, id, salary); 
        p.calculateSalary(); 
    } 
}