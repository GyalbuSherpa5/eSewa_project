package collectionAssignment;

import java.util.*;

public class Book {

    String name;
    String author;
    int price;

    public Book(){


    }

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args){



        List<Book> coll=new ArrayList<>();
        List<Book> coll1=new LinkedList<>();
        List<Book> coll2=new Vector<>();
//For ArrayList
        //Implementing add methods.
        coll.add(new Book("Java","X",500));
        coll.add(new Book("Python","X",600));
        coll.add(new Book("Ruby","X",700));
        coll.add(new Book("Rail","X",800));

        //Implementing remove methods
        coll.remove(0);

        //Implementing iterator for traversing the arraylist
        Iterator itr=coll.iterator();

        while(itr.hasNext()){

            Book a=(Book) itr.next();
            System.out.println(a);
        }



        //For LinkedList

        //adding the element
        coll1.add(new Book("Java","X",500));
        coll1.add(new Book("Python","Y",600));
        coll1.add(new Book("Django","Z",700));
        coll1.add(new Book("Rail","X",800));

        //removing the element
        coll1.remove(3);

        //Implementing iterator for traversing the Linkedlist
        Iterator itr1=coll1.iterator();

        while(itr1.hasNext()){

            Book a=(Book) itr1.next();
            System.out.println(a);
        }


        //For Vector
        //Implementing add methods.
        coll2.add(new Book("Java","X",500));
        coll2.add(new Book("Python","xman",1000));
        coll2.add(new Book("Ruby","z",800));
        coll2.add(new Book("Rail","s",800));

        //Implementing remove methods
        coll2.remove(0);

        //Implementing iterator for traversing the arraylist
        Iterator itr2=coll2.iterator();

        while(itr2.hasNext()) {

            Book a = (Book) itr2.next();
            System.out.println(a);
        }





        //For Set

        Comparator comparator = new MyComparatorImpl();


        SortedSet sortedSet = new TreeSet(comparator);

        sortedSet.add(new Book("Java","X",1000));
        sortedSet.add(new Book("Java","X",500));
        sortedSet.add(new Book("Java","X",1000));
        sortedSet.add(new Book("Java","X",60));




        //Implementing iterator for traversing the Set
        Iterator itr3=sortedSet.iterator();

        while(itr3.hasNext()) {

            Book a = (Book) itr3.next();
            System.out.println(a);
        }









    }



}
