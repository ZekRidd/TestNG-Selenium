package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTesti {

    @Test
    public void test01(){

        //Qualitydemy ANASAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //Login linkine tıklayın
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginElementi.click();

        // gecerli username ve password'u ilgili kutulara yazın
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


        //Login butonuna tıklayın
        qualitydemyPage.loginButton.click();

        // basarılı olarak giris yapıldıgını test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisYapildiginiDogrula.isDisplayed());

        //sayfayı kapatın
        Driver.closeDriver();

    }

}
