import java.util.List;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Employee.getAllEmployees();
        listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((key,value) -> System.out.println(key+" : "+value.stream().map(employee -> employee.getName()).collect(Collectors.toList())));
    }
}
