package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Change password")
    WebElement changePasswordLink;
    @FindBy(id="OldPassword")
    WebElement oldPasswordTxtBox;
    @FindBy(id = "NewPassword")
    WebElement newPasswordTxtBox;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmNewPasswordTxtBox;
    @FindBy(css = "button.button-1.change-password-button")
    WebElement changePasswordButton;
    public void openChangePasswordLink()
    {
        clickButton(changePasswordLink);

    }

    public void userChangePassword(String oldPassword,String newPassword)
    {
        setTextElementText(oldPasswordTxtBox,oldPassword);
        setTextElementText(newPasswordTxtBox,newPassword);
        setTextElementText(confirmNewPasswordTxtBox,newPassword);
        clickButton(changePasswordButton);
    }
}
