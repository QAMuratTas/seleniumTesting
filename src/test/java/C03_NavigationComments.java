import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationComments {
    public static void main(String[] args) {
        /*
        Invoke Chrome Browser
        Navigate to URL: https://clarusway.com/
        Navigate to URL: http://amazon.com/
        Come back to the Clarusway using the back command.
        Again go back to the amazon website using forward command
        Refresh the Browser using refresh command.
        Close the Browser.
         */
        // Chromedriver i uyandırdık.
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://clarusway.com/");// clarusway sitesine gittik
        driver.navigate().to("http://amazon.com/");// amazon sitesine gittik
        driver.navigate().back();//clarusway e geri döndük geri tuşuyla
        driver.navigate().forward();//amazona geri döndük ileri tuşuyla
        driver.navigate().refresh();// sayfamızı yeniledik

        //driver.close();
        driver.quit();//browser imiz kapattık


    }
}
