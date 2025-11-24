import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    private JTextField displayField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                calculator calc = new calculator();
                calc.setVisible(true);
            }
        });
    }

    public calculator() {
        // // Set window
        setTitle("KalkulatorR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 480);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // text tempat angka ditampilkan
        displayField = new JTextField("");
        displayField.setEditable(false);
        Border line = BorderFactory.createLineBorder(Color.BLACK, 1);
        Border padding = BorderFactory.createEmptyBorder(25, 10, 25, 10);
        displayField.setBorder(BorderFactory.createCompoundBorder(line, padding));
        displayField.setFont(new Font("Arial", Font.BOLD, 30));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setBackground(Color.WHITE);
        add(displayField, BorderLayout.NORTH);

        // button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 6, 0, 0));
        String[] buttonLabels = {
                "1", "2", "3", "4", "5", "6",
                "7", "8", "9", "0", "+", "-",
                "*", "/", "=", "%", "Mod", "Exit"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.setBackground(Color.WHITE);
            button.addActionListener(this);

            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onClick = e.getActionCommand();
        if (onClick.equals("Mod") || onClick.equals("Exit")) {
            System.exit(0);

        } else if (onClick.equals("=")) {
            displayField.setText(displayField.getText() + " = Hello World");

        } else {
            displayField.setText(displayField.getText() + onClick);
        }

    }
}
