package Labs.Lab4;

public class Test {
    public static void main(String[] args){
        Nameable h = new Human("Dima");
        Nameable c = new Car("Audi");
        System.out.println(h.getName());
        System.out.println(c.getName());
    }
}