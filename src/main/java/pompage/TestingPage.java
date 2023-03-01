package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement myCartArea;
	
	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement faceBookIcon;
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public WebElement getJavaImage() {
		return getJavaImage();
	}
	

	public WebElement getMyCartArea() {
		return getMyCartArea();
	}
	public void clickfacebookIcon() {
		faceBookIcon.click();
	}
	public WebElement getFacebookIcon() {
		return faceBookIcon;
	}

}
