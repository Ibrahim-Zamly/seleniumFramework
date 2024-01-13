package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "FullName")
    WebElement fullnameTxt;
    @FindBy(id = "Email")
    WebElement emailTxt;
    @FindBy(id = "Enquiry")
    WebElement messageTxt;
    @FindBy(name = "send-email")
    WebElement submitBtn;
    public @FindBy(css = "div.result")
    WebElement successMessage;
    public void contactUsPage(String fullname, String email, String message)
    {
        setTextElementText(fullnameTxt,fullname);
        setTextElementText(emailTxt,email);
        setTextElementText(messageTxt,message);
        clickButton(submitBtn);
    }
}
