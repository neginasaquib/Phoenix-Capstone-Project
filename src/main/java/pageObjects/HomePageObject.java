package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Utilities;


public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	
	}
	//header
	
	@FindBy(xpath = "//*[@id='form-currency']")
	private WebElement CurrencyTab1;
	
	@FindBy(xpath = "//li[1]/button")
	private WebElement CurrencyEuro;
	
	@FindBy(xpath = "//*[@id='form-currency']")
	private WebElement CurrencyTab2;
	
	@FindBy(xpath = "//li[2]/button")
	private WebElement CurrencyPound;
	
	@FindBy(xpath = "//*[@id='form-currency']")
	private WebElement CurrencyTab3;
	
	@FindBy(xpath = "//li[3]/button")
	private WebElement CurrencyDollar;
	
	@FindBy(xpath = "//a/i[@class='fa fa-phone']")
	private WebElement PhoneButton;
	
	@FindBy(xpath = "//span[contains(text(),'123456789')]")
	private WebElement PhoneNumber;
	

	
	@FindBy(xpath = "//ul[@class='list-inline']//li[@class='dropdown']//a[@class='dropdown-toggle']")
	private WebElement MyAccountMenu2;
	
	@FindBy(xpath = "//a[@id='wishlist-total']")
	private WebElement WishList;
	
	@FindBy(xpath = "//li[5]/a[@title='Checkout']")
	private WebElement CheckOut;
	
	@FindBy(xpath = "//h1/a")
	private WebElement TestEnvironment;
	
	@FindBy(id = "Search")
	private WebElement Search;
	
	@FindBy(xpath = "//span[@class='input-group-btn']")
	private WebElement SearchButton;
	
	@FindBy(xpath = "//div[@id='cart']//button[@type='button']")
	private WebElement CartButton;
	
	@FindBy(xpath = "//li[1][@class='dropdown']")
	private WebElement DesktopsMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'PC (0)')]")
	private WebElement PCDropDown;
	
	@FindBy(xpath = "//li[1][@class='dropdown']")
	private WebElement DesktopsMenu2;
	
	@FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
	private WebElement MacDropDown;
	
	@FindBy(xpath = "//li[1][@class='dropdown']")
	private WebElement DesktopsMenu3;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktopsDropdown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
	private WebElement LaptopsAndNotebooksMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'Macs (0)')]")
	private WebElement MacsDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
	private WebElement LaptopsAndNotebooksMenu2;
	
	@FindBy(xpath = "//a[contains(text(),'Windows (0)')]")
	private WebElement WindowsDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
	private WebElement LaptopsAndNotebooksMenu3;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopsAndNotebooks;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'Mice and Trackballs (0)')]")
	private WebElement MiceAndTrackballsDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu2;
	
	@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
	private WebElement MonitorsDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu3;
	
	@FindBy(xpath = "//a[contains(text(),'Printers (0)')]")
	private WebElement PrintersDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu4;
	
	@FindBy(xpath = "//a[contains(text(),'Scanners (0)')]")
	private WebElement ScannersDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu5;
	
	@FindBy(xpath = "//a[contains(text(),'Web Cameras (0)')]")
	private WebElement WebCamerasDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
	private WebElement ComponentsMenu6;
	
	@FindBy(xpath = "//a[contains(text(),'Web Cameras (0)')]")
	private WebElement ShowAllComponentsDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement TabletsMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Software')]")
	private WebElement SoftwareMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement PhonesAndPDAsMenu;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Cameras')]")
	private WebElement CamerasMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'Canon (1)')]")
	private WebElement CanonDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Cameras')]")
	private WebElement CamerasMenu2;
	
	@FindBy(xpath = "//a[contains(text(),'Nikon (1)')]")
	private WebElement NikonDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Cameras')]")
	private WebElement CamerasMenu3;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Cameras')]")
	private WebElement ShowAllCamerasDropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu1;
	
	@FindBy(xpath = "//a[contains(text(),'test 11 (0)')]")
	private WebElement Test11DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu2;
	
	@FindBy(xpath = "//a[contains(text(),'test 12 (0)')]")
	private WebElement Test12DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu3;
	
	@FindBy(xpath = "//a[contains(text(),'test 15 (0)')]")
	private WebElement Test15DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu4;
	
	@FindBy(xpath = "//a[contains(text(),'test 16 (0)')]")
	private WebElement Test16DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu5;
	
	@FindBy(xpath = "//a[contains(text(),'test 17 (0)')]")
	private WebElement Test17DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu6;
	
	@FindBy(xpath = "//a[contains(text(),'test 18 (0)')]")
	private WebElement Test18DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]p")
	private WebElement MP3Menu7;
	
	@FindBy(xpath = "//a[contains(text(),'test 19 (0)')]")
	private WebElement Test19DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu8;
	
	@FindBy(xpath = "//a[contains(text(),'test 20 (0)')]")
	private WebElement Test20DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu9;
	
	@FindBy(xpath = "//a[contains(text(),'test 21 (0)')]")
	private WebElement Test21DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu10;
	
	@FindBy(xpath = "//a[contains(text(),'test 22 (0)')]")
	private WebElement Test22DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu11;
	
	@FindBy(xpath = "//a[contains(text(),'test 23 (0)')]")
	private WebElement Test23DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu12;
	
	@FindBy(xpath = "//a[contains(text(),'test 24 (0)')]")
	private WebElement Test24DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu13;
	
	@FindBy(xpath = "//a[contains(text(),'test 4 (0)')]")
	private WebElement Test4DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu14;
	
	@FindBy(xpath = "//a[contains(text(),'test 5 (0)')]")
	private WebElement Test5DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu15;
	
	@FindBy(xpath = "//a[contains(text(),'test 6 (0)')]")
	private WebElement Test6DropDown;

	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu16;
	
	@FindBy(xpath = "//a[contains(text(),'test 7 (0)')]")
	private WebElement Test7DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu17;
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//li//a[contains(text(),'test 8 (0)')]")
	private WebElement Test8DropDown;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu18;
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//li//a[contains(text(),'test 9 (0)')]")
	private WebElement Test9DropDown;

	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
	private WebElement MP3Menu19;
	
	@FindBy(xpath = "//a[contains(text(),'Show All MP3 Players')]")
	private WebElement ShowAllMP3sDropDown;
	
	//footer
	
	@FindBy(xpath = "//footer/div/div/div[1]/h5")
	private WebElement FooterInformation;
	
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement FooterAboutUs;
	
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement FooterDeliveryInformation;
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement FooterPrivacyPolicy;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement FooterTermsAndConditions;
	
	@FindBy(xpath = "//footer/div/div/div[2]/h5]")
	private WebElement FooterCustomerService;
	
	@FindBy(xpath = "//a[text()='Contact Us']]")
	private WebElement FooterContactUs;
	
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement FooterReturns;
	
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement FooterSiteMap;
	
	@FindBy(xpath = "//footer/div/div/div[3]/h5")
	private WebElement FooterExtras;
	
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement FooterBrands;
	
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement FooterGiftCertificates;
	
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement FooterAffiliate;
	
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement FooterSpecials;
	
	@FindBy(xpath = "//footer/div/div/div[4]/h5")
	private WebElement FooterMyAccount;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement FooterMyAccount1;
	
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement FooterOrderHistory;
	
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement FooterWishList;
	
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement FooterNewsletter;
	
	@FindBy(xpath = "//footer/div/p")
	private WebElement FooterCopyright;
	
