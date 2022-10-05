@Regression @GroupChat
Feature: Group Chat
  I want use a Group Chat feature

  Background: I already login with registered email in Staging Cicle
    Given I already on Cicle Staging Homepage

  @PositiveCase @GRP-001
  Scenario: I success landing on Group Chat page
    When I click QA teams
    And I click Group Chat
    Then I on Group Chat page

  @PositiveCase @GRP-002
  Scenario: I send a text message on Group Chat
    When I click QA teams
    And I click Group Chat
    And Fill text message
    And I click send
    Then My message has been sent

  @PositiveCase @GRP-003
  Scenario: I success delete s message on Group Chat
    When I click QA teams
    And I click Group Chat
    And I choose one message
    And I click delete
    Then My message has been deleted

  @PositiveCase @GRP-004
  Scenario: I success upload a file on Group Chat
    When I click QA teams
    And I click Group Chat
    And I click paper clip button and choose a file
    Then My file has been uploaded