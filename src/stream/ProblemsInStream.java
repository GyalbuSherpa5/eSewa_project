package stream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProblemsInStream {

    public static void main(String[] args) {

        //creating student object.
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);


        //Getting student with exact name
         //using streams methods in collection to process elements of collection and filter the student which name is equals to ?
        // using lambda expression and getting the student which is found at first.
         Optional<Student> stud=students.stream().filter(student -> student.getName().equals("Jayesh")).findFirst();
         //checking stud is present in collection and accessing the name of the student.
        System.out.println(stud.isPresent() ?stud.get().getName(): "no student found");
        System.out.println("------------------------------");


        //Getting Student with matching address "1235"

        Optional<Student> stud1=students.stream().filter(student->student.getAddress().getZipcode().equals("1235")).findFirst();
        System.out.println(stud1.isPresent() ? stud1.get().getName():"No student Found");
        System.out.println("----------------------------");




        // Get all student having mobile numbers 3333.
        //using anyMatch method to getting all the matched numbers
        List<Student> stud2=  students.stream()
                .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
                .collect(Collectors.toList());

        String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
        System.out.println(result1);
        System.out.println("--------------------");





        
    }


}
