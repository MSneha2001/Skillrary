package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {
	
	//Declaration
	@FindBy(xpath = "//h2[@class='list_title']")
	private WebElement pageHeader ;
	
	@FindBy(xpath = "//a[text()='Core Java For Selenium Trainin']")
	private WebElement CoreJavaForSeleniumLink ;
	
	//Initialization
	public CoreJavaForSelenium(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickCorejavaforSeleniumlink() {
		CoreJavaForSeleniumLink.click();
		
	}

	

}
