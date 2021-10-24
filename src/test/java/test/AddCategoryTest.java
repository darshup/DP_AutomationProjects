package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;
	
	@Test
	public void validateUserIsAbleToAddCategory() throws Exception {
		
		driver = BrowserFactory.init();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.addCategory("Grocery Pickup Today");	
		addCategoryPage.verifyCategoryEntered();
		addCategoryPage.duplicateCategory();

		BrowserFactory.teardown();
	}
	
}
