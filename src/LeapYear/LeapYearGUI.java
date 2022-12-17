package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkedYear();
            }
        });
    }

    public void checkedYear() {
        try {
            if(tfYear.getText() == " ") {
                throw (new IllegalArgumentException("Empty String!"));
            }
            double yr = Double.parseDouble(tfYear.getText());
            boolean leap = false;

            if(yr < 0) {
                throw (new IllegalArgumentException("Input is invalid!"));
            }
            if(yr % 4 == 0) {
                if(yr % 100 == 0) {
                    if(yr % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }
            if(leap) {
                JOptionPane.showMessageDialog(panel1, "Leap year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a Leap year");
            }
            tfYear.setText("");
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            tfYear.setText("");
        }
    }
    public static void main(String[] args) {
        LeapYearGUI leapYear = new LeapYearGUI();

        leapYear.setContentPane(leapYear.panel1);
        leapYear.setSize(400, 400);
        leapYear.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYear.setVisible(true);
        leapYear.setTitle("Leap Year Checker");
    }
}
