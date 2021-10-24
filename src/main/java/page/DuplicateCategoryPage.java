package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class DuplicateCategoryPage {

	WebDriver driver;

	public DuplicateCategoryPage (WebDriver driver) {
		this.driver = driver;
	}
	
//Element Library
	
//Interactable Methods
	public void duplicateCategoryMessage(){
	
		String actualDuplicateErrormessage = driver.findElement(By.tagName("body")).getText();
		String expecetdDuplicateErrorMessage = "The category you want to add already exists: ";
		
		Assert.assertTrue(actualDuplicateErrormessage.contains(expecetdDuplicateErrorMessage));
		System.out.println("The Category you entered already exists. Please re-enter new Category!!!");
		
	}
	
	
}
