Feature: when Assessor Change the Assessment plan status to offer from Assessment Journey,
  then Assessor will see contract offer which is generated automatically on ACP of the Assessment Plan.



  @GMAIL_Login_Test
  Scenario Outline: Assessor Logon into a2o sandbox with assessor profile
    Given Assessor navigate to the SalesForce loginPage
    And Assessor enters <username> and <password>
    When I click login should be successfully logon into sandbox
    Then Navigate to Application select application Id and click on applicant
    Then I verify and Validate <Citizenship> on contact details

    Examples:


      | username                      |  password     |   Citizenship   |
      | rupa.tanneero@monash.edu.a2o  |  monash@2017  |   Citizenship   |