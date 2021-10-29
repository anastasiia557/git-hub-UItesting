import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenLayersPage {
	public WebDriver driver;
	
	public HiddenLayersPage(WebDriver driver) {
		this.driver = driver;
	}
	public By greenButton = By.xpath("//button[@class='btn btn-success']");
	public By blueButton = By.xpath("//button[@class='btn btn-primary']");
	
	
	public String verifyColorBeforeClick() {
		return driver.findElement(greenButton).getCssValue("background-color");
	}
	
	public HiddenLayersPage clickgreenButton() {
		driver.findElement(greenButton).click();;
		return new HiddenLayersPage(driver);
	}
	public String verifyColorAfterClick() {
		return driver.findElement(blueButton).getCssValue("background-color");	
	}
	public HiddenLayersPage clickblueButton() {
		driver.findElement(blueButton).click();;
		return new HiddenLayersPage(driver);
}
}
