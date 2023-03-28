package Collection;

import java.util.*;

class Employee {
    String name;
    float salary;
    String address;
    int age;

    public Employee(String name, float salary, String address, int age) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}


public class EmployeNameGrouping {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Badsna", 15000.0f, "Nala", 21);
        Employee emp2 = new Employee("Rujan", 15000.0f, "ktm", 20);
        Employee emp3 = new Employee("Badsna", 10000.0f, "benepa", 22);
        Employee emp4 = new Employee("Rujan", 1.0f, "ktm", 20);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);


        HashMap<String, List<Employee>> arrayList = new HashMap<>();
        for (Employee employee : list) {

            String name = employee.getName();
            if (!arrayList.containsKey(name)) {
                arrayList.put(name, new ArrayList<>());
            }

            arrayList.get(name).add(employee);
        }

        for (Map.Entry m : arrayList.entrySet()) {
            System.out.println(m);
        }


    }
}
