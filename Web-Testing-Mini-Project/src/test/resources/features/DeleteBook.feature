Feature: Delete Book
  As a user
  I want to delete a book
  So that book can be deleted

  @DeleteBook
  Scenario: I want to delete the book
    Given The Mini Book Store is opened
    When I click the "Trash" button
    Then I click the delete button
    And The book has been deleted