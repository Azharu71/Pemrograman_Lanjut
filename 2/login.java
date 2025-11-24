import javax.swing.*;

public class login {

    public static void main(String[] args) {
        JFrame frame = new JFrame("LOGIN");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(loginButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
