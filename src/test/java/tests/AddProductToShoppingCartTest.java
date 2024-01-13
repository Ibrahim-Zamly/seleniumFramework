package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddProductToShoppingCartPage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddProductToShoppingCartTest extends TestBase
{
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    AddProductToShoppingCartPage cartObject;

    @Test (priority = 11)
    public void userCanSearchWithAutoSuggest() throws InterruptedException
    {
        searchObject = new SearchPage(driver);
        searchObject.prodcutSearchUsingAutoSuggest("MacB");
    }

    @Test (priority = 12)
    public void userCanAddItemsToShoppingCart() throws InterruptedException {
        detailsObject = new ProductDetailsPage(driver);
        detailsObject.userCanAddProductToCart();
        detailsObject.userCanGoToShoppingCart();
    }

    @Test (priority = 13)
    public void userCanUpdateTheShoppingCart() throws InterruptedException
    {
        cartObject = new AddProductToShoppingCartPage(driver);
        cartObject.userCanUpdateTheShoppingCart("4");
        Assert.assertTrue(cartObject.cartPageTitle.getText().contains("Shopping cart"));
    }

    @Test (priority = 14)
    public void userCanRemoveItemsFromShoppingCart()
    {
        cartObject = new AddProductToShoppingCartPage(driver);
        cartObject.userCanRemoveItemsFromShoppingCart();
    }
}
