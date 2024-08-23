package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingsAndClose_Quit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Open']")).click();
        
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentWindow=it.next();
        String ChildWindow=it.next();
        driver.switchTo().window(ChildWindow);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.xpath("//*[text()='Open Multiple']")).click();
        driver.quit();
	}
}
