# Test plan for CoCoin application

## 1. Introduction
This is a test plan for CoCoin application that exists only for Android devices. CoCoin application helps users to manage their budget. 

### 1.1 In the Scope
The scope includes the following testing types on Android devices:
- Unit testing
- Integration testing
- System testing
- Sanity testing
- Smoke testing
- Regression testing
- Acceptance testing
- Performance Testing
- Load testing
- Stress testing
- Volume testing
- Security testing
- Compatibility testing & Backward Compatibility Testing
- Installation & Launching Testing
- Update Testing
- Recovery testing
- Usability testing
- Localization testing 
- Interruptions testing
- Interface testing 

### 1.2 In the Automation Scope
All of the test cases from all of the types of testing should be automated except for Usabilty, Regression, System, Sanity, Acceptance testing cases that are unsuitable for automation.  
Smoke testing should be both manual and automated.  

## 2. Test cases

### 2.1 Functional testing
Functional testing includes the following types of testing: 

#### 2.1.1 Unit testing
Unit testing is done by the developer. Each module, component and fucntion is tested separately.  
Unit testing should be automated.  

#### 2.1.2 Integration testing
Integration testing checks that modules and components of an application work correctly together.  
Integration testing should be automated.  

#### 2.1.3 System testing
System testing covers testing of an application as a whole. All the modules such as back-end, front-end and database are tested all together.  
System testing can include both manual and automated cases.  

#### 2.1.4 Sanity testing
Sanity Testing is done to determine if a new software version is performing well enough to accept it for a major testing effort or not.  
Sanity testing can be run manually and in am exploratory way by the QA Engineer.  

#### 2.1.5 Smoke testing
Smoke testing is done by the QA Englineer. Smoke testing can include both manual and automated cases. 


#### 2.1.6 Regression testing
Regression testing should cover all the existing functionality and it is done by the QA Engineer and should be mainly automated but low percetage of manual cases is acceptable.  

#### 2.1.7 Acceptance testing
An acceptance test is performed by the client and verifies whether the end to end the flow of the system is as per the business requirements or not and if it is as per the needs of the end user. It can be automated as well as done manually.  

### Test cases that can be used in all of the outlined functional types of testing  can be found below:

**Scenario 1:** Setting the password  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app on a screen to set the password | 4 dots and numbers are displayed |
|2. Enter any password| Password is successfully entered and the next screen opens|
|3. Enter the same password again| "That's it" message is displayed|
||Password is set|

**Scenario 2:** Negative case on setting the password  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app on a screen to set the password | 4 dots and numbers are displayed |
|2. Enter any password| Password is successfully entered and the next screen opens|
|3. Enter another| Error message is displayed|
||Password is not set|

**Scenario 3:** Editing the password  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app on a screen to edit the password | 4 dots and numbers are displayed |
|2. Enter existing password| Password is successfully entered and the next screen opens|
|3. Enter a new password| Password is successfully entered and the next screen opens|
|4. Enter the same password again| "That's it" message is displayed|
||Password is changed|

**Scenario 4:** Negative case on editing the password  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app on a screen to edit the password | 4 dots and numbers are displayed |
|2. Enter password other than current| Error message is displayed and the next screen doesn't|
|3. Enter current password| Password is successfully entered and the next screen opens|
|4. Enter a new password| Password is successfully entered and the next screen opens|
|5. Enter a new password with one changed number| Error message is displayed|
||Password is not changed|


**Scenario 5:** Check adding expense  
**Business proirity:** High  
**Type:** To be Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the screen for adding an expense| zero sum is displayed|
|2. Click on the check mark in the bottom right corner of a screen| Expense is not added|
||Error "how much did you spend?" is displayed|
|3. Clik on 0, then on 99| Sum "99" is displayed, not "099"|
|4. CLick on "9" six times| Sum "99999" is displayed|
|5. Click on "Delete" button twice| Sum "999" is displayed|
|6. Click on "Delete" button three times| Sum "0" is displayed|
|7. Enter sum "123" |  Sum "123" is displayed|
|8. Click on any category icon| The same icon appears in the left part of a "sum" field|
|9. Click on another category icon| Category is changed|
|10. Click on the check mark in the bottom right corner of a screen|Expense is saved with the right sum and category|


