package Labs.Lab3;

public class Spoon extends Dish{
    public Spoon(Dish.Material material, String color, int cost, boolean oneUse){
        super(material, color, cost, oneUse);
    }
    public boolean EatSoup(){
        return true;
    }
    public boolean EatVegetables(){
        return false;
    }
}
