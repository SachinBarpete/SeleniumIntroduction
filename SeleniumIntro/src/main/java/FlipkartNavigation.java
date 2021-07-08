import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.in/");

        Thread.sleep(2000);
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();
    }
}
