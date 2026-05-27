package testsUi;

import core.BaseTest;
import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestData;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void shouldLoginSuccessfully() {
        loginPage.login(TestData.STANDARD_USER, TestData.PASSWORD);
        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"));
    }

    @Test
    public void shouldShowErrorWithInvalidCredentials() {
        loginPage.login(TestData.INVALID_USER, TestData.INVALID_PASSWORD);
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Username and password"));
    }
}