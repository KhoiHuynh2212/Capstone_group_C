import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Employee Login Screen - Java Swing Prototype
 * CS4273 Group C - Innospec Inventory Management System
 *
 * Layout inspired by a self-service portal style login screen,
 * re-created with generic branding and a navy/light-blue color scheme.
 */
public class LoginScreen extends JFrame {

    // Color palette (kept from reference design, branding removed)
    private static final Color NAVY = new Color(21, 58, 92);
    private static final Color LIGHT_BLUE_BORDER = new Color(120, 190, 235);
    private static final Color LINK_BLUE = new Color(70, 140, 200);
    private static final Color BACKGROUND = Color.WHITE;
    private static final Color FIELD_BG = new Color(250, 250, 250);
    private static final Color PLACEHOLDER_GRAY = new Color(150, 150, 150);

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel feedbackLabel;
    private JCheckBox rememberMeBox;
    private char defaultEchoChar;

    public LoginScreen() {
        setTitle("Employee Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 1020);
        setLocationRelativeTo(null);
        setResizable(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(BACKGROUND);
        mainPanel.setBorder(new EmptyBorder(90, 110, 60, 110));

        // Heading
        JLabel heading = new JLabel("Welcome, please log in");
        heading.setFont(new Font("SansSerif", Font.PLAIN, 34));
        heading.setForeground(NAVY);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(heading);
        mainPanel.add(Space(50));

        // Username field
        usernameField = createTextField("Username");
        usernameField.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(usernameField);
        mainPanel.add(Space(14));

        // Forgot Username link
        JLabel forgotUsername = createLink("Forgot Username");
        mainPanel.add(forgotUsername);
        mainPanel.add(Space(36));

        // Password field
        passwordField = new JPasswordField();
        defaultEchoChar = passwordField.getEchoChar();
        stylePasswordField(passwordField);
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(passwordField);
        mainPanel.add(Space(14));

        // Forgot Password link
        JLabel forgotPassword = createLink("Forgot Password");
        mainPanel.add(forgotPassword);
        mainPanel.add(Space(36));

        // Remember me checkbox
        rememberMeBox = new JCheckBox("Remember me");
        rememberMeBox.setBackground(BACKGROUND);
        rememberMeBox.setFont(new Font("SansSerif", Font.PLAIN, 20));
        rememberMeBox.setForeground(new Color(60, 60, 60));
        rememberMeBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(rememberMeBox);
        mainPanel.add(Space(45));

        // Login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 22));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(NAVY);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(new EmptyBorder(20, 0, 20, 0));
        loginButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 72));
        loginButton.addActionListener(this::handleLogin);
        mainPanel.add(loginButton);
        mainPanel.add(Space(26));

        // Create New Account link (centered, below login)
        JLabel createAccount = createLink("Create New Account");
        createAccount.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(createAccount);
        mainPanel.add(Space(26));

        // Feedback label
        feedbackLabel = new JLabel(" ");
        feedbackLabel.setFont(new Font("SansSerif", Font.PLAIN, 17));
        feedbackLabel.setForeground(NAVY);
        feedbackLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(feedbackLabel);

        add(mainPanel);
    }

    private JTextField createTextField(String placeholder) {
        JTextField field = new JTextField();
        field.setFont(new Font("SansSerif", Font.PLAIN, 22));
        field.setBackground(FIELD_BG);
        field.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(LIGHT_BLUE_BORDER, 3, true),
                new EmptyBorder(18, 20, 18, 20)));
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 68));
        addPlaceholder(field, placeholder);
        return field;
    }

    private void stylePasswordField(JPasswordField field) {
        field.setFont(new Font("SansSerif", Font.PLAIN, 22));
        field.setBackground(FIELD_BG);
        field.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(210, 210, 210), 2, true),
                new EmptyBorder(18, 20, 18, 20)));
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 68));
    }

    private void addPlaceholder(JTextField field, String placeholder) {
        field.setForeground(PLACEHOLDER_GRAY);
        field.setText(placeholder);
        field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }
            public void focusLost(java.awt.event.FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(PLACEHOLDER_GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    private JLabel createLink(String text) {
        JLabel link = new JLabel("<html><u>" + text + "</u></html>");
        link.setFont(new Font("SansSerif", Font.PLAIN, 18));
        link.setForeground(LINK_BLUE);
        link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link.setAlignmentX(Component.LEFT_ALIGNMENT);
        return link;
    }

    private Component Space(int height) {
        return Box.createRigidArea(new Dimension(0, height));
    }

    private void handleLogin(ActionEvent e) {
        String username = usernameField.getText();
        feedbackLabel.setText("Login attempted for: " + username);
    }

    // Getters for unit testing
    public JTextField getUsernameField() { return usernameField; }
    public JPasswordField getPasswordField() { return passwordField; }
    public JButton getLoginButton() { return loginButton; }
    public JLabel getFeedbackLabel() { return feedbackLabel; }
    public char getDefaultEchoChar() { return defaultEchoChar; }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginScreen screen = new LoginScreen();
            screen.setVisible(true);
        });
    }
}