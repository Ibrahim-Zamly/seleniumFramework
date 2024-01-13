package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTest extends TestBase
{
    HomePage homeObject;
    ProductDetailsPage detailsObject;
    SearchPage searchObject;

    @Test (priority = 7)
    public void UserCanChangeCurrency()
    {
        homeObject = new HomePage(driver);
        homeObject.changeCurrency();
    }

    @Test (priority = 8)
    public void userCanSearchWithAutoSuggest() throws InterruptedException {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        searchObject.prodcutSearchUsingAutoSuggest("MacB");
//        Assert.assertTrue(detailsObject.productPriceLbl.getText().contains("€"));
    }
}
