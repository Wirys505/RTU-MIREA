package Labs.Lab1;

public class Harmony {
    private double number;
    public Harmony(double a) {
        number = a;
    }
    public void Loop(){
        for (double n = number; n < number + 10; n++){
            double a = 1/n;
            System.out.println(a);
        }
    }
}