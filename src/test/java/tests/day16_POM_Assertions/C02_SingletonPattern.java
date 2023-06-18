package tests.day16_POM_Assertions;

import org.junit.Test;
import utilities.Driver;

public class C02_SingletonPattern {
    /*
        Otomasyon icin elimiz ve kulagımız olan driver class'ındaki
        WebDriver objesini kullanıyoruz.

        Ancak driver'ın bizim istedigimiz islemleri yapabilmesi icin
        oncelikle getDriver() icinde yaptıgımız atama islemlerine ihtiyac var

        Bir framework'de calısan kisilerin
        getDriver() kullanmadan direk driver objesine erisimini engellemek icin
        Singleton Pattern kullanımı tercih edilmiştir.

        Singleton Pattern; bir class'dan obje oluşturulmasını ve o obje ile
        class'daki class uyelreine erisimi engellemek icin kullanılır

        OOP concept çerçevesinde driver class'ını farklı yöntemelrle kullanabiliriz.
        Ancak ekip calısmasının tek düzen ile gitmesi önemli oldugundan farklı yöntemlerle WebDriver driver'ın
        kullanımını engellemek istiyoruz.

     */

    @Test
    public void test01(){

            //Driver.driver.get(Configuration.getProperty("amazonUrl"));
            //getDriver() calısmadıgından driver null olarak isaretlendiginden
            //NullPointerException hatası verir

        // Driver driver = new Driver();
       //  driver.get("https://www.amazon.con")


        //Driver class'ındaki constructor'ı private yapınca kimse driver class'ından
        //obje oluşturamaz

    }
}
