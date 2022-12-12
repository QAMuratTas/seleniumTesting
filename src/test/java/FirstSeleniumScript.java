import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

    public static void main(String[] args) {
        // Adim 1- Chrome driver imizin path ini belriliyoruz (projeye tanıtoyruz)
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");

        // Adim 2 - Driver objemizi oluşturmuş oldu
        WebDriver driver =new ChromeDriver();

            driver.get("https://www.google.com");



    }
}
