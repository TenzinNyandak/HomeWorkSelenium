package hw16;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_based_alert {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void test1() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick ='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();//accept alert method 
	}

	@Test(enabled = true, priority = 2)
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick ='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();//dismiss alert method
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}