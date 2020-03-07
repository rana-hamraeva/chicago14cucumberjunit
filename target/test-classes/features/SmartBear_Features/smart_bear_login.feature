Feature: Smartbear login feature verifications
  Agile Story: When user is on the login page of SmartBear app user should
  be able to login using correct test data
  A/C:
  1- Only authenticated user should be able to login
  Link: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  Authenticated test data:
  Username: Test
  Password: tester
  2- User should see "Welcome, Tester!" displayed when logged in.
@positive
  Scenario:Positive login
    When User on smart bear login page
    And  User input correct username
    And User inputs correct password
    And User clicks on login button
    Then User should be able to login and should be able to see welcome message
@negative
    Scenario:Negative login
      When User on smart bear login page
      And  User input correct username
      And User inputs incorrect password
      And User clicks on login button
      Then User should see error message


