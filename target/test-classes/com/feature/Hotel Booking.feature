Feature: Hotel booking with adaction Aplication

Scenario: Check Login Functionality
Given user lanches the application
When user enter the username in the username field
And user enter the password in the password field
Then user clik the login button and navigate to search hotel page

Scenario: Search Hotel Page
When user select the location from the dropdown
And user select the hotel from the dropdown
And user select the room type from the dropdwon
And user select the room from the no of room
And user enter the date in the chekcin field 
And user enter the date in the checkout field
And user select the type form the adults room field
And user select the type for the children room field
Then user click the search and navigte to the selelct hotel page

Scenario: Select hotel Page
When user select the raido button from the radio btutton field
Then user click the continue button and navigage to book a hotel page

Scenario: Book a Hotel Page
When user enter the firstname in the firstname filed
And user enter the lastname in the lastname field
And user enter the address in the address field
And user enter the cridt card non in the cridt card filed
And user select the card type in the cridt card type field
And user select the date from expiry date field 
And user select the date form expiry year field
And user enter the cvv no in the cvv number field
Then user click book now btton and navigate to the booking Confirmation page

Scenario: Booking Confirmation Page
Then user click the logout
















    




        