package luma.us.generics;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.us.basepage.BasePage;

public class CommonUtilitys extends BasePage {
	
	//====== for click purpose
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
	}
	
	//====== for click purpose
	public static void getJSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	//====== for continuously clicking purpose by looping
	public static void clickUntilElementClickAble(WebElement element) {
		WebElement ele = element;
		// int i;
		for (int i = 0; i <= 299; i++) {
			ele.click();
			break;
		}

	}
	
	//====== for verification 
	public static void getAssert(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		log.info("Verified text" + actual);
		System.out.println("Verified text" + actual);
	}
	
	//====== for mouse hover over
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	
	//====== for drop down
	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);

	}
	
	//====== for multiple webelements drop down
	public static void getSelectDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;
		for (WebElement newValue : option) {
			if (newValue.getText().contains(text)) {
				newValue.click();
			}
		}
	}
	
	//====== for scroll down
	public static void elementScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].scrollIntoView", element);
	}
	//====== for scroll down
	public static void pageScrollDown() {
		Actions Magic = new Actions(driver);
		Magic.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	
	//====== for radio button
	public static void getRadioButton(WebElement ele) {
		boolean sel = ele.isSelected();
		if (!sel) {
			ele.click();

		}

	}
	//====== for generating random String
	public static String getNewAlphabetValue() {
		String data = RandomStringUtils.randomAlphabetic(6);
		//log.info(data);
		System.out.println(data);
		return data;
		
	}
	//====== for generating random integer/number
	public static String getNewNumericValue() {
		String data = RandomStringUtils.randomNumeric(10);
		//log.info(data);
		System.out.println(data);
		return data;
		
	}
	
	
	public static void main(String[] args) {
		getNewAlphabetValue();
		getNewNumericValue();
	}
}
