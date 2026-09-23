Feature: login validation

Scenario Outline: Successful login

Given user clicks on Account button and lands on login page

When user enters valid email ID "<username>" and password "<password>"

And user clicks on Sign in button

Then check whether user successfully navigated to home page

Examples:

| username                  | password |
| us-dist1101@mailinator.com | Zaq12wsx |

@test
Scenario Outline:unsuccessful login

Given user clicks on Account button and lands on login page

When user enters valid email ID "<username>" and password "<password>"

And user clicks on Sign in button

Then user gets error message in login page

Examples:

| username                  | password  |
| us-dist1101@mailinator.com | Zaq12wsxz |