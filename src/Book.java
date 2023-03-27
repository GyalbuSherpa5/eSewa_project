import java.util.*;

public class Book implements Comparable {
    String a;
    int b;
    int p;

    Book(String author, int pages,int price) {
        this.a = author;
        this.b = pages;
        this.p=price;
    }

    public String toString() {
        return a + " pages " + b+" price "+ p;
    }



    public static void main(String[] args) {
        Book b1= new Book("hello", 199,1200);
        Book b2= new Book("crpt",19,2000);
        Book b3= new Book("when",12,3000);


        List<Book> linklist = new LinkedList<>();

        linklist.add(b1);
        linklist.add(b2);
        linklist.add(b3);
        System.out.println(linklist);
        Iterator<Book>i = linklist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        linklist.remove(b1);

        System.out.println(linklist);

        TreeSet<Book>sortBook= new TreeSet<>();
        sortBook.add(b1);
        sortBook.add(b2);
        sortBook.add(b3);
        System.out.println(sortBook);
    }


    @Override
    public int compareTo(Object o) {
        Book e=(Book)o;
        if(this.p>e.p){
            return -1;
        }
        else if(this.p<e.p){
            return 1;

        }
        else{
            return 0;
        }

    }
}
