import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleAppPage {
	public WebDriver driver;
	
	public SampleAppPage(WebDriver driver) {
		this.driver = driver;
	}

	public By label = By.xpath("/html/body/section//div[@class='col-sm-4']/label");
	public By userNameField = By.xpath("//input[@type='text']");
	public By passwordField = By.xpath("//input[@type='password']");
	public By logInButton = By.xpath("//button[@id='login']");

	public void fillAndSubmitForm() {
		driver.findElement(userNameField).sendKeys("Nastia");
		driver.findElement(passwordField).sendKeys("pwd");
		driver.findElement(logInButton).click();
	}
	public String getLabelText() {
		return driver.findElement(label).getText();
		
		
	
}
}