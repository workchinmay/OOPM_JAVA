import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_Exp13 {
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[7];
    private JButton addButton, subButton, mulButton, divButton, equalButton, clearButton, decimalButton;

    private double num1, num2, result;
    private char operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 40));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + e.getActionCommand());
                }
            });
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");
        decimalButton = new JButton(".");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equalButton;
        functionButtons[5] = clearButton;
        functionButtons[6] = decimalButton;

        for (int i = 0; i < 7; i++) {
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 40);
            functionButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    switch (command) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            num1 = Double.parseDouble(textField.getText());
                            operator = command.charAt(0);
                            textField.setText("");
                            break;
                        case "=":
                            num2 = Double.parseDouble(textField.getText());
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
                            textField.setText(String.valueOf(result));
                            break;
                        case "C":
                            textField.setText("");
                            break;
                        case ".":
                            if (!textField.getText().contains(".")) {
                                textField.setText(textField.getText() + ".");
                            }
                            break;
                    }
                }
            });
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divButton);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(clearButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
