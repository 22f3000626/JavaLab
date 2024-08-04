import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class java24 {
	 public static void main(String[] args) {
        //Jframe creation
        JFrame frame = new JFrame("My Gui Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(369, 269);

        //Button creation
        JButton clickButton = new JButton("Click if u r Straight ");
        clickButton.addActionListener(new ButtonClickListener());

        //Adding button to container 
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(clickButton);

        //frame visibility
        frame.setVisible(true);
    }

    // ActionListener for the button
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Handle button click event
            JOptionPane.showMessageDialog(null, "Yes u are !");
        }
    }
}

