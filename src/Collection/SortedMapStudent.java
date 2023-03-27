package Collection;

import java.util.*;

class Student{
     int id, age;
     String studentName;
    public Student(int id, int age, String studentName) {
         this.id = id;
         this.age = age;
         this.studentName = studentName;
     }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
 class StudentAge implements Comparator{

     @Override
     public int compare(Object o1, Object o2) {
         Integer s1=(Integer) o1;
         Integer s2=(Integer) o2;
         if(s1> s2){
             return 1;
         }
         else if(s1<s2){
             return -1;
         }
         return 0;
     }
 }
public class SortedMapStudent {
    public static void main(String[] args) {
        TreeMap<Integer,Student> studentList=new TreeMap<Integer,Student>(new StudentAge());
        Student student1=new Student(1,21, "Ram");
        Student student2=new Student(2,22, "Sita");
        Student student3=new Student(3,20, "Hanuman");
        Student student4=new Student(3,20, "doremon");

        int age1=student1.getAge();
        int age2=student2.getAge();
        int age3=student3.getAge();
        int age4=student4.getAge();

        studentList.put(age1,student1);
        studentList.put(age2,student2);
        studentList.put(age3,student3);
        studentList.put(age4,student4);

        Set st=studentList.entrySet();
        Iterator itr=st.iterator();
        while(itr.hasNext()){
            Map.Entry m=(Map.Entry) itr.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
