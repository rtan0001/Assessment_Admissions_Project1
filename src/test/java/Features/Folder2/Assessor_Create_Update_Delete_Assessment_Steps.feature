Feature: Assessor can be able to edit delete and create new steps from Assessment Plan and be able to update the steps
         successfully during their assessment journey


  @GMAIL_Login_Test
  Scenario Outline: Assessor can be able to create edit and delete steps from assessment plan and view the steps Updates
    Given Assessor navigate to the SalesForce loginPage
    And Assessor enters <username> and <password>
    And I click login should be successfully logon into sandbox
    And I Navigate to Assessment Plans select Assessment Plan
    When I Select Assessment Plan From Active view
    Then I Select first assessment plan from the list of plans
    When I navigate to the Assessment Stps from the Assessment plan
    Then I can be able Create a New Assessment Step
    Then I can be able to Edit and update Assessment Steps
    Then I can be able to Delete Assessment Steps
    Then I Logout from sandbox Environment



    Examples:


      | username                      |  password     |
      | assessorbuseco@monash.edu.a2o |  monash@2017  |