package LeapYear;

import javax.swing.*;
import java.awt.Color;

public class LeapYearGUI {
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Check");

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
