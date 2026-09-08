const loginButton = document.getElementById("loginButton");
const message = document.getElementById("message");

function handleLogin() {
    message.textContent = "Login sent";
}

loginButton.addEventListener("click", handleLogin);

module.exports = { handleLogin };