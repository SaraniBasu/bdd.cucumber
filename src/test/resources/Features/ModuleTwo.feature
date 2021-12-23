@PhaseTwo
Feature: CRM Task Features

Background: User login

@RegressionTest
Scenario: Create tasks
Given User is LoggedIn
When User create a new task

Scenario: View task
Given User is LoggedIn
When User view task details

@SmokeTest
Scenario: Update task
Given User is LoggedIn
When User update a task details

