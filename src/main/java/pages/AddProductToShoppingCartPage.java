package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class AddProductToShoppingCartPage extends PageBase
{
    public AddProductToShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.page-title")
    public WebElement cartPageTitle;
    @FindBy(css = "input.qty-input")
    WebElement quantityField;
    @FindBy(css = "button.remove-btn")
    WebElement removeFromShoppingCart;
    @FindBy(id = "updatecart")
    WebElement updateShoppingCartBtn;
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckBox;
    @FindBy(id = "checkout")
    WebElement checkOutBtn;


    public void userCanUpdateTheShoppingCart(String quantity) throws InterruptedException {
        clearText(quantityField);
        Thread.sleep(2000);
        setTextElementText(quantityField,quantity);
        clickButton(updateShoppingCartBtn);
    }

    public void userCanRemoveItemsFromShoppingCart()
    {
        clickButton(removeFromShoppingCart);
    }
    public void userCanClickOnTermsOfServiceButton()
    {
        clickButton(termsOfServiceCheckBox);
    }
    public void userCanClickOnCheckOutButton()
    {
        clickButton(checkOutBtn);
    }
}
