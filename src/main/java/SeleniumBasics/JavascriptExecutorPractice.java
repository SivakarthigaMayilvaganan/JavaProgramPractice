package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
//ScrollDown
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
//ScrollUp
        js.executeScript("window.scrollBy(0,-500)");
//ScrollDowntoBottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//ScrollIntoAElement
        WebElement d=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].scrollIntoView(true);", d);
//EnterValue
		js.executeScript("arguments[0].value='siva';", d);
	}

}
