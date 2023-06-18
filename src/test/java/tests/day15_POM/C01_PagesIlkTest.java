package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){
        //amazon anasayfaya gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //Nutella icin arama yapalım
        //Arama kutusunun locate'i page sayfasında
        // POM'de pages sayfasındaki locate'lere erismek icin
        //Pages sayfasından bir obje olusturulur

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        //Sonucların nutella icerdigini test edelim ve sayfayı kapatalım
        String expectedIcerik = "Nutella";
        String actualAramaSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();
    }
}
