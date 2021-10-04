package Pracs.Prac1;

public class DogTest {
    public static void main(String[] args){
        Dog d1 = new Dog("Billy", 2);
        Dog d2 = new Dog("Johny");
        Dog d3 = new Dog(1);
        Dog d4 = new Dog();
        d3.setName("Sara");
        d4.setAge(5);
        System.out.println(d1);
        d2.InToHumanAge();
        System.out.println(d3.getName());
        System.out.println(d4.getAge());
    }
}