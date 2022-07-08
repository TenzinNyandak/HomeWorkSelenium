package hw15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B08_getAttribute_method {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://meserollshop.com/account/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test() throws InterruptedException {
		String value01 = driver.findElement(By.xpath("//a[text()='Return to Store']")).getAttribute("id");
		String value02 = driver.findElement(By.xpath("//a[text()='Return to Store']")).getAttribute("class");
		System.out.println("Value of id attribute is: " + value01);
		System.out.println("Value of class attribute is: " + value02);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}