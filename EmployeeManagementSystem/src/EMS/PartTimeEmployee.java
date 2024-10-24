

//Part-time employee class inheriting Employee
public class PartTimeEmployee extends Employee {

 public PartTimeEmployee(int id, String name, String department, double salary) {
     super(id, name, department, salary);
 }

 // Overriding displayDetails method to show part-time employee details
 @Override
 public void displayDetails() {
     System.out.println("Part-Time Employee: " + name + ", Department: " + department + ", Salary: $" + salary);
 }
}

