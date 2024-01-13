package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase {
    public EmailFriendPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FriendEmail")
    WebElement friendEmailTxtBox;
    @FindBy(id = "PersonalMessage")
    WebElement personalMessageTxtBox;
    @FindBy(name = "send-email")
    WebElement sendEmailBtn;
    public @FindBy(css = "div.result")
    WebElement successMessage;

    public void sendEmailToFriend(String friendEmail, String personalMessage)
    {
        setTextElementText(friendEmailTxtBox,friendEmail);
        setTextElementText(personalMessageTxtBox,personalMessage);
        clickButton(sendEmailBtn);
    }
}
