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
        double price = 0;
        double order = 0;
        if (cPizza.isSelected()) {
            price += 100;
        }
        if (cBurger.isSelected()) {
            price += 80;
        }
        if (cFries.isSelected()) {
            price += 65;
        }
        if (cSoftDrinks.isSelected()) {
            price += 55;
        }
        if (cTea.isSelected()) {
            price += 50;
        }
        if (cSundae.isSelected()) {
            price += 40;
        }
        if (rbNone.isSelected()) {
            price = price;
        }
        if (rb5.isSelected()) {
            order = price * 0.05;
            price = price - order;
        }
        if (rb10.isSelected()) {
            order = price * 0.10;
            price = price - order;
        }
        if (rb15.isSelected()) {
            order = price * 0.15;
            price = price - order;
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
