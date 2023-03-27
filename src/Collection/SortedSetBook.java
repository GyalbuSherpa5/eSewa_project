package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetBook {
    public static void main(String[] args) {
        TreeSet<Book> bookSet=new TreeSet<Book>();
        Book book1=new Book(1,"Advance Java", "Ram", 500.0);
        Book book2=new Book(2,"DSA", "Shyam", 600.0);
        Book book3=new Book(3,"PHP", "Hari", 300.0);
        Book book4=new Book(3,"PHP", "Hari", 300.0);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        Iterator itr=bookSet.iterator();
        while(itr.hasNext()){
            Book books=(Book) itr.next();
            books.displayBook();
        }
    }
}
