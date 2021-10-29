import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicIdPage {
	public WebDriver driver;
	
	public DynamicIdPage(WebDriver driver) {
		this.driver = driver;
	}
	public By buttonWithDynamicID = By.xpath("//button[contains(text(),'Button with Dynamic ID')]");

	
	public DynamicIdPage clickDynamicIdButton() {
		driver.findElement(buttonWithDynamicID).click();
		return new DynamicIdPage(driver);
	}
}

	