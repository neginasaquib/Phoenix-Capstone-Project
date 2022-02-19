package stepDefinitions;
import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class addRemoveMac extends Base {

	LaptopsNoteBooksPageObject addRemoveMac = new LaptopsNoteBooksPageObject();

	@When("User click on Laptops & NoteBooks tab")
	public void User_click_on_Laptops__NoteBooks_tab() throws IOException {
		addRemoveMac.clickLaptopsTab();
		Utilities.takeScreenShot("LaptopNotebooksTab");
	}

	@And("User click on Show all Laptops & NoteBooks option")
	public void User_click_on_Show_all_Laptops_NoteBooks_option() throws IOException{
		addRemoveMac.clickLaptopsAlltab();
		Utilities.takeScreenShot("ShowAllLaptops");
	}

	@And("User click on MacBook item")
	public void User_click_on_MacBook_item() throws IOException {
		addRemoveMac.clickOnMac();
		Utilities.takeScreenShot("MacClick");
	}

	@And("User click add to Cart button")
	public void User_click_add_to_Cart_button() throws IOException {
		addRemoveMac.addToCart();
		Utilities.takeScreenShot("MacAdd");
	}


		
//		@Then("User should see a message 'Success: You have added MacBook to your shopping cart!'")
//		public void User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() 

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) throws IOException {
		System.out.println("string from stepDefinition method: " + string);
		addRemoveMac.macSuccessMessage(string);
		Utilities.takeScreenShot("CartMessage");


	}
	@Then("User should see {string} shown on the cart")
	public void user_should_see_item_s_shown_on_the_cart(String string) throws IOException {
		addRemoveMac.verifyCartTotalAssert(string);
		Utilities.takeScreenShot("CartMessage2");
	}
	
	@And("User click on cart option")
	public void User_click_on_cart_option() throws IOException {
		addRemoveMac.macCart();
		Utilities.takeScreenShot("MacCart2");
	}

	@And("User click on red X button to remove the item from cart")
	public void User_click_on_red_X_button_to_remove_the_item_from_cart() throws IOException {
		addRemoveMac.xClick();
		Utilities.takeScreenShot("removeMac");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws IOException {
		addRemoveMac.macRemovalAssert(string);
		Utilities.takeScreenShot("MacRemoved");

	}

}
