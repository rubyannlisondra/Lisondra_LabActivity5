package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton noneRadioButton;
    private JButton btnOrder;
    private JCheckBox cSoftDrinks;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    public static void main(String[] args) {
        FoodOrderGUI fOrder = new FoodOrderGUI();

        fOrder.setContentPane(fOrder.panel1);
        fOrder.setSize(600, 600);
        fOrder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fOrder.setVisible(true);
        fOrder.setTitle("Food Ordering System");
    }
}
