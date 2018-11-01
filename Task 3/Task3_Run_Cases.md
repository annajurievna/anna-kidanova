# Test plan for Monefy application

## 1. Introduction
A brief summary of the product being tested. Outline all the functions at a high level.
IOS!!!!
### 1.1 In Scope

### 1.2 Out of Scope

### 1.3 Terms
**Light user:** user that has just installed an app and has not yet done any activities inside the app such as creating new incomes and expenses, deleting and adding accounts, changing settings and etc., light user doesn't have a PRO version of an app.
**Heavy user:** user that has created several incomes and expenses, has done some activities with accounts, settings and etc., heavy user also ha a PRO version of an app.

## 2. Testing strategy

### 2.1 Functional testing

#### 2.1.1 Basic functionality

**Scenario 1:** Hints are displayed correctly
**Business proirity:** Low
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user | "Click to add expense" hint is displayed|
| 2. Open the right menu | "Add an account" and "Main currency can be changed here" hints are disaplyed|

**Scenario 2:** Right and left menus are opened and closed correctly
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu is opens|
| 2. Click on a space with piechart | Right menu closes|
| 3. Click three dots menu button in the top right corner | Right menu opens|
| 4. Click three dots menu button in the top right corner again | Right menu closes|
| 5. On a screen with piechart swipe to the right | Left menu opens|
| 6. Click on a space with piechart |Left menu closes|
| 7. Click menu button in the top left corner |Left menu opens|
| 8. Click menu button in the top left corner again |Left menu closes|

**Scenario 3:** Piechart on a new account works correctly
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user | Empty piechart is displayed|
||Income sum = 0 is displayed in the center of a piechart in green color|
||Expense sum = 0 is displayed in the center of a piechart in red color|
||Icons of all the default categories are displayed around the piechart and they are clickable|

**Scenario 4:** "Balance" tab on a new account works correctly
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user | Balance tab is displayed in the bottom of the screen|
||Balance is 0|
||Two three-line menu buttons are displayed from both sides from Balance tab and they are clickable|

**Scenario 5:** Transfer button on a new account works correctly
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user | Transfer button is displayed next to the right menu button|
||Icon of transfer button is the same as in mockups|
|2. CLick on a Transfer button |Transfer button is clickable|


**Scenario 6:** Income and expense buttons on a new account work correctly
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user| Green "+" and red "-" buttons are displayed in the bottom of a screen |
||"+" and "-" buttons are clickable|
|Click on "+" button |"+" button opens a form for income|
|Click on "-" button|"-" button opens a form for expense|

#### 2.1.2 Income and expense forms

**Scenario 7:** Creating a simple new income
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app and click on "+" button | Form to create an income opens|
| 2. Insert sum = 123456 | "123456" is displayed correctly in the field "sum"|
| 3. Delete all the numbers in the field "sum" using "Delete" button | Sum is set to zero|
| 4. Insert sum = 98765 and delete the last three numbers using "Delete" button | Numbers 7,6,5 are successfully deleted and "98" is displayed in the "sum" field|
|5. Click on the button that changes an account|List of accounts is displayed with an icon, name and currency|
|6. Choose another account|Account is chosen correctly, conforming icon and conforming currency are displayed on the left from the "sum" field|
|7. Click on "add note" field| Keyboard opens|
|8. Enter any text using numbers, letters and special symbols and click on "Done" on the keyboard| Text is correctly displayed in the "add note" field|
|9. Click on "add note" field again| Keyboard opens|
|10. Delete text using "delete" button on a keyboard and click on "Done" on the Keyboard| "Add note" field is empty and "Add note" text is displayed|
|11. Click on "Choose category" | List of categories and "+" button are opened"|
| | All the existing categories are displayed|
| | Icons for categories are displayed according to mockups|
|12. Click on "Salary" category| "Salary 98 added" message is displayed in the bottom of the screen|
||Income is added to piechart and the sum is displayed in the middle of a piechart|
||Income is added to the "Balance" tab and the sum and currency are displayed in green color|


