import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenLayersPageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/hiddenlayers");
		
	}
	@Test
	public void hiddenLayersTest() {
		HiddenLayersPage hiddenLayersPage = new HiddenLayersPage(driver);
		String backgroundColor = hiddenLayersPage.verifyColorBeforeClick();
		System.out.println(backgroundColor);
		hiddenLayersPage.clickgreenButton();
		String backgroundColor2 = hiddenLayersPage.verifyColorAfterClick();
		System.out.println(backgroundColor2);
		hiddenLayersPage.clickblueButton();
		Assert.assertNotEquals(backgroundColor, backgroundColor2);
		
		

}
}