//home 
	
	@FindBy(xpath = "//div[@id='slideshow0']")
	private WebElement SlideShow;
	
	@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/product&product_id=43']//img[@class='img-responsive']")
	private WebElement MacBookImage;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook')]")
	private WebElement MacBookTitle;
	
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement MacBookIntel;
	
	@FindBy(xpath = "//p[contains(text(),'$602.00')]")
	private WebElement MacBookPrice;
	
	@FindBy(xpath = "//span[contains(text(), 'Ex Tax: $500.00')]")
	private WebElement MacBookTax;
	
//	@FindBy(xpath = "//button[@onclick="cart.add('43');"]")
//	private WebElement MacBookAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('43');"]")
//	private WebElement MacBookAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('43');"]")
//	private WebElement MacBookCompare;
	
	@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/product&product_id=40']//img[@class='img-responsive']")
	private WebElement IphoneImage;
	
	@FindBy(linkText = "iPhone")
	private WebElement IphoneTitle;
	
	@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary new mobile phone that al')]")
	private WebElement IphoneDescription;
	
	@FindBy(xpath = "//p[contains(text(),'$123.20')]")
	private WebElement IphonePrice;
	
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $101.00')]")
	private WebElement IphoneTax;
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('40');\"]")
	private WebElement IphoneAddToCart;
	
	@FindBy(xpath = "//button[@onclick=\"wishlist.add('40');\"]")
	private WebElement IphoneAddToWishList;
	
	@FindBy(xpath = "//button[@onclick=\"compare.add('40');\"]")
	private WebElement IphoneCompare;
	
	@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/product&product_id=42']//img[@class='img-responsive']")
	private WebElement AppleCinemaImage;
	
	@FindBy(linkText = "Apple Cinema 30")
	private WebElement AppleCinemaTitle;
	
	@FindBy(xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]")
	private WebElement AppleCinemaDescription;
	
	@FindBy(xpath = "//span[contains(text(),'$110.00')]")
	private WebElement AppleCinemaPrice;
	
	@FindBy(xpath = "//body/div[@id='common-home']/div[@class='row']/div[@id='content']/div[@class='row']/div[3]/div[1]/div[2]/p[2]/span[2]")
	private WebElement AppleCinemaOldPrice;
	
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $90.00')]")
	private WebElement AppleCinemaTax;
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('42');\"]")
	private WebElement AppleCinemaAddToCart;
	
	@FindBy(xpath = "//button[@onclick=\"wishlist.add('42');\"]")
	private WebElement AppleCinemaAddToWishList;
	
	@FindBy(xpath = "//button[@onclick=\"compare.add('42');\"]")
	private WebElement AppleCinemaCompare;
	
	@FindBy(xpath = "//div/a[@href='http://tek-school.com/retail/index.php?route=product/product&product_id=30']")
	private WebElement CanonEOS5DImage;
	
	@FindBy(xpath = "//h4/a[contains(text(),'Canon EOS 5D')]")
	private WebElement CanonEOS5DTitle;
	
	@FindBy(xpath = "//div[2]/p[contains(text(), \"Canon's press material for the EOS 5D states\")]")
	private WebElement CanonEOS5DDescription;
	
	@FindBy(xpath = "//span[contains(text(), '$98.00')]")
	private WebElement CanonEOS5DPrice;
	
	@FindBy(xpath = "//span[contains(text(), '$122.00')]")
	private WebElement CanonEOS5DOldPrice;
	
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $80.00')]")
	private WebElement CanonEOS5DTax;
	
