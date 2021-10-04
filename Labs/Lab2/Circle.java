package Labs.Lab2;
import java.lang.*;
public class Circle {
    private double radius = 0;
    private double square = 0;
    private double perimeter = 0;
    private double x = 0;
    private double y = 0;
    private final double Pi = 3.14;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getSquare() {
        return square;
    }
    public void setSquare(double square) {
        this.square = square;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void Perimeter(){
        System.out.println(perimeter = Pi*radius*2);
    }
    public void Square(){
        System.out.println(square = Pi*radius*radius);
    }
    public void RadiusFromSquare(){
        System.out.println(radius = Math.pow(square/Pi, 0.5));
    }
    public void RadiusFromPerimeter(){
        System.out.println(radius = perimeter/(2*Pi));
    }
    public String toString(){
        return "circle with radius - " + radius + " and center in x " + x + ", y " + y;
    }
}