package Pracs.Prac2;

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');
        Author a2 = new Author("Ivan Popov", "ivPopov@somewere.com", 'M');
        System.out.println(a1);
        a2.setEmail("IvanPopov@somewere.com");
        System.out.println(a2);
    }
}