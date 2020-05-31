@Smoke_Test
Feature: Test web application to allow users to enter the data
  I want to test the application to check whether the users are able to enter their data

  @positive
  Scenario: Verify filling the form functionality with correct data
    Given I open the home page
    When I fill the form with correct details
    And I select Risk Level
    And I click on save button
    #Then I should see a pop up message with a message
    Then I click on back button
    And I close the browser

  #Examples:
  #| Full name   | Country        | year of birth | Position   | Source info URL | Risk Level |
  #| Prasad Babu | United Kingdom |      10101980 | Politician | www.google.com  | Low        |
  
  
  @negative_test
  Scenario: Verify error is shown on url text box when invalid data is entered
    Given I open the home page
    When I dont fill the form
    When I give invalid "url"
    Then an error should be shown
    And I close the browser
    
    @test3
  Scenario: Verify empty form does not gets submitted
    Given I open the home page
    When I submit empty form
    Then the form should not be submitted
    Then I click on back button
    And I close the browser
    
  
