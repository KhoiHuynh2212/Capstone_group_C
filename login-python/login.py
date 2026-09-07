import sys

from PySide6.QtWidgets import (
    QApplication,
    QWidget,
    QLabel,
    QLineEdit,
    QPushButton,
    QVBoxLayout
)

# create the login window
class LoginWindow(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Employee Login")
        self.resize(300, 220)

        # make title
        title = QLabel("Employee Login")

        # make username label and entry
        username_label = QLabel("Username")
        self.username_entry = QLineEdit()

        # make password label and entry
        password_label = QLabel("Password")
        self.password_entry = QLineEdit()
        self.password_entry.setEchoMode(
            QLineEdit.EchoMode.Password
        )

        # make the login buttin
        self.login_button = QPushButton("Login")
        self.login_button.clicked.connect(
            self.handle_login
        )

        # login messahe
        self.message_label = QLabel("")

        # make the layout of the window
        layout = QVBoxLayout()

        layout.addWidget(title)
        layout.addWidget(username_label)
        layout.addWidget(self.username_entry)
        layout.addWidget(password_label)
        layout.addWidget(self.password_entry)
        layout.addWidget(self.login_button)
        layout.addWidget(self.message_label)

        self.setLayout(layout)

    def handle_login(self):
        self.message_label.setText("Login sent")

# run it
if __name__ == "__main__":
    app = QApplication(sys.argv)

    window = LoginWindow()
    window.show()

    app.exec()