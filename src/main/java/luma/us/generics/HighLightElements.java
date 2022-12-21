package luma.us.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import luma.us.basepage.BasePage;

public class HighLightElements extends BasePage{
	
	
	
	public static void drawBorder(WebElement ele ){
      
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='6px solid yellow'", ele);
    }

}
