package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
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
			
			//Side Bar
			
			@FindBy(xpath = "//i[@class='fa fa-home']")
			private WebElement HomePageButton;
			
			@FindBy(xpath = "//div[2]/ul/li[2]/a[contains(text(), 'Cameras')]")
			private WebElement CamerasSublink;
			
			@FindBy(xpath = "//div/a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20'][contains(text(), 'Desktops (13)')]")
			private WebElement DesktopList;
			
			@FindBy(xpath = "//div/a[2][@class='list-group-item']")
			private WebElement LaptopsAndNoteBooksList;
			
			@FindBy(xpath = "//div/a[3][@class='list-group-item']")
			private WebElement ComponentsList;
			
			@FindBy(xpath = "//div/a[4][@class='list-group-item']")
			private WebElement TabletsList;
			
			@FindBy(xpath = "//div/a[5][@class='list-group-item']")
			private WebElement SoftwareList;
			
			@FindBy(xpath = "//div/a[6][@class='list-group-item']")
			private WebElement PhonesAndPDAsList;
			
			@FindBy(xpath = "//div/a[7][@class='list-group-item']")
			private WebElement CamerasList;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[8][contains(text(), 'MP3 Players (4)')]")
			private WebElement MP3PlayersList;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[9][contains(text(), 'test 11 (0)')]")
			private WebElement Test11List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[10][contains(text(), 'test 12 (0)')]")
			private WebElement Test12List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[11][contains(text(), 'test 15 (0)')]")
			private WebElement Test15List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[12][contains(text(), 'test 16 (0)')]")
			private WebElement Test16List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[13][contains(text(), 'test 17 (0)')]")
			private WebElement Test17List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[14][contains(text(), 'test 18 (0)')]")
			private WebElement Test18List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[15][contains(text(), 'test 19 (0)')]")
			private WebElement Test19List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[16][contains(text(), 'test 20 (0)')]")
			private WebElement Test20List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[17][contains(text(), 'test 21 (0)')]")
			private WebElement Test21List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[18][contains(text(), 'test 22 (0)')]")
			private WebElement Test22List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[19][contains(text(), 'test 23 (0)')]")
			private WebElement Test23List;

			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[20][contains(text(), 'test 24 (0)')]")
			private WebElement Test24List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[21][contains(text(), 'test 4 (0)')]")
			private WebElement Test25List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[22][contains(text(), 'test 5 (0)')]")
			private WebElement Test26List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[23][contains(text(), 'test 6 (0)')]")
			private WebElement Test27List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[24][contains(text(), 'test 7 (0)')]")
			private WebElement Test28List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[25][contains(text(), 'test 8 (0)')]")
			private WebElement Test29List;
			
			@FindBy(xpath = "//div[2]/div/aside/div[1]/a[26][contains(text(), 'test 9 (0)')]")
			private WebElement Test30List;
			
			@FindBy(xpath = "//img[@alt='HP Banner']")
			private WebElement HPBanner;
			
			@FindBy(xpath = "//h2[text()='MP3 Players']") 
			private WebElement MP3PlayersObjectText;
			
			@FindBy(xpath = "//img[@title='MP3 Players']")
			private WebElement MP3PlayersImage;
			
			@FindBy(xpath = "//div[2]/div/div/div[1]/div[2]/p[contains(text(), 'Shop Laptop feature only')]")
			private WebElement MP3PlayersDescription;
			
			@FindBy(xpath = "//h3[contains(text(), 'Refine Search')]")
			private WebElement RefineSearch;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[1]/ul/li[1]/a[contains(text(), 'test 11 (0)')]")
			private WebElement Test11Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[1]/ul/li[2]/a[contains(text(), 'test 12 (0)')]")
			private WebElement Test12Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[1]/ul/li[3]/a[contains(text(), 'test 15 (0)')]")
			private WebElement Test15Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[1]/ul/li[4]/a[contains(text(), 'test 16 (0)')]")
			private WebElement Test16Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[1]/ul/li[5]/a[contains(text(), 'test 17 (0)')]")
			private WebElement Test17Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/ul/li[1]/a[contains(text(), 'test 18 (0)')]")
			private WebElement Test18Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/ul/li[2]/a[contains(text(), 'test 19 (0)')]")
			private WebElement Test19Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/ul/li[3]/a[contains(text(), 'test 20 (0)')]")
			private WebElement Test20Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/ul/li[4]/a[contains(text(), 'test 21 (0)')]")
			private WebElement Test21Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/ul/li[5]/a[contains(text(), 'test 22 (0)')]")
			private WebElement Test22Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[3]/ul/li[1]/a[contains(text(), 'test 23 (0)')]")
			private WebElement Test23Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[3]/ul/li[2]/a[contains(text(), 'test 24 (0)')]")
			private WebElement Test24Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[3]/ul/li[3]/a[contains(text(), 'test 4 (0)')]")
			private WebElement Test4Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[3]/ul/li[4]/a[contains(text(), 'test 5 (0)')]")
			private WebElement Test5Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[3]/ul/li[5]/a[contains(text(), 'test 6 (0)')]")
			private WebElement Test6Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[4]/ul/li[1]/a[contains(text(), 'test 7 (0)')]")
			private WebElement Test7Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[4]/ul/li[2]/a[contains(text(), 'test 8 (0)')]")
			private WebElement Test8Sublink;
			
			@FindBy(xpath = "//div[2]/div/div/div[2]/div[4]/ul/li[3]/a[contains(text(), 'test 9 (0)')]")
			private WebElement Test9Sublink;	
			
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
			
			//MP3 Players
			
			@FindBy(xpath = "//img[@title='iPod Classic']")
			private WebElement IpodClassicImage;
			
			@FindBy(linkText = "iPod Classic")
			private WebElement IpodClassicTitle;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/p[1][contains(text(), 'More room to move.')]")
			private WebElement IpodDescription;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
			private WebElement IpodPrice;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
			private WebElement IpodTax;
			
