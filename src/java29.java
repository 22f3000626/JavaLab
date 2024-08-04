import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
public class java29 extends JFrame {
    private JComboBox<Integer> dayBox;
    public java29() {
        setTitle("Simple Calendar");
        setLayout(new FlowLayout());
        // creating combo boxes for year, month, and day
        JComboBox<Integer> yearBox = new JComboBox<>();
        JComboBox<String> monthBox = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        dayBox = new JComboBox<>();  //intialising
        //range of years
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        for (int i = currentYear - 5; i <= currentYear + 5; i++) {
            yearBox.addItem(i);
        }
        updateDays(monthBox.getSelectedIndex() + 1, currentYear);
       	// adding action  listeners to update days when month or year changes
        monthBox.addActionListener(e -> updateDays(monthBox.getSelectedIndex() + 1, (Integer) yearBox.getSelectedItem()));
        yearBox.addActionListener(e -> updateDays(monthBox.getSelectedIndex() + 1, (Integer) yearBox.getSelectedItem()));
        //adding components to the frame
        add(yearBox);
        add(monthBox);
        add(dayBox);

        pack();
        setVisible(true);
    }
    private void updateDays(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        dayBox.removeAllItems();
        for (int i = 1; i <= daysInMonth; i++) {
            dayBox.addItem(i);
        }
    }
    public static void main(String[] args) {
        new java29();
    }
}
