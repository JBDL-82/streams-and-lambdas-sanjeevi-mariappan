import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameInitialMap {
    
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Employee.getAllEmployees();
        listOfEmployees.stream().filter(employee -> !employee.getName().trim().equals("")).collect(Collectors.groupingBy(employee -> employee.getName().charAt(0))).forEach((key, value) -> System.out.println(key+ ": "+ value.stream().map(Employee::getName).collect(Collectors.toList())));
    }
}
