import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab1Dom {
    public static void main(String args[]) {
        JFrame win;
        JTextField tf1, tf2, tf3;
        JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
        JButton btn1, btn2;

        win = new JFrame("Вычисление скорости бега:");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        lbl1 = new JLabel("Введите исходные данные");
        lbl1.setBounds(25, 15, 200, 20);
        win.add(lbl1);

        lbl2 = new JLabel("Введите длину дистанции (метров) -> ");
        lbl2.setBounds(25, 57, 260, 20);
        win.add(lbl2);

        lbl3 = new JLabel("Введите время (минут.секунд) -> ");
        lbl3.setBounds(25, 85, 260, 20);
        win.add(lbl3);

        lbl4 = new JLabel("площадь прямоугольника:");
        lbl4.setBounds(32, 115, 260, 20);
        win.add(lbl4);

        tf1.setBounds(280, 57, 100, 20);
        win.add(tf1);

        tf2.setBounds(280, 87, 100, 20);
        win.add(tf2);

        tf3.setBounds(280, 117, 100, 20);
        win.add(tf3);
        tf3.setEditable(false);

        win.setSize(430, 280);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

        btn1 = new JButton("Посчитать");
        btn2 = new JButton("Очистить");
        btn1.setBounds(45,165,130,25);
        win.add(btn1);
        btn2.setBounds(210,165,130,65);
        win.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float allTime;
                float d = Float.parseFloat(tf1.getText());
                float w = Float.parseFloat(tf2.getText());
                allTime = d * w;
                tf3.setText(String.format("%.2f", allTime));
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf3.setText("");
            }
        });
    }
}
