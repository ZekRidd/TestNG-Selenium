package tests.day16_POM_Assertions.day14_TestNGFramework;

import org.junit.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_DriverIlkTest {

    /*
        POM'de driver olusturmak icin inheritance ile kullandıgımız
        TestBase class'ı yerine static yollarla ulasabilecegimiz
        bir method kullanılması tercih edilmistir.

        Driver bizim icin cok onemli oldugundan driver icin bagımsız bir class olusturacagız


     */

    @Test
    public void test01(){

        //amazon anasayfaya gidin

        Driver.getDriver().get("https://www.amazon.com");
        //nutella icin arama yapın

        //Arama sonuclarının nutella icerdigini test edin

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
