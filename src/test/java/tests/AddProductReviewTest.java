package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddProductReviewTest extends TestBase
{
    HomePage homePageObject;
    UserRegistrationPage registerObject;
    LoginPage loginObject;
    SearchPage searchObject;
    ProductDetailsPage detailsobject;
    ProductReviewPage reviewObject;
    String email = "ibrahimzamly162263@gmail.com";
    String password = "1234567890";
//    @Test (priority = 1)
//    public void UserCanRegisterSuccessfully()
//    {
//        homePageObject = new HomePage(driver);
//        homePageObject.openRegistrationPage();
//        registerObject = new UserRegistrationPage(driver);
//        registerObject.UserRegistration("Ibrahim","Elzamly",email,password);
//    }
//    @Test (priority = 2)
//    public void RegisteredUserCanLogin() throws InterruptedException {
//        homePageObject = new HomePage(driver);
//        homePageObject.openLoginPage();
//        loginObject = new LoginPage(driver);
//        loginObject.UserLogin(email,password);
//    }
    @Test (priority = 15)
    public void userCanSearchWithAutoSuggest() throws InterruptedException {
        searchObject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchObject.prodcutSearchUsingAutoSuggest("MacB");
        detailsobject.userCanClickOnAddReviewBtn();
    }
    @Test (priority = 16)
    public void userCanAddReviewOnProduct()
    {
        reviewObject = new ProductReviewPage(driver);
        reviewObject.AddProductReview("Test Message Review Title","Your Message For Test So I Can Add Review Easily Without Any Problems");
        //Assert.assertTrue(reviewObject.reviewNotif.getText().contains("Test"));
    }
}
