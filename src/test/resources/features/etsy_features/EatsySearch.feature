Feature: Etsy search functionality
  Agile story : can be placed here

  Background: User is already on Etsy home page
    Given User is on Etsy home page
  @etsy
  Scenario: Etsy search title verification
    When User searches for "Wooden spoon"
    Then User should see "Wooden spoon" in Etsy title
  @etsy2
  Scenario: Etsy search title verification


    When User searches for "Custom wooden spoon"
    Then User should see "Custom wooden spoon" in Etsy title


    @etsy3
    Scenario Outline: Etsy search title verification
      When User searches for "<searchValue>"
      Then User should see "<expectedTitle>" in Etsy title
      Examples: different data sets
      |searchValue| expectedTitle|
      |Custom wooden spoon| Custom wooden spoon|
      |Wooden spoon       |Wooden spoon        |
      |Wooden spoon       |wooden spoon        |



