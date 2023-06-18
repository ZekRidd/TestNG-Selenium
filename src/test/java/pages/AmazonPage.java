package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    //Page class'ları sürekli kullandıgımız locate veya login gibi kucuk
    //islevleri iceren metotlar barındırır

    //Selenium ile locate işlemi veya herhangi bir işlem gerçekleştirmek istedigimizde
    //WebDriver objesine ihtiyacımız vardır

    // POM'de driver class'ından olusturdugumuz
    //WebDriver driver objesini page class'larına tanımlamak icin
    //PageFactory class'ından initElements() kullanılır

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //Bu ayarı constructor icine koyma sebebimiz
        //Page sayfalarına obje olusturarak ulasıldıgı icin
        //Kim page sayfasını kullanmak isterse page sayfasında obje olusturmak ıcın
        //Constructor calısacak ve bu constructor'ın icinde bulunan initElements() gerekli ayarı yapmıs olacak
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;
}
