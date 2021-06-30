package interviewMegi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	WebElement table;

	@Given("^sample feature file is ready$")
	public void givenStatment() {
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println("Lev Given statement executed successfully");
	}

	@When("^I run the feature file$")
	public void whenStatement() {
		driver.navigate().to("https://www.heathrow.com/arrivals");
		table = driver.findElement(By.id("arrivadatagrid"));
		System.out.println("Lev  When statement execueted successfully");
	}

	@Then("^run should be successful$")
	public void thenStatment() {
		List<WebElement> lwe = table.findElements(By.xpath("//td[contains(text(),'Astana')]"));
		System.out.println("Astana count is : " + lwe.size());

		System.out.println("Lev Then statement executed successfully");
	}

	@Then("^close the browser screen$")
	public void close_the_browser_screen() throws Throwable {
		driver.quit();
		System.out.println("Lev driver.quit();");
		throw new PendingException();
	}

}
