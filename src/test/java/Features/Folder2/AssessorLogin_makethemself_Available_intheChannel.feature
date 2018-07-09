Feature: Assessor logon into CRM system and will see list of tasks has been assigned under the Assessment Plan


  @GMAIL_Login_Test
  Scenario Outline: Assessor Logon into a2o sandbox with assessor profile
     Given Assessor navigate to the SalesForce loginPage
     And Assessor enters <username> and <password>
     When I click login should be successfully logon into sandbox
     Then I Navigate to Assessment Plans select Assessment Plan
     Then I Click on Omni-channel to see the available plans
     Then I make myself available in the channel
     Then I logout from the a20 sandbox





     Examples:


         | username                      |  password     |
         | assessorbuseco@monash.edu.a2o |  monash@2017  |