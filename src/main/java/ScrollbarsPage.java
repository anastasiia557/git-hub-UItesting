import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollbarsPage {
	public WebDriver driver;
	
	public ScrollbarsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By hidingButton = By.xpath("//button[@id='hidingButton']");
	
	public void findandClickElement() {
		WebElement element = driver.findElement(hidingButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		actions.click();
	}
	
}
