Feature: Hotel Booking In Adaction Application
Scenario: Login
Given user Lunch The Application
When user Enter The User Name In Username Field
And user Enetr The Password In Password Field
Then user Click On The Login Button And It Navigate To The Search Hotel Page

Scenario: user Select The Location
When user Select The Hotels
And user Select The Rome Type
And user Select The Number Of Room
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Room
And user Select The Children Room
Then user Click On The Search Button And It Navigate To The Select Hotel Page

Scenario: user Select The Hotel
When user Select The Hotel Location
Then user Click On The Continue Button And It Navigate To The Book A Hotel Page

Scenario: user Enter The Firstname In Firstname Field
When user Enter The Lastname In Lastname Field
And user Enter The Billing Address In The Address Field
And user Enter The Credit Card No In The Credit Card Field
And user Enter The Credit Card Type In The Credit Card Type Field
And user Enter The Expriy Date In The Expriy Date Field
And user Enter The Expriy Year In The Expriy Year Field
And user Enter The CCV Num In The CCV Num Field
Then user Click On The Book Now Button And It Navigate To The Booking Confirmation Page 


