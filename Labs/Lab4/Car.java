package Labs.Lab4;

public class Car implements Nameable{
    public String name;
    public Car(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}