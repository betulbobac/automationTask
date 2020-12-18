package frontend;

import constant.MainPageConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class Case1 extends BaseTest{

    @Test
    public void Case3_TC001(){

        mainPage.clickCategory("KADIN");
        mainPage.checkImageLoad();
        mainPage.clickCategory("ERKEK");
        mainPage.checkImageLoad();
        mainPage.clickCategory("ÇOCUK");
        mainPage.checkImageLoad();
        mainPage.clickCategory("EV & YAŞAM");
        mainPage.checkImageLoad();
        mainPage.clickCategory("SÜPERMARKET");
        mainPage.checkImageLoad();
        mainPage.clickCategory("KOZMETİK");
        mainPage.checkImageLoad();
        mainPage.clickCategory("AYAKKABI & ÇANTA");
        mainPage.checkImageLoad();
        mainPage.clickCategory("SAAT & AKSESUAR");
        mainPage.checkImageLoad();
        mainPage.clickCategory("ELEKTRONİK");
        mainPage.checkImageLoad();

        mainPage.clickFirstBoutique();
        mainPage.checkImageLoad();
        mainPage.clickProductDetail();
        mainPage.clickAddToCart();

        Assert.assertTrue(myCartPage.isProductAddedCart());

    }

}
