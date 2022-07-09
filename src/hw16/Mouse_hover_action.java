package hw16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_hover_action {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.meserollshop.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void test() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement ourLocations = driver.findElement(By.xpath("//body/div[@id='shopify-section-header']/nav[@id='navBar']/div[1]/ul[2]/li[5]/a[1]"));
		Thread.sleep(3000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(3000);	
		System.out.println("The text of this web element is: "+ ourLocations.getText());
	}
	
	@AfterTest
	public void tearUp() {
	driver.quit();
	}
}
