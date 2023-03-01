package testScript;

import org.testng.asserts.SoftAssert;

public class ThirdClass extends SecondTest{
	public void thirdTest() throws InterruptedException {
		
	SoftAssert soft = new SoftAssert();
	
	home.searchFor("core java for selenium");
	soft.assertEquals(coreJava.getPageHeader(), " CORE JAVA FOR SELENIUM");
	
	coreJava.clickCorejavaforSeleniumlink();
	soft.assertEquals(javaVideo.getPageHeader() , "Core Java For Selenium Training");
	
	javaVideo.clickCloseCookies();
	web.switchToFrame();
	javaVideo.clickPauseButton();
	Thread.sleep(2000);
	javaVideo.clickPauseButton();
	
	web.switchBackFromFrame();
	
	javaVideo.clickAddToWishList();
	
	soft.assertAll();
	
	
	

}
}