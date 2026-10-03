Feature: Sign in validatiion
@SignIn
Scenario Outline: Successful sign in

Given user clicks on Account button and lands on login page
When user click on create account button and lands on to user registration page
And enters the first name "test FN"
And enters the last name "test LN"
And enters the business email "test102009@mailinator.com"
And enters the phone number "1212323521"
And enters the company name "test company"
And selects the country "United States"
And enters the password "Zaq12wsx"
And confirms the password "Zaq12wsx"
And disabling the purchase option "false"
And agrees the terms and condition
And user clicks on submit button
And user verifies the MFA "test102009@mailinator.com"
Then account should be created s`ccessfully