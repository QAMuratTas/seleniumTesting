package FirstSeleniumPac.Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c03_FirefoxTest {
    public static void main(String[] args) {
//        Invoke FireFox Driver
//        Go to https://www.youtube.com/
//        Verify the page title contains the word video.
//        Close the driver.

        System.setProperty("webdriver.gecko.driver","Dependencies/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");

String pageTitle = driver.getTitle();
if (pageTitle.contains("video")){

    System.out.println("Title testi PASSED");

}else
    System.out.println("Title testi FAILED");

driver.quit();


    }
}
