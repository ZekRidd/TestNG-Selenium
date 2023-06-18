package tests.day16_POM_Assertions;

import org.junit.Assert;
import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    //Her method'da yeni driver oluşturup metot sonunda driver'ı kapatın
    @Test
    public void amazonTest(){
        //Amazon'a gidip url'in amazon içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }
    @Test
    public void wiseTest(){
        //Wisequarter anasayfaya gidip title'in wise quarter içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik = "wisequarter";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }
    @Test
    public void facebookTest(){
        //facebook anasayfaya gidip title'ın facebook içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik = "facebook";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }
}
