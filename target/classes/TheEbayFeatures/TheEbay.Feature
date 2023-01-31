 Feature: This Feature file will cover Ebay All catogories Feature
 @test
 Scenario: Verify Books Page is display
 Given Launching Application <"URL">
 Then click Book under the Catagory Dropdown
 Then click in search button
 Then Verify Books Page is display


 Scenario: Verify Toys are displayed
 Given Launching Application <"URL">
 Then click Baby under All Catagory
 Then click search field
 Then enter Toys in search field
 Then click search buttton
 Then Verify Toys are displayed
 
 
 Scenario: verify Buy Again page display
 Given Launching Application <"URL">
 Then mouseOver on MyeBay for Buy Again
 Then click Buy Again under MyeBay
 Then verify Buy Again page display successfuly
 
 
 




