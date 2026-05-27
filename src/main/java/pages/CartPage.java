package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class CartPage {

    private final By backpackItem = By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By removeButton = By.id("remove-sauce-labs-backpack");

    public boolean isBackpackDisplayed() {return DriverManager.getDriver().findElement(backpackItem).isDisplayed();
    }

    public void removeBackpack() {DriverManager.getDriver().findElement(removeButton).click();
    }

    public boolean isBackpackRemoved() {
        return DriverManager.getDriver().findElements(backpackItem).isEmpty();
    }
}
