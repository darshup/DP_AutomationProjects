package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.DuplicateCategoryPage;
import util.BrowserFactory;

public class DuplicateCategoryTest  {

	WebDriver driver;
	
	@Test
	public void validateDuplicateCategoryIsNotAdded() {
		
		driver = BrowserFactory.init();
		
		DuplicateCategoryPage duplicateCategoryPage = PageFactory.initElements(driver, DuplicateCategoryPage.class);
		duplicateCategoryPage.duplicateCategoryMessage();
		
		BrowserFactory.teardown();
	}
	
	
}
