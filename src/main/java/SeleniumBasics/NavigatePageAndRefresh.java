package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePageAndRefresh {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.leafground.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
//Refresh with Navigate Option
		driver.navigate().refresh();
		System.out.println("Refreshed");
//Refresh with Get Option
		driver.get(driver.getCurrentUrl());
		System.out.println("Refreshed");
//Refresh with Robot Class
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		System.out.println("Refreshed");
	}

}
