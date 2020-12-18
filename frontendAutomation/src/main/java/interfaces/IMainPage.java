package interfaces;

public interface IMainPage {
    void clickSignIn(String text);
    void enterEmail(String email);
    void clickCreateAnAccount();
    void checkAccountCreated();
    void enterFirstName(String firstName);
    void enterLastName(String lastName);
    void enterPassword(String pwd);
    void enterAddress(String address);
    void enterCity(String city);
    void selectState(String state);
    void enterZipCode(String zipCode);
    void enterMobilePhone(String mobilePhoneNumber);
    void clickSubmit();
    void checkNewAccountCreated();
    void clickSignOut();
    boolean checkLogoutSuccess();
    void closeNotification();
    void closeNotificationAfterLogin();
    void checkLoginSuccess();
    void clickCategory(String text);
    void checkImageLoad();
    void clickFirstBoutique();
    void clickProductDetail();
    void clickAddToCart();
}
