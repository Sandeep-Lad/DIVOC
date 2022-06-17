Feature: Vaccine Page Feature

@Addnewvaccine 
Scenario: Verify Register New Vaccine with valid data
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Vaccine name "Covidvac122"
And User enter Manufacturer name "serum institute"
And user select Administration Type "nasal"
And user enter Approximate Price  "700"
And User select Doses of Vaccine
And User add minimun interval "3"
And User select minimum interval type "Months"
And User add max interval "6"
And User select Max interval "Months"
And User enter Validity of Vaccine "120"
And User select the lastdose validity until "Days"
And User Click on save
Then Verify pop-up message "Successfully Registered"


@inactivevaccine @Test3
Scenario: Verify User Inactive the vaccine
Given User is on Vaccine page 
And User inactive the vaccine 
Then Verify pop-up message "Successfully Updated"

@activevaccine @Test3
Scenario: Verify User active the vaccine
Given User is on Vaccine page 
And User active the vaccine 
Then Verify pop-up message "Successfully Updated"

@backfromregistervaccinepage @Test3
Scenario: Verify back to vaccine page 
Given User is on Vaccine page 
When User click on Register new Vaccine 
And user click on back option

@editvaccine @Test3
Scenario: Verify user can edit vaccine details
Given User is on Vaccine page
When User click on already register vaccine 
And User Clear Manufacture name
And User enter Manufacturer name "J&11"
And user select Administration Type "nasal"
And User Clear Approximate Price
And user enter Approximate Price  "180"
And User Clear Validity of Vaccine
And User enter Validity of Vaccine "90"
And User select the lastdose validity until "Months"
And User Click on save
Then Verify pop-up message "Successfully Updated"

@closedoses @Test3
Scenario: Verify User can close the dose 
Given User is on Vaccine page 
When User click on already register vaccine
And User click on Add does
And user click on close 
And User Click on save
Then Verify pop-up message "Successfully Updated"

@Addnewvaccinewithblankvaccinename @Test3
Scenario: Verify Register New Vaccine with blank vaccine name
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Vaccine name ""
And User Click on save
Then Verify Error messsage "is required"

@AddnewvaccinewithblankManufacturername @Test3
Scenario: Verify Register New Vaccine with blank Manufacturer name
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Manufacturer name ""
And User Click on save
Then Verify Error messsage "is required"

@AddnewvaccinewithblankApproximatePrice @Test3
Scenario: Verify Register New Vaccine with blank Approximate Price
Given User is on Vaccine page 
When User click on Register new Vaccine 
And user enter Approximate Price  ""
And User Click on save
Then Verify Error messsage "is required"

@AddnewvaccinewithneagtiveApproximatePrice @Test3
Scenario: Verify Register New Vaccine with negative Approximate Price
Given User is on Vaccine page 
When User click on Register new Vaccine 
And user enter Approximate Price  "-41253"
And User Click on save
Then Verify negative messsage "cannot be negative"

@Addnewvaccinewithneagtivevalidity @Test3
Scenario: Verify Register New Vaccine with negative validity
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Vaccine name "Covidvac"
And User enter Manufacturer name "Serum"
And user select Administration Type "oral"
And user enter Approximate Price  "900"
And User enter Validity of new Vaccine "-90"
And User Click on save
Then Verify negative messsage validity "cannot be negative"

@Addnewvaccinewithneagtiveminint @Test3
Scenario: Verify Register New Vaccine with negative Minimum interval doses
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Vaccine name "Covidvac"
And User enter Manufacturer name "Serum"
And user select Administration Type "oral"
And user enter Approximate Price  "900"
And User select Doses of Vaccine
And User add minimun interval "-1"
And User Click on save
Then Verify negative messsage validity "cannot be negative"

@Addnewvaccinewithneagtivemaxint @Test3
Scenario: Verify Register New Vaccine with negative Maximum interval doses
Given User is on Vaccine page 
When User click on Register new Vaccine 
And User enter Vaccine name "Covidvac"
And User enter Manufacturer name "Serum"
And user select Administration Type "oral"
And user enter Approximate Price  "900"
And User select Doses of Vaccine
And User add minimun interval "1"
And User select minimum interval type "Months"
And User add max interval "-3"
And User Click on save
Then Verify negative messsage validity "cannot be negative"


@editvaccinewithnegativeapporoxprice @Test3
Scenario: Verify user can not edit vaccine price with negative data
Given User is on Vaccine page 
When User click on already register vaccine 
And User Clear Manufacture name
And User enter Manufacturer name "J&J"
And user select Administration Type "nasal"
And User Clear Approximate Price
And user enter Approximate Price  "-41253"
And User Click on save
Then Verify negative messsage validity "cannot be negative"

@editvaccinewithnegativevalidity
Scenario: Verify user can not edit vaccine validlity with negative data
Given User is on Vaccine page 
When User click on already register vaccine 
And User Clear Manufacture name
And User enter Manufacturer name "J&J1"
And user select Administration Type "nasal"
And User Clear Approximate Price
And user enter Approximate Price  "10"
And User Clear Validity of Vaccine
And User enter Validity of new Vaccine "-90"
And User Click on save
Then Verify negative messsage validity "cannot be negative"



