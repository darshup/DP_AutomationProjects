package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToDoListPage;
import util.BrowserFactory;

public class RemoveAllListItemsTest {

WebDriver driver;
	
	@Test
	public void validateAllListItemAreRemovedUsingRemoveButton() {
		driver = BrowserFactory.init();
		
		ToDoListPage todoListPage = PageFactory.initElements(driver, ToDoListPage.class);
		todoListPage.removeAllListItem();
		
		BrowserFactory.teardown();
	}
	
	
}
