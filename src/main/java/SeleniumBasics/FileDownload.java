package SeleniumBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		Thread.sleep(5000);
		File fileLocation =new File("C:\\Users\\Sivakarthiga\\Downloads");
        File[] totalFiles=fileLocation.listFiles();
        for(File f:totalFiles) {
        	if(f.getName().equalsIgnoreCase("TestLeaf Logo.png")) {
        		System.out.println("File Downloaded");
        		break;
        	}else {
        		System.out.println("File Not Downloaded");
        	}
        }
        
        
        
	}

}
