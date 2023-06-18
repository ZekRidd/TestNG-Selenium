package tests.day16_POM_Assertions.day15_POM;

import org.junit.Assert;
import org.junit.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLoginTesti {

   @Test
    public void test01(){
       //Qualitydemy ANASAYFAYA GIDIN
       Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

       //Login linkine tıklayın
   QualitydemyPage qualitydemyPage = new QualitydemyPage();
   qualitydemyPage.ilkLoginElementi.click();

       // gecerli username ve password'u ilgili kutulara yazın
       qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
       qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));


       //Login butonuna tıklayın
       qualitydemyPage.loginButton.click();

       // basarılı olarak giris yapılamadıgını test edin
       Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

       //sayfayı kapatın
       Driver.closeDriver();
   }
}
