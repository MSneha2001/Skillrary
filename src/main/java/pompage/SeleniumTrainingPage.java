package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;;
	
	@FindBy(id="add")
	private WebElement plusbutton;

	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement  addToCartButton;

	@FindBy(xpath="//div[@id='callout']")
	private WebElement ItemAddedMessage;
	//initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void doubleClickPlusButton(WebDriverUtility  web) {
		web.doubleClickOnElement(plusbutton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public WebElement getItemAddedMessage() {
		return ItemAddedMessage;
	}
	
}
