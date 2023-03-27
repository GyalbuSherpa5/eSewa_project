package WeektwoMonday.Assignment;


import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.SortedSet;

public class SortedValue{
    public static void main(String[] args) {
        SortedSet<Books> SortedBook= new TreeSet<>();
        Books Book1=new Books("Albert", 500 );
        Books Book2=new Books("The Spy", 300 );
        Books Book3=new Books("Harry Potter", 3000 );
        Books Book4=new Books("Stranger Things", 1000 );
        Books Book5=new Books("Wednesday", 450 );

        //adding the objects
        SortedBook.add(Book1);
        SortedBook.add(Book2);
        SortedBook.add(Book3);
        SortedBook.add(Book4);
        SortedBook.add(Book5);

     for (Books boo : SortedBook) {
            System.out.println(boo);
        }

    }
}
