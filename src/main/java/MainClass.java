import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestingplayground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		HomePage homePage = new HomePage(driver);
		homePage.getTitleText();
		driver.quit();
	
	}
	
}
