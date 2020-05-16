#Author:Jyothi G
@fingerTipDecisions
Feature: Fingertip Decisions test cases

  @decisiontestcase1
  Scenario Outline: Test case to validate title and description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    #And User select "Decision" frm the dropdown
    # And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                     | Description          |
      | xx_test_title_description | Test description xx1 |

  @decisiontestcase2
  Scenario Outline: Test case to validate title and no description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    #And User select "Decision" frm the dropdown
    #And click on continue button
    And user enters "<Title>" in NewDecision page
    And I click on share button
    Then user validate "Please enter description" error message

    Examples: 
      | Title                     |
      | xx_test_title_description |

  @decisiontestcase3
  Scenario Outline: Test case to validate no title and description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    #And User select "Decision" frm the dropdown
    #And click on continue button
    And user enters "<Description>" in decision page
    And I click on share button
    Then user validate "Please fill the decision title" error message

    Examples: 
      | Description          |
      | Test description xx1 |

  @decisiontestcase4
  Scenario Outline: Test case validate whether decision created successfully
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
    And user selects "Today" in date picker
    And I click on share button
    And I vaidate text "<Title>" in Decision page
    Then I Validate today date in decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_1_jyothi | Test description xx1 |

  @decisiontestcase5
  Scenario Outline: Test case validate whether decision created successfully with past date
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
    And user selects "1/MAY/2019" in date picker
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then I validate text "5/1/2019"

    #Then I validate time "5/1/2020" in decision
    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_1_jyothi | Test description xx1 |

  @decisiontestcase6
  Scenario Outline: Test case validate whether decision creted successfuly
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
    And user selects "25/APRIL/2020" in date picker
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then I validate text "4/25/2020"

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |

  @decisiontestcase7
  Scenario Outline: Test case validate whether decision creted successfuly
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
    Then I validate text "6/23/2023"

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |

  @decisiontestcase8
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "Low" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    And Click on Classification tab
    Then user validate priority "Low" under Classification

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |

  @decisiontestcase9
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "Very High" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then user validate priority "Very High" under Classification

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |

  @decisiontestcase10
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "High" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then user validate priority "High" under Classification

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |

  @decisiontestcase11
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "Normal" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then user validate priority "Normal" under Classification

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |

  @decisiontestcase12
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "Very Low" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |

  @decisiontestcase13
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    Then Click on Chatter tab
    And Click on Text box of Post
    Then ENter the "Text enter"  in box
    Then CLick on Share button
    Then validate "Text enter" text in chatter tab

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |
      
       @decisiontestcase14
  Scenario Outline: Test case to validate whether decision created with priority
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
    And user selects "Very Low" as priority
    And I click on backup for accoutable link
    Then Enter "Sunil George" in backup for accoutable link
    And user validate "Sunil George" in responsible field
    And I click on Consulted button
    Then Enter "Sunil George" in Consulted link
     And I click on Informed button
    Then Enter "Sunil George" in Informed link
    Then CLick on Share button
    And I vaidate text "<Title>" in Decision page
  
    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |
      
      
#  @decisiontestcase13
 # Scenario: Test case to validate title and description
  #  Given user launches Url of fingertip
   # And user enters username and password
    #And user click on login button
    #Then user validate fingertip text in home page
    #And Click on Decision Tab
    #And Click on New button
    #Then I validate decision image
