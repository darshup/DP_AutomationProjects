package page;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoListPage {

	WebDriver driver;
	
	public ToDoListPage(WebDriver driver) {
		this.driver = driver;
	}
	
//Element Library
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[1]") WebElement SetSkyBlueBackgroundButtonElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[2]") WebElement SetWhiteBackgroundButtonElement;
	@FindBy(how = How.XPATH, using ="//body[@style='background-color: skyblue;']") WebElement ValidateSkyBlueBackgroundElement;
	@FindBy(how = How.XPATH, using ="//body[@style='background-color: white;']") WebElement ValidateWhiteBackgroundElement;
	
	
//Interactable Methods
	
	public void clickOnSetBackgroundButton(String color) {
		if(color.equalsIgnoreCase("sky blue")) {
			SetSkyBlueBackgroundButtonElement.click();
		}
		else if(color.equalsIgnoreCase("white")) {
			SetWhiteBackgroundButtonElement.click();
		}
		else {
			System.out.println("Background Color selected is invalid");
		}
	}
	
	public void setBackgroundButtonExists(String color) {
		if(color.equalsIgnoreCase("sky blue")) {
			 Boolean skyBluebuttonExists = SetSkyBlueBackgroundButtonElement.isDisplayed();
			 Assert.assertTrue(skyBluebuttonExists); 
		}
		else if(color.equalsIgnoreCase("white")) {
			Boolean whitebuttonExists = SetWhiteBackgroundButtonElement.isDisplayed();
		    Assert.assertTrue(whitebuttonExists); 
		}
	}
	
	public void validateBackgroundColor(String color) {
		if(color.equalsIgnoreCase("sky blue")) {
			Boolean validateSkyBlueBackground = ValidateSkyBlueBackgroundElement.isDisplayed();
			Assert.assertTrue(validateSkyBlueBackground); 
		}
		else if(color.equalsIgnoreCase("white")) {
			Boolean validateWhiteBackground = ValidateWhiteBackgroundElement.isDisplayed();
			Assert.assertTrue(validateWhiteBackground); 
		}
	}
	

	
	
/*
	public void clickOnSetSkyBlueBackgroundButton() {
		SetSkyBlueBackgroundButtonElement.click();
	}

	public void clickOnSetWhiteBackgroundButton() {
		SetWhiteBackgroundButtonElement.click();
		
	}
	
	public void setSkyBlueBackgroundButtonExists() {
		 Boolean skyBluebuttonExists = SetSkyBlueBackgroundButtonElement.isDisplayed();
		    Assert.assertTrue(skyBluebuttonExists); 
	}
	
	public void setWhiteBackgroundButtonExists() {
		 Boolean whitebuttonExists = SetWhiteBackgroundButtonElement.isDisplayed();
		    Assert.assertTrue(whitebuttonExists); 
	}
	
	public void validateBackgroundColorIsSkyBlue() {
		Boolean validateSkyBlueBackground = ValidateSkyBlueBackgroundElement.isDisplayed();
		Assert.assertTrue(validateSkyBlueBackground); 
	}
	public void validateBackgroundColorIsWhite() {
		Boolean validateWhiteBackground = ValidateSkyBlueBackgroundElement.isDisplayed();
		Assert.assertTrue(validateWhiteBackground); 
	}
*/
	
	
	
	
}
