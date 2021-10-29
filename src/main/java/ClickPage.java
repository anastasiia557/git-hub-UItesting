import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPage {
public WebDriver driver;
	
	public ClickPage(WebDriver driver) {
		this.driver = driver;
	}
	private By ignoreButton = By.xpath("//*[@id='badButton']");
			
	public ClickPage clickIgnoreButton(){
		driver.findElement(ignoreButton).click();
		return new ClickPage(driver);
	}
	public String checkColor() {
		return driver.findElement(ignoreButton).getCssValue("background-color");
	}
	
}

