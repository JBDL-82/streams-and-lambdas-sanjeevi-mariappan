import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {
    
    
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Employee.getAllEmployees();
        listOfEmployees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).forEach(System.out::println);
    }
}
