import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassAttributePageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/classattr");
	}
	
	@Test
	public void clickButtonAcceptAlert() {
		ClassAttributePage classAttributePage = new ClassAttributePage(driver);
		classAttributePage.clickblueButton().acceptAllertbutton();
		
	}
	

}
