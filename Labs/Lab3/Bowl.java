package Labs.Lab3;

public class Bowl extends Dish {
    private int millilitersOfSoup;
    public Bowl(Material material, String color, int cost, boolean oneUse, int millilitersOfSoup){
        super(material, color, cost, oneUse);
        this.millilitersOfSoup = millilitersOfSoup;
    }
    public int getMillilitersOfSoup() {
        return millilitersOfSoup;
    }
    public void setMillilitersOfSoup(int millilitersOfSoup) {
        this.millilitersOfSoup = millilitersOfSoup;
    }
    public int eatSoup(){
        if(millilitersOfSoup <= 0){
            throw new IllegalArgumentException("You don't have a soup");
        }
        System.out.println("Starting to eat a soup");
        int amount = millilitersOfSoup;
        for(int i = (millilitersOfSoup/25)+1; i>=0; i--){
           amount -= 25;
           if(amount <= 0) {
               System.out.println("You eat it all");
               break;
           }
            System.out.println("Soup left: " + amount);
        }
        return 0;
    }
}