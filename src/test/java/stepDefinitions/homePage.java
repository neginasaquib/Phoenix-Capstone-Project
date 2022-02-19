package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class homePage {

	HomePageObject home = new HomePageObject();
	
	@When("User click on shopping cart")
	public void User_click_on_shopping_cart() throws IOException {
			home.clickOnShoppingCart();
		Utilities.takeScreenShot("Shopping Cart Empty");
	}
	
	@Then("{string} message should display")
	public void Your_shopping_cart_is_empty_message_should_display(String string) throws IOException {
		home.emptyShoppingCart(string);
		Utilities.takeScreenShot("Cart Empty");
	}

}
