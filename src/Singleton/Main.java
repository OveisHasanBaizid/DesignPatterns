package Singleton;

public class Main {
    public static void main(String[] args) {
        Book book1 = Book.getInstance();
        Book book2 = Book.getInstance();
    }
}