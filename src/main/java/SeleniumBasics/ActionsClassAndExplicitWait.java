package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassAndExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
//ExplicitWait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("mousehover")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
//Actions MoveEvent
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]")).click();
//Actions KeyBoardEvent
		a.moveToElement(driver.findElement(By.xpath("//input[@id='name']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("siva").build().perform();

//selectable 
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selectable.php");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='tab-content']/child::div[1]/ul/li"));
//Way1:
//		a.clickAndHold(list.get(0));
//		a.clickAndHold(list.get(1));
//		a.clickAndHold(list.get(2));
//		a.build().perform();
//Way2:		
		a.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).build().perform();
		
	}

}
