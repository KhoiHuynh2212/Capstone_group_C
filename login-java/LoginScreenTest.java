import javax.swing.*;

/**
 * Simple headless test runner for LoginScreen.
 * No external test framework required (pure Java assertions),
 * so it can run anywhere the JDK is installed.
 *
 * Covers the requirements from the README:
 *  - username field exists
 *  - password field exists
 *  - password field masks input
 *  - login button exists
 *  - login button has correct text
 *  - clicking login produces expected placeholder feedback
 */
public class LoginScreenTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginScreen screen = new LoginScreen();

            testUsernameFieldExists(screen);
            testPasswordFieldExists(screen);
            testPasswordFieldMasksInput(screen);
            testLoginButtonExists(screen);
            testLoginButtonHasCorrectText(screen);
            testLoginButtonProducesFeedback(screen);

            System.out.println();
            System.out.println("========================================");
            System.out.println("Results: " + passed + " passed, " + failed + " failed");
            System.out.println("========================================");

            screen.dispose();
            System.exit(failed == 0 ? 0 : 1);
        });
    }

    private static void check(String testName, boolean condition) {
        if (condition) {
            System.out.println("[PASS] " + testName);
            passed++;
        } else {
            System.out.println("[FAIL] " + testName);
            failed++;
        }
    }

    private static void testUsernameFieldExists(LoginScreen screen) {
        check("Username field exists", screen.getUsernameField() != null);
    }

    private static void testPasswordFieldExists(LoginScreen screen) {
        check("Password field exists", screen.getPasswordField() != null);
    }

    private static void testPasswordFieldMasksInput(LoginScreen screen) {
        char echoChar = screen.getDefaultEchoChar();
        check("Password field masks input (echo char set)", echoChar != 0);
    }

    private static void testLoginButtonExists(LoginScreen screen) {
        check("Login button exists", screen.getLoginButton() != null);
    }

    private static void testLoginButtonHasCorrectText(LoginScreen screen) {
        check("Login button text is 'Login'", "Login".equals(screen.getLoginButton().getText()));
    }

    private static void testLoginButtonProducesFeedback(LoginScreen screen) {
        screen.getUsernameField().setText("jdoe");
        screen.getLoginButton().doClick();
        String feedback = screen.getFeedbackLabel().getText();
        check("Login button click produces feedback containing username",
                feedback != null && feedback.contains("jdoe"));
    }
}