//functional calculator 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class java25 extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator;
    private double firstOperand;
    public java25() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
       	// creating text field
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);
       	//buttons using gridlayout
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            operator = command;
            firstOperand = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }
    private void calculateResult() {//function to claculate result 
        double secondOperand = Double.parseDouble(textField.getText());
        double result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    textField.setText("Error");
                    return;
                }
                break;
        }

        textField.setText(String.valueOf(result));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new java25());
    }
}
