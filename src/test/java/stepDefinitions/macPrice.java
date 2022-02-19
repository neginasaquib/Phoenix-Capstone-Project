package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class macPrice extends Base {

		LaptopsNoteBooksPageObject seePrice = new LaptopsNoteBooksPageObject(); 
		
		@And ("User click on 'MacBook Pro' item")
		public void User_click_on_MacBook_Pro_item() throws IOException {
			seePrice.clickMacBookPro();
			logger.info("user clicks on heart icon to add Sony VaIO to wishlist");
			Utilities.takeScreenShot("AddSony");
		}
		
		@Then("User should see {string} price tag is present on UI")
		public void user_should_see_price_tag_is_present_on_ui(String string) throws IOException {
			seePrice.macPrice(string);
			logger.info("User was asked to log in first.");
			Utilities.takeScreenShot("LoginFirst");
		}
		
}
