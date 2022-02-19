package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {

	public ComponentsPageObject() {
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
	private WebElement MyAccountMenu1;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Register;
	
	@FindBy(xpath = "//ul[@class='list-inline']//li[@class='dropdown']//a[@class='dropdown-toggle']")
	private WebElement MyAccountMenu2;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement Login;
	
	@FindBy(xpath = "//a[@id='wishlist-total']")
	private WebElement WishList;
	
	@FindBy(xpath = "//li[4]/a[@title='Shopping Cart']")
	private WebElement ShoppingCart;
	
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
	
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement HomePageButton;
	
	@FindBy(xpath = "//li[2]/a[contains(text(), 'Components')]")
	private WebElement ComponentsSublink;
	
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
	
	
	//components page
	
	@FindBy(css = "a.list-group-item:nth-child(1)")
	private WebElement componentsPageObjectDesktops;
	
	@FindBy(css = "a.list-group-item:nth-child(2)")
	private WebElement componentsPageObjectLaptopsAndNotebooks; 
	
	@FindBy(css = "a.list-group-item:nth-child(4)")
	private WebElement componentsPageObjectMiceAndTrackBalls;
	
	@FindBy(css = "a.list-group-item:nth-child(5)")
	private WebElement componentsPageObjectMonitors;
	
	@FindBy(css = "a.list-group-item:nth-child(6)")
	private WebElement componentsPageObjectPrinters;
	
	@FindBy(css = "a.list-group-item:nth-child(7)")
	private WebElement componentsPageObjectScanners;
	
	@FindBy(css = "a.list-group-item:nth-child(8)")
	private WebElement componentsPageObjectWebCameras; 
	
	@FindBy(css = "a.list-group-item:nth-child(9)")
	private WebElement componentsPageObjectTablets;
	
	@FindBy(css = "a.list-group-item:nth-child(10)")
	private WebElement componentsPageObjectSoftware;
	
	@FindBy (css = "a.list-group-item:nth-child(11)")
	private WebElement componentsPageObjectPhonesAndPDAs;
	
	@FindBy (css = "a.list-group-item:nth-child(12)")
	private WebElement componentsPageObjectCameras; 
	
	@FindBy (css = "a.list-group-item:nth-child(13)")
	private WebElement componentsPageObjectMP3Players;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement componentsPageObjectPCPicture;
	
	@FindBy(css = ".breadcrumb>li:nth-child(1)>a:nth-child(1)")
	private WebElement componentsPageObjectHome;
	
	@FindBy(css = ".breadcrumb>li:nth-child(2)>a:nth-child(1)")
	private WebElement componentsPageObjectComponents;
	
	@FindBy(xpath = "//h2[text()='Components']")
	private WebElement componentsPageObjectText; 

	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement componentsPageObjectSubText;
	
	@FindBy(css = "div.row:nth-child(3)>div:nth-child(1)>ul:nth-child(1)>li:nth-child(1)>a")
	private WebElement componentsPageObjectList1;
	
	@FindBy(css = "div.row:nth-child(3)>div:nth-child(1)>ul:nth-child(1)>li:nth-child(2)>a:nth-child(1)")
	private WebElement componentsPageObjectList2;
	
	@FindBy(css = "div.row:nth-child(3)>div:nth-child(1)>ul:nth-child(1)>li:nth-child(3)>a:nth-child(1)")
	private WebElement componentsPageObjectList3;
	
	@FindBy(css = "div.row:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")
	private WebElement componentsPageObjectList4;
	
	@FindBy(css = "div.row:nth-child(3)>div:nth-child(1)>ul:nth-child(1)>li:nth-child(5)>a:nth-child(1)")
	private WebElement componentsPageObjectList5;

	
	//@FindBy(linkText = "Mice and Trackballs (0)")
//	//private WebElement componentsPageObjectList1;
//	
//	@FindBy(linkText = "Monitors (2)")
//	private WebElement componentsPageObjectList2; 
//	
//	@FindBy(linkText = "Printers (0)")
//	private WebElement componentsPageObjectList3;
//	
//	@FindBy(linkText = "Scanners (0)")
//	private WebElement componentsPageObjectList4; 
//	
//	@FindBy(linkText = "Web Cameras (0)")
//	private WebElement componentsPageObjectList5; 
//	
	
	

}