**Scenario 8:** Creating a simple new expense
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app and click on "-" button | Form to create an expense opens|
| 2. Insert sum = 123456 | "123456" is displayed correctly in the field "sum"|
| 3. Delete all the numbers in the field "sum" using "Delete" button | Sum is set to zero|
| 4. Insert sum = 98765 and delete the last three numbers using "Delete" button | Numbers 7,6,5 are successfully deleted and "98" is displayed in the "sum" field|
|5. Click on the button that changes an account|List of accounts is displayed with an icon, name and currency|
|6. Choose another account|Account is chosen correctly, conforming icon and conforming currency are displayed on the left from the "sum" field|
|7. Click on "add note" field| Keyboard opens|
|8. Enter any text using numbers, letters and special symbols and click on "Done" on the keyboard| Text is correctly displayed in the "add note" field|
|9. Click on "add note" field again| Keyboard opens|
|10. Delete text using "delete" button on a keyboard and click on "Done" on the Keyboard| "Add note" field is empty and "Add note" text is displayed|
|11. Click on "Choose category" | List of categories and "+" button are opened"|
| | All the existing categories are displayed|
| | Icons for categories are displayed according to mockups|
|12. Click on "Bills" category| "Bills -98 added" message is displayed in the bottom of the screen|
||Expense is added to piechart and the sum is displayed in the middle of a piechart|
||A line connecting piechart with category "Bills" is displayed|
||Expense is added to the "Balance" tab and the sum and currency are displayed in red color|

**Scenario 9:** Creating new income or expense with a note
**Business proirity:** Middle
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
|1. Open the app and click on "+" button | Form to create an income opens|
|2. Enter any sum higher than zero and add a text with 100 symbols to the note| Text is successfully added, no crash and no error displayed|
|3. Click on "Choose category" and select any custom category| New income is added|
|4. Open "Balance" tab and click on the created income|Sum and note are displayed correctly|
|5. Open the app and click on "-" button | Form to create an expense opens|
|6. Enter any sum higher than zero | Sum is successfully entered|
|7. Paste any text to "Add note" field using long touch -> paste |Text is successfully pasted, no crash and no error displayed|
|8. Click on "Choose category" and select any custom category| New expense is added|
|9. Open "Balance" tab and click on the created expensee|Note is displayed correctly|

**Scenario 10:** Editing income or expense
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy user and click on "Balance" tab | Balnce tab with all the expenses and incomes opens|
|2. Select any income|Description opens|
|3. Click on the description of a selected income|"Edit income" form opens|
|4. Delete the sum via "Delete" button|Sum is set to zero|
|5. Enter a new sum|New sum is successfully entered and is displayed sorrectly in the "sum" field|
|6. Edit a note|Note can be successfully edited|
|7. Click on "Done" button in the left top corner of the screen|Changes are saved|
|8. Open a piechart | The sum of income changed in the piechart according to the edited sum |
|9. Open a "Balance" tab | Edited income has correct description according to changes|
|10. Select any expense|Description opens|
|11. Click on the description of a selected expense|"Edit expense" form opens|
|12. Click on "Choose the category" and change the category of an expense|"Record was edited" is displayed in the bottom of a screen|
||New icon according to new category is displayed|
|13. Click on "undo"|Category is switched to the previous|


**Scenario 11:** Deleting income or expense
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy user and click on "Balance" tab | Balnce tab with all the expenses and incomes opens|
|2. Select any income|Description opens|
|3. Click on the description of a selected income|"Edit income" form opens|
|4. Click on the "Delete" icon in the top right corner|"Record was deleted" is displayed in the bottom of a screen|
|5. Open a piechart | The sum of income has decreased by the sum of a deleted income |
|6. Open a "Balance" tab | Deleted income is no longer displayed|
|7. Select any expense|Description opens|
|8. Click on the description of a selected expense|"Edit expense" form opens|
|9. Click on the "Delete" icon in the top right corner|"Record was deleted" is displayed in the bottom of a screen|
|10. Open a piechart | The sum of expense has decreased by the sum of a deleted expense in total |
||The sum of expense has decreased by the sum of a deleted expense in the relevant category|
|11. Open a "Balance" tab | Deleted expense is no longer displayed|

**Scenario 12:** Checking boundary values in income/expense sum form
**Business proirity:** Medium
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app and click on "-" button | Form to create an expense opens|
| 2. Leave the value zero in the field "sum" and click on "Choose category"| Expense is not created and "sum" field is highlighted in red color|
| 3. Enter number "999999999" as a sum and save an expense| Expense is created successfully with sum "999999999"|
|5. Open screen with piechart |Sum is correctly displayed in piechart|
|6. Open "Balance" tab |Sum is correctly displayed in "Balance" tab|

