package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		System.out.println(driver.findElements(By.xpath("//*[@id='courses-iframe']")).size());
		driver.switchTo().frame(0);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]"))).build().perform();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
	}
}
