package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends TestBase
{
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    AddProductToShoppingCartPage productObject;
    CheckoutPage checkoutObject;
    LoginPage loginObject;
    OrderDetailsPage orderDetailsObject;
    String prodcutName = "Apple MacBook Pro 13-inch";

    @Test (priority = 24)
    public void UserCanSearchForProducts()
    {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        searchObject.productSearch(prodcutName);
        searchObject.openProductDetailsPage();
    }
    @Test (priority = 25)
    public void userCanAddItemsToShoppingCart() throws InterruptedException {
        detailsObject = new ProductDetailsPage(driver);
        detailsObject.userCanAddProductToCart();
        detailsObject.userCanGoToShoppingCart();
    }
    @Test (priority = 26)
    public void userCanClickOnCheckoutBtn()
    {
        productObject = new AddProductToShoppingCartPage(driver);
        productObject.userCanClickOnTermsOfServiceButton();
        productObject.userCanClickOnCheckOutButton();
    }
    @Test (priority = 27)
    public void userCanCheckoutAsGuest() throws InterruptedException {
        loginObject = new LoginPage(driver);
        checkoutObject = new CheckoutPage(driver);
        orderDetailsObject = new OrderDetailsPage(driver);
        loginObject.userCanCheckoutAsGuest();
        checkoutObject.userCanCheckoutAsGuest("Ibrahim","Elzamly","ibrahim@gmail.com","Egypt","Cairo","Elsalam City","123456","0112356556");
        checkoutObject.confirmOrderAsGuest();
        orderDetailsObject.downloadPdfInvoice();
        //orderDetailsObject.printOrderDetails();
    }
}
