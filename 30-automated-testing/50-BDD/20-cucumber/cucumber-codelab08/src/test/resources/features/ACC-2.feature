Feature: As a student I can log into my student account

  Scenario: Login with a registered student account
    Given A student with an existing account
    When Going to the login page
    And Filling in their credentials : login = 'studenttest@lms.com', password = 'deadpoolismyhero'
    And Pressing the login button
    Then Student will be navigated to their profile page
    And The message 'Logged in as student '<student_name>'' will be visible.

  Scenario: Login with a non-existing student account
    Given A student with a non-existing account
    When Going to the login page
    And Filling in their credentials : login = 'christoph@lms.com', password = 'rudy'
    And Pressing the login button
    Then A warning message will appear: 'Invalid credentials'

  Scenario: Login with a student account with the wrong password
    Given A student with an existing account
    When Going to the login page
    And Filling in the wrong password : login = 'studenttest@lms.com', password = 'random'
    And Pressing the login button
    Then A warning message will appear: 'Invalid credentials'