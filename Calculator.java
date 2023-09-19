import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberbts = new JButton[10];
    JButton[] functionBtns = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
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
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        negButton = new JButton("(-)");

        functionBtns[0] = addButton;
        functionBtns[1] = subButton;
        functionBtns[2] = mulButton;
        functionBtns[3] = divButton;
        functionBtns[4] = decButton;
        functionBtns[5] = equButton;
        functionBtns[6] = delButton;
        functionBtns[7] = clrButton;
        functionBtns[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionBtns[i].addActionListener(this);
            functionBtns[i].setFont(myFont);
            functionBtns[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberbts[i] = new JButton(String.valueOf(i));
            numberbts[i].addActionListener(this);
            numberbts[i].setFont(myFont);
            numberbts[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        // panel.setBackground(Color.GREEN);

        panel.add(numberbts[1]);
        panel.add(numberbts[2]);
        panel.add(numberbts[3]);
        panel.add(addButton);
        panel.add(numberbts[4]);
        panel.add(numberbts[5]);
        panel.add(numberbts[6]);
        panel.add(subButton);
        panel.add(numberbts[7]);
        panel.add(numberbts[8]);
        panel.add(numberbts[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberbts[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberbts[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            textfield.setText("");
        }
        if (e.getSource() == delButton) {
            String currentText = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < currentText.length() - 1; i++) {
                textfield.setText(textfield.getText() + currentText.charAt(i));
            }
        }
        if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }
    }
}