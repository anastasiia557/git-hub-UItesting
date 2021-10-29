import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOverPageTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/mouseover");
	}
	
	@Test
	public void mouseOverTest() {
		MouseOverPage mouseOverPage = new MouseOverPage(driver);
		String valueBeforeClick = mouseOverPage.getValue();
		System.out.println(valueBeforeClick);
		mouseOverPage.clickLink().clickLink();
		String valueAfterDoubleClick = mouseOverPage.getValue();
		System.out.println(valueAfterDoubleClick);
		Assert.assertNotEquals(valueAfterDoubleClick, valueBeforeClick);
		
	}
	

}
