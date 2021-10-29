import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientSideDelayPage {
	public WebDriver driver;
	
	public ClientSideDelayPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By clientSideLogicButton = By.xpath("//button[@class='btn btn-primary']");
	public By label = By.xpath("//p[contains(text(),'Data calculated on the client side')]");

	public ClientSideDelayPage clickClientSideLogicButton() {
		driver.findElement(clientSideLogicButton).click();
		return new ClientSideDelayPage(driver);
	}
	public void waitForLabel() {
		WebDriverWait wait = new WebDriverWait(driver,15); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'Data calculated on the client side')]")));
}
	public void clickOnLabelText() {
		driver.findElement(label).click();
		
}
}