package pages;

import constant.MainPageXpathConstants;
import interfaces.IMainPage;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageObject implements IMainPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickSignIn(String text) {
        super.clickElementByXpath(String.format(MainPageXpathConstants.SIGN_IN,text));
    }

    @Override
    public void enterEmail(String email) {
        super.enterTextByXpath(MainPageXpathConstants.EMAIL_INPUT_AREA,email);
    }

    @Override
    public void clickCreateAnAccount() {
        super.clickElementByXpath(MainPageXpathConstants.CREATE_ACCOUNT_BUTTON);
    }

    @Override
    public void checkAccountCreated() {
        super.waitByXpath(MainPageXpathConstants.SIGN_IN_PAGE_TITLE);
    }

    @Override
    public void enterFirstName(String firstName) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_FIRST_NAME, firstName);
    }

    @Override
    public void enterLastName(String lastName) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_LAST_NAME,lastName);
    }

    @Override
    public void enterPassword(String pwd) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_PASSWORD,pwd);
    }

    @Override
    public void enterAddress(String address) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_ADDRESS,address);
    }

    @Override
    public void enterCity(String city) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_CITY, "city");
    }

    @Override
    public void selectState(String state) {
        super.clickElementByXpath(MainPageXpathConstants.STATE_SELECT_BOX);
        super.clickElementByXpath(String.format(MainPageXpathConstants.STATE_OPTION,state));
    }

    @Override
    public void enterZipCode(String zipCode) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_ZIP_CODE,zipCode);
    }

    @Override
    public void enterMobilePhone(String mobilePhoneNumber) {
        super.enterTextByXpath(MainPageXpathConstants.ENTER_MOBILE_PHONE,mobilePhoneNumber);
    }

    @Override
    public void clickSubmit() {
        super.clickElementByXpath(MainPageXpathConstants.SUBMIT_BUTTON);
    }

    @Override
    public void checkNewAccountCreated() {
        super.waitByXpath(MainPageXpathConstants.MY_ACCOUNT_TITLE);
    }

    @Override
    public void clickSignOut() {
        super.clickElementByXpath(MainPageXpathConstants.SIGN_OUT);
    }

    @Override
    public boolean checkLogoutSuccess() {
        return super.isElementExist(String.format(MainPageXpathConstants.SIGN_IN,"Sign in"));
    }

    @Override
    public void closeNotification() {

        super.clickElementByXpath(MainPageXpathConstants.CLOSE_BUTTON_NOTIFICATION);
    }

    @Override
    public void closeNotificationAfterLogin() {
        super.clickElementByXpath(MainPageXpathConstants.CLOSE_BUTTON_NOTIFICATION_AFTER_LOGIN);
    }

    @Override
    public void checkLoginSuccess() {
        super.waitByXpath(MainPageXpathConstants.MY_ACCOUNT);
    }

    @Override
    public void clickCategory(String text) {
        super.clickElementByXpath(String.format(MainPageXpathConstants.CATEGORY,text));
    }

    @Override
    public void checkImageLoad() {
        super.isImageLoaded();
    }

    @Override
    public void clickFirstBoutique() {
        super.clickFirstElement(MainPageXpathConstants.BOUTIQUE);
    }

    @Override
    public void clickProductDetail() {
        super.clickFirstElement(MainPageXpathConstants.FIRST_PRODUCT);
    }

    @Override
    public void clickAddToCart() {
        super.clickElementByXpath(MainPageXpathConstants.ADD_TO_CART);
    }


}
