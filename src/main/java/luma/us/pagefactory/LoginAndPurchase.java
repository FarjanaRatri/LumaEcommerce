package luma.us.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtilitys;
import luma.us.generics.HighLightElements;
import luma.us.generics.WaitHelper;

public class LoginAndPurchase extends BasePage {
	// How to initialize pagefactory concept?

	public LoginAndPurchase() {

		PageFactory.initElements(driver, this);

	}
    //------
	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement getClickSignInBTN() {
		return clickSignInBTN;

	}
	@FindBy(id = "email")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;

	}
	@FindBy(id = "pass")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;

	}
	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickLogin;

	public WebElement getClickLogin() {
		return clickLogin;

	}
	@FindBy(xpath = "//*[text()='Welcome, Smart Tech!']")
	@CacheLookup
	private WebElement landingPageText;

	public WebElement getVerifiedLandingPageText() {
		return landingPageText;

	}
	
	//-------------
	@FindBy(xpath = "//span[text()='Men']")
	@CacheLookup
	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;

	}
	@FindBy(xpath = "(//span[text()='Tops'])[2]")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;

	}
	@FindBy(xpath = "(//span[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJacket;

	public WebElement getSelectJacket() {
		return selectJacket;

	}

	/*
	 * @FindBy(xpath = "//html[@lang='en']") // @FindBy(linkText =
	 * "Jupiter All-Weather Trainer")
	 * 
	 * @CacheLookup private WebElement scrollDown;
	 * 
	 * public WebElement getScrollDown() { return scrollDown;
	 * 
	 * }
	 */
	
	@FindBy(linkText = "Jupiter All-Weather Trainer")
	@CacheLookup
	private WebElement selectJupiterJacket;

	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;

	}
	  
	@FindBy(xpath = "//span[text()='Jupiter All-Weather Trainer ']")
	@CacheLookup
	private WebElement verifiedJupiterJacket;

	public WebElement getVerifiedJupiterJacket() {
		return verifiedJupiterJacket;

	}

	@FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
	@CacheLookup
	private WebElement selectSize;

	public WebElement getSelectSize() {
		return selectSize;

	}

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	@CacheLookup
	private WebElement selectColor;

	public WebElement getSelectColor() {
		return selectColor;

	}

	@FindBy(id = "qty")
	@CacheLookup
	private WebElement selectQuantity;

	public WebElement getSelectQuantity() {
		return selectQuantity;

	}

	@FindBy(xpath = "//span[text()='Add to Cart']")
	@CacheLookup
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;

	}

	@FindBy(linkText = "shopping cart")
	@CacheLookup
	private WebElement clickOnShoppingCart;

	public WebElement getClickOnShoppingCart() {
		return clickOnShoppingCart;

	}

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	@CacheLookup
	private WebElement proceedToCart;

	public WebElement getClickProceedToCart() {
		return proceedToCart;

	}

	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup
	private WebElement addNewAddress;

	public WebElement getClickAddNewAddress() {
		return addNewAddress;

	}

    //---------address details
	@FindBy(xpath = "(//input[@class='input-text'])[6]")
	@CacheLookup
	private WebElement addFirstName;

	public WebElement getInputFirstName() {
		return addFirstName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[7]")
	@CacheLookup
	private WebElement addLastName;

	public WebElement getInputLastName() {
		return addLastName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[8]")
	@CacheLookup
	private WebElement addCompanyName;

	public WebElement getInputCompanyName() {
		return addCompanyName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[9]")
	@CacheLookup
	private WebElement addStreetName;

	public WebElement getInputStreetName() {
		return addStreetName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[12]")
	@CacheLookup
	private WebElement addCityName;

	public WebElement getInputCityName() {
		return addCityName;

	}

	// @FindBy(xpath = "//select[@class='select']")
	@FindBy(xpath = "(//select[@class='select'])[1]")
	@CacheLookup
	private WebElement selectStateName;

	public WebElement getSelectStateName() {
		return selectStateName;

	}
	
	@FindBy(xpath = "(//select[@class='select'])[1]/option")
	@CacheLookup
	private List<WebElement> selectDropDown;

	public List<WebElement> getSelectDropDown() {
		return selectDropDown;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[14]")
	@CacheLookup
	private WebElement addZipCode;

	public WebElement getInputZipCode() {
		return addZipCode;

	}

	@FindBy(xpath = "(//select[@class='select'])[2]")
	// @FindBy(xpath = "//*[@id='OKJ35FM']")
	@CacheLookup
	private WebElement selectCountryName;

	public WebElement getselectCountryName() {
		return selectCountryName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[15]")
	@CacheLookup
	private WebElement addPhoneNumber;

	public WebElement getAddPhoneNumber() {
		return addPhoneNumber;

	}

	@FindBy(xpath = "//*[text()='Ship here']")
	@CacheLookup
	private WebElement clickShipHere;

	public WebElement getClickShipHere() {
		return clickShipHere;

	}

	@FindBy(xpath = "//*[@name='ko_unique_3']")
	@CacheLookup
	private WebElement clickShippingMethod;

	public WebElement getClickShippingMethod() {
		return clickShippingMethod;

	}
	@FindBy(xpath = "//span[text()='Next']")
	@CacheLookup
	private WebElement clickOnNext;

	public WebElement getClickOnNext() {
		return clickOnNext;

	}
	
	@FindBy(xpath = "//*[contains(text(),'Place Order')]")
	@CacheLookup
	private WebElement clickOnPlaceOrder;

	public WebElement getClickOnPlaceOrder() {
		return clickOnPlaceOrder;

	}
	
	@FindBy(xpath = "//*[contains(text(),'Thank you for your purchase!')]")
	@CacheLookup
	private WebElement verifiedPurchaseText;

	public WebElement getVerifiedPurchaseText() {
		return verifiedPurchaseText;

	}
	
	@FindBy(xpath = "//div[@class='checkout-success']//strong")
	@CacheLookup
	private WebElement verifiedOrderNumber;

	public WebElement getVerifiedOrderNumber() {
		return verifiedOrderNumber;

	}
	/*
	 * WebElement radiobutton = driver.findElement(By.xpath("(//*[@name='ko_unique_1'])[1]"));
	 * radiobutton.click();
	 * Thread.sleep(3000); 
	 * WebElement Nextbutton = driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
	 * Nextbutton.click();
	 */
	public void addShippingDetails() {
		log.info("User able to add First Name");
		getInputFirstName().clear();
		WaitHelper.seleniumWait(getInputFirstName(), 30);
		getInputFirstName().sendKeys(CommonUtilitys.getNewAlphabetValue()+ "@gmail.com");

		log.info("User able to add Last Name");
		getInputLastName().clear();
		WaitHelper.seleniumWait(getInputLastName(), 30);
		getInputLastName().sendKeys(CommonUtilitys.getNewAlphabetValue());
		
		log.info("User able to add Company Name");
		getInputCompanyName().clear();
		WaitHelper.seleniumWait(getInputCompanyName(), 30);
		getInputCompanyName().sendKeys(CommonUtilitys.getNewAlphabetValue());

		log.info("User able to add Street Name");
		getInputStreetName().clear();
		WaitHelper.seleniumWait(getInputStreetName(), 30);
		getInputStreetName().sendKeys("123 " + CommonUtilitys.getNewAlphabetValue());

		log.info("User able to add City Name");
		getInputCityName().clear();
		WaitHelper.seleniumWait(getInputCityName(), 30);
		getInputCityName().sendKeys("Jersey City");

		log.info("User able to select State Name");
		WaitHelper.seleniumWait(getSelectStateName(), 30);
		//CommonUtilitys.getSelectValue(getSelectStateName(), "New Jersey");
		CommonUtilitys.getSelectDropDownList(getSelectDropDown(), "New Jersey");
		
		
		log.info("User able to add Zip Code");
		getInputZipCode().clear();
		WaitHelper.seleniumWait(getInputZipCode(), 30);
		getInputZipCode().sendKeys("01006");

		log.info("User able to select Country Name");
		WaitHelper.seleniumWait(getselectCountryName(), 30);
		CommonUtilitys.getSelectValue(getselectCountryName(), "United States");

		log.info("User able to add Phone Number");
		getAddPhoneNumber().clear();
		WaitHelper.seleniumWait(getAddPhoneNumber(), 30);
		getAddPhoneNumber().sendKeys(CommonUtilitys.getNewNumericValue());

		log.info("User able to click Ship Here");
		WaitHelper.seleniumWait(getClickShipHere(), 30);
		CommonUtilitys.getActionClick(getClickShipHere());
		
		log.info("User able to select Shipping Method");
		WaitHelper.seleniumWait(getClickShippingMethod(), 30);
		CommonUtilitys.getRadioButton(getClickShippingMethod());
		//CommonUtilitys.getActionClick(getClickShippingMethod());
		//getClickShippingMethod().click();
		
		log.info("User able to click Next");
		WaitHelper.seleniumWait(getClickOnNext(), 30);
		CommonUtilitys.getActionClick(getClickOnNext());
		
		log.info("User able to click Place Order");
		WaitHelper.seleniumWait(getClickOnPlaceOrder(), 30);
		//CommonUtilitys.getActionClick(getClickOnPlaceOrder());
		CommonUtilitys.getJSClick(getClickOnPlaceOrder());
		//CommonUtilitys.clickUntilElementClickAble(getClickOnPlaceOrder());
	}

	public void getLogin() {
		log.info("User able to click on sign in button");
		HighLightElements.drawBorder(getClickSignInBTN());
		WaitHelper.seleniumWait(getClickSignInBTN(), 30);
		CommonUtilitys.getActionClick(getClickSignInBTN());

		log.info("User able to enter username");
		HighLightElements.drawBorder(getEnterUserName());
		WaitHelper.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));

		log.info("User able to enter password");
		HighLightElements.drawBorder(getEnterPassword());
		WaitHelper.seleniumWait(getEnterPassword(), 30);
		getEnterPassword().sendKeys(prop.getProperty("passWord"));

		log.info("User able to click on login button");
		HighLightElements.drawBorder(getClickLogin());
		WaitHelper.seleniumWait(getClickLogin(), 30);
		CommonUtilitys.getActionClick(getClickLogin());

	}
}
