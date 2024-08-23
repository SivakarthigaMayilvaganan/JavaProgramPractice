package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		WebElement draggable = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement droppable = driver.findElement(By.xpath("(//*[text()='Drop here'])[1]"));
		a.dragAndDrop(draggable, droppable).build().perform();
	}

}
