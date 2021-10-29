import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTextPageTest {
	private WebDriver driver;
		
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/verifytext");
	}
	
	@Test
	public void verifyTextTest() {
		VerifyTextPage verifyTextPage = new VerifyTextPage(driver);
		verifyTextPage.findText();
		
	}
	
}
