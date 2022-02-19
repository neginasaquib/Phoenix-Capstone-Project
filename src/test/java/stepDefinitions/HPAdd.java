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

public class HPAdd extends Base {

	DesktopsPageObject HP = new DesktopsPageObject();
	

	@When("^User click on Desktops tab$")
	public void User_click_on_Desktops_tab() throws IOException {
		HP.clickOnDesktops();
		logger.info("User was able to click on Desktops tab");
		Utilities.takeScreenShot("DesktopClick");

	}

	@And("User click on Show all desktops")
	public void User_click_on_Show_all_desktops() throws IOException {
		HP.clickOnShowAll();
		logger.info("User was able to click on Show All Desktops");
		Utilities.takeScreenShot("ShowAllDesktops");

	}

	@And("User click ADD TO CART option on HP LP3065 item")
	public void User_click_ADD_TO_CART_option_on_HP_LP3065_item() throws IOException {
		HP.HPAdd();
		logger.info("User was able to click on ADD TO CART button");
		Utilities.takeScreenShot("AddToCart");
	}

	@And("User select HP quantity 1")
	public void User_select_HP_quantity_1() throws IOException {
		HP.selectQuantity();
		logger.info("User selected quantity of the product");
		Utilities.takeScreenShot("Quantity");
	}

	@And("User click add HP to Cart button")
	public void User_click_add_HP_to_Cart_button() throws IOException {
		HP.addToCart();
		logger.info("User clicked on Add to Cart button");
		Utilities.takeScreenShot("AddQuantity");
	}

	@Then("User should see the message {string}")
	public void User_should_see_the_message(String string) throws IOException {
		HP.hpAssert(string);
		logger.info("Success! you're done adding");
		Utilities.takeScreenShot("HPSuccess");

	}

}
