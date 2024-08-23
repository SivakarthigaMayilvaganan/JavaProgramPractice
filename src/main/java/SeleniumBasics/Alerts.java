package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
//To get Unhandled Alert Exception:
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("QA");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		}
}
