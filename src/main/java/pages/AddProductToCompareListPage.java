package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCompareListPage extends PageBase
{
    public AddProductToCompareListPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(css = "div.page-title")
        public WebElement comparePageTitle;
        @FindBy(css = "button.button-2.remove-button")
        WebElement removeProductBtn;
        @FindBy(linkText = "Asus N551JK-XO076H Laptop")
        public WebElement prodcutNameLink;
        @FindBy(css = "a.clear-list")
        WebElement clearListBtn;


        public void removeSingleItemFromCompareList()
        {
            clickButton(removeProductBtn);
        }
        public void clearAllProductsList()
        {
            clickButton(clearListBtn);
        }
}
