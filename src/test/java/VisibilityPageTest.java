import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VisibilityPageTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/visibility");
	}
	
	@Test
	public void VisibilityTest() {
		VisibilityPage visibilityPage = new VisibilityPage(driver);
		visibilityPage.clickHideButton().verifyVisibilityOfButtons();
		
	}
}

