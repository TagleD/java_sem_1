import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab1 {
    public static void main(String args[]) {
        JFrame win;
        JTextField tf1, tf2, tf3;
        JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
        JButton btn1, btn2;
        win = new JFrame("Вычисление площади прямоугольника");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        lbl1 = new JLabel("Введите исходные данные");
        lbl1.setBounds(25, 15, 200, 20);
        win.add(lbl1);

        lbl2 = new JLabel("длина(см) ->");
        lbl2.setBounds(112, 55, 200, 20);
        win.add(lbl2);

        lbl3 = new JLabel("ширина(см) ->");
        lbl3.setBounds(105, 85, 200, 20);
        win.add(lbl3);

        lbl4 = new JLabel("площадь прямоугольника:");
        lbl4.setBounds(32, 115, 230, 20);
        win.add(lbl4);

        tf1.setBounds(210, 57, 100, 20);
        win.add(tf1);

        tf2.setBounds(210, 87, 100, 20);
        win.add(tf2);

        tf3.setBounds(210, 117, 100, 20);
        win.add(tf3);
        tf3.setEditable(false);

        win.setSize(430, 280);
        win.setLayout(null);
        win.setVisible(true);

        btn1 = new JButton("Добавить");
        btn2 = new JButton("Очистить");
        btn1.setBounds(45,165,130,25);
        win.add(btn1);
        btn2.setBounds(210,165,130,65);
        win.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float C;
                float D;
                float d = Float.parseFloat(tf1.getText());
                float w = Float.parseFloat(tf2.getText());
                C = d * w;
                tf3.setText(String.format("%.2f", C));
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