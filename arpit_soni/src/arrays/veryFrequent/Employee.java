package arrays.veryFrequent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    String FirstName;
    String department;
    int age;

    public Employee(String firstName, String department, int age) {
        this.FirstName = firstName;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return  FirstName + " " + department + " " + age;
    }

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Arpit", "dev", 23));
        emp.add(new Employee("Saransh", "management", 27));
        emp.add(new Employee("Ayush", "dev", 30));
        System.out.println(emp);
        
        List<String> res = new ArrayList<>();

        for(Employee employee : emp) {
        
            if (employee.FirstName.startsWith("A")){
                res.add(employee.FirstName);
            }

        }

        System.out.println("Result " + res);

        List<String> resStream = emp
                                .stream()
                                .filter(x -> x.FirstName.startsWith("A"))
                                .map(x-> x.FirstName)
                                .toList();

        System.out.println("Stream " + resStream);

         emp.stream().collect(java.util.stream.Collectors.groupingBy(e->e.department))
                 .entrySet().stream().forEach(entry->
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().stream().map(value->value.FirstName).toList());
        });

    }


}