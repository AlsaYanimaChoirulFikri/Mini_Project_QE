Feature: Get Information Book
  As a user
  I want to get the information of the book
  So that i can see the details information about the book

  @DeleteBook
  Scenario: I want to see the information about book
    Given The Mini Book Store is opened
    When I click the "i" in the list of books
    Then I can see the information from the book