//			@FindBy(xpath = "//button[@onclick="cart.add('48', '1');"]")
//			private WebElement IpodAddToCart;
//			
//			@FindBy(xpath = "//button[@onclick="wishlist.add('48');"]")
//			private WebElement IpodAddToWishList;
//					
//			@FindBy(xpath = "//button[@onclick="compare.add('48');"]")
//			private WebElement IpodCompare;
			
			@FindBy(xpath = "//img[@title='iPod Nano']")
			private WebElement IpodNanoImage;
			
			@FindBy(linkText = "iPod Nano")
			private WebElement iPodNanoTitle;
			
			@FindBy(xpath = "//p[contains(text(), 'Video in your pocket')]")
			private WebElement iPodNanoDescription;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
			private WebElement iPodNanoPrice;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[2]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
			private WebElement iPodNanoTax;
			
//			@FindBy(xpath = "//button[@onclick="cart.add('36', '1');"]")
//			private WebElement iPodNanoAddToCart;
//			
//			@FindBy(xpath = "//button[@onclick="wishlist.add('36');"]")
//			private WebElement iPodNanoAddToWishList;
//					
//			@FindBy(xpath = "//button[@onclick="compare.add('36');"]")
//			private WebElement iPodNanoCompare;
			
			@FindBy(xpath = "//img[@title='iPod Shuffle']")
			private WebElement IpodShuffleImage;
			
			@FindBy(linkText = "iPod Shuffle")
			private WebElement iPodShuffleTitle;
			
			@FindBy(xpath = "//p[contains(text(), 'Born to be worn.')]")
			private WebElement iPodShuffleDescription;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[3]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
			private WebElement iPodShufflePrice;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[3]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
			private WebElement iPodShuffleTax;
			
//			@FindBy(xpath = "//button[@onclick="cart.add('34', '1');"]")
//			private WebElement iPodShuffleAddToCart;
//			
//			@FindBy(xpath = "//button[@onclick="wishlist.add('34');"]")
//			private WebElement iPodShuffleAddToWishList;
//					
//			@FindBy(xpath = "//button[@onclick="compare.add('34');"]")
//			private WebElement iPodShuffleCompare;
			
			
			@FindBy(xpath = "//img[@title='iPod Touch']")
			private WebElement IpodTouchImage;
			
			@FindBy(linkText = "iPod Touch")
			private WebElement iPodTouchTitle;
			
			@FindBy(xpath = "//p[contains(text(), 'Revolutionary multi-touch interface.')]")
			private WebElement iPodTouchDescription;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[4]/div/div[2]/div[1]/p[2][contains(text(), '$122.00')]")
			private WebElement iPodTouchPrice;
			
			@FindBy(xpath = "//div[2]/div/div/div[4]/div[4]/div/div[2]/div[1]/p[2]/span[contains(text(), 'Ex Tax: $100.00')]")
			private WebElement iPodTouchTax;
			
//			@FindBy(xpath = "//button[@onclick="cart.add('32', '1');"]")
//			private WebElement iPodTouchAddToCart;
//			
//			@FindBy(xpath = "//button[@onclick="wishlist.add('32');"]")
//			private WebElement iPodTouchAddToWishList;
//					
//			@FindBy(xpath = "//button[@onclick="compare.add('32');"]")
//			private WebElement iPodTouchCompare;
			
			@FindBy(xpath = "//div[2][@class='col-sm-6 text-right']")
			private WebElement Showing;
			
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
			
			
			
	
	
}
