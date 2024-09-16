Feature: Application Login

Background:
	Given setup the entries in Database
	When user launches the browser from config url
	And hit the home page url of banking site

#Scope of backround is only in the feature file
#Background: 
#	Given setup the entries in Database
#	When user launches the browser from config url
#	And hit the home page url of banking site
	
	

@SmokeTest @RegressionTest
Scenario: Admin Page default login
	Given User is on Netbanking login page
	When User login into application with username "admin" and password "1234"
	Then Home Page is displayed
	And Cards are displayed

@DataTest @RegressionTest
#DataDrivenTesting -> used in cases like forms,etc having more details
Scenario: User page data fill up
	Given User is on practice landing page
	When User signs up into application
	|Rahul|
	|Shilimkar|
	|silimkarr@gamil.com|
	|7045821324|
	Then Home Page is displayed
	And Cards are displayed 

@MultiTest
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
	|ForexUser |Pass@9082|
		
#Using Scenario Outline, where there are multiple using for  a same flow using Parameterization
#Scenario Outline: Client Page default login 
#	Given User is on Netbanking login page
#	When User login into application with username "<UserName>" and password "<Password>" combination
#	Then Home Page is displayed
#	And Cards are displayed
#	
#Examples:
#	|UserName  |Password |
#	|DebitUser |Pass@1234|
#	|CreditUser|Pass@9594|
#	|ForexUser |Pass@9082|
		
#Scenario: Admin Page default login
#	Given User is on Netbanking login page
#	When User login into application
#	Then Home Page is displayed
#	And Cards are displayed

#Reusable code by passing password at RunTime
#Scenario: Client Page default login
#	Given User is on Netbanking login page
#	When User login into application with username "user" and password "0953"
#	Then Home Page is displayed
#	And Cards are displayed