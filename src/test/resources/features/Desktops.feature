@Desktops, @Regression
Feature: Home Page 

Background: Desktops page products 
	Given User is on retail website 
	
@currency 
Scenario: User verify currency values change 

	When User click on Currency 
	And User choose Euro from dropdown 
	Then Currency value should change to Euro 
	
@HP 
Scenario: User add HP LP 3065 from Desktops tab to the cart 

	When User click on Desktops tab 
	And User click on Show all desktops 
	And User click ADD TO CART option on HP LP3065 item 
	And User select HP quantity 1 
	And User click add HP to Cart button 
	Then User should see the message 'Success: You have added HP LP3065 to your shopping cart!' 
	
@Canon 
Scenario: User add Canon EOS 5D from Desktops tab to the cart 
	When User click on Desktops tab 
	And User click on Show all desktops 
	And User click  ADD TO CART option on Canon EOS 5D item 
	And User select color from dropdown Red 
	And User select Canon quantity 1 
	And User click add Canon to Cart button 
	Then User should see the following message 'Success: You have added Canon EOS 5D to your shopping cart!' 

@canonReview
Scenario Outline: User add a review to Canon EOS 5D item in Desktops tab 
	When User click on Desktops tab 
	And User click on Show all desktops 
	And User click on Canon EOS 5D item 
	And User click on write a review link 
	And User fill the review information with below information 
	And User click on Continue Button 
	Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'
	
