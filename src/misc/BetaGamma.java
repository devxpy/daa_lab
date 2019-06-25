package misc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BetaGamma {
    public static void main(String[] args) {
        JFrame frame = new JFrame("beta gamma");

        JLabel label = new JLabel("null");
        label.setBounds(0, 10, 100, 100);

        JButton beta = new JButton("beta");
        beta.setBounds(100, 10, 100, 100);

        JButton gamma = new JButton("gamma");
        gamma.setBounds(200, 10, 100, 100);

        beta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("beta");
            }
        });

        gamma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("gamma");
            }
        });

        frame.add(label);
        frame.add(beta);
        frame.add(gamma);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
