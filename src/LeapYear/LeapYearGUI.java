package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        JLabel label = new JLabel("Input Year");
        label.setBounds(150, 100, 100, 100);

        JTextField tfYear = new JTextField();
        tfYear.setBounds(103, 41, 144, 20);
        tfYear.setColumns(40);

        JButton button = new JButton("Check");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null);
                int yr = Integer.parseInt(input);
                boolean leap = true;

                if(leap) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });

        frame.add(label);
        frame.setLayout(null);
        //frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(tfYear);

    }
}
