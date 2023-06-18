package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_QualitydemyNegatifLoginTesti {

    @Test
    public void test01(){

        //qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        //ilk login linkine tıklayın
        qualitydemyPage.ilkLoginElementi.click();

        //kullanıcı adı olarak ; selenium
        //password olarak ; heyacandir yazın
        qualitydemyPage.emailKutusu.sendKeys("selenium");
        qualitydemyPage.passwordKutusu.sendKeys("heyacandir");

        //login butonuna tıklayın
        qualitydemyPage.loginButton.click();

        //giris yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayı kapatın
        Driver.closeDriver();

    }
}
