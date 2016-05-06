Narrative: Explain the benefits of Single Sign on and prompt to log in or register
As a user
I want to learn about the benefits of Single Sign on
So that I can decide to log in, register or dismiss

Scenario: Display Single Sign On prompt dialog
Given I want to show the prompt
When I request to show the prompt
Then I should see the dialog
Then see a list of the benefits of signing up for an account
Then see a button to sign into an existing account
Then see a button to register for a new account
Then see a close button
Then see a maybe later button
Then I have a url to sign in
Then I have a url to register
