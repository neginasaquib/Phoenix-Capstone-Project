//package stepDefinitions;
//
//import java.io.IOException;
//
//import core.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.HomePageObject;
//import utilities.Utilities;
//
//public class accountBackground extends Base {
//	
//		HomePageObject accountSetup = new HomePageObject();
//		
//		@And("User click on MyAccount") 
//		public void User_click_on_MyAccount() throws IOException {
//			accountSetup.accountClick();
//			logger.info("User clicked on MyAccount.");
//			Utilities.takeScreenShot("ClickOnAccounts");
//		} 
//		
//		@When("User click on Login") 
//		public void User_click_on_Login() throws IOException {
//			accountSetup.loginClick();
//			logger.info("User clicked on Login");
//			Utilities.takeScreenShot("ClickOnLogin");
//		}
//		
//		@And("User enter username and password") 
//		public void User_enter_username_and_password() throws IOException {
//			accountSetup.usernameInput();
//			accountSetup.passwordInput();
//			logger.info("User entered userName and password.");
//			Utilities.takeScreenShot("UsernameAndPassword");
//		}
//		
//		@And("User click on Login button") 
//		public void User_click_on_Login_button() throws IOException {
//			accountSetup.submitButton();
//			logger.info("User clicked on Login button.");
//			Utilities.takeScreenShot("LoginButton");
//		}
//		
//		@Then("User should be logged in to MyAccount dashboard") 
//		public void User_should_be_logged_in_to_MyAccount_dashboard() throws IOException {
//			accountSetup.pageDisplayAssert();
//			logger.info("User was logged in to MyAccount dashboard.");
//			Utilities.takeScreenShot("MyAccountDash");
//		}
//		
//}