//	@FindBy(xpath = "//button[@onclick="cart.add('30');"]")
//	private WebElement CanonEOS5DAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('30');"]")
//	private WebElement CanonEOS5DAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('30');"]")
//	private WebElement CanonEOS5DCompare;
	
	@FindBy(id = "carousel0")
	private WebElement Carousel;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Harley Davidson']")
	private WebElement HarleyDavidsonLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Dell']")
	private WebElement DellLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Disney']")
	private WebElement DisneyLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Starbucks']")
	private WebElement StarbucksLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Nintendo']")
	private WebElement NintendoLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='NFL']")
	private WebElement NFLLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='RedBull']")
	private WebElement RedBullLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Sony']")
	private WebElement SonyLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='CocaCola']")
	private WebElement CocaColaLogo;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-duplicate']/img[@alt='Canon]")
	private WebElement CanonLogo;
	
	@FindBy(xpath = "//div[@id='content']/div[@class='swiper-viewport']/div[@class='swiper-pagination carousel0 swiper-pagination-clickable swiper-pagination-bullets']/span[1]")
	private WebElement Bullet1;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][2]")
	private WebElement Bullet2;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][3]")
	private WebElement Bullet3;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][4]")
	private WebElement Bullet4;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][5]")
	private WebElement Bullet5;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][6]")
	private WebElement Bullet6;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][7]")
	private WebElement Bullet7;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][8]")
	private WebElement Bullet8;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][9]")
	private WebElement Bullet9;
	
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet'][10]")
	private WebElement Bullet10;
	
	
//-------------------------------------------------------------------	
//	For Background: for this feature you have to have an existing account

	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccountMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement Login;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginButton;

	@FindBy(xpath = "//div[@id='account-account']//div[@class='row']")
	private WebElement Dashboard;
	
	public void accountClick() {
		MyAccountMenu1.click();
	}
	
	public void login() {
		Login.click();
	}
	
	public void username() {
		username.click();
		username.sendKeys("xyza@gmail.com");
		
	}	
	
	public void password() {
		password.click();
		password.sendKeys("ABC123");
		
	}

	public void loginButton() {
		LoginButton.click();
		
	}
	
	@SuppressWarnings("deprecation")
	public void pageDisplayAssert() {
		boolean pageDisplay = Dashboard.isDisplayed();
		boolean expected = true;
		Assert.assertEquals(pageDisplay, expected);
		
	}

