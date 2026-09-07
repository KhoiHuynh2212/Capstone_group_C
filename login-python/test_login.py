import sys
import unittest

from PySide6.QtWidgets import QApplication, QLineEdit

from login import LoginWindow

# make the login tests
class TestLoginWindow(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        cls.app = QApplication.instance()

        if cls.app is None:
            cls.app = QApplication(sys.argv)

    def setUp(self):
        self.window = LoginWindow()

    def tearDown(self):
        self.window.close()

    # test if the username field is there
    def test_username_field_exists(self):
        self.assertIsNotNone(
            self.window.username_entry
        )

    # test for the password field
    def test_password_field_exists(self):
        self.assertIsNotNone(
            self.window.password_entry
        )

    # make sure the password is hidden
    def test_password_is_hidden(self):
        self.assertEqual(
            self.window.password_entry.echoMode(),
            QLineEdit.EchoMode.Password
        )

    # check login button existence
    def test_login_button_text(self):
        self.assertEqual(
            self.window.login_button.text(),
            "Login"
        )

    # check that the message displays after login attempt
    def test_login_button_displays_message(self):
        self.window.login_button.click()

        self.assertEqual(
            self.window.message_label.text(),
            "Login sent"
        )

# run em
if __name__ == "__main__":
    unittest.main()