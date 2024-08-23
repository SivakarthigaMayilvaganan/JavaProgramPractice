package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BasicFunctionalities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//Set Browser Dimension
		Dimension d=new Dimension(1080,1920);
		driver.manage().window().setSize(d);
//Enter Text with out using 'Locator' and 'Enter' key
		driver.switchTo().activeElement().sendKeys("Selenium \n");
		driver.navigate().back();
//Enter text without using Enter key
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		driver.navigate().back();
		Actions a = new Actions(driver);
//Check word underlined or not
		WebElement word=driver.findElement(By.xpath("//*[text()='தமிழ்']"));
		System.out.println(word.getCssValue("text-decoration"));
        a.moveToElement(word).build().perform();
        System.out.println(word.getCssValue("text-decoration"));


        


	}

}
