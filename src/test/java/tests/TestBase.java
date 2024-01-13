package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Helper;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static String downloadPath = System.getProperty("user.dir") + "/downloads";

    public static ChromeOptions chromeOption()
    {
        ChromeOptions options = new ChromeOptions();
        HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
        chromePrefs.put("profile.default.content_settings.popups",0);
        chromePrefs.put("download.default_directory",downloadPath);
        options.setExperimentalOption("prefs",chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        return options;
    }
    @BeforeSuite
    @Parameters({"browser"})

    public void startDriver(@Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }

    // Taking screenshot when test case fail and add it in the folder of screenshot
    @AfterMethod
    public void screenshotOnFailure(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("Failed !");
            System.out.println("Taking Screenshot...");
            Helper.captureScreenshot(driver,result.getName());
        }
    }
}
