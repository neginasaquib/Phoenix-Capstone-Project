package stepDefinitions;

import java.io.IOException;
import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.Utilities;

public class addCanon extends Base {

	DesktopsPageObject canon = new DesktopsPageObject();
	

	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void User_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() throws IOException {
		canon.addToCartCanon();
		logger.info("User was able to click on Desktops tab");
		Utilities.takeScreenShot("Add Canon to cart");

	}

	@And("User select color from dropdown Red")
	public void User_select_select_color_from_dropdown_Red() throws IOException {
		canon.selectCanonColor();
		logger.info("User was able to pick red color.");
		Utilities.takeScreenShot("Select red color");

	}

	@And("User select Canon quantity 1")
	public void User_select_Canon_quantity_1() throws IOException {
		canon.selectCanonQuantity();
		logger.info("User was able to select 1 quantity.");
		Utilities.takeScreenShot("Add Canon To Cart");
	}

	@And("User click add Canon to Cart button")
	public void User_click_add_Canon_to_Cart_button() throws IOException {
		canon.addCanontoCart();
		logger.info("User added Canon to cart.");
		Utilities.takeScreenShot("Quantity 1");
	}


	@Then("User should see the following message {string}")
	public void User_should_see_the_following_message(String string) throws IOException {
		canon.canonAssert(string);
		logger.info("Success! you're done adding");
		Utilities.takeScreenShot("Canon Success");

	}

}
