Feature: Login functionlity
  I want to use this to check the loin functionlity for ServiceNow

Background: 
		Given User opens the application
		  
Scenario Outline: validate user is able to login
  When User enters "<Username>" and "<Password>"
  And User clicks on the submit button
  Then User lands to homepage
	And User fills Requestor Information
	And User selects Multilingual Support
	And User selects Source
	And User selects Reported for
	And User enters Site
	And User adds Description
	And User enters "<Catalog>" item
	And User clicks on Next button
	And User clicks on Save & Submit button
	And User gets the ticket number
    
Examples:

	| Username| Password | Catalog |
	| MKumar6 | Default@1234 | Access to a public folder |
	|VSharma4| vikasH@6972 | Access to Network |
	|MKumar6| Default@1234 | ATS Printer - Move-Add-Change Request |
	|MKumar6| Default@1234 | DataCenter Operations/Maintenance |
	
