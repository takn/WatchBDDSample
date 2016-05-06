Narrative: Explain the bebefits of Single Sign on and prompt to log in or register
As a user
I want to learn about the benefits of Single Sign on
So that I can decide to log in or register

Scenario: Display Single Sign On prompt dialog
Given I am a <loggedIn> user
When I start the app
Then I <should> see the Single SignOn prompt dialog

Examples:
| loggedIn | should |
| true     | false  |
| false    | true   |