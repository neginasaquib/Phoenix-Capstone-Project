package pageObjects;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);

	}
	// header

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

	@FindBy(xpath = "/html/body/nav/div/div[1]/form/div/button/strong")
	private WebElement EuroSelect;

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

	// footer

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

	// Desktops

	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement HomePageButton;

	@FindBy(xpath = "//li[2]/a[contains(text(), 'Desktops')]")
	private WebElement ComponentsSublink;

	@FindBy(xpath = "//div/a[@class='list-group-item active']")
	private WebElement DesktopList;

	@FindBy(xpath = "//div/a[2][@class='list-group-item']")
	private WebElement DesktopListPC;

	@FindBy(xpath = "//div/a[3][@class='list-group-item']")
	private WebElement DesktopListMac;

	@FindBy(xpath = "//div/a[4][@class='list-group-item']")
	private WebElement LaptopsAndNoteBooksList;

	@FindBy(xpath = "//div/a[5][@class='list-group-item']")
	private WebElement ComponentsList;

	@FindBy(xpath = "//div/a[6][@class='list-group-item']")
	private WebElement TabletsList;

	@FindBy(xpath = "//div/a[7][@class='list-group-item']")
	private WebElement SoftwareListList;

	@FindBy(xpath = "//div/a[8][@class='list-group-item']")
	private WebElement PhonesAndPDAsList;

	@FindBy(xpath = "//div/a[9][@class='list-group-item']")
	private WebElement CamerasList;

	@FindBy(xpath = "//div/a[10][@class='list-group-item']")
	private WebElement MP3PlayersList;

	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement HPBanner;

	@FindBy(xpath = "//h2[contains(text(), 'Desktops')]")
	private WebElement DesktopsHeader;

	@FindBy(xpath = "//img[@title='Desktops']")
	private WebElement DesktopsThumbnail;

	@FindBy(xpath = "//p[contains(text(), 'Example of category description text')]")
	private WebElement DesktopsDescription;

	@FindBy(xpath = "//h3[contains(text(), 'Refine Search')]")
	private WebElement RefineSearch;

	@FindBy(xpath = "//div[@class='col-sm-3']/ul/li/a[contains(text(), 'PC (0)')]")
	private WebElement PCLink;

	@FindBy(xpath = "//div[@class='col-sm-3']/ul/li[2]/a[contains(text(), 'Mac (1)')]")
	private WebElement MacLink;

	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement ListButton;

	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement GridButton;

	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement CompareTotal;

	@FindBy(xpath = "//label[@for='input-sort']")
	private WebElement SortBy;

	@FindBy(xpath = "//select[@id='input-sort']/option[1]")
	private WebElement SortOption1;

	@FindBy(xpath = "//select[@id='input-sort']/option[2]")
	private WebElement SortOption2;

	@FindBy(xpath = "//select[@id='input-sort']/option[3]")
	private WebElement SortOption3;

	@FindBy(xpath = "//select[@id='input-sort']/option[4]")
	private WebElement SortOption4;

	@FindBy(xpath = "//select[@id='input-sort']/option[5]")
	private WebElement SortOption5;

	@FindBy(xpath = "//select[@id='input-sort']/option[6]")
	private WebElement SortOption6;

	@FindBy(xpath = "//select[@id='input-sort']/option[7]")
	private WebElement SortOption7;

	@FindBy(xpath = "//select[@id='input-sort']/option[8]")
	private WebElement SortOption8;

	@FindBy(xpath = "//select[@id='input-sort']/option[9]")
	private WebElement SortOption9;

	@FindBy(xpath = "//label[@for='input-limit']")
	private WebElement Show;

	@FindBy(xpath = "//select[@id='input-limit']/option[1]")
	private WebElement Show15;

	@FindBy(xpath = "//select[@id='input-limit']/option[2]")
	private WebElement Show25;

	@FindBy(xpath = "//select[@id='input-limit']/option[3]")
	private WebElement Show50;

	@FindBy(xpath = "//select[@id='input-limit']/option[4]")
	private WebElement Show75;

	@FindBy(xpath = "//select[@id='input-limit']/option[5]")
	private WebElement Show100;

	@FindBy(xpath = "//img[@title='Apple Cinema 30']")
	private WebElement AppleCinema30Image;

	@FindBy(xpath = "//h4/a[contains(text(), 'Apple Cinema 30\"')]")
	private WebElement AppleCinema30Title;

	@FindBy(xpath = "//div/p[contains(text(), 'The 30-inch Apple Cinema HD Display delivers')]")
	private WebElement AppleCinema30Description;

	@FindBy(xpath = "//p[@class='price']/span[contains(text(), '$110.00')]")
	private WebElement AppleCinema30NewPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/p[2]/span[2]")
	private WebElement AppleCinema30OldPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/p[2]/span[3]")
	private WebElement AppleCinema30Tax;

