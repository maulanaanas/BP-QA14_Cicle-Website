@Regression @Board
 Feature: Board
    I want use a Board feature

    Background: I already login with registered email in Staging Cicle
      Given I already on Cicle Staging Homepage

   @PositiveCase @BRD-001
      Scenario: I success landing on Kanban Board
        When I click QA teams
        And I click Board
        Then I on Kanban Board

   @PositiveCase @BRD-002
     Scenario: I success add list on Kanban Board
        When I click QA teams
        And I click Board
        And I click Add List button
        And I fill name list with "On review"
        Then I success add list on Kanban Board

   @PositiveCase @BRD-003
     Scenario: I success add card on list at Kanban Board
        When I click QA teams
        And I click Board
        And I click Add Card on list
        And I fill name card with "Make a cucumber"
        Then I success add card on Kanban Board

   @PositiveCase @BRD-004
     Scenario: I success add notes on card at Kanban Board
        When I click QA teams
        And I click Board
        And  I click one card
        And I type a notes
        Then I success add notes on card

   @PositiveCase @BRD-005
     Scenario: I success completed a list
        When I click QA teams
        And I click Board
        And I click three dots symbol on first list
        And I click Set as a Complete List
        Then My list has been checked green

   @NegativeCase @BRD-006
     Scenario: I failed add list if list name was empty
        When I click QA teams
        And I click Board
        And I click Add List button
        And I fill name list with ""
        Then I see notification failed create a list

   @NegativeCase @BRD-007
     Scenario: I failed add card if card name was empty
        When I click QA teams
        And I click Board
        And I click Add Card on list
        And I fill name card with ""
        Then I see notifictaion failed add card on Kanban Board

   @NegativeCase @BRD-008
     Scenario: I failed add labels on card if label name was empty
        When I click QA teams
        And I click Board
        And I click pencil button on any card
        And I click Edit Labels
        And I click plus symbol
        And I fill Labels Name with ""
        And I click Create button
        Then I see notification failed to add labels