**Scenario 6:** Check menu button  
**Business proirity:** High  
**Type:** To be Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the screen for adding an expense and click on the top left menu button| Password is asked |
|2. Click on the "return" button| Screen for adding an expense is displayed |
|3. Click on the top left menu button again and enter the wrong password| Report is not opened, access is denied|
|4. Enter first three numbers of a correct password and click on "Delete" button in the botton left corner | Third number is deleted|
|5. Enter the last two numbers of a correct password| Access granted, "Today" report opens|
|6.  Click on the top left <- button| Menu opens|


**Scenario 7:** Check reports functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Today" report| "Today" report is opened|
|2. Check the date| Correct date is displayed|
|3. Check the sum and count it manually| Correct sum is displayed|
|4. Count sum for every category| In the piechart sum for every category is displayed correctly|
|5. Click on piechart| Piechart is clickable, correct operations are opened|
|6. Swipe to Yesterday and check steps 2-5 for "yesterday" report| All the data is correct|
|7. Swipe to This week and check steps 2-5 for "This week" report| All the data is correct|
|8. Swipe to Last week and check steps 2-5 for "Last week" report| All the data is correct|
|9. Swipe to This month and check steps 2-5 for "This month" report| All the data is correct|
|10. Swipe to Last month and check steps 2-5 for "Last month" report| All the data is correct|
|11. Swipe to This year and check steps 2-5 for "This year" report| All the data is correct|
|12. Swipe to Last year and check steps 2-5 for "Last year" report| All the data is correct|
|13.  Click on the top left <- button| Menu opens|

**Scenario 8:** Check Custom view functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Custom view"| "Custom view" report is opened|
|2. Click on the Calendar |Calendar opens|
|3. Select any date from the following month| Date is applied and the sum is correct|
|4. Select any date from the another month| Date is applied and the sum is correct|
|5. Select any date from the another month and click on "OK"| Date is applied and the sum is correct|
|6.  Click on the top left <- button| Menu opens|

**Scenario 9:** Check Expense report functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Expense report"| "Expense report" report is opened|
|2. Click on the Calendar |Calendar opens|
|3. Select any date from the following month| Date is applied and the sum is correct|
|4. Select any date from the another month and click on "Cancel"| Date is not applied 
|5. Select any date from the another month and click on "OK"| Date is applied and the sum is correct|
|6.  Click on the top left <- button| Menu opens|

**Scenario 10:** Check Month View functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Month View"| "Month View" report is opened|
|2. Click on three lines button| List of categories opens|
|3. Click on "Got it"| "Month View" report is opened|
|4. Click on the top left menu button| Menu opens|

**Scenario 11:** Check Tags View functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Tags View"| "Tags View" report is opened|
||Piechart is displayed with correct sums|
|2. Click on "Histogram"| Histogram is displayed with correct sums|
|3.  Click on the top left <- button| Menu with categories opens |
|4. Select any category| Report for this category opens with the correct sums|

**Scenario 12:** Check List View functionality  
**Business proirity:** High  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for " List View"| " List View" report is opened|
|2. Count the total sum and chekc it|Total sum is displayed correctly|
|3. Check categories and sums|Sum for every category is displayed correctly|
|4. Click on "Search" and enter any category| Searching by the category works correctly|
|5. Click on the top left menu button| Menu with conditions opens|
|6. Check setting limits| Setting limits works correctly|
|7. Check setting "No limit" option| "No limit" can be successfully set|


