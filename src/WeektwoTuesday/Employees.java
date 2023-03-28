package WeektwoTuesday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employees{
     String name;
    int age;
    int salary;

    public Employees(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

        }


    public class ByName{

    public static void main(String[] args) {
        List<Employees> Empo=new ArrayList<>();
Employees empo1=new Employees("Nilima", 30, 10000);
        Employees empo2=new Employees("Musu", 31, 50000);
        Employees empo3=new Employees("Nili", 30, 5000);
        Employees empo4=new Employees("Nili", 30, 1000);
        Employees empo5=new Employees("Mus", 30, 5000);

        Empo.add(empo1);
        Empo.add(empo2);
        Empo.add(empo3);
        Empo.add(empo4);
        Empo.add(empo5);

        HashMap<String,List<Employees>> ByName = new HashMap<>();

        ByName.put(empo1.name, empo1);




    }


}
