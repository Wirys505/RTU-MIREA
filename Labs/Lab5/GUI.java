package Labs.Lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame{
    JPanel[] pnl = new JPanel[20];
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 5));
        for (int i = 0; i < pnl.length; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new GUI.MyRectangleJPanel();
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
        }
        setSize(800, 500);
    }
    class MyRectangleJPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int n1 = (int) (Math.random() * 140);
            int n2 = (int) (Math.random() * 95);
            g.setColor(Color.CYAN);
            g.fillRect(n1, n2, 20, 30);
        }
    }
    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}