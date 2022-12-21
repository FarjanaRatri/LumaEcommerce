package luma.us.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.*;
import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtilitys;
import luma.us.generics.HighLightElements;
import luma.us.generics.WaitHelper;
import luma.us.pagefactory.LoginAndPurchase;

public class Men_Functional_Stepdef extends BasePage {

	LoginAndPurchase pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = PageFactory.initElements(driver, LoginAndPurchase.class);
		// LoginAndPurchase pf = new LoginAndPurchase();

		pf.getLogin();

		// In order to keep track to our execution time, date, we have to use the logger
		log.info("User able to verify the landing page");
		HighLightElements.drawBorder(pf.getVerifiedLandingPageText());
		// In order to Highlight the elements we can take help from javascript excutor

		WaitHelper.seleniumWait(pf.getVerifiedLandingPageText(), 30);
		// In order to avoid the syn issue we need help from explicit Wait from selenium

		String expected = prop.getProperty("LandingPageTitle");
		// In order to validate the requirement we have to use the assertion, either
		// TestNG or JUnit
		String actual = pf.getVerifiedLandingPageText().getText();
		// In order to verify the text we have to use either getText() ,or
		// getAttribute()
		CommonUtilitys.getAssert(expected, actual);

	}

	@When("Users should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void users_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
		log.info("User able to mousehover over the men module");
		HighLightElements.drawBorder(pf.getMenModule());
		WaitHelper.seleniumWait(pf.getMenModule(), 30);
		// In order to handle the mouse hover we need help from Actions class
		CommonUtilitys.mouseHover(pf.getMenModule());

		log.info("User able to mousehover over the tops");
		HighLightElements.drawBorder(pf.getSelectTops());
		WaitHelper.seleniumWait(pf.getSelectTops(), 30);
		CommonUtilitys.mouseHover(pf.getSelectTops());

		log.info("User able to click on Jackets");
		HighLightElements.drawBorder(pf.getSelectJacket());
		WaitHelper.seleniumWait(pf.getSelectJacket(), 30);
		// In order to click the web element we can use the Actions class
		// also we can use Java Script Executor
		// CommonUtilitys.getActionClick(pf.getSelectJacket());
		CommonUtilitys.getJSClick(pf.getSelectJacket());
		

	}

	@When("Verify the jacket name Jupiter All-Weather Trainer on the list")
	public void verify_the_jacket_name_jupiter_all_weather_trainer_on_the_list() {

		log.info("User able to click the Specific Jacket");
		HighLightElements.drawBorder(pf.getSelectJupiterJacket());
		WaitHelper.seleniumWait(pf.getSelectJupiterJacket(), 30);
		CommonUtilitys.getJSClick(pf.getSelectJupiterJacket());
		// CommonUtilitys.pageScrollDown();

		log.info("User able to verify the Specific Jacket");
		HighLightElements.drawBorder(pf.getVerifiedJupiterJacket());
		WaitHelper.seleniumWait(pf.getVerifiedJupiterJacket(), 30);
		String expected = prop.getProperty("Jacketname");
		String actual = pf.getVerifiedJupiterJacket().getText();
		// CommonUtilitys.getAssert(actual,expected);
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}

	@When("User should be able to select the S and Blue and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_s_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {

		log.info("User able to select the size");
		HighLightElements.drawBorder(pf.getSelectSize());
		WaitHelper.seleniumWait(pf.getSelectSize(), 30);
		CommonUtilitys.getJSClick(pf.getSelectSize());

		log.info("User able to select the color");
		HighLightElements.drawBorder(pf.getSelectColor());
		WaitHelper.seleniumWait(pf.getSelectColor(), 30);
		CommonUtilitys.getJSClick(pf.getSelectColor());

		log.info("User able to select the quantity");
		HighLightElements.drawBorder(pf.getSelectQuantity());
		WaitHelper.seleniumWait(pf.getSelectQuantity(), 30);
		pf.getSelectQuantity().clear();
		pf.getSelectQuantity().sendKeys(prop.getProperty("QT"));

		log.info("User able to add to cart");
		HighLightElements.drawBorder(pf.getAddToCart());
		WaitHelper.seleniumWait(pf.getAddToCart(), 30);
		CommonUtilitys.getJSClick(pf.getAddToCart());

	}

	@When("User should be able to Click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {
		log.info("User able to click on the shopping cart");
		HighLightElements.drawBorder(pf.getClickOnShoppingCart());
		WaitHelper.seleniumWait(pf.getClickOnShoppingCart(), 30);
		CommonUtilitys.getJSClick(pf.getClickOnShoppingCart());
	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {
		log.info("User able to click on proceed to checkout");
		HighLightElements.drawBorder(pf.getClickProceedToCart());
		WaitHelper.seleniumWait(pf.getClickProceedToCart(), 30);
		CommonUtilitys.getJSClick(pf.getClickProceedToCart());
	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		log.info("User able to click on new address");
		HighLightElements.drawBorder(pf.getClickAddNewAddress());
		WaitHelper.seleniumWait(pf.getClickAddNewAddress(), 30);
		CommonUtilitys.getJSClick(pf.getClickAddNewAddress());
	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		pf.addShippingDetails();
	}

	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
		log.info("User able to verify Thank You text");
		HighLightElements.drawBorder(pf.getVerifiedPurchaseText());
		WaitHelper.seleniumWait(pf.getVerifiedPurchaseText(), 30);
		String actual = pf.getVerifiedPurchaseText().getText();
		String expected = prop.getProperty("VerifyPurchaseText");
		CommonUtilitys.getAssert(expected, actual);
		
		log.info("User able to verify Thank You text");
		HighLightElements.drawBorder(pf.getVerifiedOrderNumber());
		WaitHelper.seleniumWait(pf.getVerifiedOrderNumber(), 30);
		String actualNum = pf.getVerifiedPurchaseText().getText();
		
		
	}

}
