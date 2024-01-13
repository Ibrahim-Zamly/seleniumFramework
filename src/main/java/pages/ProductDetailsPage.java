package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "strong.current-item")
    public WebElement prodcutNameBreadcrumb;
    @FindBy(id = "price-value-4")
    public WebElement productPriceLbl;
    @FindBy(linkText = "Add your review")
     WebElement addReviewBtn;
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addWishlistBtn;
    @FindBy(linkText = "wishlist")
    WebElement wishlistLink;
    @FindBy(css = "button.button-2.add-to-compare-list-button")
    WebElement compareListBtn;
    @FindBy(linkText = "product comparison")
    WebElement compareListLink;
    @FindBy(id = "add-to-cart-button-4")
    WebElement addToCartBtn;
    @FindBy(linkText = "shopping cart")
    WebElement addToCartLink;
    public void userCanClickOnAddReviewBtn()
    {
          clickButton(addReviewBtn);
    }
    public void addProductToWishList()
    {
        clickButton(addWishlistBtn);
    }
    public void userCanGoToWishlistPage() throws InterruptedException {
        Thread.sleep(2000);
        clickButton(wishlistLink);
    }
    public void userCanAddItemToCompareListPage()
    {
        clickButton(compareListBtn);
    }
    public void userCanGoToCompareListPage() throws InterruptedException {
        Thread.sleep(2000);
        clickButton(compareListLink);
    }
    public void userCanAddProductToCart()
    {
        clickButton(addToCartBtn);
    }
    public void userCanGoToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        clickButton(addToCartLink);
    }
}
