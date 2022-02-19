@HomePage, @Regression
Feature: Home Page 

Background: Desktops page products 
	Given User is on retail website 

Scenario: User empty Shopping cart message displays 
	When User click on shopping cart 
	Then 'Your shopping cart is empty!' message should display 
	
	
