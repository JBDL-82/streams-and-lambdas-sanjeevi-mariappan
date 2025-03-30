import java.util.Comparator;
import java.util.List;

public class Top3Salaries {
    
    
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Employee.getAllEmployees();
        listOfEmployees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
    }
}
