package Collection;

import java.util.*;

class Employee {
    int id;
    String empName;
    double salary;

    public Employee(int id, String empName, double salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class GroupByName {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Ram", 50000.00);
        Employee emp2 = new Employee(2, "Ram", 40000.00);
        Employee emp3 = new Employee(3, "Shyam", 60000.00);
        Employee emp4 = new Employee(4, "Shyam", 50000.00);
        Employee emp5 = new Employee(5, "Shyam", 30000.00);
        Employee emp6 = new Employee(6, "Shyam", 20000.00);


        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);


        HashMap<String, ArrayList<Employee>> empList = new HashMap<>();
        for (Employee employee : list) {
//            String keyName = employee.getEmpName();
//            if (!empList.containsKey(keyName)) {
//                empList.put(keyName, new ArrayList<>());
//            }
//            empList.get(keyName).add(employee);
            ArrayList<Employee> emp=empList.getOrDefault(employee.getEmpName(), new ArrayList<>());
            emp.add(employee);
            empList.put(employee.getEmpName(),emp);
        }
        for (Map.Entry m : empList.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
