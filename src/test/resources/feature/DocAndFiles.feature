@Regression @DocAndFiles
Feature: Doc and Files
  I want use a Doc and Files feature

  Background: I already login with registered email in Staging Cicle
    Given I already on Cicle Staging Homepage

  @PositiveCase @DOC-001
  Scenario: I success landing on Doc and Files page
    When I click QA teams
    And I click Doc and Files
    Then I on Doc and Files page

  @PositiveCase @DOC-002
  Scenario: I success create a folder on Doc and Files page
    When I click QA teams
    And I click Doc and Files
    And I choose Create a New Folder
    And I fill the folder name
    Then My folder has been created

  @PositiveCase @DOC-003
  Scenario: I success create a new document on Doc and Files page
    When I click QA teams
    And I click Doc and Files
    And I choose Add a New Doc
    And I fill title and content of document
    Then My document has been created

  @PositiveCase @DOC-004
  Scenario: I success upload file on Doc and Files page
    When I click QA teams
    And I click Doc and Files
    And I choose Upload Files to upload
    Then My files has been uploaded

  @NegativeCase @DOC-005
  Scenario: I failed create a folder on Doc and Files page if folder name empty
    When I click QA teams
    And I click Doc and Files
    And I choose Create a New Folder
    And I don't fill the name folder
    Then I see notification Folder name cannot be empty