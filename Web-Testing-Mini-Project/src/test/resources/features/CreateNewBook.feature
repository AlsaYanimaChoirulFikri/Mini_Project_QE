Feature: Create New Book
  As a user
  I want to create a new book
  So that the new book can be added to the library

  @CreateValidNewBook
  Scenario: I want to create a valid new book
    Given The Mini Book Store is opened
    When I click the Add New Book button
    And I input the valid title of the book
    And I input the valid author of the book
    And I input the valid publish year of the book
    Then I submit the book creation form

  @CreateEmptyCredentialsNewBook
  Scenario: I want to create a new book with empty credentials
    Given The Mini Book Store is opened
    When I click the Add New Book button
    And I input the empty title of the book
    And I input the empty author of the book
    And I input the empty publish year of the book
    Then I submit the book creation form
    And I receive the error message

  @CreateInvalidNewBook
  Scenario: I want to create a New Book with invalid publish year
    Given The Mini Book Store is opened
    When I click the Add New Book button
    And I input the valid title of the book
    And I input the valid author of the book
    And I input the invalid publish year of the book
    Then I submit the book creation form
    And I receive the error message
