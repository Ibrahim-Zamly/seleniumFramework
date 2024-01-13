package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase {
        String prodcutName= "Apple MacBook Pro 13-inch";
        SearchPage searchObject;
        //ProductDetailsPage detailsobject;
        @Test (priority = 4)
    public void UserCanSearchForProducts()
        {
            searchObject = new SearchPage(driver);
           // detailsobject = new ProductDetailsPage(driver);
            searchObject.productSearch(prodcutName);
            searchObject.openProductDetailsPage();
            //Assert.assertTrue(detailsobject.prodcutNameBreadcrumb.getText().equalsIgnoreCase(prodcutName));
        }
}
