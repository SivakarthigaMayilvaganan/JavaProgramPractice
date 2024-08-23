package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//using sendKeys
      //WebElement addFile = driver.findElement(By.xpath("//*[@type='file']"));
      //addFile.sendKeys("C:\\Users\\Sivakarthiga\\Downloads\\TestLeaf Logo.png");
		
//Using Robot Class
		driver.findElement(By.xpath("//div[contains(@class,'btn-file')]")).click();
		Thread.sleep(1000);
		StringSelection s=new StringSelection("C:\\Users\\Sivakarthiga\\Downloads\\TestLeaf Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}

}
