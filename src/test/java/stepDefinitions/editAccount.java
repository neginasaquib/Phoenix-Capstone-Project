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

public class editAccount extends Base {
	
		HomePageObject edit = new HomePageObject();
		
		@And("User click on 'Edit your account information' link") 
		public void User_click_on_edit_your_account_information_link() throws IOException {
			edit.accountEditing();
			logger.info("User clicked on the edit your account link.");
			Utilities.takeScreenShot("Clicked on edit account");
		} 
		
		@And("User modify below information")
		public void user_modify_below_information(DataTable dataTable) throws IOException {
			List<Map<String, String>> editAffiliate = dataTable.asMaps(String.class, String.class);
			edit.firstNameEditing(editAffiliate.get(0).get("firstname"));
			edit.lastNameEditing(editAffiliate.get(0).get("lastName"));
			edit.emailEditing(editAffiliate.get(0).get("email"));
			edit.telphoneEditing(editAffiliate.get(0).get("telephone"));
			logger.info("User modified all the information.");
			Utilities.takeScreenShot("Modify information");
		}
}
		
