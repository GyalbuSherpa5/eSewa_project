package Collection;

public class Book implements Comparable<Book>{
    int id;
    String bookName, authorName;
    double bookPrice;

    public Book(int id, String bookName, String authorName, Double bookPrice) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }
    public void displayBook(){
        System.out.println(id + " " + bookName + " " + authorName + " " + bookPrice);
    }

    @Override
    public int compareTo(Book o) {
        if(bookPrice>o.bookPrice)
            return 1;
        else if(bookPrice<o.bookPrice)
            return -1;
        return 0;
    }
}
