class Person { String name; Person(String name) {
    this.name = name; 
} 
} 
class Student extends Person { 
    int rollNo; 
    Student(String name, int rollNo) { 
        super(name); 
        this.rollNo = rollNo; 
    } 
    void displayStudent() { 
        System.out.println("Student Name : " + name); 
        System.out.println("Roll No : " + rollNo); 
    } 
} 
class Faculty extends Person { 
    String department; 
    Faculty(String name, String department) { 
        super(name); 
        this.department = department; 
    } 
    void displayFaculty() {
        System.out.println("Faculty Name : " + name); 
        System.out.println("Department : " + department); 
    } 
} 
class Course { String courseName; Course(String courseName) { 
    this.courseName = courseName; 
} 
void displayCourse() { 
    System.out.println("Course : " + courseName); 
} 
} 
public class inheritance{ 
    public static void main(String[] args) { 
    Student s = new Student("Rahul", 101); 
    Faculty f = new Faculty("Dr. Kumar", "Computer Science"); 
    Course c = new Course("Java Programming"); 
    s.displayStudent(); 
    System.out.println(); 
    f.displayFaculty(); 
    System.out.println(); 
    c.displayCourse(); 
    } 
}