**Scenario 13:** Calculator 
**Business proirity:** Medium
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app and click on "+" button | Form to create an income with calculator opens|
||Calculator is displayed accorsing to mockups|
| 2. Enter the sum using calculator, use all the operations | All the buttons of calculator work and all the operations work mathematically correctly|

**Scenario 14:** Canceling creating an income or an expense
**Business proirity:** Medium
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
|1. Open the app to the piechart screen and click on "+" button | Form to create an income opens|
|2. Enter any sum and any note| Sum and note are successfully added |
|3. Click on "Cancel" in the top left corner of a screen| Income is not created|
||Piechart is opened and it is not changed|
|4. Open "Balance" tab and click on the "-" button |Form to create an expense opens|
|5. Enter any sum and any note| Sum and note are successfully added |
|6. Click on "Cancel" in the top left corner of a screen| Expense is not created|
||"balance" tab is opened and it is not changed|
|7. Open "Balance" tab and click on the "-" button |Form to create an expense opens|
||Form is clean, fields from the previus form are not saved and displayed|

**Scenario 15:** Adding new category via income/expense form
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a light client to the piechart screen and click on "+" button | Form to create an income opens|
|2. Enter any sum and any note| Sum and note are successfully added |
|3. Click on "Choose category"| Existing categories are opened|
|4. Click on "+"| Form for creating a new category is opened|
||Icons are displayed according to mockups|
|5. Enter any name|Name can be successfully entered|
|6. Click on any icon|Sceen with suggestion to buy a PRO version is opened|
|7. Click on "Cancel" button|Previous screen with income form is opened|
||Name entered in step 5 is displayed in the "Name" field|
|8. Click on any icon again |Sceen with suggestion to buy a PRO version is opened|
|9. Click on "Restore"|"Monefy PRO has not been purchased yet" message is displayed|
|10. Click on "Buy"| Payment is proceeded|



**Scenario 7:** Purchasing PRO version via income/expense form
**Business proirity:** High
**Type:** Automated
Canseling check
Activation check

#### 2.1.3 Piechart

**Scenario 8:** Piechart functionality
**Business proirity:** High
**Type:** Automated
Кликаешь и открывается баланс


**Scenario 8:** Opening a form when clicking on category icon
**Business proirity:** High
**Type:** Automated
Открытие расхода при нажатии на иконку категории около пайчарта 

**Scenario 8:** Pecentage is counted correctly
**Business proirity:** High
**Type:** Automated
Открытие расхода при нажатии на иконку категории около пайчарта 

#### 2.1.3 Balance

**Scenario 2:** "Balance" tab on a clean account opens and closes correctly 
**Business proirity:** High
**Type:** Automated
| Steps | Expected results |
| ------ | ------ |
| 1. Open the app for the first time and click on "Balance" field | "Balance" tab opens and "There are no records for this period yet" message is displayed |
| 2. Click on "Balance" field | "Balance" tab closes |
| 3. Click on 3 lines button on the right from "Balance" field | "Balance" tab opens |
| 4. Click on 3 lines button on the right from "Balance" field | "Balance" tab closes |
| 5. Click on 3 lines button on the left from "Balance" field | "Balance" tab opens |
| 6. Click on 3 lines button on the left from "Balance" field | "Balance" tab closes |

**Scenario 8:** Functionality of "Balance" tab on a heavy user
**Business proirity:** High
**Type:** Automated
Раскрытие информации о доходе тли расходе 
Зеленая или красная штука

#### 2.1.3 Transfers

**Scenario 8:** Creating new transfer
**Business proirity:** High
**Type:** Automated

#### 2.1.3 Right menu

**Scenario 8:** Creating new account
**Business proirity:** High
**Type:** Automated
добавить новый(ВСЕ ПОЛЯ ПРОВЕРИТЬ), удалить имеющийся (проверить что он везде пропадает: в форме расхода/дохода, в переводах, в левом меню про смену аккаунта )

**Scenario 8:** Deleting an existing account
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Adding new category using the right menu
**Business proirity:** High
**Type:** Automated
добавление, редактирование, деактивировать, объединить, отмена, удалить 

**Scenario 7:** Currencies
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Unlocking Pro version under new accounts via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Restoring PRO version via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Switching on and off the "Carry on" function
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Changing language via right menu
**Business proirity:** High
**Type:** Automated
сообщение о перезагрузке), 

