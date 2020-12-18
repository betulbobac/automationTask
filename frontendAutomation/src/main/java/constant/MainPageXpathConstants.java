package constant;

public class MainPageXpathConstants {
    public static final String SIGN_IN = "//span[contains(text(),'%s')]";
    public static final String EMAIL_INPUT_AREA = "//input[@id='login-email']";
    public static final String CREATE_ACCOUNT_BUTTON = "//*[@id='SubmitCreate']";
    public static final String SIGN_IN_PAGE_TITLE = "//*[text()='Your personal information']";
    public static final String ENTER_FIRST_NAME = "//*[@id='customer_firstname']";
    public static final String ENTER_LAST_NAME = "//*[@id='customer_lastname']";
    public static final String ENTER_PASSWORD = "//input[@id='login-password-input']";
    public static final String ENTER_ADDRESS = "//*[@id=\"address1\"]";
    public static final String ENTER_CITY = "//*[@id=\"city\"]";
    public static final String STATE_SELECT_BOX = "//*[@id=\"id_state\"]";
    public static final String STATE_OPTION = "//*[text()=\"%s\"]";
    public static final String ENTER_ZIP_CODE = "//*[@id=\"postcode\"]";
    public static final String ENTER_MOBILE_PHONE = "//*[@id=\"phone_mobile\"]";
    public static final String REGISTER_BUTTON = "//*[text()='Register']";
    public static final String MY_ACCOUNT_TITLE = "//h1[text()='My account']" ;
    public static final String CHECK_OUT_BUTTON = "//*[@title='Check out']";
    public static final String WINDOW = "//div[@class=\"primary_block row\"]";
    public static final String SIGN_OUT = "//*[text()='Sign out']";
    public static final String HOME_PAGE_CONSTANT = "//div[@id='popupContainer']";
    public static final String CLOSE_BUTTON_NOTIFICATION = "//a[@title='Close']";
    public static final String SUBMIT_BUTTON = "//*[@class='q-primary q-fluid q-button-medium q-button submit' and span='Giriş Yap']";
    public static final String NOTIFICATION_POPUP = "//div[@class='notification-popup-container']";
    public static final String CLOSE_BUTTON_NOTIFICATION_AFTER_LOGIN = "//*[@id='Combined-Shape']";
    public static final String MY_ACCOUNT = "//span[text()='Hesabım']";
    public static final String CATEGORY = "//a[text()='%s']";
    public static final String IMAGE_BUTIQUE = "//article[@class='component-item']";
    public static final String BOUTIQUE = "//span[@class='image-container']";
    public static final String FIRST_PRODUCT = "//*[@id=\"boutique-detail-app\"]//following::img";
    public static final String ADD_TO_CART = "//*[text()='Sepete Ekle']";
}
