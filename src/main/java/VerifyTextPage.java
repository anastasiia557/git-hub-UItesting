import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyTextPage {
	public WebDriver driver;
	
	public VerifyTextPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By textField = By.xpath("//span[normalize-space(.)='Welcome...']");
	
	public String findText() {
		String str = driver.findElement(textField).getText();
		System.out.println(str);
		return str;
			
	}
	
}
