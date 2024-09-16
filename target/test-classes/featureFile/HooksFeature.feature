Feature: Application Login

#Scope of backround is only in the feature file
Background:
	Given setup the entries in Database
	When user launches the browser from config url
	And hit the home page url of banking site

@LoginTest
Scenario: Admin Page default login
	Given User is on Netbanking login page
	When User login into application with username "admin" and password "1234"
	Then Home Page is displayed
	And Cards are displayed

@FormTest
#Using Scenario Outline and Regex, where there are multiple using for  a same flow using Parameterization
Scenario Outline: Client Page default login 
	Given User is on Netbanking login page
	When User login into application with username <UserName> and password <Password> combination
	Then Home Page is displayed
	And Cards are displayed
	
Examples:
	|UserName  |Password |
	|DebitUser |Pass@1234|
	|CreditUser|Pass@9594|
