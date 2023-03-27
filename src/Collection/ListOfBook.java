package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfBook {
    public static void main(String[] args) {
        ArrayList<Book> bookList=new ArrayList<Book>();
        Book book1=new Book(1,"Java", "Ram", 500.0);
        Book book2=new Book(2,"DSA", "Shyam", 400.0);
        Book book3=new Book(3,"PHP", "Hari", 300.0);
        Book book4=new Book(3,"PHP", "Hari", 300.0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        Iterator itr= bookList.iterator();
        while(itr.hasNext()){
            Book books=(Book) itr.next();
            books.displayBook();
        }
        System.out.println("List of books after remove:");
        bookList.remove(2);
        Iterator itr1= bookList.iterator();
        while(itr1.hasNext()){
            Book books=(Book) itr1.next();
            books.displayBook();
        }
    }
}
