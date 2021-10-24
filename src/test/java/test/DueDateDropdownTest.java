package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.DueDateDropdownPage;
import util.BrowserFactory;

public class DueDateDropdownTest {

	WebDriver driver;
	
	@Test
	public void validateMonthsinDueDateDropdown() {
		
		driver = BrowserFactory.init();
		
		DueDateDropdownPage dueDateDropdownPage = PageFactory.initElements(driver, DueDateDropdownPage.class);
		dueDateDropdownPage.dueDateDropdown();
		
		BrowserFactory.teardown();
	}
	
}
