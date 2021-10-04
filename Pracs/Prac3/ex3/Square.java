package Pracs.Prac3.ex3;

public class Square extends Rectangle {
    double side;
    public Square(){}
    Square(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
        setWidth(side);
        setLength(side);
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }
    public String toString() {
        return super.toString();
    }
}
