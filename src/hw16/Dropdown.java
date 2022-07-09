package hw16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		driver = new FirefoxDriver();//Use of Firefox driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(enabled = true, priority = 1)
	public void dropDownTest() throws InterruptedException {
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropElement);
		select.selectByIndex(5);//Select by Index
		Thread.sleep(3000);
		select.selectByValue("15032");//Select by Value
		Thread.sleep(3000);
		select.selectByVisibleText("Collectibles");//Select by Visible Text
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
