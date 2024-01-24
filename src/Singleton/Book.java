package Singleton;

public class Book {
    private static Book book;
    private Book(){

    }
    public static Book getInstance(){
        if (book==null)
            book = new Book();
        return book;
    }
}
