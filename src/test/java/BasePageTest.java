import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BasePageTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
}