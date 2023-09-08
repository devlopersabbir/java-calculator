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
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionBtns[0] = addButton;
        functionBtns[1] = subButton;
        functionBtns[2] = mulButton;
        functionBtns[3] = divButton;
        functionBtns[4] = decButton;
        functionBtns[5] = equButton;
        functionBtns[6] = delButton;
        functionBtns[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionBtns[i].addActionListener(this);
            functionBtns[i].setFont(myFont);
            functionBtns[i].setFocusable(false);
        }

        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
    }
}