
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeManagement empManagement = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee Details");
            System.out.println("3. Remove Employee");
            System.out.println("4. Update Employee Information");
            System.out.println("5. Display Total Employees");
            System.out.println("6. Sort Employees by Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Adding Employee
                    System.out.println("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Employee Name: ");
                    String name = sc.next();
                    System.out.println("Enter Department: ");
                    String department = sc.next();
                    System.out.println("Enter Salary: ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter 1 for Full-Time, 2 for Part-Time: ");
                    int type = sc.nextInt();

                    Employee employee;
                    if (type == 1) {
                        employee = new FullTimeEmployee(id, name, department, salary);
                    } else {
                        employee = new PartTimeEmployee(id, name, department, salary);
                    }

                    empManagement.addEmployee(employee);
                    break;

                case 2:
                    // Viewing Employee
                    System.out.println("Enter Employee ID to view: ");
                    int viewId = sc.nextInt();
                    empManagement.viewEmployee(viewId);
                    break;

                case 3:
                    // Removing Employee
                    System.out.println("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    empManagement.removeEmployee(removeId);
                    break;

                case 4:
                    // Updating Employee
                    System.out.println("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.println("Enter New Name: ");
                    String newName = sc.next();
                    System.out.println("Enter New Department: ");
                    String newDept = sc.next();
                    System.out.println("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    empManagement.updateEmployee(updateId, newName, newDept, newSalary);
                    break;

                case 5:
                    // Display total employees
                    int total = empManagement.getTotalEmployees();
                    System.out.println("Total Employees: " + total);
                    break;

                case 6:
                    // Sorting employees by salary
                    empManagement.sortEmployeesBySalary();
                    break;

                case 7:
                    // Exiting
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

