package Labs.Lab3;
import java.lang.*;
public abstract class Dish {
    private Material material;
    private String color;
    private int cost;
    private boolean oneUse;
    public Dish(Material material, String color, int cost, boolean oneUse){
        this.material = material;
        this.color = color;
        this.cost = cost;
        this.oneUse = oneUse;
    }
    public enum Material {
        Aluminium, Plastic, Ceramic, Glass
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public boolean isOneUse() {
        return oneUse;
    }
    public void setOneUse(boolean oneUse) {
        if (this.material.equals(Material.Aluminium) || this.material.equals(Material.Glass) || this.material.equals(Material.Ceramic)) {
            throw new IllegalArgumentException("It's not one use material");
        }
        this.oneUse = oneUse;
    }
}