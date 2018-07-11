Feature: Assessor can be able to edit and update document status after verified document checklist.


  @Document_Status_Verification
  Scenario Outline: Assessor can be able to edit and update document status with the document checklist.
    Given Assessor navigate to the SalesForce loginPage
    And Assessor enters <username> and <password>
    And I click login should be successfully logon into sandbox
    And I Navigate to Application Documents Tab
    And I Edit Document and change document status and update comments then hit Save
    And I Validate document status updates
    Then I Logout from sandbox Environment




    Examples:


      | username                      |  password     |
      | assessorbuseco@monash.edu.a2o |  monash@2017  |