import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {
    
    public static void main(String[] args) {
        List<Employee> listOfEmployee = Employee.getAllEmployees();

        listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).forEach((key, value) -> System.out.println(String.format("Average salary of %s department is %.2f", key, value)));
    }
}
