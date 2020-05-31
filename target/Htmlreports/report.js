$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/ui_test.feature");
formatter.feature({
  "name": "Test web application to allow users to enter the data",
  "description": "  I want to test the application to check whether the users are able to enter their data",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke_Test"
    }
  ]
});
formatter.scenario({
  "name": "Verify filling the form functionality with correct data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke_Test"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "I open the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_open_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the form with correct details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_fill_the_form_with_correct_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Risk Level",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_select_risk_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on back button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_click_on_back_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify error is shown on url text box when invalid data is entered",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke_Test"
    },
    {
      "name": "@negative_test"
    }
  ]
});
formatter.step({
  "name": "I open the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_open_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I dont fill the form",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_dont_fill_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I give invalid \"url\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_give_invalid_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.an_error_should_be_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify empty form does not gets submitted",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke_Test"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "I open the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_open_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit empty form",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_submit_empty_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the form should not be submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.the_form_should_not_be_submitted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on back button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_click_on_back_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.FormFillingTest.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});