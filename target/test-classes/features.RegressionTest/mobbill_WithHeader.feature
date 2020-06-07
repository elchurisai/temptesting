Feature: Compare the billing data between new and legacy system
  As a Customer
  i want to know Billing data between legacy system and new system is not changed
  so that i know the system is behaving corectly or not


 Background:

@Regression
   Scenario Outline: Verify the results of json files after comparing
     Given the User with "<Actual>" and "<Expected>" Mobile Billing data in CSV
     When User the Order the Expected and Actual rows in CSV
     And User converts the Expected and Actual data into JSON
     And User Compare the Actual and Expected JSON file and logs the results
   Examples:
    | Actual | Expected |
    |    C:\sai\ForO2\mobbill.json     |   C:\sai\ForO2\mobbill_WithHeader.csv       |