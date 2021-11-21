package Labs.Lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
public class GuessingGame extends JFrame{
    JTextField jtf1 = new JTextField(10);
    JButton jb1 = new JButton("Нажми чтобы угадать");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    int i = (int) (Math.random() * 21);
    int n = 2;
    public GuessingGame(){
        setSize(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(jtf1);
        add(jb1);
        System.out.println(i);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    int i1 = Integer.parseInt(jtf1.getText().trim());
                    if (n == 0){
                        JOptionPane.showMessageDialog(null, "Вы проиграли. У вас закончились попытки. Число было: " + i,
                                "Результат", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    if (i1 == i){
                        JOptionPane.showMessageDialog(null, "Вы выйграли",
                                "Результат", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    if (i1 > i){
                        n--;
                        JOptionPane.showMessageDialog(null, "Не повезло. Число меньше",
                                "Результат", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (i1 < i) {
                        n--;
                        JOptionPane.showMessageDialog(null, "Не повезло. Число Больше",
                                "Результат", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        });
    }
    public static void main(String[]args) {
        new GuessingGame().setVisible(true);
    }
}