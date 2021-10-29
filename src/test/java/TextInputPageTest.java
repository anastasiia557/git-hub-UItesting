import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextInputPageTest {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/");
		
	}
	@Test
	public void textInputPage() {
		TextInputPage textInputPage = new TextInputPage(driver);
		HomePage homePage = new HomePage(driver);
		    homePage.clickInputTextLink().inputText("Hello");
			textInputPage.clickButton();
			String beforeClick = textInputPage.textBefore();
			textInputPage.clickButton();
			String afterClick = textInputPage.textAfter();
			Assert.assertNotEquals(beforeClick, afterClick);
		}
	

		
	}

	

