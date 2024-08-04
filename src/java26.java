import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class java26 extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    public java26() {
        setTitle("Recursive Fibonacci Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());//creating jframe box 

        inputField = new JTextField(10);
        outputField = new JTextField(20);
        outputField.setEditable(false);

        add(new JLabel("Enter N: "), BorderLayout.NORTH);
        add(inputField, BorderLayout.NORTH);
        add(new JLabel("Fibonacci Result: "), BorderLayout.CENTER);
        add(outputField, BorderLayout.CENTER);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            try {
                int n = Integer.parseInt(inputField.getText());
                outputField.setText(String.valueOf(calculateFibonacci(n)));
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input");
            }
        }
    }
    private long calculateFibonacci(int n) {
        return n <= 1 ? n : calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(java26::new);
    }
}
