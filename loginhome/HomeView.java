import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {
    public HomeView(String username) {
        setTitle("Aplikasi DagDigDug - Home");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Left panel with red color
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);
        leftPanel.setBounds(0, 0, 150, 300);
        add(leftPanel);
        leftPanel.add(new JLabel(new ImageIcon("path/to/your/image.png"))); // User icon

        // Welcome label
        JLabel welcomeLabel = new JLabel("Selamat Datang, " + username);
        welcomeLabel.setBounds(160, 20, 250, 25);
        welcomeLabel.setForeground(Color.RED);
        add(welcomeLabel);

        // Right panel with cyan background
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setBounds(150, 0, 250, 300);
        add(rightPanel);

        // Yellow body panel
        JPanel bodyPanel = new JPanel();
        bodyPanel.setBackground(Color.YELLOW);
        bodyPanel.setBounds(160, 50, 240, 200);
        rightPanel.add(bodyPanel);

        // Logout button
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(160, 230, 150, 30);
        logoutButton.setBackground(new Color(0, 122, 255)); // Blue
        logoutButton.setForeground(Color.WHITE);
        logoutButton.addActionListener(e -> {
            new LoginView().setVisible(true);
            setVisible(false);
        });
        add(logoutButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
