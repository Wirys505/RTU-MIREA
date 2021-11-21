package Labs.Lab5;
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame {
    JPanel[] pnl = new JPanel[20];

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 5));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new Draw();
            add(pnl[i]);
        }
        setSize(800, 500);
    }

    class Draw extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int i = (int) (Math.random() * 2);
            if(i == 0) {
                Shape shape1 = new Rectangle();
                g.setColor(new Color(shape1.getR(), shape1.getG(), shape1.getB()));
                g.fillRect(shape1.getX(), shape1.getY(), shape1.getW(), shape1.getH());
            }
            else{
                Shape shape1 = new Oval();
                g.setColor(new Color(shape1.getR(), shape1.getG(), shape1.getB()));
                g.fillOval(shape1.getX(), shape1.getY(), shape1.getW(), shape1.getH());
            }
        }
    }

    public static void main(String[] args) {
        new Labs.Lab5.GUI().setVisible(true);
    }
}