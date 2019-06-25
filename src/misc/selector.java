package misc;

import javax.swing.*;
import java.awt.event.*;

public class selector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("misc.selector");

        JLabel label = new JLabel("select a language, and press show");
        label.setBounds(10, 100, 500, 100);

        String[] choices = {"c++", "java", "c"};
        JComboBox cb = new JComboBox(choices);
        cb.setBounds(10, 200, 100, 100);

        JButton button = new JButton("show");
        button.setBounds(10, 300, 100, 100);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected language is: " + cb.getItemAt(cb.getSelectedIndex()));
            }
        });

        frame.add(label);
        frame.add(cb);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
