package tests.day16_POM_Assertions.day14_TestNGFramework;

import org.junit.Test;

/*
    TestNG testleri harf sırasına göre çalıştırır
 */
public class C01_PriorityClass {

    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
