Feature: Vaccinator page Feature
@donwloadtemp @Test5
Scenario: Download Template
Given User is on Vaccinator tab
When User click on Download Template 
And User is redirect to template page
Then User verify templete page data "code,name,nationalIdentifier,mobileNumber,email,status,facilityIds"
  
@uploadcsv @Test5
Scenario: Upload CSV
Given User is on Vaccinator tab
When User click on Upload CSV
And User click on Uploaded File
And User can see file upload details "0 Errors Found"
And User verify Upload Status "No Error Found"
Then User close the status pop-up

@Uploaderrorcsv @Test5
Scenario: Upload error csv
Given User is on Vaccinator tab
When User click on Upload CSV
And User click on Uploaded File
And User can see file upload details "1 Errors Found"
And User verify Upload Status "Row 1 : Errors 1"
Then User close the status pop-up

@Viewerrorcsvfile @Test5
Scenario: Veiw error csv file
Given User is on Vaccinator tab
And User click on Uploaded File
And User click on Download Error csv
Then User view the Error file data 

@viewerrorfilefromuploadstatus @Test5
Scenario: View error file from upload status 
Given User is on Vaccinator tab
When User click on Upload CSV
And User gets error pop-up and user click on view file
And User verify Upload Status "Row 1 : Errors 1"
Then User close the status pop-up

@closeerrorfilepopupfromuploadstatus @Test5
Scenario: Verify close error file popup from uploadstatus
Given User is on Vaccinator tab
When User click on Upload CSV
And User gets error pop-up and user click close

@viewrowasperpagesinuploadhistory @Test5
Scenario: Verify view row as per pages in uploadhistory
Given User is on Vaccinator tab
When User select rows per pages "20"
Then Verify user should able to see the no or rows selected "20"

@clickonnxtpageonuploadhistory @Test5
Scenario: Verify click on next page on uploadhistory
Given User is on Vaccinator tab
And User click on next page
Then Verify previous page numbers "11-20 of 78"

@clickonpreviouspageonuploadhistory @Test5
Scenario: Verify user click on previous page on uploadhistory
Given User is on Vaccinator tab
And User click on next page
Then Verify previous page numbers "11-20 of 78"
When USer click on Previous page option of history
Then Verify previous page numbers "1-10 of 78"


@viewrowasperpagesinallvaccinator @Test5
Scenario: Verify view row as per pages in all vaccinator
Given User is on Vaccinator tab
When User select rows per pages in allvaccinator "20"
Then Verify user should able to see the no or rows selected for all vaccinator "20"

@clickonnxtpageonallvaccinator @Test5
Scenario: verify click  on Next page on vaccinator
Given User is on Vaccinator tab
And User click on next page on all vaccinator
Then Verify previous page numbers of all vaccinator "11-20 of 71"

@clickonpreviouspageonvaccinator @Test5
Scenario: verify click  onpreviouspage on vaccinator
Given User is on Vaccinator tab
And User click on next page on all vaccinator
Then Verify previous page numbers of all vaccinator "11-20 of 71"
When USer click on Previous page option of vaccinator
Then Verify previous page numbers of all vaccinator "1-10 of 71"












