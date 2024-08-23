package SeleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedDisplayedEnableMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkBoxes = driver
				.findElements(By.xpath("//div[@id='checkbox-example']//following::label/input"));
		System.out.println("No of total checkboxes: " + checkBoxes.size());
		for (WebElement cb : checkBoxes) {
			if (cb.getAttribute("value").equalsIgnoreCase("option2")) {
				cb.click();
			}
		}
		int selectedCB = 0;
		for (WebElement cb : checkBoxes) {
			if (cb.isSelected() == true) {
				selectedCB++;
			}
		}

		System.out.println("No of checkboxes selected: " + selectedCB);
		driver.findElement(By.xpath("//*[@id='hide-textbox']")).click();
		System.out.println("Is the box Displayed: " + driver.findElement(By.xpath("//*[@id='displayed-text']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='show-textbox']")).click();
		System.out.println("Is the box Displayed: " + driver.findElement(By.xpath("//*[@id='displayed-text']")).isDisplayed());

	}
}
