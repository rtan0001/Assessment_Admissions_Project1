$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FieldValidations_ApplicationPage.feature");
formatter.feature({
  "line": 1,
  "name": "when Assessor Change the Assessment plan status to offer from Assessment Journey,",
  "description": "then Assessor will see contract offer which is generated automatically on ACP of the Assessment Plan.",
  "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Assessor Logon into a2o sandbox with assessor profile",
  "description": "",
  "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,;assessor-logon-into-a2o-sandbox-with-assessor-profile",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@GMAIL_Login_Test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Assessor navigate to the SalesForce loginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Assessor enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click login should be successfully logon into sandbox",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Application select application Id and click on applicant",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify and Validate \u003cCitizenship\u003e on contact details",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,;assessor-logon-into-a2o-sandbox-with-assessor-profile;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Citizenship"
      ],
      "line": 21,
      "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,;assessor-logon-into-a2o-sandbox-with-assessor-profile;;1"
    },
    {
      "cells": [
        "rupa.tanneero@monash.edu.a2o",
        "monash@2017",
        "Citizenship"
      ],
      "line": 22,
      "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,;assessor-logon-into-a2o-sandbox-with-assessor-profile;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Assessor Logon into a2o sandbox with assessor profile",
  "description": "",
  "id": "when-assessor-change-the-assessment-plan-status-to-offer-from-assessment-journey,;assessor-logon-into-a2o-sandbox-with-assessor-profile;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@GMAIL_Login_Test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Assessor navigate to the SalesForce loginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Assessor enters rupa.tanneero@monash.edu.a2o and monash@2017",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click login should be successfully logon into sandbox",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Application select application Id and click on applicant",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify and Validate Citizenship on contact details",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Assessment_LoginStep.assessorNavigateToTheSalesForceLoginPage()"
});
formatter.result({
  "duration": 9747870903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rupa.tanneero@monash.edu.a2o ",
      "offset": 16
    },
    {
      "val": "monash@2017",
      "offset": 49
    }
  ],
  "location": "Assessment_LoginStep.assessorEntersUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 786879078,
  "status": "passed"
});
formatter.match({
  "location": "Assessment_LoginStep.iClickLoginShouldBeSuccessfullyLogonIntoSandbox()"
});
formatter.result({
  "duration": 12695138197,
  "status": "passed"
});
formatter.match({
  "location": "FieldValidations_Step.navigateToApplicationSelectApplicationIdAndClickOnApplicant()"
});
formatter.result({
  "duration": 21785711918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Citizenship",
      "offset": 22
    }
  ],
  "location": "FieldValidations_Step.iVerifyAndValidateCitizenshipOnContactDetails(String)"
});
formatter.result({
  "duration": 3082727303,
  "status": "passed"
});
});