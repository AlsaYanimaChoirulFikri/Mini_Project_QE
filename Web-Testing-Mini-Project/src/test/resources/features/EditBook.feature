Feature: Edit Book
  As a user
  I want to create a edit the book
  So that the edited book has been changed

  @EditValidBook
  Scenario: I want to edit the book with valid credentials
    Given The Mini Book Store is opened
    When I click the "Ballpoint" button
    And I input the valid title of the book for edit
    And I input the valid author of the book for edit
    And I input the valid publish year of the book for edit
    Then I submit the edit book creation form

  @EditEmptyField
  Scenario: I want to edit the book with empty credentials
    Given The Mini Book Store is opened
    When I click the "Ballpoint" button
    And I input the edited with empty title of the book for edit
    And I input the edited with empty author of the book for edit
    And I input the edited with empty publish year of the book for edit
    Then I submit the edit book creation form
    And I receive the error message for edited book

  @EditInvalidBook
  Scenario: I want to edit the book with invalid credentials
    Given The Mini Book Store is opened
    When I click the "Ballpoint" button
    And I input the valid title of the book for edit
    And I input the valid author of the book for edit
    And I input the invalid publish year of the book for edit
    Then I submit the edit book creation form
    And I receive the error message for edited book



