

//Abstract class representing an Employee
abstract class Employee {
 protected int id;
 protected String name;
 protected String department;
 protected double salary;

 // Constructor
 public Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 // Abstract method to display employee details (to be overridden)
 public abstract void displayDetails();

 // Method to update employee details
 public void updateDetails(String name, String department, double salary) {
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }
}

