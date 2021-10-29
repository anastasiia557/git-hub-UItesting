import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTablePage {
	public WebDriver driver;
	
	public DynamicTablePage(WebDriver driver) {
		this.driver = driver;
	}
	public By warningElement = By.xpath("//p[@class='bg-warning']");
    public By chromeRow = By.xpath("//div[@role='row']/span[contains(text(),'Chrome')]/following-sibling::span[contains(text(),'%')]");
    String element;
	public String getTableCPU() {
		 String str = driver.findElement(chromeRow).getText();
		 return str;
	}
		
	public String getWarningCPU() {
		String element = driver.findElement(warningElement).getText();
		return element.split(" ")[2];
	}
	
}