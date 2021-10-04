package Labs.Lab2;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        Circle c5 = new Circle();
        c1.setRadius(4);
        c2.setPerimeter(15);
        c3.setSquare(64);
        c4.setX(13.67);
        c5.setY(72.43);
        c1.Perimeter();
        c1.Square();
        c2.RadiusFromPerimeter();
        c3.RadiusFromSquare();
        System.out.println(c1);
        System.out.println(c4.getX());
        System.out.println(c5.getY());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getRadius());
        System.out.println(c3.getSquare());
    }
}