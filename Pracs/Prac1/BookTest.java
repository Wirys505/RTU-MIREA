package Pracs.Prac1;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Lev Tolstoy");
        Book b2 = new Book("Iliad");
        Book b3 = new Book();
        b2.setAuthor("Homer");
        b3.setName("Sword Art Online");
        System.out.println(b1);
        System.out.println(b2.getAuthor());
        System.out.println(b3.getName());
    }
}