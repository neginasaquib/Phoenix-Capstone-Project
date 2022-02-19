package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class sonyVio extends Base {

		LaptopsNoteBooksPageObject sonyHeart = new LaptopsNoteBooksPageObject(); 
		
		@And ("User click on heart icon to add 'Sony VaIO' laptop to wish list")
		public void User_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws IOException {
			sonyHeart.heartSony();
			logger.info("user clicks on heart icon to add Sony VaIO to wishlist");
			Utilities.takeScreenShot("AddSony");
		}
		
		@Then("User should get a message {string}")
		public void User_should_get_a_message(String string) throws IOException {
			sonyHeart.loginForWishlistAssert(string);
			logger.info("User was asked to log in first.");
			Utilities.takeScreenShot("LoginFirst");
		}
		
}
