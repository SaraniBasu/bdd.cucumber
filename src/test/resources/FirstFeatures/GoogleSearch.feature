Feature: Google Search

Scenario: Java Tutorial Search

Given User is on Google page
When User search Java Tutorial
Then Should display Java Result Page
And Close Browser

Scenario: Selenium Tutorial Search

Given User is on Google page
When User search Selenium Tutorial
Then Should display Selenium Result Page
And Close Browser