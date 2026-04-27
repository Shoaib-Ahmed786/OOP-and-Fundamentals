import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String Name;
    private int Id;

    public Employee(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public abstract double CalculateSalary();

    @Override
    public String toString() {
        return "Employee [Name:" + Name + " Id:" + Id + " Salary:" + CalculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double MonthlySalary;

    public FullTimeEmployee(String Name, int Id, double MonthlySalary) {
        super(Name, Id);
        this.MonthlySalary = MonthlySalary;
    }

    @Override
    public double CalculateSalary() {
        return MonthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String Name, int Id, int hoursWorked, double hourlyRate) {
        super(Name, Id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double CalculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> EmployeeList;

    public PayrollSystem() {
        EmployeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        EmployeeList.add(employee);
    }

    public void removeEmployee(int Id) {
        Employee employeeToRemove = null;

        for (Employee employee : EmployeeList) {
            if (employee.getId() == Id) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null) {
            EmployeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : EmployeeList) {
            System.out.println(employee);
        }
    }
}

public class PayRollSystem {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}
