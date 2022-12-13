package FirstSeleniumPac.Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageWindowCommands {
    public static void main(String[] args) {
        //        Invoke Chrome Browser
//        Open URL: https://www.google.com/
//        Maximize the window.
//        Print the position and size of the page.
        //        Minimize the page.
        //        Wait 5 seconds in the icon state and maximize the page.
        //                Print the position and dimensions of the page in maximized state.
        //        Make the page fullscreen.
        //        Close the Browser.

        // Driver imizin yolunu javaya tanıttık
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // google sayfamıza gidiyoruz

        driver.get("https://www.google.com");
        driver.manage().window().maximize();// sayfamızı maximize etmiş olduk
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        Point point = driver.manage().window().getPosition();

        int posX=point.getX();
        int posY=point.getY();
        System.out.println("posX = " + posX);
        System.out.println("posY = " + posY);
        // browser size
        Dimension dimension =driver.manage().window().getSize();
        int h=driver.manage().window().getSize().getHeight();
        int w = driver.manage().window().getSize().getWidth();
        System.out.println("h = " + h);
        System.out.println("w = " + w);
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
    }
}
