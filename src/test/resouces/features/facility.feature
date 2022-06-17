Feature: Facility Tab Page 

@donwloadtempletefacility @Test4
Scenario: Verify User Click on Download Templates
Given User is on Facility Tab
When User click on Download Template 
And User is redirect to template page
Then User verify templete page data "facilityCode,facilityName,contact,email,operatingHourStart,operatingHourEnd,category,type,status,addressLine1,addressLine2,district,state,pincode,geoLocationLat,geoLocationLon,websiteURL,adminName,adminMobile"

@Test4 @Uploadfilicitycsv
Scenario: Verify User can upload Facility CSV
Given User is on Facility Tab
When User click on Upload CSV for facility
And User click on Uploaded File
And User can see file upload details "0 Errors Found"
And User verify Upload Status "No Error Found"
Then User close the status pop-up

@Uploaderrorcsvfacility @Test4
Scenario: Upload error csv
Given User is on Facility Tab
When User click on Upload CSV for facility
And User click on Uploaded File
And User can see file upload details "1 Errors Found"
And User verify Upload Status for facilities "Row 1 : Errors 1"
Then User close the status pop-up

@Viewerrorcsvfilefacilities @Test4
Scenario: Veiw error csv file
Given User is on Facility Tab
And User click on Uploaded File
And User click on Download Error csv
Then User view the Error file data  of facilities




@viewerrorfilefromuploadstatusonfacilities @Test4
Scenario: View error file from upload status 
Given User is on Facility Tab
When User click on Upload CSV for facility
And User gets error pop-up and user click on view file
And User verify Upload Status "Row 1 : Errors 1"
Then User close the status pop-up

@closeerrorfilepopupfromuploadstatusonfacilities @Test4
Scenario: Verify close error file popup from uploadstatus
Given User is on Facility Tab
When User click on Upload CSV for facility
And User gets error pop-up and user click close


@viewrowasperpagesinuploadhistoryonfacilities @Test4
Scenario: Verify view row as per pages in uploadhistory
Given User is on Facility Tab
When User select rows per pages "20"
Then Verify user should able to see the no or rows selected "20"

@clickonnxtpageonuploadhistoryonfacilities @Test4
Scenario: Verify click on next page on uploadhistory
Given User is on Facility Tab
And User click on next page
Then Verify previous page numbers "1-10 of 63"

@clickonpreviouspageonuploadhistoryonfacilities @Test4
Scenario: Verify user click on previous page on uploadhistory
Given User is on Facility Tab
And User click on next page
Then Verify previous page numbers "11-20 of 63"
When USer click on Previous page option of history
Then Verify previous page numbers "1-10 of 53"


@viewrowasperpagesinallonfacilities @Test4
Scenario: Verify view row as per pages in all facilies
Given User is on Facility Tab
When User select rows per pages in allvaccinator "20"
Then Verify user should able to see the no or rows selected for all vaccinator "20"

@clickonnxtpageononfacilities
Scenario: verify click  on Next page on facilies
Given User is on Facility Tab
And User click on next page on all vaccinator
Then Verify previous page numbers of all vaccinator "11-20 of 71"

@clickonpreviouspageonfacilities
Scenario: verify click  onpreviouspage on vaccinator
Given User is on Vaccinator tab
And User click on next page on all vaccinator
Then Verify previous page numbers of all vaccinator "11-20 of 71"
When USer click on Previous page option of vaccinator
Then Verify previous page numbers of all vaccinator "1-10 of 71"
