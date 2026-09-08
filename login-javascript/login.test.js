/**
 * @jest-environment jsdom
 */

document.body.innerHTML = `
    <h1>Employee Login</h1>

    <label for="username">Username</label>
    <input type="text" id="username">

    <label for="password">Password</label>
    <input type="password" id="password">

    <button id="loginButton">Login</button>

    <p id="message"></p>
`;

const loginButton = document.getElementById("loginButton");
const message = document.getElementById("message");

function handleLogin() {
    message.textContent = "Login sent";
}

loginButton.addEventListener("click", handleLogin);


// test if username field exists
test("username field exists", () => {
    const username = document.getElementById("username");

    expect(username).not.toBeNull();
});


// test if password field exists
test("password field exists", () => {
    const password = document.getElementById("password");

    expect(password).not.toBeNull();
});


// make sure password is hidden
test("password is hidden", () => {
    const password = document.getElementById("password");

    expect(password.type).toBe("password");
});


// check login button text
test("login button text", () => {
    expect(loginButton.textContent).toBe("Login");
});


// check message displays after login attempt
test("login button displays message", () => {
    loginButton.click();

    expect(message.textContent).toBe("Login sent");
});

// test if login button exists
test("login button exists", () => {
    const button = document.getElementById("loginButton");

    expect(button).not.toBeNull();
});