**Scenario 7:** Changing currency via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Changing time period settings via right menu
**Business proirity:** High
**Type:** Automated
first day of the month, first day of the week

**Scenario 7:** Adding passcode protection via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Leaving a review via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Exporting data to file via right menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Sinchronization
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Data backup
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Reading about the app via right menu
**Business proirity:** High
**Type:** Automated


#### 2.1.4 Left menu

**Scenario 7:** Changing accounts via left menu
**Business proirity:** High
**Type:** Automated

**Scenario 7:** Changing time period via left menu
**Business proirity:** High
**Type:** Automated



Network access error messages. Availability and synchronization of sound, vibration, and visual notifications. Requests are sent not just empty buttons
#### 2.1.1 Unit testing
Unit tests are very low level, close to the source of your application. They consist in testing individual methods and functions of the classes, components or modules used by your software. Unit tests are in general quite cheap to automate and can be run very quickly by a continuous integration server.
Definition:
Specify the minimum degree of comprehensiveness desired. Identify the techniques which will be used to judge the comprehensiveness of the testing effort (for example, determining which statements have been executed at least once). Specify any additional completion criteria (for example, error frequency). The techniques to be used to trace requirements should be specified.
Participants
List the names of individuals/departments who would be responsible for Unit Testing.
Methodology:
Describe how unit testing will be conducted. Who will write the test scripts for the unit testing, what would be the sequence of events of Unit Testing and how will the testing activity take 
#### 2.1.2 Integration testing
Integration tests verify that different modules or services used by your application work well together. For example, it can be testing the interaction with the database or making sure that microservices work together as expected. These types of tests are more expensive to run as they require multiple parts of the application to be up and running.
#### 2.1.3 System testing
#### 2.1.4 Sanity testing
#### 2.1.5 Smoke testing
Smoke tests are basic tests that check basic functionality of the application. They are meant to be quick to execute, and their goal is to give you the assurance that the major features of your system are working as expected.
Smoke tests can be useful right after a new build is made to decide whether or not you can run more expensive tests, or right after a deployment to make sure that they application is running properly in the newly deployed environment.
#### 2.1.6 Regression testing
#### 2.1.7 Acceptance testing
Acceptance tests are formal tests executed to verify if a system satisfies its business requirements. They require the entire application to be up and running and focus on replicating user behaviors. But they can also go further and measure the performance of the system and reject changes if certain goals are not met.
Definition:
The purpose of acceptance test is to confirm that the system is ready for operational use. During acceptance test, end-users (customers) of the system compare the system to its initial requirements.
### 2.2	Usability Testing
The purpose of usability testing is to ensure that the new components and features will function in a manner that is acceptable to the customer.  
Development will typically create a non-functioning prototype of the UI components to evaluate the proposed design.  Usability testing can be coordinated by testing, but actual testing must be performed by non-testers (as close to end-users as possible).  Testing will review the findings and provide the project team with its evaluation of the impact these changes will have on the testing process and to the project as a whole.
### 2.3	Performance Testing 
Performance tests check the behaviors of the system when it is under significant load. These tests are non-functional and can have the various form to understand the reliability, stability, and availability of the platform. For instance, it can be observing response times when executing a high number of requests, or seeing how the system behaves with a significant of data.
Performance tests are by their nature quite costly to implement and run, but they can help you understand if new changes are going to degrade your system.
#### 2.3.1 Load Testing
#### 2.3.2 Stress Testing 
#### 2.3.3 Interruptions testing
#### 2.3.4 Volume Testing
#### 2.3.5 Concurrency Testing
### 2.4	Installation & Launching Testing
### 2.5 Automated Regression Testing 
### 2.6  Update Testing
### 2.7 Compatibility & Backward Compatibility Testing
### 2.8 Security Testing
### 2.9 Stability Testing
### 2.10 Recovery Testing
### 2.11 Accessibility Testing
### 2.12 Localization Testing
### 2.13 Back-end Testing
Whenever an input or data is entered on front-end application, it stores in the database and the testing of such database is known as Database Testing or Backend testing. There are different databases like SQL Server, MySQL, and Oracle etc. Database testing involves testing of table structure, schema, stored procedure, data structure and so on.

