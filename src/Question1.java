public class Question1 {
    /*
1. What is the difference between a class and an interface in object-oriented programming?
    When would you use an interface instead of a class?
    Can a class implement multiple interfaces? If so, how would you do this?

------------>
        Class                                                               interface
a. A Class is a  blueprint from                                  a. An interface is a reference type in java which
   which individual objects are created	                            have abstract methods

b. A class can have constructor methods	                         b. Interface can not have a constructor
c. A class can have any type of members like private,public	     c.Interface can only have public members
d. A class describes the attributes and behaviour of an object	 d. An interface contains behaviours that a class implements
e. Classes are used to create objects	                         e.Interface are used to achieve polymorphism

#######################################################################################################################
-->We use interface in below two case
1.We want to specify the behaviour of  a particular data type,but not concerned about who implements its behaviour
2.We want to take  advantage of multiple inheritance of  type

#######################################################################################################################
-->As implementation of behaviour inside interface depends on child class we can implement multiple interface by
    separating the interface by ',' sign
Example:
public interface Dog{
    void eat();
}
public interface Cat{
    void makeSound();
}
public class Lion implements Dog,Cat{
    public void eat(){
        System.out.println("It eats");
    }
public void makeSound(){
    System.out.println("It roars");
    }
public static void main(String[] args){
    Lion obj=new Lion();
    obj.eat();
    obj.makeSound();
   }
 }



     */
}
