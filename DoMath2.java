import java.awt.*;
import javax.swing.*;

public class DoMath2 {

    public static void main(String[] args) {
        arithmetic();
    }

    public static void arithmetic() {

        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JLabel sumLabel = new JLabel("Sum: ");
        JLabel diffLabel = new JLabel("Diff: ");
        JLabel prodLabel = new JLabel("Prod: ");
        JLabel divLabel  = new JLabel("Divide: ");

        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));

        panel.add(new JLabel("First Integer:"));
        panel.add(xField);

        panel.add(new JLabel("Second Integer:"));
        panel.add(yField);

        panel.add(sumLabel);
        panel.add(diffLabel);
        panel.add(prodLabel);
        panel.add(divLabel);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "DoMath",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {

            int num1 = Integer.parseInt(xField.getText());
            int num2 = Integer.parseInt(yField.getText());

            sumLabel.setText("Sum: " + (num1 + num2));
            diffLabel.setText("Diff: " + Math.abs(num1 - num2));
            prodLabel.setText("Prod: " + (num1 * num2));

            if (num2 != 0) {
                divLabel.setText("Divide: " + ((double) num1 / num2));
            } else {
                divLabel.setText("Divide: Undefined");
            }

            JOptionPane.showMessageDialog(null, panel, "DoMath Results", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
