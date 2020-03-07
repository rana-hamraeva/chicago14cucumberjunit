Feature: Google feature verifications
  Agile Story: user stories , acceptance criteria
  Basically we can pass here any additional information related to feature file
  #commens are done using hashtag sign in feature file
  @smokeTest
  Scenario: Google Title Verification
    When User is on google home page
    Then User should see title contains Google
    @regressionTest
    Scenario: Google title verification
      When User is on google home page
      And User types wooden spoon into search box
      And User clicks on search button
      Then User should see wooden spoon in the title

