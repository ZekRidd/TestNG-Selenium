package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_ConfigurationDosyasiKullanma {

    /*
        POM'de hedef test class'ında manuel olarak
        hiçbir test datasını girmemektir.

        Test Datalari;
        1-Kullanacağımız WebDriver; Driver class'ından dinamik olarak kullanıyoruz
        2- Locate ; Locate'leri page sayfasından dinamik olarak kullanıyoruz
        3- kullanılan URL, aranan kelime, expected icerik, dogru kullanıcı adi
            yanlıs kullanıcı adı... gibi datalar
     */
    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);

        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();

    }
}
