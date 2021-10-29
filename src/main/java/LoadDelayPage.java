import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadDelayPage {
	public WebDriver driver;

	public LoadDelayPage(WebDriver driver) {
		this.driver = driver;
}
	public By delayButton = By.xpath("/html/body/section/div/button");
	
	public LoadDelayPage clickDelayButton() {
		driver.findElement(delayButton).click();
		return new LoadDelayPage(driver);
	}
}