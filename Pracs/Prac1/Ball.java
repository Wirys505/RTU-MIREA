package Pracs.Prac1;
import java.lang.*;
public class Ball {
    private String purpose;
    private double size;
    public Ball(String purpose, double size) {
        this.purpose = purpose;
        this.size = size;
    }
    public Ball(String purpose) {
        this.purpose = purpose;
        size = 27.17;
    }
    public Ball(double size) {
        this.size = size;
        purpose = "unknown";
    }
    public Ball() {
        purpose = "soccer";
        size = 27.17;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String toString(){
        return "This ball is for " + purpose + " and its size in inches is " + size;
    }
    public void InToCentimeters(){
        System.out.println("Ball for " + purpose + " with size in centimeters " + size*2.54);
    }
}