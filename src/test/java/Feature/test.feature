Feature: Verify Brikroy.com Website work properly

  #T1
  @Release
  Scenario: Verify Write work properly
    Given User Click on notepad write options
    Then Write "this is a comment"


  @Release
  Scenario: Create a new file on notepad++
    Given Click on New File Icon

