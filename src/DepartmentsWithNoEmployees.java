import java.util.List;

public class DepartmentsWithNoEmployees {
    
    public static void main(String[] args) {
        List<Employee> listOfEmployee = Employee.getAllEmployees();
        listOfEmployee.stream().filter(employee -> employee.getName().trim().equals("")).map(Employee::getDepartment).forEach(System.out::println);
    }
}
