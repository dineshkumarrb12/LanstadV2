@login
Feature: To verify application login
#Test scenario using table for Datadriven
@testcase11
Scenario Outline: Login application with correct username and password
Given Launch the application
When sign in with username as "<Username>" and password as "<Password>"
Then application should redirect to home page
Examples:
|Username			|Password		|Result|
|techsupport|123456|Login|
|asdad				|123456			|wrongusername|
#|techsupport	|asdad			|wrongpassword|
#|							|						|enter username and password|
#|techsupport	|						|Password is mandatory|
#|							|123456			|Login is mandatory|		