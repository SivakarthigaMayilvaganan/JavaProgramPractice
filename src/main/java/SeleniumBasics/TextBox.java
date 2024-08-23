package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		TextBox tb=new TextBox();
		String actualText=tb.getText(driver);
		driver.findElement(By.xpath("//*[@role='textbox']")).sendKeys(actualText);
		Thread.sleep(1000);
		driver.close();
		
	}
	public String getText(WebDriver driver) {
		
        String fullText=driver.findElement(By.xpath("//*[text()='Type your name']")).getText();
        String text=fullText.split(" ")[2].trim();
        return text;
	} 

}
