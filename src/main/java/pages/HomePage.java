package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver)
    {
        super(driver);
        jse = (JavascriptExecutor) driver;
        action =new Actions(driver);
    }
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(css = "a.ico-login")
    WebElement loginLink;
    @FindBy(css = "span.close")
    WebElement closeChangePasswordMessage;
    @FindBy(linkText = "Contact us")
    WebElement contactUsLink;
    @FindBy(id = "customerCurrency")
    WebElement currencyDropDownList;
    @FindBy(linkText = "Computers")
    WebElement computerMenu;
    @FindBy(linkText = "Notebooks")
    WebElement notebookMenu;
    @FindBy(css = "div.header-logo")
    WebElement clickOnHomepageBtn;
    public void openRegistrationPage()
    {
        //registerLink.click();
        clickButton(registerLink);
    }
    public void userCanClickOnHomepageBtn()
    {
        clickButton(clickOnHomepageBtn);
    }
    public void openLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        clickButton(loginLink);
    }

    public void closeChangePasswordMessage()
    {
        clickButton(closeChangePasswordMessage);
    }

    public void openContactPage()
    {
        scrollToBottom();
        clickButton(contactUsLink);
    }

    public void changeCurrency()
    {
        select = new Select(currencyDropDownList);
        select.selectByVisibleText("Euro");
    }

    public void selectNotebookMenu()
    {
        action
        .moveToElement(computerMenu)
        .moveToElement(notebookMenu)
        .click()
        .build()
        .perform();
    }

}
