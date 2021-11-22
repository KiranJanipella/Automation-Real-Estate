Feature: Login

Background: Verify login with valid credentials
Given Initialize the browser with chrome
And Navigate to  "http://realty-real-estatem1.upskills.in/" site
And Click on Login link in home page to land on Secure sign in Page
And Click on Login in login page
When I entered valid mohankrishna176@gmail.com and valid Secret@123&& logs in
And Click on signin button
Then Navigate to properties
  

Scenario Outline: Working and functionality of screen options in properties module
And Click on Screen options in the Properties page
And Select columns pagination view
Then Apply screen Options

Scenario Outline: Working and Functionality of add new button in Properties page
And Click on add new button
Then Verify it redirects to add new properties  

Scenario Outline: Verify the Date Filter and Actions
And Click on Date Filter Select date
And Click on Filter
And Select All Properties are displayed
And Click on Bulk actions Select the action
And Click on Apply
Then Verify the action is performed

Scenario Outline: Verify the functionality of Properties
And Click on Search bar
And Enter the Property Details and click on search button
And Click on Edit
And Click on Quick edit and update the property
Then close the window

Scenario Outline: Verify the working and functionality of add new property
And Click on Add new
And Click on title and Enter the title details
And Click on description enter the description
And Click on add or upload images
And Select images of property
And Click on use these files
And Click on gallery layout select the layout
And Click on Price Details enter the details 
And Click on Main Details enter the details
And Click on location details enter the details
And Click on Details enter the details
And Click on Video urls
And Click on Findeo Property select the image
And Select Keywords of the property
And Click and enter the project details
And Click and enter the builder name
And Click on checkbox of discussion
Then Click on publish

Scenario Outline: Verify the Functionality of Features
And Click on features
And Click on Name enter the feature name
And Click on slug enter the slug
And select the parent feature
And Click on Description enter the feature description
And Click on Addnew feature
And Perform search opertions in features page
Then close the browser

Scenario Outline: Verify the Functionality of Regions
And Click on Regions
And Click on Name enter the region name
And Click on slug enter the region slug
And select the parent region
And Click on Description enter the region description
And Click on Addnew region
And Perform search opertions in region page
Then close the browser  
  
