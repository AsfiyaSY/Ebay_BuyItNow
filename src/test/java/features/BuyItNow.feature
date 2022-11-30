Feature: BuyItNow

Scenario: User is be able to click on BuyItNow

	Given browser is open
	And Web application should be displayed
	And search for the product
	When User clicks on Search button
	Then User is able to see BuyItNow option
	And User is able to checkout as Guest
	And User adds shipping adress
	And select Payment Option
	And click on continue
	

	


	