package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEntireScreen {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(d);
		BufferedImage bf=r.createScreenCapture(rectangle);
		File file=new File("C:\\Users\\Sivakarthiga\\Downloads\\SS\\latest.png");
        ImageIO.write(bf, "png", file);
        
	}

}
