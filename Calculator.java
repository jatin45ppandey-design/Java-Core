import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator extends JFrame implements ActionListener {

    private final JTextField display;
    @SuppressWarnings("unused")
    private final List<JButton> buttonList = new ArrayList<>();
    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;
    private char operator = '\0';

    public Calculator() {
        setTitle("Calculator");
        setSize(320, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(e -> actionPerformed(e));
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Number buttons
        if (command.matches("\\d")) {
            display.setText(display.getText() + command);
            return;
        }

        // Clear button
        if (command.equals("C")) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = '\0';
            return;
        }

        // Equals button
        if (command.equals("=")) {

            if (display.getText().isEmpty() || operator == '\0') {
                return;
            }

            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+' -> result = num1 + num2;

                case '-' -> result = num1 - num2;

                case '*' -> result = num1 * num2;

                case '/' -> {
                    if (num2 == 0) {
                        display.setText("Error");
                        return;
                    }
                    result = num1 / num2;
                }
            }

            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }

            num1 = result;
            return;
        }

        // Operator buttons
        if (!display.getText().isEmpty()) {
            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}