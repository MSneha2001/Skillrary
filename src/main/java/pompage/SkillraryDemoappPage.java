package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoappPage {
   //Declaration 
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id= "course")
	private  WebElement courseTab;
	
	@FindBy(xpath="//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement  seleniumLinkTraining;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement categoryDropDown;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	
	//initialization
	public SkillraryDemoappPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void mouseHoverToCourse(WebDriverUtility web) {
	  ((WebDriverUtility) web).mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		seleniumLinkTraining.click();
	}
		
		public void selectCategory(WebDriverUtility web,int index) {
			web.dropdown(categoryDropDown,index);
		}
		
		public WebElement getContactUs() {
			return getContactUs();
		}
		
		public void clickContactUs() {
			contactUsLink.click();
		}

		
	
		}
		
	 

