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


public class canonReview extends Base {
	
	DesktopsPageObject canonReview = new DesktopsPageObject(); 
	
	@And("User click on Canon EOS 5D item")
		public void User_click_on_Canon_EOS_5D_item() throws IOException {
		canonReview.clickOnCanon();
		logger.info("Canon was selected");
		Utilities.takeScreenShot("CanonImage");
	}
		
	@And("User click on write a review link") 
	public void User_click_on_write_a_review_link() throws IOException {
		canonReview.canonReview();
		logger.info("user clicked on review");
		Utilities.takeScreenShot("CanonReview");
	}
	
	@And("User fill the review information with below information") 
	public void User_fill_the_review_information_with_below_information() throws IOException {
		canonReview.nameClick();
		canonReview.ReviewClick();
		canonReview.buttonClick();
		logger.info("User filled in the review");
		Utilities.takeScreenShot("CanonQuantity");
	}
	
	@And("User click on Continue Button") 
	public void User_click_on_Continue_Button() throws IOException {
		canonReview.continueClick();
		logger.info("User clicked on continue button");
		Utilities.takeScreenShot("ReviewAdded");
	}
	
	@Then("User should see a message with {string}") 
	public void User_should_see_a_message_with(String string) throws IOException {
		canonReview.canonReviewAssert(string); 
		logger.info("Review was successfully added.");
		Utilities.takeScreenShot("CanonReview");
	}
	
	}
	