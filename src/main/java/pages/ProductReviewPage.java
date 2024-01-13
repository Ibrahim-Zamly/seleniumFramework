package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase{

    public ProductReviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "AddProductReview_Title")
    WebElement reviewTitleTxt;
    @FindBy(id = "AddProductReview_ReviewText")
    WebElement reviewTxt;
    @FindBy(id = "addproductrating_4")
    WebElement ratingRadioButton;
    @FindBy(name = "add-review")
    WebElement reviewSubmitBtn;
    @FindBy(css = "div.text-body")
    public WebElement reviewNotif;

    public void AddProductReview(String reviewTitle, String reviewMessage)
    {
        setTextElementText(reviewTitleTxt,reviewTitle);
        setTextElementText(reviewTxt,reviewMessage);
        clickButton(ratingRadioButton);
        clickButton(reviewSubmitBtn);
    }
}
