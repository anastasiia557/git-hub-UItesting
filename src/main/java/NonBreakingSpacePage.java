import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NonBreakingSpacePage {
	public WebDriver driver;
	
	public NonBreakingSpacePage(WebDriver driver) {
		this.driver = driver;
	}
	public By button = By.xpath("//button[text()='My\u00A0Button']");
	
	public NonBreakingSpacePage clickButton() {
		driver.findElement(button).click();
	return new NonBreakingSpacePage(driver);
		
	}
	
	
}