In back-end testing GUI is not involved, testers are directly connected to the database with proper access and testers can easily verify data by running a few queries on the database. There can be issues identified like data loss, deadlock, data corruption etc during this back-end testing and these issues are critical to fixing before the system goes live into the production environment

6.1	Main Frame 

Specify both the necessary and desired properties of the test environment. The
 
specification should contain the physical characteristics of the facilities, including the hardware, the communications and system software, the mode of usage (for example, stand-alone), and any other software or supplies needed to support the test. Also specify the level of security which must be provided for the test facility, system software, and proprietary components such as software, data, and hardware.

Identify special test tools needed. Identify any other testing needs (for example, publications or office space). Identify the source of all needs which are not currently available to your group.
15.0 RISKS/ASSUMPTIONS

Identify the high-risk assumptions of the test plan. Specify contingency plans for each (for example, delay in delivery of test items might require increased night shift scheduling to meet the delivery date).


## 4. Tools

List the Automation tools you are going to use. List also the Bug tracking tool here.





  - Import a HTML file and watch it magically convert to Markdown
  - Drag and drop images (requires your Dropbox account be linked)


You can also:
  - Import and save files from GitHub, Dropbox, Google Drive and One Drive
  - Drag and drop markdown and HTML files into Dillinger
  - Export documents as Markdown, HTML and PDF

Markdown is a lightweight markup language based on the formatting conventions that people naturally use in email.  As [John Gruber] writes on the [Markdown site][df1]

> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

This text you see here is *actually* written in Markdown! To get a feel for Markdown's syntax, type some text into the left window and watch the results in the right.

### Tech

Dillinger uses a number of open source projects to work properly:

* [AngularJS] - HTML enhanced for web apps!
* [Ace Editor] - awesome web-based text editor
* [markdown-it] - Markdown parser done right. Fast and easy to extend.
* [Twitter Bootstrap] - great UI boilerplate for modern web apps
* [node.js] - evented I/O for the backend
* [Express] - fast node.js network app framework [@tjholowaychuk]
* [Gulp] - the streaming build system
* [Breakdance](http://breakdance.io) - HTML to Markdown converter
* [jQuery] - duh

And of course Dillinger itself is open source with a [public repository][dill]
 on GitHub.

### Installation

Dillinger requires [Node.js](https://nodejs.org/) v4+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ cd dillinger
$ npm install -d
$ node app
```

For production environments...

```sh
$ npm install --production
$ NODE_ENV=production node app
```

### Plugins

Dillinger is currently extended with the following plugins. Instructions on how to use them in your own application are linked below.

| Plugin | README |
| ------ | ------ |
| Dropbox | [plugins/dropbox/README.md][PlDb] |
| Github | [plugins/github/README.md][PlGh] |
| Google Drive | [plugins/googledrive/README.md][PlGd] |
| OneDrive | [plugins/onedrive/README.md][PlOd] |
| Medium | [plugins/medium/README.md][PlMe] |
| Google Analytics | [plugins/googleanalytics/README.md][PlGa] |


### Development

Want to contribute? Great!

Dillinger uses Gulp + Webpack for fast developing.
Make a change in your file and instantanously see your updates!

Open your favorite Terminal and run these commands.

First Tab:
```sh
$ node app
```

Second Tab:
```sh
$ gulp watch
```

(optional) Third:
```sh
$ karma test
```
#### Building for source
For production release:
```sh
$ gulp build --prod
```
Generating pre-built zip archives for distribution:
```sh
$ gulp build dist --prod
```
### Docker
Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the Dockerfile if necessary. When ready, simply use the Dockerfile to build the image.

```sh
cd dillinger
docker build -t joemccann/dillinger:${package.json.version} .
```
This will create the dillinger image and pull in the necessary dependencies. Be sure to swap out `${package.json.version}` with the actual version of Dillinger.

Once done, run the Docker image and map the port to whatever you wish on your host. In this example, we simply map port 8000 of the host to port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart="always" <youruser>/dillinger:${package.json.version}
```

Verify the deployment by navigating to your server address in your preferred browser.

```sh
127.0.0.1:8000
```

#### Kubernetes + Google Cloud

See [KUBERNETES.md](https://github.com/joemccann/dillinger/blob/master/KUBERNETES.md)


### Todos

 - Write MORE Tests
 - Add Night Mode

License
----

MIT


**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
