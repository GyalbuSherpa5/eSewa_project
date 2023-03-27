import java.util.*;

class Student{
    int age;
    String student_name;
    float student_marks;

    public Student(int age, String student_name, float student_marks) {
        this.age = age;
        this.student_name = student_name;
        this.student_marks = student_marks;
    }

    public float getStudent_marks() {
        return student_marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", student_name='" + student_name + '\'' +
                ", student_marks=" + student_marks +
                '}';
    }
}
class StudentMarks implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Float s1=(Float) o1;
        Float s2=(Float) o2;
        if(s1<s2){
            return -1;
        }
        else if(s1>s2){
            return 1;
        }
        return 0;
    }
}
public class SortingMap {
    public static void main(String[] args) {
        TreeMap<Float,Student> treeSet=new TreeMap<Float,Student>(new StudentMarks());
        Student s1=new Student(21,"badsna",25.0f);
        Student s2=new Student(20,"badsn",26.0f);
        Student s3=new Student(25,"bads",20.0f);

        float marks1=s1.getStudent_marks();
        float marks2=s2.getStudent_marks();
        float marks3=s3.getStudent_marks();

        treeSet.put(marks1,s1);
        treeSet.put(marks2,s2);
        treeSet.put(marks3,s3);

        Set std=treeSet.entrySet();
        Iterator iterator=std.iterator();
        while(iterator.hasNext()){
            Map.Entry m=(Map.Entry)iterator.next();
            System.out.println(m.getKey() + " " +m.getValue());
        }



    }
}
