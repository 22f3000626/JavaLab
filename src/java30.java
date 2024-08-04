import java.awt.*;
import java.awt.event.*;

public class java30 extends Frame implements ActionListener {

    private Button button;
    private Label label;

    public java30() {
        button = new Button("Click Me!");
        label = new Label("Label text will change on click.");
        setLayout(new FlowLayout());
        button.addActionListener(this); // ActionListener
        add(button);
        add(label);

        // window setting properties
        setTitle("Event Listener Demo");
        setSize(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button clicked!");
        }
    }

    public static void main(String[] args) {
        new java30();
    }
}
