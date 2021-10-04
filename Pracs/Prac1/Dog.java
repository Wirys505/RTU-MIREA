package Pracs.Prac1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(int age) {
        this.age = age;
        name = "Bobik";
    }
    public Dog(String name) {
        this.name = name;
        age = 1;
    }
    public Dog() {
        name = "Rex";
        age = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return name + ", age " + age;
    }
    public void InToHumanAge(){
        System.out.println(name + "'s age in human years is " + age*7);
    }
}