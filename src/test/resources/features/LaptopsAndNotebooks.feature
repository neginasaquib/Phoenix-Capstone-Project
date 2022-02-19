@LaptopsAndNotebooks, @Regression
Feature: Laptops & Notebooks 

Background: Laptops & NoteBooks page products 
	Given User is on retail website 
	
@AddRemoveMac 
Scenario: Add and Remove a Mac book from Cart 
	When User click on Laptops & NoteBooks tab 
	And User click on Show all Laptops & NoteBooks option 
	And User click on MacBook item 
	And User click add to Cart button 
	Then User should see a message 'Success: You have added MacBook to your shopping cart!'
	Then User should see '1 item(s) - $602.00' shown on the cart 
	And User click on cart option 
	And User click on red X button to remove the item from cart 
	Then item should be removed and cart should show '0 item(s) - $0.00' 
	
@ProductComparison 
Scenario: Product Comparison 

	When User click on Laptops & NoteBooks tab 
	And User click on Show all Laptops & NoteBooks option 
	And User click on product comparison icon on 'MacBook' 
	And User click on product comparison icon on 'MacBook Air' 
	Then User should see a success message 'Success: You have added MacBook Air to your product comparison!' 
	And User click on Product comparison link 
	Then User should see Product Comparison Chart 
	
@WishList 
Scenario: Adding an item to Wish list 
	When User click on Laptops & NoteBooks tab 
	And User click on Show all Laptops & NoteBooks option 
	And User click on heart icon to add 'Sony VaIO' laptop to wish list 
	Then User should get a message 'You must login or create an account to save Sony VAIO to your wish list!' 
	
@MacPrice 
Scenario: Validate the price of MacBook Pro is $2,000.00 
	When User click on Laptops & NoteBooks tab 
	And User click on Show all Laptops & NoteBooks option 
	And User click on 'MacBook Pro' item 
	Then User should see '$2,000.00' price tag is present on UI
	
	
	
	
