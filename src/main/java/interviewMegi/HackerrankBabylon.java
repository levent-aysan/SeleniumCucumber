package interviewMegi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackerrankBabylon {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.heathrow.com/arrivals");
		WebElement table = driver.findElement(By.id("arrivadatagrid"));
		List<WebElement> lwe = table.findElements(By.xpath("//td[contains(text(),'Astana')]"));
		System.out.println("Astana count is : " + lwe.size());
		driver.quit();
	}

	private static boolean existsElement(WebDriver driver, String id) {
		try {
			driver.findElement(By.id(id));
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
}
