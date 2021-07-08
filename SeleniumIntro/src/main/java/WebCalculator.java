import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebCalculator {
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
    //System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver.exe");
	
	System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	//driver = new ChromeDriver();
	
	String driverOption = "edge";
	
    driver.manage().window().maximize();
   
    driver.get("https://web2.0calc.com/");
    
    String homePageTitle = driver.getTitle();
    System.out.println("Tittle : " + homePageTitle);
    
    driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
    
    String title = driver.getTitle();
    System.out.println("Tittle : " + title);
    
    String currentURL = driver.getCurrentUrl(); 
    System.out.println("Current URL : " + currentURL);
   
    driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("TestUser");
   
    driver.findElement(By.id("inputEmail")).sendKeys("testemail@gmail.com");
    
    driver.findElement(By.id("inputPassword1")).sendKeys("Testpassword");
  
    driver.findElement(By.id("inputPassword2")).sendKeys("Testpassword");
}

}
