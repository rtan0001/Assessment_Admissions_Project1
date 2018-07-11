Feature: Assessor can be able to add single/multiple preferences to the Package Offer on Add Preference.


  @Verify_AssessmentOutcome_Status_OnACP_And_Plan
  Scenario Outline: Assessor can be able to add single/multiple preferences to the Package Offer on Add Preference.
    Given Assessor navigate to the SalesForce loginPage
    And Assessor enters <username> and <password>
    And I click login should be successfully logon into sandbox
    And I Navigate to Assessment Details Tab
    And I Assessed and update Plan Status to Offer and Select  Outcome Status to Package Offer and save the Assessment Plan
    And I Verify Offer to be Generated under ACP Details and Validate the Offer Number
    And I Verify the Outcome Status on ACP
    Then I Logout from sandbox Environment




    Examples:


      | username                      |  password     |
      | assessorbuseco@monash.edu.a2o |  monash@2017  |