package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class InventoryPage {

    private final By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCart = By.className("shopping_cart_link");
    private final By shoppingCartBadge = By.className("shopping_cart_badge");


    public void addBackpackToCart() {
        DriverManager.getDriver().findElement(backpackAddButton).click();
    }

    public void openCart() {
        DriverManager.getDriver().findElement(shoppingCart).click();
    }

    public String getCartBadgeText() {
        return DriverManager.getDriver().findElement(shoppingCartBadge).getText();
    }

}
