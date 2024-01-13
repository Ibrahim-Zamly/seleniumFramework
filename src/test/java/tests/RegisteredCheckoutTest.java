package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegisteredCheckoutTest extends TestBase
{
    UserRegistrationPage registerObject;
    HomePage homePageObject;
    LoginPage loginObject;
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    AddProductToShoppingCartPage productObject;
    CheckoutPage checkoutObject;
    OrderDetailsPage orderDetailsObject;

    String email = "ibrahimzamly12223655@gmail.com";
    String password = "1234567890";
    String prodcutName = "Apple MacBook Pro 13-inch";
//    @Test(priority = 1)
//    public void UserCanRegisterSuccessfully()
//    {
//        homePageObject = new HomePage(driver);
//        homePageObject.openRegistrationPage();
//        registerObject = new UserRegistrationPage(driver);
//        registerObject.UserRegistration("Ibrahim","Elzamly","ibrahimzamly5552322@gmail.com","1234567890");
//    }
//    @Test(priority = 2)
//    public void RegisteredUserCanLogin() throws InterruptedException {
//        homePageObject = new HomePage(driver);
//        homePageObject.openLoginPage();
//        loginObject = new LoginPage(driver);
//        loginObject.UserLogin(email,password);
//    }
    @Test (priority = 20)
    public void UserCanSearchForProducts()
    {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        searchObject.productSearch(prodcutName);
        searchObject.openProductDetailsPage();
    }
    @Test (priority = 21)
    public void userCanAddItemsToShoppingCart() throws InterruptedException {
        detailsObject = new ProductDetailsPage(driver);
        detailsObject.userCanAddProductToCart();
        detailsObject.userCanGoToShoppingCart();
    }
    @Test (priority =22)
    public void userCanClickOnCheckoutBtn()
    {
        productObject = new AddProductToShoppingCartPage(driver);
        productObject.userCanClickOnTermsOfServiceButton();
        productObject.userCanClickOnCheckOutButton();
    }
    @Test (priority = 23)
    public void userCanCheckoutAsRegisteredUser() throws InterruptedException {
        loginObject = new LoginPage(driver);
        checkoutObject = new CheckoutPage(driver);
        orderDetailsObject = new OrderDetailsPage(driver);
        registerObject = new UserRegistrationPage(driver);
        checkoutObject.userCanCheckoutAsRegisteredUser("Egypt","Cairo","Elsalam City","123456","0112356556");
        checkoutObject.confirmOrderAsGuest();
        orderDetailsObject.downloadPdfInvoice();
        //orderDetailsObject.printOrderDetails();
        registerObject.userLogout();
    }

}
