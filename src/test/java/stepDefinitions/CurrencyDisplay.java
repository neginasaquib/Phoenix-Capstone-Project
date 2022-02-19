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

public class CurrencyDisplay extends Base {

	DesktopsPageObject currency = new DesktopsPageObject();

	@Given("^User is on retail website$")
	public void User_is_on_retail_website() throws IOException {
		currency.validateHomePage();
		logger.info("Homepage validated successfully");
		Utilities.takeScreenShot("Homepage");
	}

	@When("User click on Currency")
	public void User_click_on_Currency() throws IOException {
		currency.clickOnCurrency();
		logger.info("User click on currency tab");
		Utilities.takeScreenShot("Currency");
	}

	@And("User choose Euro from dropdown")
	public void User_choose_Euro_from_dropdown() throws IOException {
		currency.clickOnEuro();
		logger.info("user clicked on Euro from the dropdown");
		Utilities.takeScreenShot("Euro");
	}

	@Then("Currency value should change to Euro")
	public void Currency_value_should_change_to_Euro() throws IOException {
		Assert.assertEquals(currency.currencyAssert(), "€");
		logger.info("currency changed to Euro");
		Utilities.takeScreenShot("CurrencyAssert");
	}


}
