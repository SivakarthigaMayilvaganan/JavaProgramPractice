package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement box=driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		System.out.println(box.getRect().getDimension().getHeight());
		System.out.println(box.getRect().getDimension().getWidth());
	}

}
