package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class affiliateInformation extends Base {
	
		HomePageObject affiliate = new HomePageObject();
		

		@When("User click on 'Edit your affiliate information' link") 
		public void User_click_on_link() throws IOException {
			affiliate.clickOnAffiliate();
			logger.info("User clicked on login");
			Utilities.takeScreenShot("Edit affiliate");
		} 

		@And("User click on Bank Transfer radio button") 
		public void User_click_on_Bank_Transfer_radio_button() throws IOException {
			affiliate.bankRadioButton();
			logger.info("User clicked on bank transfer radio button.");
			Utilities.takeScreenShot("Click on transfer");
		} 
		
		@And("User fill Bank information with below information")
		public void user_fill_bank_information_with_below_information(DataTable dataTable) {
			List<Map<String, String>> editAffiliate = dataTable.asMaps(String.class, String.class);
			affiliate.bankName(editAffiliate.get(0).get("bankName"));
			affiliate.bankABA(editAffiliate.get(0).get("abaNumber"));
			affiliate.bankSwiftCode(editAffiliate.get(0).get("swiftCode"));
			affiliate.accountNameField(editAffiliate.get(0).get("accountName"));
			affiliate.accountNumberField(editAffiliate.get(0).get("accountNumber"));

		}
		
		
//		@And("User fill Bank information with below information") 
//		public void User_fill_bank_information_with_below_information() throws IOException {
//			affiliate.bankName();
//			affiliate.bankABA();
//			affiliate.bankSwiftCode();
//			affiliate.accountNameField();
//			affiliate.accountNumberField();
//
//			logger.info("User entered username and password");
//			Utilities.takeScreenShot("enter username & password");
//		} 
		
		
		@And("User click on Continue button2") 
		public void User_click_on_Continue_button2() throws IOException {
			affiliate.continueButton();
			logger.info("User clicked on continue button");
			Utilities.takeScreenShot("Continue Edit Button");
		} 
		
		@Then("User should see edit success message {string}") 
		public void User_should_see_edit_success_message(String string) throws IOException {
			affiliate.successAccountEdit(string);
			logger.info("User saw success message.");
			Utilities.takeScreenShot("Edit successful");
		} 
		
		
}
