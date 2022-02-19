package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class productComparison extends Base {

		LaptopsNoteBooksPageObject productCompare = new LaptopsNoteBooksPageObject(); 
		
		@And ("User click on product comparison icon on 'MacBook'")
		public void User_click_on_product_comparison_icon_on_MacBook() throws IOException {
			productCompare.macBookCompareButton();
			logger.info("user clicks on product comparison");
			Utilities.takeScreenShot("ComparisonMacBook");
		}
		
		@And("User click on product comparison icon on 'MacBook Air'")
		public void User_click_on_product_comparison_icon_on_MacBook_Air() throws IOException {
			productCompare.macBookAirCompareButton();
			logger.info("user click on product comparison icon on MacBook Air");
			Utilities.takeScreenShot("ComparisonMacBookAir");
		}
		@Then("User should see a success message {string}") 
		public void User_should_see_a_message_(String string) throws IOException {
			productCompare.compareMacBookAirAddSuccessAssert(string);
			logger.info("user saw a message: success!");
			Utilities.takeScreenShot("comparisonSuccessMessage");
		}
		@And("User click on Product comparison link") 
		public void User_click_on_Product_comparison_link() throws IOException {
			productCompare.comparisonLink();
			logger.info("user clicks on product comparison link");
			Utilities.takeScreenShot("comparisonLink");

		}
		
		@Then("User should see Product Comparison Chart")
		public void User_should_see_Product_Comparison_Chart() throws IOException {
			productCompare.comparisonChart();
			logger.info("User sees the Comparison Chart");
			Utilities.takeScreenShot("ComparisonChart");
		}


}
