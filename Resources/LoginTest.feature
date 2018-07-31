Feature: Login
User should be successfully logged in using valid credentials

Scenario: user can login successfully
	Given  user is on the login page
	When user enters valid credentials
	Then user is successfully logged in