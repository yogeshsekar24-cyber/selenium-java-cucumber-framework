Feature: Sign in validatiion
@SignIn
Scenario Outline: Successful sign in

Given user clicks on Account button and lands on login page
When user click on create account button and lands on to user registration page
And enters the first name "test FN"
And enters the last name "test LN"
And enters the business email "<username>"
And enters the phone number "1212323521"
And enters the company name "test company"
And selects the country "United States"
And enters the password "<password>"
And confirms the password "<password>"
And disabling the purchase option "false"
And agrees the terms and condition
And user clicks on submit button
And user verifies the MFA "<username>"
When user enters valid email ID "<username>" and password "<password>"
And user clicks on Sign in button
Then check whether user successfully navigated to home page

Examples:
|username|password|
|test2324@mailinator.com|Zaq12wsx|