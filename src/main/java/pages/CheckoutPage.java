package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.net.IDN;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.page-title")
    WebElement checkoutPageTitle;
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement checkoutFirstName;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement checkoutLastName;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement checkoutEmail;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement checkoutCountryList;
    @FindBy(id = "BillingNewAddress_City")
    WebElement checkoutCity;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement checkoutAddress;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement checkoutPostalCode;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement checkoutPhoneNumber;
    @FindBy(css = "button.button-1.new-address-next-step-button")
    WebElement checkoutBillingContinueBtn;
    @FindBy(id = "shippingoption_2")
    WebElement shippingMethodRadioBtn;
    @FindBy(css = "button.button-1.shipping-method-next-step-button")
    WebElement shippingMethodBtn;
    @FindBy(id = "paymentmethod_0")
    WebElement paymentMethodRadioBtn;
    @FindBy(css = "button.button-1.payment-method-next-step-button")
    WebElement paymentMethodBtn;
    @FindBy(css = "button.button-1.payment-info-next-step-button")
    WebElement paymentInfoBtn;
    @FindBy (css = "ul.info-list")
    public WebElement confirmOrderBodyTxt;
    @FindBy (css = "button.button-1.confirm-order-next-step-button")
    WebElement confirmOrderBtn;
    @FindBy(linkText = "Click here for order details.")
    WebElement orderDetailsLink;
    public void userCanCheckoutAsGuest(String fName, String lName, String email, String countryName, String city, String address, String postal, String number) throws InterruptedException {
        Thread.sleep(2000);
        setTextElementText(checkoutFirstName,fName);
        setTextElementText(checkoutLastName,lName);
        setTextElementText(checkoutEmail,email);
        select = new Select(checkoutCountryList);
        select.selectByVisibleText(countryName);
        setTextElementText(checkoutCity,city);
        setTextElementText(checkoutAddress,address);
        setTextElementText(checkoutPostalCode,postal);
        setTextElementText(checkoutPhoneNumber,number);
        clickButton(checkoutBillingContinueBtn);
        Thread.sleep(2000);
    }

    public void userCanCheckoutAsRegisteredUser(String countryName,String city,String address,String postal,String number) throws InterruptedException {
        Thread.sleep(2000);
        select = new Select(checkoutCountryList);
        select.selectByVisibleText(countryName);
        setTextElementText(checkoutCity,city);
        setTextElementText(checkoutAddress,address);
        setTextElementText(checkoutPostalCode,postal);
        setTextElementText(checkoutPhoneNumber,number);
        clickButton(checkoutBillingContinueBtn);
        Thread.sleep(2000);
    }
    public void confirmOrderAsGuest() throws InterruptedException {
        clickButton(shippingMethodRadioBtn);
        clickButton(shippingMethodBtn);
        Thread.sleep(2000);
        clickButton(paymentMethodRadioBtn);
        clickButton(paymentMethodBtn);
        Thread.sleep(2000);
        clickButton(paymentInfoBtn);
        Thread.sleep(2000);
        clickButton(confirmOrderBtn);
        Thread.sleep(2000);
        clickButton(orderDetailsLink);
    }
}