//	@FindBy(xpath = "//button[@onclick="cart.add('42', '2');"]")
//	private WebElement AppleCinema30AddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('42');"]")
//	private WebElement AppleCinema30AddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('42');"]")
//	private WebElement AppleCinema30Compare;

	@FindBy(xpath = "//h4/a[contains(text(), 'Canon EOS 5D')]")
	private WebElement CanonTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/p[1]")
	private WebElement CanonDescription;

	@FindBy(xpath = "//p[@class='price']/span[contains(text(), '$98.00')]")
	private WebElement CanonPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/p[2]/span[2]")
	private WebElement CanonOldPrice;

	@FindBy(xpath = "//p[2]/span[3][contains(text(), 'Ex Tax: $80.00')]")
	private WebElement CanonTax;

//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('30');"]")
//	private WebElement CanonAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('30');"]")
//	private WebElement CanonCompare;
	

	@FindBy(xpath = "//img[@alt='HP LP3065']")
	private WebElement HPImage;

	@FindBy(linkText = "HP LP3065")
	private WebElement HPTitle;

	@FindBy(xpath = "//p[contains(text(), 'Stop your co-workers in their tracks')]")
	private WebElement HPDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[3]/div/div[2]/div[1]/p[2][@class='price'][contains(text(), '$122.00')]")
	private WebElement HPPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[3]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
	private WebElement HPTax;

	@FindBy(xpath = "//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement AddHP;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement SelectQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddtoCart;

	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement HTCImage;

	@FindBy(linkText = "HTC Touch HD")
	private WebElement HTCTitle;

	@FindBy(xpath = "//div/p[contains(text(), 'HTC Touch - in High Definition')]")
	private WebElement HTCDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[4]/div/div[2]/div[1]/p[2]")
	private WebElement HTCPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[4]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
	private WebElement HTCTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('28', '1');"]")
//	private WebElement HTCAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('28');"]")
//	private WebElement HTCAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('28');"]")
//	private WebElement HTCCompare;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement IphoneImage;

	@FindBy(linkText = "iPhone")
	private WebElement IphoneTitle;

	@FindBy(xpath = "//div/p[contains(text(), 'iPhone is a revolutionary new mobile')]")
	private WebElement IphoneDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[5]/div/div[2]/div[1]/p[2]")
	private WebElement IphonePrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[5]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $101.00')]")
	private WebElement IphoneTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('40', '1');"]")
//	private WebElement IphoneAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('40');"]")
//	private WebElement IphoneAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('40');"]")
//	private WebElement IphoneCompare;

	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement IpodImage;

	@FindBy(linkText = "iPod Classic")
	private WebElement IpodTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[6]/div/div[2]/div[1]/p[1]")
	private WebElement IpodDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[6]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
	private WebElement IpodPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[6]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
	private WebElement IpodTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('48', '1');"]")
