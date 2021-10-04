package Pracs.Prac4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Results: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");
    int count1;
    int count2;
    public GUI() {
        super("Example");
        setSize(150, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(button1);
        add(button2);
        add(label1);
        add(label2);
        add(label3);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               count1++;
               label1.setText("Results: " + count1 + " X " + count2);
               label2.setText("Last Scorer: AC Milan");
               if(count1 > count2)
                   label3.setText("Winner: AC Milan");
               if(count1 == count2)
                   label3.setText("Winner: Draw");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                count2++;
                label1.setText("Results: " + count1 + " X " + count2);
                label2.setText("Last Scorer: Real Madrid");
                if(count2 > count1)
                    label3.setText("Winner: Real Madrid");
                if(count1 == count2)
                    label3.setText("Winner: Draw");
            }
        });
    }
    public static void main(String[]args) {
        new GUI().setVisible(true);
    }
}