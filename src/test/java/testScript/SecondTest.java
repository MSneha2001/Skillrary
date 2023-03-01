package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTest extends FirstTest {
	
	@Test
	public void secondTest() {
		
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildSBrowser();
		
		
		soft.assertEquals(demoApp.getPageHeader(), "SkillRary-ECommerce");
		demoApp.selectCategory(web, 1);
		
		soft.assertEquals(testing.getPageHeader(), "Testing");
		web.dragAndDropElement(testing.getJavaImage(),testing.getMyCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickfacebookIcon();
		
		soft.assertAll();
		


}
}