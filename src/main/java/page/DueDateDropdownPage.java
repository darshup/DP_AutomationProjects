package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DueDateDropdownPage {

	WebDriver driver;
	public DueDateDropdownPage (WebDriver driver) {
		this.driver = driver;
	}

//Element Library
	
//Interactable Methods
	public void dueDateDropdown() {
		
		WebElement DueDateDropdownElement = driver.findElement(By.name("due_month"));	
		
		Select select = new Select(DueDateDropdownElement);
	
		String monthsExpectedValues [] = {"None","Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		List <WebElement> monthActualDropdownValues = select.getOptions();
		
		for(int i = 0; i < monthActualDropdownValues.size(); i++) {
			Assert.assertEquals(monthsExpectedValues[i], monthActualDropdownValues.get(i).getText());
			
		}
		System.out.println("Month Dropdown has all the months in the Due Date dropdown section");
	}

//	for (WebElement element : duedateValues) {
//	String monthsActualValues = element.getText();
//}
	
}
