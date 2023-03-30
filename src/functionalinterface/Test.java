package functionalinterface;
import java.util.Date;
import java.util.function.*;
public class Test {

    public static void main(String[] args){

//        int n=10;
//        //using predicate inteface
//        //given integer is even or not.
//        Predicate p= e-> n%2==0;
//
//        System.out.println(p.test(n));


//        String[] a={"Rupesh","Sunuwar","Gyalbu","Anuj"};
//        Predicate<String> p1=e->e.length()>5;
//        for(String s:a){
//            //check the length of the string whether it is greater
//            System.out.println(p1.test(s));
//        }
//
//
//        //Predicate Joining
//
//        int[] x={0,4,10,10,20,30,24,34};
//        Predicate<Integer> p3=i->i%2==0;
//        Predicate<Integer> p4=i ->i>10;
//        //and() , or() , negate() joining
//
//
//
//        for(int n:x){
//            //checking if it is even and greater than 10
//            if(p3.and(p4).test(n)){
//                System.out.println(n);
//            }
//            //true if even or greater than 10
//            if(p3.or(p4).test(n)){
//                System.out.println(n);
//            }
//            //return which or not even
//            if(p3.negate().test(n)){
//
//                System.out.println(n);
//
//
//            }
//
//
//        }


        // Predefined Functional Interfaces
        //Function
        //convert the uppercase string in to lower case
//        String[] str={"RAJA","SAJA","KHAJA","BHAJA","MOMO"};
//        Function<String,String> a= e-> e.toLowerCase();
//
//        for(String n:str){
//
//            System.out.println(a.apply(n));
//        }


        Function<Student,String> studs=e->{

            int marks=e.marks;
            String grade="";
            if(marks>=80) grade="A+";
            else if(marks>60) grade="B+";
            else if(marks>=50) grade="B";
            else if(marks>=60) grade="C+";
            else if(marks>=60) grade="C";
            else grade="Failed";
            return grade;
        };

//        Student[] s={new Student("Rupesh",90),
//                new Student("Rupesh",80),
//                new Student("Rupesh",50),
//                new Student("Rupesh",60),
//                new Student("Rupesh",50)};
//
//        for(Student st:s){
//            System.out.println(st.getName());
//            System.out.println(st.getMarks());
//            System.out.println( studs.apply(st));;
//        }




        //Function Chaining
        //f1.Then(f2).apply(i)  this chaining
        // first f1 will run and followed by f2.
        //f1.compose(f2).apply(i)
        //first f2 and then followed by f1.


        //Consumer Functional Interfaces

        Student[] s={new Student("Rupesh",90),
                new Student("Rupesh",80),
                new Student("Rupesh",50),
                new Student("Rupesh",60),
                new Student("Rupesh",50)};


        Consumer<Student> c=e->{
            System.out.println("Name" + e.name);
            System.out.println("Marks"+e.marks);
            System.out.println("Grade"+studs.apply(e));
        };

        for(Student s1:s){
            c.accept(s1);


        }


        // Supplier
        //Just supply my required objects and it won't take any input

//Supplier<Date> da=()->new Date();
//
//        System.out.println(da.get());
//
//
//
//        Supplier<String> genOtp= ()->{
//
//            String otp="";
//
//            for(int i=0;i<6;i++){
//                otp+=(int)(Math.random()*10);
//            }
//          return otp;
//        };
//
//        System.out.println(genOtp.get());







    }
}
