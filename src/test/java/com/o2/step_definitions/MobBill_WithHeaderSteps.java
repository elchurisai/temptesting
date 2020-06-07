package com.o2.step_definitions;

import com.o2.framework.helpers.JacksonProgram;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MobBill_WithHeaderSteps {

        JacksonProgram jacksonProgram;


    @Given("^the User with \"([^\"]*)\" and \"([^\"]*)\" Mobile Billing data in CSV$")
    public void theUserWithAndMobileBillingDataInCSV(String actualPath, String expectedPath) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("the User Mobile Billing data in CSV == " +actualPath+"====2nd arqument" +expectedPath);

        jacksonProgram.jacksoncompare(actualPath,expectedPath);
    }

    @When("^User the Order the Expected and Actual rows in CSV$")
    public void userTheOrderTheExpectedAndActualRowsInCSV() {

        System.out.println("User the Order the Expected and Actual rows in CSV");

    }

    @And("^User converts the Expected and Actual data into JSON$")
    public void userConvertsTheExpectedAndActualDataIntoJSON() {

        System.out.println("User converts the Expected and Actual data into JSON");
    }

    @And("^User Compare the Actual and Expected JSON file and logs the results$")
    public void userCompareTheActualAndExpectedJSONFileAndLogsTheResults() {

        System.out.println("User Compare the Actual and Expected JSON file and logs the results");
    }
}
