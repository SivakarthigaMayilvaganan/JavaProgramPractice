package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		String toolTip = driver.findElement(By.xpath("//*[text()='Hover over me']")).getAttribute("title");
		System.out.println(toolTip);
	}

}
