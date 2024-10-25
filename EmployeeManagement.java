package EMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class to manage employee operations
public class EmployeeManagement {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Method to add employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    // Method to view an employee's details
    public void viewEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.displayDetails();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Method to remove an employee
    public void removeEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Method to update an employee's information
    public void updateEmployee(int id, String name, String department, double salary) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.updateDetails(name, department, salary);
                System.out.println("Employee details updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Method to get the total number of employees
    public int getTotalEmployees() {
        return employeeList.size();
    }

    // Method to sort employees by salary
    public void sortEmployeesBySalary() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }

        // Sort employees using a comparator based on salary
        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\n--- Employees Sorted by Salary (Ascending Order) ---");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
