package WeektwoMonday.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {
        List<Books> book=new ArrayList<>();
        //make objects
        Books Book1=new Books("Albert", 500 );
        Books Book2=new Books("The Spy", 300 );
        Books Book3=new Books("Harry Potter", 3000 );
        Books Book4=new Books("Stranger Things", 1000 );
        Books Book5=new Books("Wednesday", 450 );
//adding the objects
        book.add(Book1);
        book.add(Book2);
        book.add(Book3);
        book.add(Book4);
        book.add(Book5);

        //Iterating
        System.out.println(book);
        Iterator Traversing = book.iterator();
        while(Traversing.hasNext()){
            System.out.println(Traversing.next());
        }

        //remove
        book.remove(Book5);
        //Iterating after removing Book5
        System.out.println("After removing Book5");
        Iterator Traversin = book.iterator();
        while(Traversin.hasNext()){
            System.out.println(Traversin.next());
        }

    }


    // @Override

}
