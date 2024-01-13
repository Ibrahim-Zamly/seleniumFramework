package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase
{
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Print")
    WebElement printBtn;
    @FindBy(linkText = "PDF Invoice")
    WebElement pdfInoviceBtn;

    public void downloadPdfInvoice() throws InterruptedException {
        clickButton(pdfInoviceBtn);
        Thread.sleep(10000);
    }
    public void printOrderDetails()
    {
        clickButton(printBtn);
    }

}
