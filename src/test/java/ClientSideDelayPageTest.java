import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientSideDelayPageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/clientdelay");
	}
	
	@Test
	public void clientSideDelayTest() {
	ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage(driver);
	clientSideDelayPage.clickClientSideLogicButton();
	clientSideDelayPage.waitForLabel();
	clientSideDelayPage.clickOnLabelText();
	}
}
