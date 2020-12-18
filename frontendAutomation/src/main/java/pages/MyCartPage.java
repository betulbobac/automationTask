package pages;

import constant.MainPageXpathConstants;
import constant.MyCartXpathConstants;
import interfaces.IMainPage;
import interfaces.IMyCart;
import org.openqa.selenium.WebDriver;

public class MyCartPage extends PageObject implements IMyCart {
    public MyCartPage(WebDriver driver) {
        super(driver);
    }

     @Override
    public boolean isProductAddedCart() {
        return super.isElementExist(MyCartXpathConstants.ADDED_SUCCESS);
    }
}
