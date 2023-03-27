package WeektwoMonday.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Books implements Comparable<Books> {
    String bookName;
    int bookPrice;

    public Books(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }


    public String toString() {
        return bookName + " " + bookPrice;
    }



    @Override
    public int compareTo(Books b) {
        if(bookPrice<b.bookPrice){
            return -1;
        }
        else if(bookPrice>b.bookPrice){
            return 1;
        }
        return 0;
    }
}
