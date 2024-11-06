@createNewAcc1
Feature: To valid the functionality of signup page
@sanity
Scenario: To pass the Firstname, LastName, MobileNumber and NewPassword values
Given To launch the createNewAcc URL
And To Click the Create New Account URL
When To pass the values for FirstName, LastName, MobileNumber, NewPassword values
    |Deiva|Kumar|9688284010|Deiva@987|
    |Guhan|Deiva|9876543210|GDeiva@123|
    |Mona|Kumar|8765432109|Mona@345|
    |Atchu|Praji|7654321098|AtchuPraji@000|

And Select the values for DateOfBirth and Gender

@smoke
Scenario: To pass the values in SignUp page
Given To launch the Facebook URL and click CreateNewAcc button
When To pass the values for SignUp page
    |Firstname|Lastname|MobileNumber|NewPassword|
    |Jammu|Kashmir|9123456780|JammuKash@780|
    |My|Love|8956743210|Mine@210|
    
And Select the values for DateOfBirth and Gender
