Feature: Form automation
  As a user I want to fill my form
  and submit it

  Scenario Outline: Form filling and submition
    Given user navigates to the app url
    When user fills first name textfield "<firstName>"
    And user fills last name textfield "<lastName>"
    And user click gender
    And user fills date of birth "<dateOfBirth>"
    And user fills email "<email>"
    And user fills Password "<password>"
    And user fills address "<address>"
    And user fills company "<company>"
    And user select role
    And user select first job expectation
    And user select second job expectation
    And user select third job expectation
    And user select first way of development
    And user select second way of development
    And user fills comments "<comment>"
    And user click submit
    Then form succesfully submited
    Examples:
      | firstName | lastName | dateOfBirth | email          | password | address | company | comment |
      | Vadym     | Iershov  | 05/05/1990  | test@gmail.com | test     | Niles   | HMD     | comment |
      | Eugene    | Chyrva   | 06/06/1991  | test@gmail.com | test     | Niles   | HMD     | comment |
      | Test      | Test     | 07/07/1992  | test@gmail.com | test     | Niles   | HMD     | comment |