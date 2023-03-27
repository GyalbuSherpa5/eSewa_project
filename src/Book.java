class Book implements Comparable<Book>{
    int book_id;
    String book_name;
    String author_name;
    int price;

    public Book(int book_id, String book_name, String author_name, int price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.price = price;
    }
    public void display(){
        System.out.println(book_id+ " " + book_name +" "+ author_name + " "+price);
    }

    @Override
    public int compareTo(Book book) {
        if(price>book.price){
            return 1;
        }
        else if(price<book.price){
            return -1;
        }
        return 0;

    }
}