**Scenario 13:** Check synchronizing to server  
**Business proirity:** High  
**Type:** To be Automated  
**Expected results:**  
1. Synchronizing only possible when the user is signed in
2. Synchronizing process completes correctly  

**Scenario 14:** Check singing in  
**Business proirity:** High    
**Type:** To be Automated  
**Expected results:** Every user can sing in throught settings


**Scenario 15:** Check singing out  
**Business proirity:** High    
**Type:** To be Automated  
**Expected results:** Every user can sing out throught settings

**Scenario 16:** Settings: Max expense limit monthly  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can switch on and off "Max expense limit monthly" successfully and the ammount is displayed correctly  

**Scenario 17:** Settings: Color remind  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can switch on and off "Color remind successfully and the sum and the color are displayed correctly  

**Scenario 18:** Settings: Account book Name  
**Business proirity:** Medium  
**Type:** To be Automated  
**Expected results:** User can successfully change account book name  

**Scenario 19:** Settings: Sort Tags  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can successfully sort tags  

**Scenario 20:** Settings: Show pictures in tags view account book  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can switch on and off "Show pictures in tags view account book"  

**Scenario 21:** Settings: Doughnut-shape pie chart  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can switch on and off "Doughnut-shape pie chart"    

**Scenario 22:** Settings: Version  
**Business proirity:** Low  
**Type:** To be Automated  
**Expected results:** User can check updates and run then if necessary  


### 2.2 Non-functional testing
Non-functional testing includes the following types of testing: 

#### 2.2.1 Performance Testing

**Scenario 23:** Check app's memory consumption  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** Memory consumption should not be higher that in requirements  

**Scenario 24:** Check app's power consumption  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** Power consumption should not be higher that in requirements

**Scenario 25:** Examine the operability of the application for long time work  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:** Under the normal load but during non-stop using of the application (till full battery dies) the app works well, there are mo errors and crashes  

#### 2.2.2 Load testing

**Scenario 26:** Checking the response time of the application to various types of requests  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  The application is working according to the requirements for the normal user load  

#### 2.2.3 Stress  testing

**Scenario 27:** Testing the working capacity of the application at loads exceeding the user's several times  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  The application is not crashing, correct errors are displayed to the user  

#### 2.2.4 Volume testing

**Scenario 28:** Check how app reacts to user with a lot of data  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:**  The application is not crashing, user can use the application normally or the user gets correct errors  

#### 2.2.5 Security testing

**Scenario 29:** Check that there is no data leak  
**Business proirity:** High    
**Type:** To be Automated  
**Expected results:** One user can't access data from another user

**Scenario 30:** Check password protection  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** If a user has set a password, it is impossible to access the app and data without enetering correct password  

#### 2.2.6 Compatibility testing & Backward Compatibility Testing

**Scenario 31:** Check basic application functions of a new version on all the supported devices  
**Business proirity:** High  
**Type:** To be utomated  
**Expected results:** New version of an app works well on all the supported devices and Android versions

#### 2.2.7 Installation & Launching Testing

**Scenario 32:** Check version in apple store and google play  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  The version on apple store and google play in the latest that was released  

**Scenario 33:** Check downloading the app from apple store and google play  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  App with the latest version can be successfully downloaded from apple store and google play  

**Scenario 34:** Check installation and uninstallation of the app  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  App can be successfully installed and uninstalled. Should be checked on every supported device.    


**Scenario 35:** Check installation of an app when there is a lack of memory on the device  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:** Installation doesn't crush, the error saying that there is not enough memory is displayed  


#### 2.2.8 Update Testing

**Scenario 36:** Check update process  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** All user data is saved after updates, new version installs correctly and is displayed correctly  

**Scenario 37:** Check new updates on old supported devices  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** New updates should work well on all the supported devices  

#### 2.2.9 Recovery testing

**Scenario 38:** Verify the effective recovery of the application after unforeseen crash scenarios  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** All users data is saved

