package hw15;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_isDisplayed_method {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://meserollshop.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test() {
		boolean isDisplayed = driver.findElement(By.cssSelector("div.lazyload__image-wrapper.no-js.header-logo__image")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + isDisplayed);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}