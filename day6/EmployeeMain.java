import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
      
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Viraj", 500000));
        employeeList.add(new Employee(2, "Raj", 350000));
        employeeList.add(new Employee(3, "Marks", 450000));
        employeeList.add(new Employee(4, "Prerna", 380000));

        System.out.println("Employees with salary > 400000:");
        employeeList.stream()
                .filter(employee -> employee.getSalary() > 400000)
                .forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));

   
        System.out.println("\nEmployees after updating salary by 25%:");
        employeeList.forEach(employee -> {
            double updatedSalary = employee.getSalary() * 1.25;
            employee.setSalary(updatedSalary);
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
        });

       
        List<String> empNames = employeeList.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    
        System.out.println("\nEmployee names in uppercase:");
        empNames.forEach(System.out::println);
    }
}
