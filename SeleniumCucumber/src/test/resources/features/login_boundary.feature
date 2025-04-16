@login_boundary
  Feature: User Login

    @login_boundary_empaty_data
    Scenario Outline: Login with empaty data
      Given user on the home page
      When user input <username> as username
      And user input <password> as password
      Then user stays on login page
      Examples:
        | username | password |
        | ""       | ""       |