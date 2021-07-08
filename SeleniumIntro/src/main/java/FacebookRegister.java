import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FacebookRegister {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("xyz");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File SourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("./screenshots/" +"facebook-register-"+ System.currentTimeMillis() + ".png");
        //FileUtils.copyFile(SourceFile, destinationFile);
        FileHandler.copy(SourceFile, destinationFile);
        driver.quit();
    }
}
