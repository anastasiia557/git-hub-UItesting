import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AJAXDataPage {
	public WebDriver driver;
	
	public AJAXDataPage(WebDriver driver) {
		this.driver = driver;
	}
	public By ajaxButton = By.xpath("//button[@id='ajaxButton']");
	public By label = By.xpath("//p[contains(text(),'Data loaded with AJAX get request')]");
	
	public AJAXDataPage clickAjaxButton() {
		driver.findElement(ajaxButton).click();
		return new AJAXDataPage(driver);
		
	}
	public void waitForLabel() {
		WebDriverWait wait = new WebDriverWait(driver,15); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'Data loaded with AJAX get request')]")));
	}
	
	public void clickOnLabelText() {
		driver.findElement(label).click();
	}

	
}
