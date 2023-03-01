package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompage.ContactUsPage;
import pompage.CoreJavaForSelenium;
import pompage.CoreJavaVideoPage;
import pompage.HomePage;
import pompage.SeleniumTrainingPage;
import pompage.SkillraryDemoappPage;
import pompage.TestingPage;

public class BaseClass {
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoappPage demoApp;
	protected TestingPage testing;
	protected CoreJavaForSelenium coreJava;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaVideoPage javaVideo;
	protected ContactUsPage contact;
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();
		
		property.propertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH );
		excel.excelInitialisation(IConstantPath.EXCEL_FILE_PATH);
	}
	@BeforeMethod
	public void methodConfiguration() {
		long time = Long.parseLong(property.fetchproperty("timeouts"));
		driver = web.openApplication(property.fetchproperty("browser"),property.fetchproperty("url"),time);
		
		home = new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		demoApp = new SkillraryDemoappPage(driver);
		coreJava = new CoreJavaForSelenium(driver);
		 selenium = new SeleniumTrainingPage(driver);
		testing = new TestingPage(driver);
		javaVideo = new CoreJavaVideoPage(driver);
		contact = new ContactUsPage(driver);
		
	}
	
	@AfterMethod
	public void methodTeardown() {
		web.quitBrowser();
	}
	
	@AfterClass
	public void classTeardown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
