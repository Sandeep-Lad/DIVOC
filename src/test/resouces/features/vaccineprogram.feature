Feature: Vaccine Program Page 

Scenario: User Register New Vaccine Program
Given User is on Vaccine Program Page
When User click on Register new Vaccine Program
And User Enter program Name "Covid Free India"
When User Enter Program Description "Lets make India Covid Free"
And User Select Start Date of the program
And User select End date of the program 	
When User Select Vaccine for Program ""
And User click on Save 
Then Verify pop-up message "Successfully Registered"
