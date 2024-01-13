package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTxtBox;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchBtn;
    @FindBy(id = "ui-id-1")
    List<WebElement> productList;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productTitle;
    @FindBy(css = "button.button-2.email-a-friend-button")
    WebElement emailFriendBtn;
    public void productSearch(String productName)
    {
        setTextElementText(searchTxtBox,productName);
        clickButton(searchBtn);
    }
    public void openProductDetailsPage()
    {
        clickButton(productTitle);
    }
    public void userCanClickOnEmailFriendBtn()
    {
        clickButton(emailFriendBtn);
    }

    public void prodcutSearchUsingAutoSuggest(String searchTxt) throws InterruptedException {
        setTextElementText(searchTxtBox,searchTxt);
        Thread.sleep(3000);
        productList.get(0).click();
    }
}
