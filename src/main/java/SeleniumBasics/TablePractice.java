package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
        WebElement table=driver.findElement(By.xpath("(//table[@id='product'])[1]"));
        int rowCount=driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr")).size();
        System.out.println("RowCount: "+rowCount);
        int columnCount=driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[1]/th")).size();
        System.out.println("ColumnCount: "+columnCount);

        List<WebElement> data=driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[3]/td"));
             for(WebElement x:data)   
        System.out.println("Data: "+x.getText());
	}

}
