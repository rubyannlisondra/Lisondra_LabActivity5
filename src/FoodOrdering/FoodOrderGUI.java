package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cSoftDrinks;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodOrder();
            }
        });
    }

    public void foodOrder() {
        try{
            double food = 0;
            double price = 0;
            boolean temp = false;

            if (cPizza.isSelected()) {
                food += 100;
                temp = true;
            }
            if (cBurger.isSelected()) {
                food += 80;
                temp = true;
            }
            if (cFries.isSelected()) {
                food += 65;
                temp = true;
            }
            if (cSoftDrinks.isSelected()) {
                food += 55;
                temp = true;
            }
            if (cTea.isSelected()) {
                food += 50;
                temp = true;
            }
            if (cSundae.isSelected()) {
                food += 40;
                temp = true;
            }
            if (rbNone.isSelected()) {
                food = food;
                temp = true;
            }
            if (rb5.isSelected()) {
                price = food * 0.05;
                food = food - price;
                temp = true;
            }
            if (rb10.isSelected()) {
                price = food * 0.10;
                food = food - price;
                temp = true;
            }
            if (rb15.isSelected()) {
                price = food * 0.15;
                food = food - price;
                temp = true;
            }
            if(temp == false) {
                throw (new Exception("Invalid"));
            }
            JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", food));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    public static void main(String[] args) {
        FoodOrderGUI fOrder = new FoodOrderGUI();

        fOrder.setContentPane(fOrder.panel1);
        fOrder.setSize(600, 600);
        fOrder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fOrder.setVisible(true);
        fOrder.setTitle("Food Ordering System");
    }
}
