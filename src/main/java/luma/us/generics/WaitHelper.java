package luma.us.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import luma.us.basepage.BasePage;

public class WaitHelper extends BasePage {
	
	
	public static void seleniumWait(WebElement ele, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		
	}
	
	/*public static WebElement getExplicitWait(WebElement elem, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elem));
		return element;
		
	}*/
	
}
