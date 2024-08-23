package SeleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_Image {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		String brokenUrl=driver.findElement(By.xpath("//*[text()='Broken Link']")).getAttribute("href");
		URL url =new URL(brokenUrl);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		System.out.println(con.getResponseCode());
		if(con.getResponseCode()>400) {
			System.out.println("Its a broken link"+brokenUrl);
		}else {
			System.out.println("Its NOT a broken link -"+brokenUrl);
		}
//Broken Image check-.getAttribute("naturalWidth")==0 then brokenImage
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
		Thread.sleep(3000);
		WebElement web=driver.findElement(By.xpath("//*[@class='broken-img']"));
		String nw=web.getAttribute("naturalWidth");
		System.out.println(nw);
		if(web.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Its a broken Image");
		}else {
			System.out.println("Its NOT a broken Image");
		}	
	}

}
