package tests.day16_POM_Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertions {

    /*
        Assert işlemi ilk failed oldugunda
        Selenium çalışmayı durdurur
        ve java.lang.AssertionError hatası verir

        Eger bir test metotu içinde birden fazla assertion varsa
        ilk failed olanda çalışma durur
        sonraki assertionlar çalışmamış olur

        TestNG bu konuda bize daha rahat çalışma imkanı vermiştir.
        Istersek TestNG assertion failed olsa bile bizim istedigimiz satıra kadar çalışmaya devam eder

        "Artık rapor ver" dedigimizde failed olan tüm assertion'ları raporlar
        ve failed olan varsa çalışmayı durdurur.

     */
    @Test
    public void hardAssertion(){
        int sayi=23;

        Assert.assertTrue(sayi%2==0);  //Sayı çift mi

        Assert.assertTrue(sayi>100); //Sayı 100'den büyük mü

        Assert.assertTrue(sayi<1000); //Sayı 1000'den kücük mü

        Assert.assertFalse(sayi % 3 == 0); //Sayi'nin 3 ile bölünmediğini test edin
    }

    @Test
    public void softAssertionTesti(){

        /*
            SoftAssert class'ı sayesinde assert.All() metotunun calısacagı satıra kadar
            Tüm assertionlar failed olan olsa bile çalısmaya devam eder.

            assertAll() metotu çalıştığında failed olan assertionlara ait olan raporu verir
            ancak hangi satırda olduklarını vermez

            Selenium hata mesajı da assertAll'un bulundugu satiri işaret eder.

            Failed olan assertion'ları kolaylıkla bulabilmemiz icin , 'den sonra bir mesaj girebiliriz

         */

        int sayi=36;

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(sayi%2==0,"sayi cift olmalı");  //Sayı çift mi

        softAssert.assertTrue(sayi>100,"sayi 100'den buyuk olmali"); //Sayı 100'den büyük mü

        softAssert.assertTrue(sayi<1000,"sayi 1000'den kucuk olmalı"); //Sayı 1000'den kücük mü

        softAssert.assertFalse(sayi % 3 == 0,"sayi 3'e bolunememeli"); //Sayi'nin 3 ile bölünmediğini test edin

        softAssert.assertAll();

        // SoftAssert objesi ile assertAll() metodunu kullanmazsak
        // test PASSED olur, failed olan assertion'lar raporlanmaz.

    }
}
