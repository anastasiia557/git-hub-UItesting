import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInputPage {
public WebDriver driver;
	
	public TextInputPage(WebDriver driver) {
		this.driver = driver;
	}
	private By textField = By.xpath("//*[@id='newButtonName']");
	private By updatingButton = By.xpath("//*[@id='updatingButton']");

	public void inputText(String word) {
		driver.findElement(textField).sendKeys(word);
	}
	public String textBefore() {
		return driver.findElement(updatingButton).getText();
	}

	public TextInputPage clickButton() {
		driver.findElement(updatingButton ).click();
		return this;
	}
	public String textAfter() {
			return driver.findElement(updatingButton).getText();
		
	}
		
		
}
		
		