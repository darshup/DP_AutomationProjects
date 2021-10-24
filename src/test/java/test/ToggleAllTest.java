package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToDoListPage;
import util.BrowserFactory;

public class ToggleAllTest {

	WebDriver driver;
	
	@Test
	public void validateToggleItemCheckboxAndAllListItemsCheckboxChecked(){
		driver = BrowserFactory.init();
		
		ToDoListPage todoListPage = PageFactory.initElements(driver, ToDoListPage.class);
		todoListPage.toggleAll();
		
		BrowserFactory.teardown();
	}

	
}
