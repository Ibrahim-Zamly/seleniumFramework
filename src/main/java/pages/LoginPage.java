package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(id = "Email")
    WebElement emailTxtBox;
    @FindBy (id = "Password")
    WebElement passwordTxtBox;
    @FindBy (css = "button.button-1.login-button")
    WebElement loginBtn;
    @FindBy(css = "button.button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestBtn;


    public void UserLogin(String email,String password)
    {
        setTextElementText(emailTxtBox,email);
        setTextElementText(passwordTxtBox,password);
        clickButton(loginBtn);
    }
    public void userCanCheckoutAsGuest()
    {
        clickButton(checkoutAsGuestBtn);
    }

}
