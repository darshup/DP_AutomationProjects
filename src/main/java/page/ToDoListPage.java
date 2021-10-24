package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoListPage {

	WebDriver driver;

	public ToDoListPage (WebDriver driver) {
		this.driver = driver;
	}
	
//Element Library
	@FindBy(how = How.NAME, using="allbox") WebElement ToggleAllCheckboxElement;
	@FindBy(how = How.NAME, using="todo[0]") WebElement ListItemCheckboxElement;					
	@FindBy(how = How.NAME, using="todo[1]") WebElement ListItemCheckbox1Element;					
	@FindBy(how = How.NAME, using="todo[2]") WebElement ListItemCheckbox2Element;	
	@FindBy(how = How.NAME, using="todo[3]") WebElement ListItemCheckbox3Element;	
	@FindBy(how = How.XPATH, using="//input[@value='Remove']") WebElement RemoveButtonElement;
	@FindBy(how = How.XPATH, using="//input[@value='Complete']") WebElement CompleteButtonElement;
	

//Interactable Methods
//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.	
	
	public void toggleAll() {
		ToggleAllCheckboxElement.click();
		
		WebElement toggleAllCheckbox = ToggleAllCheckboxElement;
		WebElement listItemCheckbox = ListItemCheckboxElement;

//I added 3 list items elements on the test page (If elements gets removed in future, the below test will fail)
		if(toggleAllCheckbox.isSelected()) {					
			System.out.println("ToggleAll Checkbox is ON");
			if(listItemCheckbox.isSelected() && ListItemCheckboxElement.isSelected() && ListItemCheckbox2Element.isSelected() ) {
				System.out.println("All List Items checkbox is also On");
			}
		else {
				System.out.println("List item checkbox is not selected");
			}
		}	
	}
	
//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
	
	public void removeSingleListItem() {
		try {
			ListItemCheckbox3Element.click();
			RemoveButtonElement.click();
			if(ListItemCheckbox3Element.isDisplayed())
				System.out.println("The single list item is not removed successfully");
			else{
            System.out.println("The checked item is successfully removed");
            	
        	}	
		}
		catch(NoSuchElementException e) {
			System.out.println("The checked item is successfully removed");
		}
		
	}

	public boolean verifyRemovedElement() {
		try {
//			ListItemCheckbox3Element.isDisplayed();
//			return true;
			if(ListItemCheckbox3Element.isDisplayed())
				return true;
			else{
            System.out.println("The checked item is successfully removed");
            	return false;
        	}
		}
		catch(NoSuchElementException e) {
			return false;
		}
		
//		try {
//			ListItemCheckbox3Element.click();
//			RemoveButtonElement.click();
//			return driver.findElement(By.className(cssLocator)).isDisplayed();	
//		}
//		catch(NoSuchElementException e) {
//			return true;
//		}
	}
	
	
//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	
	public void removeAllListItem() {
		ToggleAllCheckboxElement.click();
		RemoveButtonElement.click();
		System.out.println("All Items removed");
	}
	
	

}
