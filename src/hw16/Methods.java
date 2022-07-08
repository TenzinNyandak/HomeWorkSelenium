package hw16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methods {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		driver = new FirefoxDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();//maximize() method
		driver.manage().deleteAllCookies();//deleteAllCookies() method
		driver.get("https://meserollshop.com/account/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//pageLoadTimeout() method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitlyWait() method
		driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("tenz@gmail.com");//sendKeys() method
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customer_email']")).clear();//clear() method
		Thread.sleep(2000);
		driver.navigate().to("https://meserollshop.com");//Home page
		Thread.sleep(2000);
		driver.navigate().back();//back() method to Login page
		Thread.sleep(2000);
		driver.navigate().forward();//forward() method
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh() method
		Thread.sleep(2000);
		driver.manage().window().fullscreen();//manage() & fullscreen() methods
		Thread.sleep(2000);
		driver.quit();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}