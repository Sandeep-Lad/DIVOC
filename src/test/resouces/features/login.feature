Feature: Login page feature

@Loginpage @Test
Scenario: Landing on login page
Given User is on login page 
When user gets the title of the page
Then page title "Sign in to divoc"

@Valid @Test
Scenario: Login with valid credentials 
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "1234"
And user click on login to portal
Then page title should be "DIVOC Portal"


@Invalid @Test
Scenario: Login with blank mobile number
Given User is on login page 
When user enter the mobile number ""
And user click on get otp
Then user should get an error 

@InvalidOtp @Test
Scenario: Login with Blank otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt ""
And user click on login to portal
Then user should get an error for invalid opt

@Logout @Test
Scenario: user Logged Out
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "1234"
And user click on login to portal
And User click on Admin option
And user logout

@validmobileno @Test
Scenario: User enter valid mobile no 
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp

@validotp @Test
Scenario: User enter valid otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "1234"
And user click on login to portal

@InvalidOtpwithalphabet @Test
Scenario: Login with alphabet in otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "asfc"
And user click on login to portal
Then user should get an error for invalid opt

@InvalidOtpwithspecialcharacters @Test
Scenario: Login with specialcharacters otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "#$%^"
And user click on login to portal
Then user should get an error for invalid opt


@InvalidOtpwithmorethen4numbers  @Test
Scenario: Login with morethen4numbers otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "123456"
And user click on login to portal
Then user should get an error for invalid opt

@InvalidOtpwithlessthen4numbers @Test1
Scenario: Login with lessthen4numbers otp
Given User is on login page 
When user enter the mobile number "0000000000"
And user click on get otp
And User enter the opt "123"
And user click on login to portal
Then user should get an error for invalid opt

@invalidmobileno @Test1
Scenario: User enter unregistered mobile no 
Given User is on login page 
When user enter the mobile number "8745214221"
And user click on get otp
Then user should get and error for invalid number

@invalidmobilenowithalphabit @Test1
Scenario: User enter alphabets in  mobile no 
Given User is on login page 
When user enter the mobile number "ASdfresfas"
And user click on get otp
Then user should get and error for invalid number

@invalidmobilenowithlessthen10digit @Test1
Scenario: User enter lessthen10digit mobile no 
Given User is on login page 
When user enter the mobile number "87452142"
And user click on get otp
Then user should get and error for invalid number

@invalidmobilenowithmorethen10digit @Test1
Scenario: User enter morethen10digit mobile no 
Given User is on login page 
When user enter the mobile number "874521421245"
And user click on get otp
Then user should get and error for invalid number

@invalidmobilenowithspecialcharacter @Test1
Scenario: User enter specialcharacter in mobile no 
Given User is on login page 
When user enter the mobile number "@#$)(*&!@@"
And user click on get otp
Then user should get and error for invalid number



