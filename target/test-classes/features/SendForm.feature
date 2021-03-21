Feature: Send Form

	@SendForm
  Scenario: Fill in all fields properly and send the form
    Given the user acess Vehicle Insurance Page
    And fills in all "Enter Vehicle Data" data
    And fills in all "Enter Insurant Data" data
    And fills in all "Enter Product Data" data
    And fills in all "Select Price Option" data
    And fills in all "Send Quote" data
    When the user sends the form
    Then the user should see a confirmation message
