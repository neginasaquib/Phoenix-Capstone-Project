@RetailPage, @Regression
Feature: for this feature you have to have an existing account 

Background: User on main website 
	Given User is on retail website 
	And User click on MyAccount 
	#//we exercised cheque payment with Instructor ramin, I wanted to try paypal this time.
	When User click on Login 
	And User enter username 'userName' and password 'password' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
@PaypalMethod
Scenario: Register as an Affiliate user with Paypal Method 
 
	When User click on 'Register for an Affiliate Account' link 
	And User fill affiliate form with below information 
		|company|website|taxID|paymentMethod|
		|Wolf LLC|www.wolf.com|35-23523600|october18fallday@gmail.com|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see account created success message 'Success: Your account has been successfully updated.' 
	
@AffiliateInformation
Scenario: Edit your affiliate information from Cheque payment method to Bank 
	Transfer 
	When User click on 'Edit your affiliate information' link 
	And User click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|Capital One|0055522|Cap01|Checking|345235612134|
	And User click on Continue button2
	Then User should see edit success message 'Success: Your account has been successfully updated.'
	
@EditAccount 
Scenario: Edit your account Information 
	When User click on 'Edit your account information' link 
	And User modify below information 
		|firstname|lastName|email|telephone|
		|Ada|Wang|ada.wang@gmail.com|571-888-3252|
	And User click on Continue button 
	Then User should see edit success message 'Success: Your account has been successfully updated.' 
