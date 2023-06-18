package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_QualitydemyLoginTest {

    @Test
    public void test01(){

        //Qualitydemy ANASAYFAYA GIDIN
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        //Login linkine tıklayın
        qualitydemyPage.ilkLoginElementi.click();


        // gecerli username ve password'u ilgili kutulara yazın
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        //Login butonuna tıklayın
        qualitydemyPage.loginButton.click();

        // basarılı olarak giris yapıldıgını test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisYapildiginiDogrula.isDisplayed());

        //sayfayı kapatın
        Driver.closeDriver();
    }

}
