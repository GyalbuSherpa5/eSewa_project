

class Student{
    int age;
    String name;
    int id;

    public Student(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

   }



public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(30, "nilima", 1);
        students[1] = new Student(23, "Rita", 2);
        students[2] = new Student(23, "Rio", 3);


        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].age > students[j].age) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for (Student student : students) {
            System.out.println(student.id + " " + student.name + " " + student.age);
        }
    }
}
//    public static void main(String[] args) {
//        Student s= new Student(22, "nilima", 1);
//        Student s1= new Student(23, "Rita", 2);
//        Student s1= new Student(23, "Rio", 3)









//loop of i
//        for (int i = 1; i <= 3; i++) {
////loop of j
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(i + " " + j+ " "+ " ");
//            }//end of i
//            System.out.println();
//        }//end of j


//        for (int i=1; i<=4; i++){
//            for (int j=6; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        int m=4, n=3;
//        for(int i=1; i<=m; i++){
//            for(int j=1; j<=n; j++){
//                if(i==1 || j==1 || i==m || j==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//
//
//        for(int i=1; i<=4; i++){
//            for(int j=1 ; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }







