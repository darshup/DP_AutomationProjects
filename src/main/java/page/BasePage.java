package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void selectFromDropdown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNo = rnd.nextInt(boundaryNumber);
		return randomNo;
	}
	
}
