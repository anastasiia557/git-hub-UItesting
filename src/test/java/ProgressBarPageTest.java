import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProgressBarPageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/progressbar");
}
	@Test
	public void ProgressBarTest() {
		ProgressBarPage progressBarPage = new ProgressBarPage(driver);
		progressBarPage.clickStartButton().waitForValue();
		progressBarPage.clickStopButon();
		
		
		

		
		
	}
}