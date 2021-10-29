import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisibilityPage {
	public WebDriver driver;
	
	public VisibilityPage (WebDriver driver) {
		this.driver = driver;
	}
	public By hideButton = By.xpath("//button[@id='hideButton']");
	public By transparentButton = By.xpath("//button[@id='transparentButton']");
	public By removedButton = By.xpath("//button[contains(text(),'Removed')]");
	public By invisibleButton = By.xpath("//button[@id='invisibleButton']");
	public By zeroWidthButton = By.xpath("//button[@id='zeroWidthButton']");
	public By notDisplayedButton = By.xpath("//button[@id='notdisplayedButton']");
	public By overlappedButton = By.xpath("//button[@id='overlappedButton']");
	public By offscreenButton = By.xpath("//button[@id='offscreenButton']");
	
	
	public VisibilityPage clickHideButton() {
		driver.findElement(hideButton).click();
		return new VisibilityPage(driver);
		
	}
	public void verifyVisibilityOfButtons() {
	
		boolean visibilityOfTransparentButton = driver.findElement(transparentButton).isDisplayed();
		if (visibilityOfTransparentButton == true) {
			System.out.println("Transparent button is visible");}
		else {
				System.out.println("Transparent button is invisible ");	
			}
		try {
		boolean visibilityOfRemovedButton = driver.findElement(removedButton).isDisplayed();
		if (visibilityOfRemovedButton == true) {
			System.out.println("Removed button is visible");}}
		catch (Exception e) {
			System.out.println("Removed button is invisible ");
			}
		
		boolean visibilityOfInvisibleButton = driver.findElement(invisibleButton).isDisplayed();
		if (visibilityOfInvisibleButton == true) {
			System.out.println("Invisible button is visible");}
		else {
			System.out.println("Invisible button is invisible ");
			}
		
		boolean visibilityOfZeroWidthButton = driver.findElement(zeroWidthButton).isDisplayed();
		if (visibilityOfZeroWidthButton == true) {
			System.out.println("Zero Width button is visible");}
		else {
			System.out.println("Zero Width button is invisible ");
			}
	
		boolean visibilityOfNotDisplayedButton = driver.findElement(notDisplayedButton).isDisplayed();
		if (visibilityOfNotDisplayedButton == true) {
			System.out.println("Not Displayed button is visible");}
		else {
			System.out.println("Not Displayed button is invisible ");
			}
		
		boolean visibilityOfOverlappedButton = driver.findElement(overlappedButton).isDisplayed();
		if (visibilityOfOverlappedButton == true) {
			System.out.println("Overlapped button is visible");}
		else {
			System.out.println("Overlapped button is invisible ");
			}
	
		boolean visibilityOfOffscreenButton = driver.findElement(offscreenButton).isDisplayed();
		if (visibilityOfOffscreenButton == true) {
			System.out.println("Offscreen button is visible");}
		else {
			System.out.println("Offscreen button is invisible ");}
		}
	}
			
		
	