#### 2.2.10 Usability testing

**Scenario 39:** Check reaction of an app to wrong values entered in fields by the user  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:** Wrong values entered in fields by the user are highlighted in red color in the same way on all the pages  

**Scenario 40:** Check fonts on every page  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:** Font is the same on every page  

**Scenario 41:** Check the way hard keys work in an app  
**Business proirity:** High  
**Type:** Manual  
**Expected result:** Hard keys such as "Home" and "Sound" are behaving while running an app in the same way as in any other iOS app  

#### 2.2.11 Localization testing 

**Scenario 42:** Check that different time zones are supported  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:** Check that changing time zones on the device doesn't change the date displayed for every income or expanse operation  

#### 2.2.12 Interruptions testing

**Scenario 43:** Check how app reacts to the incoming call  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  The application is not crashing, when user reopens app after the call it is launched from the place it was stopped without losing unsaved data  

**Scenario 44:** Check how app reacts to the incoming SMS/MMS or message from a messanger  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:**  The application is not crashing, when user reopens app after looking at the message it is launched from the place it was stopped without losing unsaved data  

**Scenario 45:** Check how app reacts to charging the device  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, charging the device does not effect the app in any way  

**Scenario 46:** Check how app reacts to discharging the device  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, discharging the device does not effect the app in any way  

**Scenario 47:** Check how app reacts to disconnecting and connecting the network/Wi-Fi  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:**  The application is not crashing, Wi-Fi, 3G and any other network connection does not effect the app in any way  

**Scenario 48:** Check how app reacts to disconnecting and connecting the SD-card  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, Wi-Fi, correct error is displayed for the user  

**Scenario 49:** Check how app reacts to the "Home" button  
**Business proirity:** High  
**Type:** Manual  
**Expected result:**  The application is not crashing, user can return to the application,  when user reopens app it is launched from the place it was stopped without losing unsaved data  

**Scenario 50:** Check how app reacts to switching between applications  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, user can return to the application,  when user reopens app it is launched from the place it was stopped without losing unsaved data  

#### 2.2.13 Interface testing 
All of the tests in this section should be run on all the supported devices and Android versions

**Scenario 51:** Check icons for expenses  
**Business proirity:** High  
**Type:** To be Automated  
**Expected results:** On all the screens icons are displayed correctly  

**Scenario 52:** Check "Today" report interface  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Today" report| Title is "Today"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 53:** Check "Yesterday" report interface  
**Business proirity:** Medium  
**Type:** To be automated

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Yesterday" report| Title is "Yesterday"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 54:** Check "This week" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "This week" report| Title is "This week"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 55:** Check "Last week" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Last week" report| Title is "Last week"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 56:** Check "This month" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "This month" report| Title is "This month"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 57:** Check "Last month" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Last month" report| Title is "Last month"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 58:** Check "This year" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "This year" report| Title is "This year"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|

**Scenario 59:** Check "Last year" report interface  
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Last year" report| Title is "Last year"|
||"CoCoin" is displayed|
||Piechart is displayed correctly|


**Scenario 60:** Check Custom view interface  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Custom view"| "You can choose the range to show record" is displayed|
||The title is correct: "CoCoin"|
||Calendar button is displayed|

**Scenario 61:** Check Expense report interface   
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Expense report"| "Expense report" is displayed|
||The title is correct: "CoCoin"|
||Calendar button is displayed|

**Scenario 62:** Check Month View interface   
**Business proirity:** Medium  
**Type:** To be automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Expense report"| "Month View" is displayed|
||The title is correct: "CoCoin"|
||No calendar button displayed|
||Piechart is displayed|
||The sum is displayed|

**Scenario 63:** Check Tags View interface   
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Tags View"| "Pie" screen is opened|
||Piechart is displayed correctly|
||"Histogram" screen button is displayed|
||Titile is correct: "CoCoin"|

