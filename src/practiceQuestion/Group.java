package practiceQuestion;

import java.util.*;

public class Group {


    public static <Arraylist> void main(String[] args) {
        boolean flag = true;

        HashMap<String, ArrayList> map = new HashMap<>();


        Employee emp1 = new Employee("Rupesh", "Boudha", 6000);
        Employee emp2 = new Employee("Rupesh", "Chabhail", 7000);

        Employee emp3 = new Employee("Gyalbu", "Jorpati", 6000);
        Employee emp4 = new Employee("Gyalbu", "Bhaktapur", 5000);
        Employee emp5 = new Employee("Rupesh", "Chabhail", 9000);

//Grouping Element by name 1st method.
//        ArrayList<Employee> l = new ArrayList<>();
//        l.add(emp2);
//        l.add(emp3);
//        l.add(emp4);
//        l.add(emp1);
//        l.add(emp5);
//
//        for (int i = 0; i < l.size(); i++) {
//
//            ArrayList<Employee> l1 = new ArrayList<>();
//            Employee a = l.get(i);
//
//            if (map.containsKey(a.getName())) {
//                flag = false;
//                //accessing the value of the key from hashmap
//                ArrayList<Employee> c = map.get(a.getName());
//                c.add(a);
//            } else {
//                l1.add(a);
//                map.put(a.getName(), l1);
//
//            }
//
//        }
//        Set set = map.entrySet();
//
//        Iterator<HashSet> itr = set.iterator();
//
//        while (itr.hasNext()) {
//
//            Map.Entry entry = (Map.Entry) itr.next();
//
//            System.out.println(entry.getKey() + " " + entry.getValue());
//
//        }






    }


}






