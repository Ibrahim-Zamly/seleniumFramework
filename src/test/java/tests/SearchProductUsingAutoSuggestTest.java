package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductUsingAutoSuggestTest extends TestBase {
    //String prodcutName= "Apple MacBook Pro 13-inch";
    SearchPage searchObject;
    //ProductDetailsPage detailsobject;
    @Test (priority = 3)
    public void userCanSearchWithAutoSuggest() throws InterruptedException {
        searchObject = new SearchPage(driver);
        //detailsobject = new ProductDetailsPage(driver);
        searchObject.prodcutSearchUsingAutoSuggest("MacB");
        //Assert.assertTrue(detailsobject.prodcutNameBreadcrumb.getText().equalsIgnoreCase(prodcutName));
    }
}
