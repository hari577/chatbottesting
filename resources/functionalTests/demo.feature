#Author: jyothi g
@Demo
Feature: This feature file is regarding running cases demo
   @Demo1
  Scenario Outline: Test case validate whether decision created successfuly
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    #And User select "Decision" frm the dropdown
    #And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "23/june/2023" in date picker
    And user selects "11:00 AM" in time section
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |  

  @Demo2failed
  Scenario Outline: Failing test case
      Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    #And User select "Decision" frm the dropdown
    #And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "23/june/202327853" in date picker
    And user selects "11:00 AM" in time section
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | Fail case                      | Test description xx2 |  

