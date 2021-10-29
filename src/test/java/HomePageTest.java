import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HomePageTest {
	private WebDriver driver;
	private HomePage homePage;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/");
		homePage = new HomePage(driver);
	}   
	
	@Test
	public void getTitleTest() {
		String title = homePage.getTitleText();
		System.out.println(title);
		Assert.assertEquals("UI Test Automation\n"+"Playground", title);
	}
	
	@Test
	public void progressBarPageTest() {
		homePage.clickProgressBarLink();
		
	}
	
	@Test
	public void loadDelayPageTest() {
		homePage.clickLoadDelayLink();
	}
	
	@Test
	public void dynamicTablePage() {
		homePage.clickDynamicPageLink();
	}
	
}
	
	

	
	
	
	
	
	
	

	
	