**Scenario 64:** Check List View interface   
**Business proirity:** Medium  
**Type:** To be Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "List View"| "List View" screen is opened|
||Sum is diplayed at the top|
||List is displayed correctly|
||All the icons are displayed correctly|
||Search button is displayed|

**Scenario 65:** Check Help page interface   
**Business proirity:** Medium      
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Help page"| "Help page" screen is opened|
||Titile is "CoCoin"|
||"Multi view..." Line is displayed|
||"You can do the accounting..." block is displayed|

**Scenario 66:** Check About page interface   
**Business proirity:** Medium    
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "About page"| "About page" screen is opened|
||Title is "About"|
||"Nightonke" line is displayed|
||"github.com" line is displayed|
||"blog.csdn.net" line is displayed|
||"outlook.com" line is displayed|
||"daimajia.androidanimations" line is displayed|
||"material" line is displayed|  

**Scenario 67:** Check Feedback page interface   
**Business proirity:** Medium    
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the screen for "Feedback page"| "Feedback page" screen is opened|
||"Send" button is displayed|
||Title is "Feedback"|

**Scenario 68:** Check Settings Page interface  
**Business proirity:** High  
**Type:** To be automated  
**Expected results:** All the elements suggested in Documentation are displayed correctly  

**Scenario 69:** Check Add expense page interface  
**Business proirity:** High      
**Type:** To be automated  
**Expected results:** All the elements suggested in Documentation are displayed correctly  

#### 2.2.14 Concurrency Testing

**Scenario 70:** Determine the number of users who can simultaneously work with the application  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:**  The highest number of users that can simultaneously work with the application is the same or higher as told in the requirements  

#### 2.2.15 Back-end Testing

**Scenario 71:** Check that correct requests are sent and received when user is doing any actions in the app  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** Requests are correct acccording to provided documentation

**Scenario 72:** Check that correct data is sent and recieved via API    
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** Received and sent data is in correct format and is presented correctly according to Documentation and is not corrupted  

**Scenario 73:** Check API responses when there is a Back-end error  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** Understandable responses with correct errors are received when API has an error  

**Scenario 74:** Check how long it takes for data to load  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** It must not take too much time while loading data  

**Scenario 75:** Check number of calls from application  
**Business proirity:** Medium  
**Type:** To be automated  
**Expected result:** The number of calls from App under test to the server generated from app should be less   

**Scenario 76:** Check application behaviur during server down time  
**Business proirity:** High  
**Type:** To be automated  
**Expected result:** In case of server downtime data can be saved  in the native database or correct error is displayed for the user


## 3. Choosing a framework for Automation 

Appium, Selendroid, Robotium and Espresso were considered as possible frameworks for automation of testing CoCoin application. 
Here you can find a list of pros and cons of every listed framework. 

| Framework| Pros | Cons | 
| ------ | ------ | ------ |
|Appium |1. Supports continuous integration |1. No direct support for Android Alert Handling | 
| |2. Source code can be reused for both Android and iOS | 2. Doesn’t support image recognition |
| |3. Supports many programming languages | | 
| | 4. Appium is an open source product|  |
| | 5. Supports simulations such as rotation and clicking on “home” button | |
| | 7. Several tests can be run simultaneously | |
| | 8. Tests can be run on both emulators and real devices | |
| | | |
|Espresso | 1. Suitable for “white box” testing  | 1. Supports only UI testings|
| | 2. Supports both emulators and real devices| 2. Only for Android | 
| | | |
| Robotium| 1. Allows to take screenshots anywhere in the test | 1. Supports only Android|
| |2. Cases can be run on different devices | 2. Supports only one language: Java| 


Taking all the outlined pros and cons into account, both Appium and Espresso frameworks are selected to cover all the types and levels of testing except for performance testing. Together Appium and Espresso will cover all the “black box” and “white box” test cases.
CloudTest is suggested to be used for Performance test cases. 
