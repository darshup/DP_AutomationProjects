Feature: Background Color Functionality;

#Scenario: Sky Blue Background
#	Given Set SkyBlue Background button exists
#	When I click on the button
#	Then the background color will change to sky blue
#	
#Scenario: White Background Change
#	Given Set SkyWhite Background button exists
#	When I click on the button
#	Then the background color will change to white

Scenario Outline: 
	Given "<button>" button exists
	When I click on the "<color>" button 
	Then the background color will change to "<color>"
	Examples:
	|button 				 |color|
	|Set SkyBlue Background  |sky blue|
	|Set SkyWhite Background |white	|