//	private WebElement IpodAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('48');"]")
//	private WebElement IpodAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('48');"]")
//	private WebElement IpodCompare;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookImage;

	@FindBy(linkText = "MacBook")
	private WebElement MacBookTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[7]/div/div[2]/div[1]/p[1][contains(text(), 'Intel Core 2 Duo processor')]")
	private WebElement MacBookDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[7]/div/div[2]/div[1]/p[2][contains(text(), '$602.00')]")
	private WebElement MacBookPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[7]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $500.00')]")
	private WebElement MacBookTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('43', '1');"]")
//	private WebElement MacBookAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('43');"]")
//	private WebElement MacBookAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('43');"]")
//	private WebElement MacBookCompare;

	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement MacBookAirImage;

	@FindBy(linkText = "MacBook Air")
	private WebElement MacBookAirTitle;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[8]/div/div[2]/div[1]/p[1][contains(text(), 'MacBook Air is ultrathin')]")
	private WebElement MacBookAirDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[8]/div/div[2]/div[1]/p[2][contains(text(), '$1,202.00')]")
	private WebElement MacBookAirPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[8]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $1,000.00')]")
	private WebElement MacBookAirTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('44', '1');"]")
//	private WebElement MacBookAirAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('44');"]")
//	private WebElement MacBookAirAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('44');"]")
//	private WebElement MacBookAirCompare;

	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement PalmTreoProImage;

	@FindBy(linkText = "Palm Treo Pro")
	private WebElement PalmTreoProTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[9]/div/div[2]/div[1]/p[1][contains(text(), 'Redefine your workday with the Palm Treo Pro smartphone. ')]")
	private WebElement PalmTreoProDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[9]/div/div[2]/div[1]/p[2][contains(text(), '$337.99')]")
	private WebElement PalmTreoProPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[9]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $279.99')]")
	private WebElement PalmTreoProTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('29', '1');"]")
//	private WebElement PalmTreoProAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('29');"]")
//	private WebElement PalmTreoProAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('29');"]")
//	private WebElement PalmTreoProCompare;

	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement Product8Image;

	@FindBy(linkText = "Product 8")
	private WebElement Product8Title;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[10]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
	private WebElement Product8Price;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[10]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
	private WebElement Product8Tax;

//	@FindBy(xpath = "//button[@onclick="cart.add('35', '1');"]")
//	private WebElement Product8AddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('35');"]")
//	private WebElement Product8AddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('35');"]")
//	private WebElement Product8AirCompare;

	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement SamsungImage;

	@FindBy(linkText = "Samsung SyncMaster 941BW")
	private WebElement SamsungTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[11]/div/div[2]/div[1]/p[1][contains(text(), 'Imagine the advantages of going big without slowing down.')]")
	private WebElement SamsungDescription;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[11]/div/div[2]/div[1]/p[2][contains(text(), '$242.00')]")
	private WebElement SamsungPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[11]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $200.00')]")
	private WebElement SamsungTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('33', '1');"]")
//	private WebElement SamsungAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('33');"]")
//	private WebElement SamsungAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('33');"]")
//	private WebElement SamsungCompare;

	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement SonyImage;

	@FindBy(linkText = "Sony VAIO")
	private WebElement SonyTitle;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[12]/div/div[2]/div[1]/p[1][contains(text(), '$1,202.00')]")
	private WebElement SonyPrice;

	@FindBy(xpath = "//div[2]/div/div/div[4]/div[12]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $1,000.00')]")
	private WebElement SonyTax;

//	@FindBy(xpath = "//button[@onclick="cart.add('46', '1');"]")
//	private WebElement SonyAddToCart;
//	
//	@FindBy(xpath = "//button[@onclick="wishlist.add('46');"]")
//	private WebElement SonyAddToWishList;
//	
//	@FindBy(xpath = "//button[@onclick="compare.add('46');"]")
//	private WebElement SonyAirCompare;

	@FindBy(xpath = "//div[2][@class='col-sm-6 text-right']")
	private WebElement Showing;

	@FindBy(tagName = "strong")
	private WebElement currencyTag;
	

	
