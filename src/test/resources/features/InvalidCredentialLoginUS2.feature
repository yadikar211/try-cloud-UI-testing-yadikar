Feature: as a user, i should be able to login.

  Scenario Outline: verify user login fail with invalid credentials
    Given user on the login page http://qa3.trycloud.net/index.php/login?clear=1
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then verify "<message>" message should be displayed
    Examples:
      | username  |   password        | message                                   |
      | User9         |   Wrong               | Wrong username or password. |
      | Wrong        |   Userpass123    | Wrong username or password. |
      | Wrong        |     Wrong             | Wrong username or password. |