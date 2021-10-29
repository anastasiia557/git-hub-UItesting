import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoadDelayPageTest {
		private WebDriver driver;
		
		
		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get("http://www.uitestingplayground.com/");
			
		}
		
		@Test 
		private void loadDelayPage() {
		HomePage homePage = new HomePage(driver);
		LoadDelayPage loadDelayPage = new LoadDelayPage(driver);
		homePage.clickLoadDelayLink();
		loadDelayPage.clickDelayButton();
		}
			
		}

