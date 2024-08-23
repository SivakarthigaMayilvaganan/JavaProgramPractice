package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarAndAssertion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		Thread.sleep(1000);
//To select current date:
		// driver.findElement(By.xpath("//*[contains(@class,'ui-state-highlight')]")).click();
//To select custom date:		
		while (!driver.findElement(By.className("ui-datepicker-month")).getText().contains("November")) {
			driver.findElement(By.xpath("//*[@title='Next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		Thread.sleep(1000);
		for (int i = 0; i < dates.size(); i++) {
			if (dates.get(i).getText().equalsIgnoreCase("25")) {
				dates.get(i).click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("sixth_date_picker")).getAttribute("value"));
		Assert.assertEquals(driver.findElement(By.id("sixth_date_picker")).getAttribute("value"), "11/25/2024");
	}
}
