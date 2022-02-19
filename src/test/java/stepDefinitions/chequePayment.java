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

public class chequePayment extends Base {
	
		HomePageObject payment = new HomePageObject();
		
		@And("User click on MyAccount") 
		public void User_click_on_MyAccount() throws IOException {
			payment.accountClick();
			logger.info("User clicked on MyAccount.");
			Utilities.takeScreenShot("ClickOnAccounts");
		} 
		
		
//		@And("User fill resgistration form with information below") 
//		public void User_fill_resgistration_form_with_information_below() throws IOException {
//			payment.firstName();
//			payment.lastName();
//			payment.emailClick();
//			payment.phoneClick();
//			payment.passwordClick();
//			payment.radioButton();
//			payment.passwordClick();
//			payment.passwordconfirm();
//			logger.info("User filled registration form with the information.");
//			Utilities.takeScreenShot("RegisterationComplete");
//		} 
//		
//		@And("User click on agree to terms checkbox") 
//		public void User_click_on_agree_to_terms_checkbox() throws IOException {
//			payment.agreement();
//			logger.info("User clicked agreed to terms and conditions");
//			Utilities.takeScreenShot("agreement");
//		} 
		
		@When("User click on Login") 
		public void User_click_on_login() throws IOException {
			payment.login();
			logger.info("User clicked on login");
			Utilities.takeScreenShot("Login Link");
		} 
		
		@And("User enter username 'userName' and password 'password'") 
		public void User_enter_username_and_password() throws IOException {
			payment.username();
			payment.password();
			logger.info("User entered username and password");
			Utilities.takeScreenShot("enter username & password");
		} 
		
		@And("User click on Login button") 
		public void User_click_on_Login_button() throws IOException {
			payment.loginButton();
			logger.info("User clicked on login button");
			Utilities.takeScreenShot("Login Button");
		} 
		
		@Then("User should be logged in to MyAccount dashboard") 
		public void User_should_be_logged_in_to_MyAccount_dashboard() throws IOException {
			payment.pageDisplayAssert();
			logger.info("User is on account dashboard.");
			Utilities.takeScreenShot("Account Dashboard");
		} 
		
		@When("User click on 'Register for an Affiliate Account' link") 
		public void User_click_on_link() throws IOException {
			payment.affiliateAccountLink();
			logger.info("User clicked on Register for an affiliate account link.");
			Utilities.takeScreenShot("ClickOnRegister");
		} 
		
//		@And("User fill affiliate form with below information") 
//		public void User_fill_affiliate_form_with_below_information() throws IOException {
//			payment.companyName();
//			payment.websiteInput();
//			payment.taxIdInput();
//			payment.paypalMethod();
//			payment.paypalEmail();
//			logger.info("User put company name, website url, tax ID, payment method, and paypal email address.");
//			Utilities.takeScreenShot("CompanyName");
//		}
		
		@And("User fill affiliate form with below information")
		public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
			List<Map<String, String>> editAffilate = dataTable.asMaps(String.class, String.class);
			payment.enterCompanyName(editAffilate.get(0).get("company"));
			payment.enterWebsiteInput(editAffilate.get(0).get("website"));
			payment.enterTaxIdInput(editAffilate.get(0).get("taxID"));
			payment.verifyPaypalRadioButtonIsSelected();
			payment.enterPaypalEmail();

		}
		
		@And("User check on About us check box") 
		public void User_check_on_About_us_check_box() throws IOException {
			payment.agreement();
			logger.info("User checked on About Us check box.");
			Utilities.takeScreenShot("AboutUs");
		}
		
		@And("User click on Continue button") 
		public void User_click_on_Continue_button() throws IOException {
			payment.clickOnContinue();
			logger.info("User clicked on continue button.");
			Utilities.takeScreenShot("ContinueButton");
		}
		
		@Then("User should see account created success message {string}") 
		public void User_should_see_account_created_success_message(String string) throws IOException {
			payment.successAccountCreatedAssert(string);
			logger.info("User saw success message.");
			Utilities.takeScreenShot("AccountCreatedSuccessMessage");
		}
		
}
