package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class MyAccountTest extends TestBase
{

    HomePage homePageObject;
    LoginPage loginObject;
    UserRegistrationPage registerObject;
    MyAccountPage myAccountObject;
    String firstName = "Ibrahim";
    String lastName = "Elzamly";
    String email = "ibrahimzamly613@gmail.com";
    String password = "1234567890";
    String newPassword = "123456789";
//    @Test(priority = 1)
//    public void UserCanRegisterSuccessfully()
//    {
//        homePageObject = new HomePage(driver);
//        homePageObject.openRegistrationPage();
//        registerObject = new UserRegistrationPage(driver);
//        registerObject.UserRegistration(firstName,lastName,email,password);
//        //Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
//    }

//    @Test (priority = 2)
//    public void RegisteredUserCanLogin() throws InterruptedException {
//        homePageObject = new HomePage(driver);
//        homePageObject.openLoginPage();
//        loginObject = new LoginPage(driver);
//        loginObject.UserLogin(email,password);
//        Assert.assertTrue(registerObject.logoutLink.isDisplayed());
//    }

    @Test(priority = 29 )
    public void RegisteredUserCanChangePassword() throws InterruptedException {
        myAccountObject = new MyAccountPage(driver);
        registerObject = new UserRegistrationPage(driver);
        loginObject = new LoginPage(driver);
        homePageObject = new HomePage(driver);
        homePageObject.openLoginPage();
        loginObject.UserLogin("ibrahimzamlyyy000@gmail.com","1234567890");
        registerObject.myAccountLink();
        myAccountObject.openChangePasswordLink();
        myAccountObject.userChangePassword(password,newPassword);
        homePageObject.closeChangePasswordMessage();
        Thread.sleep(2000);
        registerObject.userLogout();
//        homePageObject.openLoginPage();
//        loginObject.UserLogin(email,newPassword);
    }



}
