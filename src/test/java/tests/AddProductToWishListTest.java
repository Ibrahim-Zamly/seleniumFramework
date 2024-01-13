package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishlistPage;

public class AddProductToWishListTest extends TestBase
{
    SearchPage searchObject;
    ProductDetailsPage detailsobject;
    WishlistPage wishlistObject;
    @Test (priority = 17)
    public void userCanSearchWithAutoSuggest() throws InterruptedException {
        searchObject = new SearchPage(driver);
        searchObject.prodcutSearchUsingAutoSuggest("MacB");
    }

    @Test (priority = 18)
    public void userCanAddProductToWishlist() throws InterruptedException {
        detailsobject = new ProductDetailsPage(driver);
        wishlistObject= new WishlistPage(driver);
        detailsobject.addProductToWishList();
        detailsobject.userCanGoToWishlistPage();
//        Assert.assertTrue(wishlistObject.wishlistHeader.getText().contains("Wishlist"));
    }

    @Test (priority = 19)
    public void userCanRemoveProductFromWishlist()
    {
        wishlistObject= new WishlistPage(driver);
        wishlistObject.removeProductFromWishlist();
//        Assert.assertTrue(wishlistObject.emptyWishlistData.getText().contains("The wishlist is empty!"));
    }
}
