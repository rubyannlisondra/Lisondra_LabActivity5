package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;
    private JTextField tfNumber2;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcComp();
            }
        });
    }
    public void calcComp() {
        try {
            String operation = (String) cbOperations.getSelectedItem();
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            double answer = 0;

            if (operation == "+") {
                answer = num1 + num2;
                lblResult.setText(String.valueOf(String.format("%.0f", (answer))));
            }
            if (operation == "-") {
                answer = num1 - num2;
                lblResult.setText(String.valueOf(String.format("%.0f", (answer))));
            }
            if (operation == "*") {
                answer = num1 * num2;
                lblResult.setText(String.valueOf(String.format("%.0f", (answer))));
            }
            if (operation == "/") {
                answer = num1 / num2;
                lblResult.setText(String.valueOf(String.format("%.0f", (answer))));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();

        calc.setContentPane(calc.panel1);
        calc.setSize(600, 600);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.setTitle("Simple Calculator");

    }
}