import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickPageTest {
	private WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com");
		
	}
	
		
	@Test
	public void clickButton() {
		HomePage homePage = new HomePage(driver);
		ClickPage clickPage = new ClickPage(driver);
		homePage.clickClickLink();
		String colorBeforeClick = clickPage.checkColor();
		System.out.println(colorBeforeClick);
		clickPage.clickIgnoreButton();
		String colorAfterClick = clickPage.checkColor();
		System.out.println(colorAfterClick);
		Assert.assertNotEquals(colorAfterClick, colorBeforeClick);
		
		
		
		
		
		
	}
}
