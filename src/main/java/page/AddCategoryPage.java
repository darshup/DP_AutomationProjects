package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCategoryPage {

	String Category;
	
	WebDriver driver;
	public AddCategoryPage (WebDriver driver) {
		this.driver = driver;
	}
	
//ElementLibrary
	@FindBy(how = How.XPATH, using="//input[@name='categorydata']") WebElement AddCategoryTextBoxElement;
	@FindBy(how = How.XPATH, using="//input[@value='Add category']") WebElement AddCategoryButtonElement;
	@FindBy(how = How.XPATH, using="//select[@name='colour']") WebElement CategoryColorDropdownElement;

	
//Interactable Methods
	
	public void addCategory(String category) {
		Category = category ;
		AddCategoryTextBoxElement.sendKeys(category);
//		selectFromDropdown(CategoryColorDropdownElement, "Yellow");
		AddCategoryButtonElement.click();
	}

	String before_xpath = "//span[contains(text(),'";
	String after_xpath = "')]";
	
	public void verifyCategoryEntered() {
		String categoryEntered = driver.findElement(By.xpath(before_xpath + Category + after_xpath)).getText();
		if (categoryEntered.equalsIgnoreCase(Category)) {
			Assert.assertEquals(Category, categoryEntered);
			System.out.println("Category is successfully displayed on the list");		
		}
		else {
			System.out.println("Category not found");
		}
	}
	
	public void duplicateCategory(){
			
		String actualDuplicateErrormessage = driver.findElement(By.tagName("body")).getText();
		String expecetdDuplicateErrorMessage = "The category you want to add already exists: " + Category;
		
		Assert.assertTrue(actualDuplicateErrormessage.contains(expecetdDuplicateErrorMessage));
		System.out.println("The Category you entered already exists. Please re-enter new Category!!!");
		
	}
	
	
	
}
