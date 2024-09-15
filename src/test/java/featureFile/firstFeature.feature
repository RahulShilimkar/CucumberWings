Feature: Application Login

Scenario: Admin Page default login
	Given User is on Netbanking login page
	When User login into application with username "admin" and password "1234"
	Then Home Page is displayed
	And Cards are displayed
	
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