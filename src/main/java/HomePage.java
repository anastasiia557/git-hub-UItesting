import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public By title = By.xpath("//h1[@id='title']");
	public By clickLink = By.linkText("Click");
	public By textInputLink = By.linkText("Text Input");
	public By progressBarLink = By.linkText("Progress Bar");
	public By loadDelayLink = By.linkText("Load Delay");
	public By dynamicTableLink = By.linkText("Dynamic Table");
	public By dynamicIdLink = By.linkText("Dynamic ID");
	public By classAttributeLink = By.linkText("Class Attribute");
	public By hiddenLayersLink = By.linkText("Hidden Layers");
	public By ajaxDataLink = By.linkText("AJAX Data");
	public By clientSideDelayLink = By.linkText("Client Side");
	public By scrollbarsLink = By.linkText("Scrollbars");
	public By verifyTextLink = By.linkText("Verify Text");
	public By visibilityLink = By.linkText("Visibility");
	public By sampleAppLink = By.linkText("Sample App");
	public By mouseOverLink = By.linkText("Mouse Over");
	public By nonBreakingSpaceLink = By.linkText("Non-Breaking Space");
	
	public String getTitleText() {
		return driver.findElement(title).getText();
		
	}
	public ClickPage clickClickLink() {
		driver.findElement(clickLink).click();
		return new ClickPage(driver);
		
	}
	public TextInputPage clickInputTextLink() {
		driver.findElement(textInputLink).click();
		return new TextInputPage(driver);

	}
	public ProgressBarPage clickProgressBarLink() {
		driver.findElement(progressBarLink).click();
		return new ProgressBarPage(driver);
	}
	public LoadDelayPage clickLoadDelayLink() {
		driver.findElement(loadDelayLink).click();
		return new LoadDelayPage(driver);
	}
	public DynamicTablePage clickDynamicPageLink(){
		driver.findElement(dynamicTableLink).click();
		return new DynamicTablePage(driver);
	}
	public DynamicIdPage clickDynamicIdLink() {
		driver.findElement(dynamicIdLink).click();
		return new DynamicIdPage(driver);
	}
	public ClassAttributePage clickClassAttributeLink() {
		driver.findElement(classAttributeLink).click();
		return new ClassAttributePage(driver);
	}
	public HiddenLayersPage clickHiddenLayersLink() {
		driver.findElement(hiddenLayersLink).click();
		return new HiddenLayersPage(driver);
	}
	public AJAXDataPage clickAJAXDataLink() {
		driver.findElement(ajaxDataLink).click();
		return new AJAXDataPage(driver);
	}
	public ClientSideDelayPage clickClientSideDelayLink() {
		driver.findElement(clientSideDelayLink).click();
		return new ClientSideDelayPage(driver);
	}
	public ScrollbarsPage clickScrollbarsLink() {
		driver.findElement(scrollbarsLink).click();
		return new ScrollbarsPage(driver);
	}
	public VerifyTextPage clickVerifyTextLink() {
		driver.findElement(verifyTextLink).click();
		return new VerifyTextPage(driver);
	}
	public VisibilityPage clickVisibilityLink() {
		driver.findElement(visibilityLink).click();
		return new VisibilityPage(driver);
	}
	public SampleAppPage clickSampleAppLink() {
		driver.findElement(sampleAppLink).click();
		return new SampleAppPage(driver);
	}
	public MouseOverPage clickMouseOverLink() {
		driver.findElement(mouseOverLink).click();
		return new MouseOverPage(driver);
	}
	public NonBreakingSpacePage clickNonBreakingSpaceLink() {
		driver.findElement(nonBreakingSpaceLink).click();
		return new NonBreakingSpacePage(driver);
	}
}
