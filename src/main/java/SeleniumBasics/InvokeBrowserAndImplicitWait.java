package SeleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowserAndImplicitWait {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream((System.getProperty("user.dir")+"\\src\\test\\Resource\\global.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String passWord = prop.getProperty("Password");
		
//ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//getTitle
		System.out.println(driver.getTitle());
//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		
//FirefoxBrowser 
		//System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
//Edge Browser
       //System.setProperty("webdriver.edge.driver", "C:\\eclipse\\Drivers\\msedgedriver.exe");
       //WebDriver driver = new EdgeDriver();
	}

}
