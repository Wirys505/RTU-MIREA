package Labs.Lab3;

public class Plate extends Dish {
    private int pieces;
    public Plate(Dish.Material material, String color, int cost, boolean oneUse, int pieces){
        super(material, color, cost, oneUse);
        this.pieces = pieces;
    }
    public int getPieces() {
        return pieces;
    }
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    public int eatFood(){
        if(pieces <= 0){
            throw new IllegalArgumentException("You don't have food");
        }
        System.out.println("Starting to eat");
        int amount = pieces;
        for(int i = pieces; i>0; i--){
            amount -= 1;
            System.out.println("Pieces left: " + amount);
        }
        System.out.println("That's all");
        return 0;
    }
}