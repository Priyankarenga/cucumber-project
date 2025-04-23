Feature: To validate the login functionality of facebook application

@smoke @sanity
Scenario: Validate the all the username and password
  
When user enter the values in username and password field
#   0              1        2            3
|username|password|                 #keys
|java@123   |8347837433|            #list-1
|python@123|7654321789|             #list-2
|selenium@123|6655378228|           #list-3
And click the login button
Then navigate into corresponding page

@regression
Scenario: To validate invalid username and invalid password in the login page
When to pass values in username and password field and click the login button
Then navigate into error page
