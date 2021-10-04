import Labs.Lab5.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestGui extends JFrame {
    /*JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    TestGui() {
        super("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("First Number:"));
        add(jta1);
        add(new JLabel("Second Number:"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2),
                            "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !",
                            "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestGui();
    }*/
    JPanel[] pnl = new JPanel[20];
    public TestGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,5));
        for(int i = 0 ; i < pnl.length ; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
        pnl[1] = new MyRectangleJPanel();
        add(pnl[1]);
        setSize(800,500);
    }
    class MyRectangleJPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, 100, 100);
        }
    }
    public static void main(String[]args) {
        new TestGui().setVisible(true);
    }
}