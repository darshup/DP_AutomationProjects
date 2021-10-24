package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.ToDoListPage;
import util.BrowserFactory;

public class RemoveSingleItemTest {

	WebDriver driver;
	
	@Test
	public void validateSingleItemIsRemovedUsingRemoveButton() {
		driver = BrowserFactory.init();
		
		ToDoListPage todoListPage = PageFactory.initElements(driver, ToDoListPage.class);
		todoListPage.removeSingleListItem();
		BrowserFactory.teardown();
	}
	
}
