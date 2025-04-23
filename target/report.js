$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/forgotten.feature");
formatter.feature({
  "name": "To validate the login functionality of fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the forgotten password link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.userClickTheForgottenPasswordLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the email id to finding our account and click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.enterTheEmailIdToFindingOurAccountAndClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user found the account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.userFoundTheAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFile/login.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the all the username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the values in username and password field",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java@123",
        "8347837433"
      ]
    },
    {
      "cells": [
        "python@123",
        "7654321789"
      ]
    },
    {
      "cells": [
        "selenium@123",
        "6655378228"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userEnterTheValuesInUsernameAndPasswordField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate into corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.navigateIntoCorrespondingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate invalid username and invalid password in the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to pass values in username and password field and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassValuesInUsernameAndPasswordFieldAndClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate into error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.navigateIntoErrorPage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.step.StepDefinition.navigateIntoErrorPage(StepDefinition.java:58)\r\n\tat ✽.navigate into error page(file:src/test/resources/FeatureFile/login.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});