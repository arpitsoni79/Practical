package arrays.veryFrequent;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {

    String name;
    int age;
    String depatrtment;

    public Employee1(String name, String depatrtment, int age) {
        this.name = name;
        this.depatrtment = depatrtment;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + depatrtment;
    }

    public static void main (String[] args){

        List<Employee1> emp = new ArrayList<>();
        emp.add(new Employee1("Arpit","IT",24));
        emp.add(new Employee1("Ayush","HR",40));
        emp.add(new Employee1("Saransh","maintenance",28));

        List<String> res = emp.stream().filter(e->e.age>25).map(value->value.name + " " + value.age).toList();

        System.out.println(res);

    }
}
