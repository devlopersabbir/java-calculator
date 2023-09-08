import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberbts = new JButton[10];
    JButton[] functionBtns = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    // declare font fmly & style
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    // init value
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        frame.add(textfield);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
    }
}