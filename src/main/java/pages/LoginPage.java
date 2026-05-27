package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class LoginPage {
    private final By inputUsername = By.id("user-name");
    private final By inputPassword = By.id("password");
    private final By buttonLogin = By.id("login-button");
    private final By errorMsg = By.cssSelector("[data-test='error']");


    public void login(String username, String password) {
        DriverManager.getDriver().findElement(inputUsername).sendKeys(username);
        DriverManager.getDriver().findElement(inputPassword).sendKeys(password);
        DriverManager.getDriver().findElement(buttonLogin).click();
    }

    public String getErrorMessage() {
        return DriverManager.getDriver().findElement(errorMsg).getText();
    }
}
