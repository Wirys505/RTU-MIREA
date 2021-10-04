package Labs.Lab3;

public class Fork extends Dish{
    private int teethCount;
    public Fork(Material material, String color, int cost, boolean oneUse, int teethCount){
        super(material, color, cost, oneUse);
        this.teethCount = teethCount;
    }
    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
    public int getTeethCount() {
        return teethCount;
    }
    public boolean EatSoup(){
        return false;
    }
    public boolean EatVegetables(){
        return true;
    }
}