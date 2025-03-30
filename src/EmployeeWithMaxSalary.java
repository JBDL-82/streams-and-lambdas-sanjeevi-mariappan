import java.util.List;

public class EmployeeWithMaxSalary {

    public static void main(String[] args) {
         List<Employee> listOfEmployees = Employee.getAllEmployees();

    double maxSalary = listOfEmployees.stream()
    .mapToDouble(Employee::getSalary)
    .max()
    .orElse(Double.MIN_VALUE); 

listOfEmployees.stream()
    .filter(emp -> emp.getSalary() == maxSalary) 
    .map(Employee::toString)
    .forEach(System.out::println);
    }
}
