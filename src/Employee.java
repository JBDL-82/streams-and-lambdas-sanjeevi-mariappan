import java.util.List;

class Employee{
    private String name;
    private double salary;
    private String department;
    private int experience;

    public Employee(String name, double salary, String department, int experience){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public int getExperience(){
        return experience;
    }

    public static List<Employee> getAllEmployees(){
        return List.of(   new Employee("Alice Johnson", 55000.0, "HR", 5),
        new Employee("Bob Smith", 62000.0, "IT", 8),
        new Employee("Charlie Brown", 48000.0, "Finance", 3),
        new Employee("David Lee", 75000.0, "Engineering", 10),
        new Employee("Emma Wilson", 53000.0, "Marketing", 4),
        new Employee("Frank Thomas", 68000.0, "Sales", 7),
        new Employee("Grace Miller", 57000.0, "HR", 6),
        new Employee("Hannah White", 60000.0, "IT", 5),
        new Employee("Isaac Martin", 72000.0, "Engineering", 9),
        new Employee("Jack Taylor", 54000.0, "Finance", 4),
        new Employee("Katie Anderson", 51000.0, "Marketing", 3),
        new Employee("Liam Harris", 49000.0, "Sales", 2),
        new Employee("Mia Clark", 63000.0, "HR", 6),
        new Employee("Noah Lewis", 71000.0, "IT", 9),
        new Employee("Olivia Scott", 69000.0, "Engineering", 8),
        new Employee("Paul Walker", 66000.0, "Finance", 7),
        new Employee("Quinn Adams", 47000.0, "Marketing", 2),
        new Employee("Ryan Nelson", 52000.0, "Sales", 3),
        new Employee("Sophia Carter", 58000.0, "HR", 5),
        new Employee("Thomas Roberts", 73000.0, "IT", 10),
        new Employee("Uma Martinez", 55000.0, "Engineering", 5),
        new Employee("Victor Gonzalez", 62000.0, "Finance", 6),
        new Employee("Will Evans", 60000.0, "Marketing", 5),
        new Employee("Xavier Hall", 74000.0, "Sales", 9),
        new Employee("Yara Allen", 51000.0, "HR", 3),
        new Employee("Zachary Young", 77000.0, "IT", 11),
        new Employee("Ava Hernandez", 49000.0, "Engineering", 2),
        new Employee("Ben King", 53000.0, "Finance", 4),
        new Employee("Catherine Wright", 61000.0, "Marketing", 6),
        new Employee("Daniel Lopez", 68000.0, "Sales", 7),
        new Employee("Ethan Green", 56000.0, "HR", 5),
        new Employee("Fiona Baker", 70000.0, "IT", 9),
        new Employee("George Phillips", 59000.0, "Engineering", 6),
        new Employee("Holly Campbell", 64000.0, "Finance", 7),
        new Employee("Ian Mitchell", 57000.0, "Marketing", 5),
        new Employee("Julia Carter", 65000.0, "Sales", 7),
        new Employee("Kevin Cooper", 75000.0, "HR", 10),
        new Employee("Laura Murphy", 48000.0, "IT", 3),
        new Employee("Michael Sanchez", 73000.0, "Engineering", 9),
        new Employee("Natalie Ramirez", 52000.0, "Finance", 4),
        new Employee("Oscar Turner", 68000.0, "Marketing", 7),
        new Employee("Penny Parker", 66000.0, "Sales", 6),
        new Employee("Quentin Reed", 71000.0, "HR", 8),
        new Employee("Rachel Bell", 49000.0, "IT", 3),
        new Employee("Samuel Collins", 62000.0, "Engineering", 6),
        new Employee("Tina Foster", 54000.0, "Finance", 5),
        new Employee("Umar Ward", 77000.0, "Marketing", 11),
        new Employee("Vera Cox", 58000.0, "Sales", 5),
        new Employee("William Hughes", 69000.0, "HR", 8),
        new Employee("",0,"Legal", 0)
        );
    }

    @Override
    public String toString() {
       return String.format("%s from %s draws salary of %f", name,department,salary);
    }
}