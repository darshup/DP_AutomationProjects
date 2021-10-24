package steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.TestBasePage;
import page.ToDoListPage;

public class SetBackgroundColorDefinition extends TestBasePage{
	
	ToDoListPage toDoListPage;
	
	@Before
	public void beforeTestRun() {
		initDriver();
		toDoListPage = PageFactory.initElements(driver, ToDoListPage.class);	
	}

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String button) throws Throwable {
		toDoListPage.setBackgroundButtonExists(button);	
	}
	
	@When("^I click on the \"([^\"]*)\" button$")
	public void i_click_on_the_button(String color) throws Throwable {
		toDoListPage.clickOnSetBackgroundButton(color);
	}

	@Then("^the background color will change to \"([^\"]*)\"$")
	public void the_background_color_will_change_to(String color) throws Throwable {
		toDoListPage.validateBackgroundColor(color);
	}
	
	@After
	public void afterRunTest() {
		tearDown();
		
	}
	
	
	
/*
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		toDoListPage.setSkyBlueBackgroundButtonExists();
	}
	
	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		toDoListPage.clickOnSetSkyBlueBackgroundButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		toDoListPage.validateBackgroundColorIsSkyBlue();
	}
*/
	
	/*
	@When("^I click on the \"([^\"]*)\"\"$\" button$")
	public void i_click_on_the_button(String color) throws Throwable {
		toDoListPage.clickOnSetBackgroundButton(color);
	}

	@Then("^the background color will change to \"([^\"]*)\"\"$")
	public void the_background_color_will_change_to(String color) throws Throwable {
		if(color.equalsIgnoreCase("sky blue")) {
			Boolean validateSkyBlueBackground = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).isDisplayed();
			Assert.assertTrue(validateSkyBlueBackground); 
		}
		else if(color.equalsIgnoreCase("white")) {
			Boolean validateWhiteBackground = driver.findElement(By.xpath("//body[@style='background-color: white;']")).isDisplayed();
			Assert.assertTrue(validateWhiteBackground); 
		}
	}
*/
	
	
}
