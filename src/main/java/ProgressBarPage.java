import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {
	public WebDriver driver;

	public ProgressBarPage(WebDriver driver) {
		this.driver = driver;
	}
	private By startButton = By.xpath("//button[@id='startButton']");
	private By stopButton = By.xpath("//button[@id='stopButton']");
	private By progressBar = By.xpath("//div[@aria-valuenow='75']");
	
	public ProgressBarPage clickStartButton() {
		driver.findElement(startButton).click();
		return new ProgressBarPage(driver);
	}
	public void waitForValue() {
		WebDriverWait wait = new WebDriverWait(driver,30); 
		wait.until(ExpectedConditions.presenceOfElementLocated(progressBar));
	}
	
	
	public ProgressBarPage clickStopButon() {
		driver.findElement(stopButton);
		return new ProgressBarPage(driver);
		
}
}