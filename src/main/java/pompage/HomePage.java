package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement SkillraryDemoappLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getLogo() {
		return logo;
	}
	public void clickGears() {
		gearstab.click();
	}
	public void clickSkillraryDemoApp() {
		SkillraryDemoappLink.click();
	}
	public void searchFor(String data) {
		searchFor(data);
	}

}
