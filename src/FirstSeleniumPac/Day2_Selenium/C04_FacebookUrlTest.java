package FirstSeleniumPac.Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookUrlTest {
    public static void main(String[] args) {
        // Invoke Chrome Driver
// Navigate to Facebook homepage URL: https://www.facebook.com/
// Verify expected equals actual URL.
// Verify expected contains Facebook Word.
        System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");

        WebDriver dirver = new ChromeDriver();
        dirver.get("https://www.facebook.com");
// Url testi
        System.out.println("URL testi yapılıyor");
        String expectedURL = "http://www.facebook.com";
        String actualURL = "http://www.facebook.com";

        if (expectedURL.equals(actualURL)) {
            System.out.println("URL testi PASSED");
        } else
            System.out.println("URL testi FAILED");
        String actualTitle = dirver.getTitle();
        System.out.println("Title testi yapılıyor");
        if (actualTitle.contains("Facebook")) {
            System.out.println("Title testi PASSED");

        } else System.out.println("Title testi FAILED");
        dirver.quit();


    }


}
