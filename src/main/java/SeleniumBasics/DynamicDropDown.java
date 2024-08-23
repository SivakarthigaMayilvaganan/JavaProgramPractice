package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		Thread.sleep(1000);
		WebElement dDropDown = driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]"));
		dDropDown.sendKeys("r");
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[contains(@class,'ui-menu')]/li"));
		Thread.sleep(1000);
		for (WebElement dList : dynamicList) {
			if (dList.getText().equalsIgnoreCase("Ruby")) {
				dList.click();
				break;
			}
		}
		System.out.println(dDropDown.getAttribute("value"));
	}

}
