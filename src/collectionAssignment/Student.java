package collectionAssignment;

import java.util.*;

public class Student implements Comparable<Student>  {


    String name;
    double marks;


    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    public Student(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    public static void main(String[] args){


        SortedMap<Student,Double> sortedMap=new TreeMap<>();
        Student o1=new Student("Rupesh",100);


        sortedMap.put(o1,o1.getMarks());
        sortedMap.put(new Student("Anuj",100),100.0);
        sortedMap.put(new Student("Gyalbu",90),90.0);


        //Converting in to entry set to traverse through map.
        Set set=sortedMap.entrySet();

        Iterator<Student> itr=set.iterator();

        while(itr.hasNext()){

            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey() +" "+entry.getValue());

        }
    }

    @Override
    public int compareTo(Student o) {
        if (marks >o.marks) {
            return 1;
        } else if (marks < o.marks) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
