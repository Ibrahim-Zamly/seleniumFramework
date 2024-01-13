package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class    EmailFriendTest extends TestBase{
        String firstName = "Ibrahim";
        String lastName = "Elzamly";
        String email = "ibrahimelzamlyy2551@gmail.com";
        String password = "1234567890";
        String friendEmail="ahmed@gmail.com";
        String personalMessage = "You Can Send A Message For You My Friend";
        UserRegistrationPage userRegistrationObject;
        LoginPage loginObject;
        SearchPage searchObject;
        HomePage homeObject;
        EmailFriendPage emailFriendObject;

//        @Test (priority = 1)
//        public void UserCanRegisterSuccessfully()
//        {
//            homeObject = new HomePage(driver);
//            homeObject.openRegistrationPage();
//            userRegistrationObject = new UserRegistrationPage(driver);
//            userRegistrationObject.UserRegistration(firstName,lastName,email,password);
//        }
//        @Test (priority = 2)
//        public void RegisteredUserCanLogin() throws InterruptedException {
//             homeObject = new HomePage(driver);
//             homeObject.userCanClickOnHomepageBtn();
//             homeObject.openLoginPage();
//             loginObject = new LoginPage(driver);
//             loginObject.UserLogin(email,password);
//        }
        @Test (priority = 5)
        public void userCanSearchWithAutoSuggest() throws InterruptedException
        {
            searchObject = new SearchPage(driver);
            searchObject.prodcutSearchUsingAutoSuggest("MacB");
            searchObject.userCanClickOnEmailFriendBtn();
        }

        @Test (priority = 6)
        public void userCanSendEmailToFriend() throws InterruptedException
        {
            emailFriendObject = new EmailFriendPage(driver);
            emailFriendObject.sendEmailToFriend(friendEmail,personalMessage);
            //Assert.assertTrue(emailFriendObject.successMessage.getText().contains("Your message has been sent."));
        }
//        @Test(priority = 7)
//        public void RegisteredUserCanLogout() throws InterruptedException {
//            Thread.sleep(2000);
//            userRegistrationObject.userLogout();
//        }
}
