import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JFrame {
    private JTextField userTextField;
    private JPasswordField passwordField;

    public LoginView() {
        setTitle("Aplikasi DagDigDug");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GREEN);
        leftPanel.setBounds(0, 0, 150, 300);
        add(leftPanel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(160, 30, 100, 25);
        add(userLabel);
        userTextField = new JTextField();
        userTextField.setBounds(160, 60, 200, 30);
        add(userTextField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(160, 100, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 130, 200, 30);
        add(passwordField);

        JButton loginButton = new JButton("Masuk");
        loginButton.setBounds(160, 180, 200, 40);
        loginButton.setBackground(new Color(0, 122, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(e -> {
            new HomeView(userTextField.getText()).setVisible(true);
            setVisible(false);
        });
        add(loginButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
