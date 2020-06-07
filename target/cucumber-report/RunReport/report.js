$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features.RegressionTest/mobbill_WithHeader.feature");
formatter.feature({
  "name": "Compare the billing data between new and legacy system",
  "description": "  As a Customer\n  i want to know Billing data between legacy system and new system is not changed\n  so that i know the system is behaving corectly or not",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the results of json files after comparing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "the User with \"\u003cActual\u003e\" and \"\u003cExpected\u003e\" Mobile Billing data in CSV",
  "keyword": "Given "
});
formatter.step({
  "name": "User the Order the Expected and Actual rows in CSV",
  "keyword": "When "
});
formatter.step({
  "name": "User converts the Expected and Actual data into JSON",
  "keyword": "And "
});
formatter.step({
  "name": "User Compare the Actual and Expected JSON file and logs the results",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Actual",
        "Expected"
      ]
    },
    {
      "cells": [
        "C:\\sai\\ForO2\\mobbill_WithHeader.csv",
        "C:\\sai\\ForO2\\mobbill_WithHeaderBulk.csv"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Verify the results of json files after comparing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "the User with \"C:\\sai\\ForO2\\mobbill_WithHeader.csv\" and \"C:\\sai\\ForO2\\mobbill_WithHeaderBulk.csv\" Mobile Billing data in CSV",
  "keyword": "Given "
});
formatter.match({
  "location": "MobBill_WithHeaderSteps.theUserWithAndMobileBillingDataInCSV(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User the Order the Expected and Actual rows in CSV",
  "keyword": "When "
});
formatter.match({
  "location": "MobBill_WithHeaderSteps.userTheOrderTheExpectedAndActualRowsInCSV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User converts the Expected and Actual data into JSON",
  "keyword": "And "
});
formatter.match({
  "location": "MobBill_WithHeaderSteps.userConvertsTheExpectedAndActualDataIntoJSON()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Compare the Actual and Expected JSON file and logs the results",
  "keyword": "And "
});
formatter.match({
  "location": "MobBill_WithHeaderSteps.userCompareTheActualAndExpectedJSONFileAndLogsTheResults()"
});
formatter.result({
  "status": "passed"
});
});