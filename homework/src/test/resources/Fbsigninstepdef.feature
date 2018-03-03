Feature: Signin functionality validation

Scenario: Successfully Log in  with valid credentials
	 Given User able to open internet browser
	 
	 When Go to facebook home page
	 
	 And User put valid user email-sumss04@yahoo.com
	 
	 And User put valid password -Sum@8888
	 
	 And User click log in button 
	 
	 Then User account log in successfully
	 