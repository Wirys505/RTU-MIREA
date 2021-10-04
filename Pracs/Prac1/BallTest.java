package Pracs.Prac1;

public class BallTest {
    public static void main(String[] args){
        Ball b1 = new Ball("waterpolo", 26.77);
        Ball b2 = new Ball(25.59);
        Ball b3 = new Ball("regby");
        Ball b4 = new Ball();
        b3.setPurpose("basketball");
        b4.setSize(29.13);
        System.out.println(b1);
        b2.InToCentimeters();
        System.out.println(b3.getPurpose());
        System.out.println(b4.getSize());
    }
}