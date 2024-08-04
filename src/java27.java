import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class java27 extends JFrame {
    private JLabel timeLabel;
    public java27() {
        setTitle("My Digital Clock " );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 24));//setting font and text size 

        add(timeLabel);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);

        updateTime();
        //updating time everytime 
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }
    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(dateFormat.format(new Date()));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(java27::new);
    }
}

