import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingPrice {
    public static void main(String[] args) {
        TreeSet<Book> treeSet=new TreeSet<Book>();
        Book book=new Book(1,"Java for beginners","Java Code Geeks",1000);
        Book book1=new Book(7,"Apache Maven Cookbook","Java Code Geeks",2000);
        Book book2=new Book(5,"Big Java","Cay S. Horstmann",2100);
        Book book3=new Book(9,"Java Projects","Peter Verhas",1800);
        Book book4=new Book(5,"Java Projects","Peter Verhas",1800);

        treeSet.add(book);
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        treeSet.add(book4);

        System.out.println("Sorting in Descending ");
        Iterator iterator=treeSet.iterator();
        while(iterator.hasNext()){
            Book bok=(Book) iterator.next();
            bok.display();
        }
    }
}
