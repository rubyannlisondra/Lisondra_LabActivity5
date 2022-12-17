package LeapYear;

import javax.swing.*;

public class LeapYearGUI {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Leap Year Checker");

    }
}
