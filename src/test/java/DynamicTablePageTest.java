import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicTablePageTest {
	private WebDriver driver;
	
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.uitestingplayground.com/dynamictable");
	}
	
	@Test
	public void getValues() {
	DynamicTablePage dynamicTablePage = new DynamicTablePage(driver);
	String tableValue = dynamicTablePage.getTableCPU();
	System.out.println(tableValue);
	String warningValue = dynamicTablePage.getWarningCPU();
	System.out.println(warningValue);
	Assert.assertEquals(warningValue, tableValue);
	
}
}