//----------------------------------------------------------------	
//	For Scenario: Register as an Affiliate user with Paypal Method
	
	
	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement RegisterForAffiliateAccount;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyInput;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement WebsiteInput;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement TaxIdInput;	
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement Paypal;	
	
	@FindBy(xpath = "//input[@id='input-paypal']")
	private WebElement PaypalEmailAdd;	
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement CheckBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement ContinueButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]")
	private WebElement AccountSuccess;
	
	
	public void affiliateAccountLink() {
		RegisterForAffiliateAccount.click();
	}
	
	public void enterCompanyName(String companyName) {
		companyInput.sendKeys(companyName);
	}
	
	public void enterWebsiteInput(String websiteInput) {
		WebsiteInput.sendKeys(websiteInput);
	}
	
	public void enterTaxIdInput(String taxId) {
		TaxIdInput.sendKeys(taxId);
	}
	
	public void paypalMethod() {
		Paypal.click();
	}
	
	public void enterPaypalEmail() {
		PaypalEmailAdd.sendKeys("october18fallday@gmail.com");
	}
	
	@SuppressWarnings("deprecation")
	public void verifyPaypalRadioButtonIsSelected() {
		Paypal.click();
		boolean isPaypalRadioButtonSelected = Paypal.isSelected();
		boolean expectedBlm = true;
		try {
			Assert.assertEquals(expectedBlm, isPaypalRadioButtonSelected);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void agreement() {
		CheckBox.click();
	}
	
	public void clickOnContinue() {
		ContinueButton.click();
	}
	
	@SuppressWarnings("deprecation")
	public void successAccountCreatedAssert(String accountCreated) {
		String actualAccountMessage = AccountSuccess.getText();
		String actualAccountMessageStr = actualAccountMessage.substring(0, 52);
		Assert.assertEquals(accountCreated, actualAccountMessageStr);
	}
	
//----------------------------------------------------------------	
//	This is for Scenario: Edit your affiliate information from 
//	Cheque payment method to Bank Transfer

	
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement EditAffiliate;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement BankTransfer;
	
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement BankName;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement ABA;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SwiftCode;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement AccountName;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement AccountNumber;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement ClickSubmit;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement BankAddedSuccess;
	
	public void clickOnAffiliate() {
		EditAffiliate.click();
	}
	
	public void bankRadioButton() {
		BankTransfer.click();
	}
	
	public void bankName(String name) {
		Utilities.waitAndClickElement(BankName);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		BankName.clear();
		BankName.sendKeys(name);
	}
	
	public void bankSwiftCode(String swift) {
		
		SwiftCode.clear();
		SwiftCode.sendKeys(swift);
	}
	
	public void accountNameField(String accountName) {
		AccountName.clear();
		AccountName.sendKeys(accountName);
	}
	
	
	public void accountNumberField(String accountNumber) {
		AccountNumber.clear();
		AccountNumber.sendKeys(accountNumber);
		
	}
	
	public void bankABA(String aBa) {
		ABA.clear();
		ABA.sendKeys(aBa);
	}
	
	public void continueButton() {
		ClickSubmit.click();
	}
	
	@SuppressWarnings("deprecation")
	public void successAccountEdit(String accountEdited) {
		String actualSuccessMsg = BankAddedSuccess.getText();
		String actualSuccessMsgStr = actualSuccessMsg.substring(0, 52);
		Assert.assertEquals(accountEdited, actualSuccessMsgStr);
	}

//----------------------------------------------------------------	
//	This is for Scenario: Edit your account Information
	
	
	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	private WebElement EditAccount;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement FirstNameEdit;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement LastNameEdit;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement EmailEdit;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement TelephoneEdit;
	
	public void accountEditing() {
		EditAccount.click();
	}
	
	public void firstNameEditing(String firstName) {
		FirstNameEdit.clear();
		FirstNameEdit.sendKeys(firstName);
		
	}
	public void lastNameEditing(String lastName) {
		LastNameEdit.clear();
		LastNameEdit.sendKeys(lastName);
	}
	
	public void emailEditing(String email) {
		EmailEdit.clear();
		EmailEdit.sendKeys(email);
	}
	public void telphoneEditing(String phone) {
		TelephoneEdit.clear();
		TelephoneEdit.sendKeys(phone);
	}

//----------------------------------------------------------------	
// This is for Scenario: User empty Shopping cart message displays  
	
	
	@FindBy(xpath = "//li[4]/a[@title='Shopping Cart']")
	private WebElement ShoppingCart;
	
	@FindBy(xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement CartEmpty;
	
	public void clickOnShoppingCart() {
		ShoppingCart.click();
	}
	
	@SuppressWarnings("deprecation")
	public void emptyShoppingCart(String cart) {
		String actualCartMessage = CartEmpty.getText();
		@SuppressWarnings("unused")
		String expectedCartMessage = cart;
		Assert.assertEquals(cart, actualCartMessage);
	}
	
	
	
	
}
