import java.util.ArrayList;
import java.util.Iterator;

public class ListOfBooks {
    public static void main(String[] args) {
        ArrayList<Book> arrayList=new ArrayList<Book>();
        Book book=new Book(1,"Java for beginners","Java Code Geeks",1000);
        Book book1=new Book(7,"Apache Maven Cookbook","Java Code Geeks",2000);
        Book book2=new Book(5,"Big Java","Cay S. Horstmann",2100);
        Book book3=new Book(9,"Java Projects","Peter Verhas",1800);
        Book book4=new Book(5,"Java Projects","Peter Verhas",1800);


        //for adding book objects into list
        arrayList.add(book);
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);

        //for traversing arrayList
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            Book bok=(Book) iterator.next();
            bok.display();
        }
        //removing element of index 2
        arrayList.remove(2);

        System.out.println();
        //for traversing arrayList after removing element from index 2
        Iterator iterator1=arrayList.iterator();
        while(iterator1.hasNext()){
            Book bok=(Book) iterator1.next();
            bok.display();
        }
    }

}
