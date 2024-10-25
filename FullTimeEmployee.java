package EMS;

//Full-time employee class inheriting Employee
public class FullTimeEmployee extends Employee {

 public FullTimeEmployee(int id, String name, String department, double salary) {
     super(id, name, department, salary);
 }

 // Overriding displayDetails method to show full-time employee details
 @Override
 public void displayDetails() {
     System.out.println("Full-Time Employee: " + name + ", Department: " + department + ", Salary: $" + salary);
 }
}
