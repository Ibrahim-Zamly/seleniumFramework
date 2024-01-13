package pages;

//import com.sun.org.apache.xerces.internal.impl.dv.xs.IDDV;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

    public UserRegistrationPage(WebDriver driver)
    {

        super(driver);
    }

    @FindBy(id ="gender-male")
    WebElement genderRdoBtn;

    @FindBy(id = "FirstName")
    WebElement fnTxtBox;

    @FindBy(id = "LastName")
    WebElement lnTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;

    @FindBy(id = "register-button")
    WebElement registerbtn;
    @FindBy(linkText = "Log out")
    public WebElement logoutLink;
    @FindBy(css = "div.result")
    public WebElement successMessage;

    @FindBy(linkText = "My account")
    WebElement myAccountLink;
    public void UserRegistration(String firstName, String lastName, String email, String password)
    {
        clickButton(genderRdoBtn);
        setTextElementText(fnTxtBox,firstName);
        setTextElementText(lnTxtBox,lastName);
        setTextElementText(emailTxtBox,email);
        setTextElementText(passTxtBox,password);
        setTextElementText(confirmPasswordTxtBox,password);
        clickButton(registerbtn);
    }

    public void userLogout()
    {
        clickButton(logoutLink);
    }
    public void myAccountLink(){
        clickButton(myAccountLink);
    }
}
