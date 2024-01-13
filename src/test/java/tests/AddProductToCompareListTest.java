package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddProductToCompareListPage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddProductToCompareListTest extends TestBase
{
    String FirstItem = "Apple MacBook Pro 13-inch";
    String SecondItem = "Asus N551JK-XO076H Laptop";

    ProductDetailsPage detailsObject;
    AddProductToCompareListPage compareListObject;
    SearchPage searchObject;
    @Test (priority = 9)
    public void userCanCompareProduct() throws InterruptedException {
        //compareListObject = new AddProductToCompareListPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        searchObject = new SearchPage(driver);

        searchObject.prodcutSearchUsingAutoSuggest(FirstItem);
        detailsObject.userCanAddItemToCompareListPage();
        searchObject.prodcutSearchUsingAutoSuggest(SecondItem);
        detailsObject.userCanAddItemToCompareListPage();
        detailsObject.userCanGoToCompareListPage();
//        Assert.assertTrue(compareListObject.comparePageTitle.getText().equals("Compare products"));
//        Assert.assertTrue(compareListObject.prodcutNameLink.getText().contains("Asus"));
    }
    @Test (priority = 10)
    public void removeItemsFromCompareList()
    {
        compareListObject = new AddProductToCompareListPage(driver);
        compareListObject.removeSingleItemFromCompareList();
        compareListObject.clearAllProductsList();
    }
}
