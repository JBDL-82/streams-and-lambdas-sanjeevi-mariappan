import java.util.List;
import java.util.stream.Collectors;

public class PartitionEmployeeByExperience {
    
    public static void main(String[] args) {
        
        List<Employee> listOfEmployee = Employee.getAllEmployees();
        listOfEmployee.stream().collect(Collectors.groupingBy(employee -> employee.getExperience() > 5)).forEach((key, value) -> System.out.println((key ?"Exp > 5":"Exp < 5" )+" : "+value.stream().map(employee -> employee.getName()).collect(Collectors.toList())));
    }
}
