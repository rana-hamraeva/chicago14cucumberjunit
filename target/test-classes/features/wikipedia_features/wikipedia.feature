@wiki
Feature:Wikipedia Search Functionality Title Verification


  Scenario: Wiki search title verification
  When User is onWikipedia home page
And User types Steve Jobs in the wiki search box
And User clickswiki search button
  Then User sees Steve Jobs is in the wiki title




  Scenario: Main header verification
 Given User is onWikipedia home page
When User types Steve Jobs in the wiki search box
And User clickswiki search button
Then User sees Steve Jobs is in the main header



    Scenario Outline: image header verification
  Given User is onWikipedia home page
 When User types Steve Jobs in the wiki search box
  And User clickswiki search button
  Then sees Steve Jobs is in the image header
      Examples: Test data for image header verification
      |Steve Jobs|Steve Jobs|