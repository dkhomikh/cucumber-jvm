Feature: Test maven cucumber project

  Scenario: test cucumber-jvm with maven
    Given cucumber installed
    When all dependencies added to pom.xml
    When maven project created
    Then user can run cucumber test

  Scenario Outline: test cucumber-jvm selenium maven
    Given web driver initialized as <browser>
    When user navigates to website "http://www.amazon.com"    
    
  Examples: test firefox and chrome
  |browser|
  |"firefox"|
  |"chrome"|
  
 
  
  

