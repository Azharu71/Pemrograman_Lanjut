import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TUGAS9 extends JFrame implements ActionListener {

    private JTextField displayField;
    private double num1 = 0;
    private String operator = "";
    private boolean waitingForSecondNumber = false;

    public TUGAS9() {
        setTitle("Kalkulator Fungsional (Clear)");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        displayField = new JTextField("0");
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 6, 5, 5));

        String[] buttonLabels = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "C", "Exit"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String currentText = displayField.getText();

        try {
            if (command.matches("[0-9]")) {
                if (waitingForSecondNumber || currentText.equals("0") || currentText.equals("Error")) {
                    displayField.setText(command);
                    waitingForSecondNumber = false;
                } else {
                    displayField.setText(currentText + command);
                }
                return;
            }
            
            if (command.equals("C")) {
                displayField.setText("0");
                num1 = 0;
                operator = "";
                waitingForSecondNumber = false;
                return;
            }

            if (command.matches("[\\+\\-*/%]")) { 
                num1 = Double.parseDouble(currentText);
                operator = command;
                waitingForSecondNumber = true;
                return;
            }

            if (command.equals("=")) {
                if (operator.isEmpty()) {
                    return;
                }

                double num2 = Double.parseDouble(currentText);
                double result = 0;

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            displayField.setText("Error"); return;
                        }
                        result = num1 / num2;
                        break;
                    case "%": 
                        if (num2 == 0) {
                            displayField.setText("Error"); return;
                        }
                        result = num1 % num2;
                        break;
                }

                if (result == (long) result) {
                    displayField.setText(String.format("%d", (long) result));
                } else {
                    displayField.setText(String.format("%s", result));
                }
                
                operator = "";
                waitingForSecondNumber = true;
                return;
            }
            
            if (command.equals("Exit")) {
                System.exit(0);
            }

        } catch (NumberFormatException nfe) {
            displayField.setText("Error");
            waitingForSecondNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TUGAS9().setVisible(true);
            }
        });
    }
}