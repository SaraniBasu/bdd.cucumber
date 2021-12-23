@PhaseOne
Feature: CRM Contact & Deal Feature

@SmokeTest
Scenario: Create contact
Given User is LoggedIn
When User create a new contact

@RegressionTest
Scenario: View contact
Given User is LoggedIn
When User view contact details

@SmokeTest @RegressionTest
Scenario: Update contact
Given User is LoggedIn
When User update a contact details

@SmokeTest
Scenario: Create Deal
Given User is LoggedIn
When User create a new deal

@RegressionTest
Scenario: View Deal
Given User is LoggedIn
When User view Deal details

Scenario: Update Deal
Given User is LoggedIn
When User update a Deal details