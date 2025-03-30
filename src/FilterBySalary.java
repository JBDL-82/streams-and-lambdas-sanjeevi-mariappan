import java.util.List;

public class FilterBySalary {
    


    public static void main(String[] args) {
        List<Employee> listOfEmployees = Employee.getAllEmployees();
        listOfEmployees.stream().filter(employee -> employee.getSalary() > 50000).map(employee -> employee.toString()).forEach(System.out::println);
    }
}
