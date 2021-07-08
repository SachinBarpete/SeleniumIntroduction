import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class KeyboardOperations {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //move the mouse by x and y coordinate
        // robot.mouseMove(300, 500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_N);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        // ****************

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.get("https://www.flipkart.com/");
            }
        }
        // ********************

        Thread.sleep(2000);

        driver.switchTo().window(mainWindowHandle);
        driver.get("https://mail.google.com/mail");

        driver.close();
    }
}
