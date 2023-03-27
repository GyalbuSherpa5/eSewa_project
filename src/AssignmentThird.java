import java.util.SortedMap;
import java.util.TreeMap;


class Student implements Comparable {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;

    }

    public int getMarks() {
        return marks;

    }

    public String toString() {
        return name + " " + marks;
    }

    @Override
    public int compareTo(Object o) {
        Student e = (Student) o;

        return this.name.compareTo(e.name);
    }
}

public class AssignmentThird {
    public static void main(String[] args) {
        SortedMap<Student, Integer> stud = new TreeMap<>();
        Student st1 = new Student("Anuj", 74);
        Student st2 = new Student("Ravi", 67);
        Student st3 = new Student("Henry", 90);
        Student st4 = new Student("Kasyap", 78);
        int mark1 = st1.getMarks();
        int mark2 = st2.getMarks();
        int mark3 = st3.getMarks();
        int mark4 = st4.getMarks();

        stud.put(st1, mark1);
        stud.put(st2, mark2);
        stud.put(st3, mark3);
        stud.put(st4, mark4);
        System.out.println(stud);


    }
}


