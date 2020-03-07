@test

Feature:dZone header

  Scenario:header comparisson
    Given User on "https://dzone.com/articles/gradle-vs-maven"
    And user takes header
    Then  User on "https://dzone.com/articles/api-security-weekly-issue-71"
    And user takes header of this page
    Then user compares headers




