package tests;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {

    ContactUsPage contactPageObject;
    HomePage homePageObject;

    String fullName = "Ibrahim Elzamly";
    String email = "Ibrahim@gmail.com";
    String message = "We Test The Enquiry Message";
    @Test (priority = 28)
    public void UserCanUseContactUs()
    {
        contactPageObject = new ContactUsPage(driver);
        homePageObject = new HomePage(driver);

        homePageObject.openContactPage();
        contactPageObject.contactUsPage(fullName,email,message);
        //Assert.assertTrue(contactPageObject.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner."));
    }
}
