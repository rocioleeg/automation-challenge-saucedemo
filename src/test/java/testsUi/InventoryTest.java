package testsUi;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import utils.TestData;

public class InventoryTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    CartPage cartPage = new CartPage();

    @Test
    public void shouldAddProductToCart() {
        loginPage.login(TestData.STANDARD_USER, TestData.PASSWORD);
        inventoryPage.addBackpackToCart();
        Assert.assertEquals(inventoryPage.getCartBadgeText(), "2");
        inventoryPage.openCart();
        Assert.assertTrue(cartPage.isBackpackDisplayed());
    }

    @Test
    public void shouldRemoveProductFromCart() {
        loginPage.login(TestData.STANDARD_USER, TestData.PASSWORD);
        inventoryPage.addBackpackToCart();
        inventoryPage.openCart();
        cartPage.removeBackpack();
        Assert.assertTrue(cartPage.isBackpackRemoved());
    }
}
