import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassAttributePage {
	public WebDriver driver;
	
	public ClassAttributePage(WebDriver driver) {
		this.driver = driver;
	}
	public By blueButton = By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");
	
	
	public ClassAttributePage clickblueButton() {
		driver.findElement(blueButton).click();
		return new ClassAttributePage(driver);
	}
	public void acceptAllertbutton() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
	}
	
}
