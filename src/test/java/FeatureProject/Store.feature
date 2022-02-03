#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Demoblaze Login Page

  @tag1
  Scenario Outline: Check the Funcationality of Signup page
    Given User must be on HomePage url "https://www.demoblaze.com/"
    When user click on signup button
    Then Signup window should be open
    When user entered the <username> and <password>
    And Click on signup button
    Then user will get the successful signup alert message
    And user should click on ok button and alert message will disappear

  @tag2
  Scenario Outline: Check the Funcationality of Login page
  
    When user click on login button
    Then Login window will be displayed
    When user should enter the <username> and <password>
    And click on login button
    Then user should be navigate to account page 

    @tag3
   Scenario: Check the Funcationality of Addtocart
  
    When user click on any laptops
    Then new window will be displayed of laptop
    When user click on addtocart button
    Then user will get the product added alert message
    And user should click on ok button and alert message will disappear
    
    @tag4
    Scenario: Navigate to cartpage 
    When user navigate to cart page
    Then  verify product is added or not
    
    Examples:
    |username||password|
    |kkkggg||llll|
    |fffff||nnnn|
    |reffg||sdfcf|
    
