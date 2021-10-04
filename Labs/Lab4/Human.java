package Labs.Lab4;

public class Human implements Nameable{
    public String name;
    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}