//---------------------------------------------------------------
//	For Scenario: User verify currency values change 

	
	public void validateHomePage() {
		String text = TestEnvironment.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	}

	public void clickOnCurrency() {
		CurrencyTab1.click();
	}

	public void clickOnEuro() {
		CurrencyEuro.click();
	}

	public String currencyAssert() {

		String value = currencyTag.getText();
		return value;
	}

//---------------------------------------------------------------
//	For Scenario: User add HP LP 3065 from Desktops tab to the cart 

	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPsucess;
	
	public void clickOnDesktops() {
		DesktopsMenu1.click();
	}

	public void clickOnShowAll() {
		ShowAllDesktopsDropdown.click();

	}

	public void HPAdd() {
		AddHP.click();
	}

	public void selectQuantity() {
		SelectQuantity.sendKeys("");
	}

	public void addToCart() {
		AddtoCart.click();
	}

	public void hpAssert(String hp) {
		String actualHpAddedMsg = HPsucess.getText();
		String HPAddedMsgStr = actualHpAddedMsg.substring(0, 56);
		Assert.assertEquals(hp, HPAddedMsgStr);

	}

//---------------------------------------------------------------
//	For Scenario: User add Canon EOS 5D from Desktops tab to the cart 

	@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@class='row']/div[2]/div[1]/div[2]/div[2]/button[1]")
	private WebElement CanonAddToCart;
	
	@FindBy(xpath = "//*[@id=\"input-option226\"]")
	private WebElement SelectColor;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement RedColor;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement CanonQuantity;
	
	@FindBy(xpath = "//div[@class='form-group']//input[@type='hidden']")
	private WebElement CanonSelectAway;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddtoCartCanon;
	
//	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
//	private WebElement CanonSuccessMessage;

//	@FindBy(xpath = "//div[1][contains(text(), 'Success: You have added')]")
//	private WebElement CanonSuccessMessage;
	
	@FindBy(xpath = "//body/div[2]/div[1]")
	private WebElement CanonSuccessMessage;
	
	public void addToCartCanon() {
		CanonAddToCart.click();
	}
	

	public void selectCanonColor() {
		SelectColor.click();
		RedColor.click();
	}
	
	public void selectCanonQuantity() {
		CanonQuantity.click();
		CanonQuantity.sendKeys("");
	}
	
	
	public void addCanontoCart() {
		AddtoCartCanon.click();

	}
	
	public void canonAssert(String successCanon) {
		String actualSuccess = CanonSuccessMessage.getText();
		String successStr = successCanon.substring(0, 59);
		Assert.assertEquals(successCanon, successStr);

	}
//---------------------------------------------------------------
//	For Scenario Outline: User add a review to Canon EOS 5D item in Desktops tab 
	
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement CanonImage;
	
	public void clickOnCanon() {
		CanonImage.click();
	}
	
	@FindBy(xpath = "//li/a[@href='#tab-review']")
	private WebElement CanonReview;
	
	public void canonReview() {
		CanonReview.click();
	}
	
	@FindBy(xpath = "//*[@id='input-name']")
	private WebElement NameClick;
	
	public void nameClick() {
		NameClick.click();
		NameClick.sendKeys("12345");
	}
	
	@FindBy(xpath = "//*[@id='input-review']")
	private WebElement ReviewClick;
	
	
	public void ReviewClick() {
		ReviewClick.click();
		ReviewClick.sendKeys("Canon works fine. I bought this camera for a reasonable price. The lens is up to 1000 mega pixels.");
	}

	@FindBy(xpath = "//input[@value='4']")
	private WebElement RadioButtonClick;
	
	public void buttonClick() {
		RadioButtonClick.click();
	}
	
	@FindBy(xpath = "//div[@class='pull-right']")
	private WebElement ClickContinue;
	
	public void continueClick() {
		ClickContinue.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ReviewSubmitted;
	
	@SuppressWarnings("unused")
	public void canonReviewAssert(String canon) {
		String actualReviewMessage = ReviewSubmitted.getText();
		String expectedReviewMessage = canon;
	}

}
