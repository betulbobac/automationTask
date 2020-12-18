package frontend;

import constant.MainPageXpathConstants;
import constant.TestSettingConstants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;
import pages.MyCartPage;
import util.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest  {
    protected static WebDriver driver;
    protected static MainPage mainPage;
    protected static MyAccountPage myAccountPage;
    protected static MyCartPage myCartPage;




    @BeforeSuite
    public static void setUpSuite(){
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        String url = TestSettingConstants.URL;
        driver = webDriverFactory.createWebDriver(TestSettingConstants.CHROME);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        mainPage = new MainPage(driver);
        myAccountPage = new MyAccountPage(driver);
        myCartPage = new MyCartPage(driver);

        if(mainPage.isElementExist(MainPageXpathConstants.HOME_PAGE_CONSTANT)){
            mainPage.closeNotification();
        }
        mainPage.clickSignIn("Giriş Yap");
        mainPage.enterEmail("test@automation.com");
        mainPage.enterPassword("automation@123");
        mainPage.clickSubmit();
        if(mainPage.isElementExist(MainPageXpathConstants.NOTIFICATION_POPUP)){
            mainPage.closeNotificationAfterLogin();
        }

        mainPage.checkLoginSuccess();
    }

    @AfterSuite
    public static void tearDownSuite(){
       // mainPage.clickSignOut();
       // Assert.assertTrue(mainPage.checkLogoutSuccess());
        //driver.close();
    }
}
