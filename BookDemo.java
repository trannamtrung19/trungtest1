package test1;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Tran Dinh Nam ", "Trung");
        Book book = new Book("BookJava" ,author ,79.75);
        System.out.println(book.toString());

    }
}
