import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseOverPage {
	public WebDriver driver;
	
	public MouseOverPage(WebDriver driver) {
		this.driver = driver;
	}
	public By activeLink = By.xpath("//a[contains(text(),'Click me')]");
	public By clickCount = By.xpath("//span[@id='clickCount']");
	
	public String getValue() {
		return driver.findElement(clickCount).getText();
			
	}
	public MouseOverPage clickLink() {
		driver.findElement(activeLink).click();
		return new MouseOverPage(driver);	
	}
	
	
}
