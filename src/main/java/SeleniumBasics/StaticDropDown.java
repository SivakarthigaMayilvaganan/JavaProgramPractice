package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@class='ui-selectonemenu']")));
		System.out.println(dropdown.isMultiple());
		List<WebElement> list=dropdown.getOptions();
		for(WebElement x:list) { 
			System.out.println(x.getText());
		}
		String one="1";
		dropdown.selectByIndex(Integer.parseInt(one));
		//dropdown.selectByVisibleText("Selenium");
	}

}
