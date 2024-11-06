@login
Feature: To validate the functionality to login the Facebook
Scenario Outline:
 To pass the values for userName and Password
Given To Launch the FaceBook URL
When Pass the values for "<userName>" and "<Password>"
And Click the login button



Examples:
|userName|Password|
|smartskills@gmail.com|smart@123|
|hcl123@gmail.com|hcl@123|
|karpagam987@gmail.com|11|
|deiva567@gmail.com|deiva@567|


