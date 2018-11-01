# Test plan for Monefy application

## 1. Introduction
This is a test plan for Monefy application for iOS devices. Monefy application is created for money management. It has a free version with several features available and a PRO version that includes all the functionality.

### 1.1 The Scope
The scope includes the following testing types on iOS devices:
- Functional testing
- Usability Testing
- Performance Testing 
- Load Testing
- Stress Testing 
- Interruptions testing
- Volume Testing
- Concurrency Testing
- Installation & Launching Testing
- Update Testing
- Compatibility & Backward Compatibility Testing
- Security Testing
- Stability Testing
- Recovery Testing
- Accessibility Testing
- Localization Testing

### 1.2 Terms
**Light user:** user that has just installed an app and has not yet done any activities inside the app such as creating new incomes and expenses, deleting and adding accounts, changing settings and etc., light user doesn't have a PRO version of an app.  
**Heavy user:** user that has created several incomes and expenses, has done some activities with accounts, settings and etc., heavy user also ha a PRO version of an app.

## 2. Testing strategy

### 2.1 Functional testing
In this section you can find test cases that do functional checks. All functionality test cases are seperated to different sections that you can find below:

#### 2.1.1 Basic functionality

**Scenario 1:** Hints are displayed correctly  
**Business proirity:** Low  
**Type:** Automated  

| Steps  | Expected results  |
| ------------- | ------------- |
| 1.Open the app under a light user  | "Click to add expense" hint is displayed  |
| 2.Open the right menu  | "Add an account" and "Main currency can be changed here" hints are disaplyed  |

**Scenario 2:** Right and left menus are opened and closed correctly  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
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

**Scenario 15:** Adding new category under a light client via income/expense form  
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
|10. Click on "Cancel" button twice| User is returned to piechart|

**Scenario 16:** Adding new category under a heavy client via income/expense form  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy client to the piechart screen and click on "+" button | Form to create an income opens|
|2. Enter any sum and any note| Sum and note are successfully added |
|3. Click on "Choose category"| Existing categories are opened|
|4. Click on "+"| Form for creating a new category is opened|
||Icons are displayed according to mockups|
|5. Enter any name|Name can be successfully entered|
|6. Click on any icon|Icon is successfully chosen|
|7. Click on "Done" button|Income is saved|
|8. Open piechart| New category is displayed|
||Sum for a new category is displayed correctly|
|9. Open "Balance" tab|Created income is displayed with correct icon and description|

**Scenario 17:** Purchasing PRO version via income/expense form  
**Business proirity:** High  
**Type:** Manual  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a light client to the piechart screen and click on "+" button | Form to create an income opens|
|2. Click on "Choose category"| Existing categories are opened|
|3. Click on any icon|Sceen with suggestion to buy a PRO version is opened|
|4. Click on "Buy"| Payment is proceeded|
||PRO version is activated|

#### 2.1.3 Piechart

**Scenario 18:** Opening a form when clicking on category icon  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy client | Piechart displayed on a screen|
|2. Click on any category| Form for creating expense is opened|
|3. Repeat step 2 for every default and all the custom categories|Form for creating expense is opened|
|4. Click on "Cancel" on a form|User is returned to piechart|

**Scenario 19:** Percentage on a piechart is counted correctly  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy client | Piechart displayed on a screen|
|2. Calculate percentage for any category manually and compare it to the percentage displayed in thee piechart| Percentage is displayed correctly|


**Scenario 20:** Opening a "Balance" tab when clicking on a piechart sector  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy client | Piechart displayed on a screen|
|2. Click on any sector in the piechart| "Balance" tab is opened|
||Operations for selected category are displayed, other operations are hidden|
|3. Check step 2 for every default and all the custom expense categories|"Balance" tab with all the operations in the selcted category is opened|

**Scenario 21:** Check the sum displayed in the piechart  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
|1. Open the app under a heavy client | Piechart displayed on a screen|
|2. Calculate total income amount manualy and compare the result to the number dispalyed in the piechart| Correct total income amount is displayed in the piechart|
|3. Calculate total expanse amount manualy and compare the result to the number dispalyed in the piechart| Correct total expanse amount is displayed in the piechart|

#### 2.1.4 Balance

**Scenario 22:** "Balance" tab under a light client opens and closes correctly  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light client and click on "Balance" field | "Balance" tab opens and "There are no records for this period yet" message is displayed |
| 2. Click on "Balance" field | "Balance" tab closes |
| 3. Click on 3 lines button on the right from "Balance" field | "Balance" tab opens |
| 4. Click on 3 lines button on the right from "Balance" field | "Balance" tab closes |
| 5. Click on 3 lines button on the left from "Balance" field | "Balance" tab opens |
| 6. Click on 3 lines button on the left from "Balance" field | "Balance" tab closes |

**Scenario 23:** Functionality of "Balance" tab on a heavy user  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy client and click on "Balance" field | "Balance" tab opens |
||Operations are merged by the category|
||Total amount for every category is displayed|
||Incomes are displayed in green color|
||Expenses are displayed in red color|
||Bubble with number of operations under every category is displayed correctly|
|2. Add income operations so that the total amount of income is higher than total amount of expenses| "Balance" tab is colored in green and sum is displayed without '-' symbol|
|3. Add expanse operations so that the total amount of expenses is higher than total amount of incomes| "Balance" tab is colored in red and sum is displayed with '-' symbol|


#### 2.1.5 Transfers

**Scenario 24:** Creating and cancelling a new transfer  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and click on Transfer button| "New transfer" form is displayed|
| 2. Click on currency| Currency is not clickable|
|3. Leave the sum with value = zero and click on "Save"|Sum is highlighed with red color and transfer is not saved|
|4. Eneter sum "999999999"| Sum "999999999" is successfully entered|
|5. Add a note using numbers, letters and special symbols|Note is successfully entered|
|6. Click on a selector for account| A list of accounts is opened|
||Any default of custom account can be chosen|
|7. Select the same accounts in both selectors and click on the "Save" button in the bottom of the screen|Both selectors are highlighted in red color and transfer is not saved|
|8. Choose different accounts and click on "Cancel" button|Piechart openes and transfer is not saved|
|9. Click on Transfer button|Previously filled fields are clear, no data is saved from the previous form|
|10. Enter sum, note and accounts again and click on "Save"| "Transfer is added" message is displayed|
||"Undo" button is displayed|
|11. Click on "Undo"|Transfer is not saved|
|12. Click on Transfer button again and enter sum, note and accounts again and click on "Save"|"Transfer is added" message is displayed|
||Transfer is saved|

#### 2.1.6 Right menu

**Scenario 25:** Opening and closing sections of the right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
||Categories are devided to incomes and expenses|
||"+" button is displayed|
|3. Click on the "Categories"|List of categories closes|
|4. Click on the "Accounts"|List of accounts opens in the right menu|
||Transfer button is displayed|
||"+" button is displayed|
|5. Click on the "Accounts"|List of accounts closes|
|6. Click on the "Currencies"|Suggestion to buy PRO version opens|
|7. Click on the "Cancel"|Suggestion to buy PRO version closes and right menu is displayed|
|8. Click on the "Settings"|List of settings opens in the right menu|
|9. Click on the "Settings"|List of settings closes|

**Scenario 26:** Creating new account under a light user  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Accounts"|List of accounts opens in the right menu|
|3. Click on "+" button| "New account" form opens|
|4. Click on "Add"|Name field is highlighted in red and account is not added|
|5. Select a new currency|Suggestion to buy a PRO version opens|
|6. Click on "Cancel"|Currency was not changed|
|7. Click on "Exchange rate"| Suggestion to buy a PRO version opens|
|8. Click on "Cancel"|Exchage rates are not displayed|
|9. Select any icon|All icons are displayed correctly and can be selected|
|10. Select any date| Any date can be successfully selected|
|11. Leave the initial account balance to zero and click on "Add"| "New account was added" message is displayed|
||"Undo" button is displayed|
|12. Click on "Undo" button|Account is deleted and not disaplyed in income/expense forms, in the left menu, in transfer form, in the list of accounts in the right menu|
|13. Click on "Add" again and fill all the fields and insert initial account balance higher than zero and click on "Cancel"|Account is not saved and not disaplyed in income/expense forms, in the left menu, in transfer form, in the list of accounts in the right menu|
|14. Click on "Add" again and fill all the fields and insert initial account balance higher than zero and click on "Add"|Account is saved and is disaplyed in income/expense forms, in the left menu, in transfer form, in the list of accounts in the right menu|

**Scenario 27:** Creating new account under a heavy user  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the left | Right menu opens|
|2. Click on the "Accounts"|List of accounts opens in the right menu|
||Transfer button is displayed|
||"+" button is displayed|
|3. Click on "+" button| "New account" form opens|
|4. Click on "Add"|Name field is highlighted in red and account is not added|
|5. Select a new currency|Any currency can be successfully selected|
|6. Click on "Exchange rate"| Exchage rates are displayed|
|7. Select any icon|All icons are displayed correctly and can be selected|
|8. Select any date| Any date can be successfully selected|
|9. Insert the initial account balance | Any number from zero up to 999999999 can be inserted|
|10. Click on "Add" button|Account is saved and is disaplyed in income/expense forms, in the left menu, in transfer form, in the list of accounts in the right menu|

**Scenario 28:** Deleting an existing account  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the left | Right menu opens|
|2. Click on the "Accounts"|List of accounts opens in the right menu|
|3. Click on any account| "Edit account" form opens|
|4. Edit all the fields and click on "Cancel"|Account is not edited|
|5. Click on any account| "Edit account" form opens|
|6. Edit all the fields and click on "Done"|Account is edited|

**Scenario 29:** Adding new category under a light user using the right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. CLick on the "+" button for expenses|Suggestion to buy PRO version is opened|
|4. Click on "Cancel"|List of categories is opened|
|5. CLick on the "+" button for incomes|Suggestion to buy PRO version is opened|
|6. Click on "Cancel"|List of categories is opened|

**Scenario 30:** Adding new category under a heavy user using the right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. CLick on the "+" button for expenses|New category can be added and is displayed in the list of categories, in piechart and in expenses form|
|4. CLick on the "+" button for incomes|New category can be added and is displayed in the list of categories and in the income form|

**Scenario 30:** Disabling and enabling categories  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. Click on any existing category|"Edit categories" opens|
|4. Click on three dots menu button in the top right corner and select "Disable"| "Category was edited" message is displayed and can not be used in forms|
|5. Open the list of Categories| Disabled category is displayed in gray color|
|6. Click on the category again and enable it|"Category was edited" message is displayed and ca be used in forms|
|7. Open the list of Categories| Enabled category is displayed in white color|
|8. Click on the category again and disable it|"Category was edited" message is displayed and ca be used in forms|
||"Undo" button is displayed|
|9. Click on "Undo"|Category is not edited|

**Scenario 31:** Merging categories  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. Click on any existing category|"Edit categories" opens|
|4. Click on three dots menu button in the top right corner and select "Merge"| List of categories to merge with is displayed|
|5. Select any category to merge with|"Category was edited" message is displayed and merged category is lo longer listed in the list of categories in forms|
|6. Merge another category| "Category was edited" message is displayed|
||"Undo" button is displayed|
|7. Click on "Undo"|Category is not merged|

**Scenario 32:** Editing existing categories under light user  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. Click on any existing cKeyboard openes|
|4. Delete the name and click on "Done"|Name is highlighed in the red color and category is not edited|
|5. Enter a valid name|New name is successfully entered|
|6. Change the icon|New icon is selected|
|7. Click on "Done"|Suggestion to buy PRO version id siplayed|

**Scenario 32:** Editing existing categories under heavy user  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menuopens|
|2. Click on the "Categories"|List of categories opens in the right menu|
|3. Click on any existing cKeyboard openes|
|4. Delete the name and click on "Done"|Name is highlighed in the red color and category is not edited|
|5. Enter a valid name|New name is successfully entered|
|6. Change the icon|New icon is selected|
|7. Click on "Done"|Category is modified successfully and is displayed correctly in the list of categories, in income and expense forms and in the piechart|

**Scenario 33:** Currencies under a heavy account  
**Business proirity:** Medium    
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the left | Right menu opens|
|2. Click on the "Currencies"|List of currencies opens in the right menu|
||New currencies can be added|

**Scenario 34:** Unlocking Pro version under new accounts via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Unlock Monefy"|Suggestion to upgrade to PRO version opens|
|3. Click on "Cancel"| Settings are opened|
|4. Click on "Unlock Monefy" again|Suggestion to upgrade to PRO version opens|
|5. Click on Buy|Payment and proceeded|
||PRO version is activated|


**Scenario 35:** Restoring PRO version via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Unlock Monefy"|Suggestion to upgrade to PRO version opens|
|3. Click on Restore|PRO version is activated|

**Scenario 36:** Switching on and off the "Carry on" function   
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Carry on"|"Carry on" version is switched on and is displayed with a mark in settings menu|
|3. Click on "Carry on" again|"Carry on" version is switched off and is displayed without a mark in settings menu|


**Scenario 37:** Changing language via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Language"|List of supported languages opens|
|3. Choose any language|"You should restart the application..." message is displayed|
|4. Restart the application|Language is successfully changed|
|5. Repeat steps 2-4 for every supported language|Each supported language is successfully changed|

**Scenario 38:** Changing currency via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Currency"|List of supported currencies opens|
|3. Choose any currency|"Base currency has been changed" message is displayed|
|4. Repeat steps 2-3 for every supported currency|Each supported currency is successfully applied|

**Scenario 39:** Changing time period settings via right menu  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "first day of the month"|List of dates 1-31 opens|
|3. Choose any date|First day of the month is changed successfully|
|4. Repeat steps 2-3 for every day from 1-31|Each day is successfully applied|
|5. Click on "Settings" and then on "first day of the week"|List of days of the week opens|
|6. Choose any day|First day of the week is changed successfully|
|7. Repeat steps 2-3 for every day of the week|Each day is successfully applied|


**Scenario 40:** Adding passcode protection via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Passcode protection"|Suggestion to upgrade to PRO version opens|
|3. Click on "Cancel"| Settings are opened|
|4. Click on "Passcode protection" again|Suggestion to upgrade to PRO version opens|
|5. Click on Buy|Payment and proceeded|
||PRO version is activated|
|6. Click on "Settings" and then on "Passcode protection"|Passcode can be set successfully|

**Scenario 41:** Leaving a review via right menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Review application"|Review form in apple store or google play opens|


**Scenario 42:** Exporting data to file via right menu  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Export to file"|Form to export to a file opens|
|3. Export to a file| Export is done successfully|

**Scenario 43:** Sinchronization  
**Business proirity:** Low  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Dropbox sync"|Suggestion to upgrade to PRO version opens|
|3. Click on "Cancel"| Settings are opened|
|4. Click on "Dropbox sync" again|Suggestion to upgrade to PRO version opens|
|5. Click on Buy|Payment and proceeded|
||PRO version is activated|
|6. Click on "Settings" and then on "Dropbox sync"|Dropbox sync can be done successfully|

**Scenario 44:** Data backup  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "Create data backup"|Backup is successfully created|
|3. Click on "Restore data"| List of existing backups opens|
|4. Select any backup|Warning message is displayed|
|5. Click "yes"|Data is restored to the selected backup|
|6. Click on "Clear data"|Warning message is displayed|
|7. Click on "yes"|All the data is cleared|

**Scenario 45:** Reading about the app via right menu  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a light user and swipe to the left | Right menu opens|
|2. Click on "Settings" and then on "About Monefy"|"About Monefy" window opens|
|3. Enable Google analytics| Google analytics is enabled successfully|
|4. Disable Google analytics| Google analytics is disabled successfully|
|5. Click on "OK"| "About Monefy" window closes|


#### 2.1.7 Left menu

**Scenario 46:** Changing accounts via left menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the right | Left menu opens|
|2. Click on "All accounts"| List of existing accounts appears|
|3. Select any account| Piechart changes accroding to a selected account|
|4. Repeat steps 2-3 on all the default and custom accounts| Piechart changes accroding to a selected account|

**Scenario 47:** Changing time period via left menu  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Open the app under a heavy user and swipe to the right | Left menu opens|
|2. Select "Day"|Piechart changes accroding to the chosen day|
|3. Select "Week"|Piechart changes accroding to the chosen week|
|4. Select "Month"|Piechart changes accroding to the chosen month|
|5. Select "Year"|Piechart changes accroding to the chosen year|
|6. Select "All"|Piechart displayes all operations|
|7. Select "Choose date" and choose any date|Piechart changes accroding to the chosen day|

### 2.2	Usability Testing

**Scenario 48:** Check icons of categories on every page of an app  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:** icons of categories are displayed on every page the same way as in mockups provided by the designer  

**Scenario 49:** Check reaction of an app to wrong valuesentered in fields by the user  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:** Wrong values entered in fields by the user are highlighted in red color in the same way on all the pages  

**Scenario 50:** Check fonts on every page  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:** Font is the same on every page  

**Scenario 51:** Check the way hard keys work in an app  
**Business proirity:** High  
**Type:** Manual  
**Expected result:** Hard keys such as "Home" and "Sound" are behaving while running an app in the same way as in any other iOS app  

**Scenario 52:** Check layout on all the supported screen resolutions and both orientations (portrait and landscape)  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Layout should be the same as in mockups  

### 2.3	Performance Testing 

**Scenario 53:** Check app's memory consumption  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Memory consumption should not be higher that in requirements  

**Scenario 54:** Check app's power consumption  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Power consumption should not be higher that in requirements  

#### 2.3.1 Load Testing

**Scenario 55:** Checking the response time of the application to various types of requests  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  The application is working according to the requirements for the normal user load  

#### 2.3.2 Stress Testing 

**Scenario 56:** Testing the working capacity of the application at loads exceeding the user's several times  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  The application is not crashing, correct errors are displayed to the user  

#### 2.3.3 Interruptions testing

**Scenario 57:** Check how app reacts to the incoming call  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  The application is not crashing, when user reopens app after the call it is launched from the place it was stopped without losing unsaved data  

**Scenario 58:** Check how app reacts to the incoming SMS/MMS or message from a messanger  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  The application is not crashing, when user reopens app after looking at the message it is launched from the place it was stopped without losing unsaved data  

**Scenario 59:** Check how app reacts to charging the device  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, charging the device does not effect the app in any way  

**Scenario 59:** Check how app reacts to discharging the device  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, discharging the device does not effect the app in any way  

**Scenario 60:** Check how app reacts to disconnecting and connecting the network/Wi-Fi  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:**  The application is not crashing, Wi-Fi, 3G and any other network connection does not effect the app in any way  

**Scenario 61:** Check how app reacts to disconnecting and connecting the SD-card  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, Wi-Fi, correct error is displayed for the user  

**Scenario 62:** Check how app reacts to the "Home" button  
**Business proirity:** High  
**Type:** Manual  
**Expected result:**  The application is not crashing, user can return to the application,  when user reopens app it is launched from the place it was stopped without losing unsaved data  

**Scenario 63:** Check how app reacts to switching between applications  
**Business proirity:** Medium  
**Type:** Manual  
**Expected result:**  The application is not crashing, user can return to the application,  when user reopens app it is launched from the place it was stopped without losing unsaved data  

#### 2.3.4 Volume Testing

**Scenario 64:** Check how app reacts to user with a lot of data  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:**  The application is not crashing, user can use the application normally or the user gets correct errors  

#### 2.3.5 Concurrency Testing

**Scenario 65:** Determine the number of users who can simultaneously work with the application  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:**  The highest number of users that can simultaneously work with the application is the same or higher as told in the requirements  

### 2.4	Installation & Launching Testing

**Scenario 66:** Check version in apple store and google play  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  The version on apple store and google play in the latest that was released  

**Scenario 67:** Check downloading the app from apple store and google play  
**Business proirity:** High  
**Type:** Automated  
**Expected result:**  App with the latest version can be successfully downloaded from apple store and google play  

**Scenario 68:** Check installation and uninstallation of the app  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Download the app and start the intallation process | Installation of the application should take place without significant errors|
||Installation takes less or the same time as said in requirements|
|2. Switch off the internet during installation and then switch it back on|Installation is resumed correctly|
|3. Wait till the app is installed| The installed appl does not interfere with the normal operation of other apps and does not consume their memory|
||App icon is displayed correctly|
||App name is displayed correctly|
||App is displayed in the list of applications installed on the device|
|4. Uninstall the app | Uninstallation is successfull|
||App is no longer displayed in the list of applications installed on the device|
||All the files that the app had are deleted from the device|

**Scenario 69:** Check installation of an app when there is a lack of memory on the device  
**Business proirity:** Medium  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Download the app and start the intallation process on the device that doesn't have any more memory left| Installation doesn't crush, the error saying that there is not enough memory is displayed|

### 2.5  Update Testing

**Scenario 70:** Check notification about the update  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** every user gets update notification  

**Scenario 71:** Check successfull update process  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** All user data is saved after updates, new version installs correctly and is displayed correctly  

**Scenario 72:** Check unsuccessfull update process (Instull corrupted version)  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** If a new version is corrupted, then the app is backed up to the previous version successfully, all user data is saved  

**Scenario 73:** Check new updates on old supported devices  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** New updates should work well on all the supported devices  

### 2.6 Compatibility & Backward Compatibility Testing

**Scenario 74:** Check basic application functions and layouts on all the supported devices  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Check different device types: smartphone, tablet, etc | Installation, basic functions work well and layouts are the same as in mockups|
| 2. Check different device configurations: RAM, processor type, screen resolution, battery capacity, etc.| Installation, basic functions work well and layouts are the same as in mockups|
| 3 Check different different network configurations: GSM, TDMA and standards 2G, 3G, 4G| Installation, basic functions work well and layouts are the same as in mockups|

### 2.7 Security Testing

**Scenario 75:** Check password protection  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** If a user has set a password, it is impossible to access the app and data without enetering correct password  

### 2.8 Stability Testing

**Scenario 76:** Examine the operability of the application for long time work  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:** Under the normal load but during non-stop using of the application (till full battery dies) the app works well, there are mo errors and crashes  


### 2.9 Recovery Testing

**Scenario 77:** Verify the effective recovery of the application after unforeseen crash scenarios  
**Business proirity:** High  
**Type:** Automated  

| Steps | Expected results |
| ------ | ------ |
| 1. Start an app on a device with very low battery and use an app untill the buttery dies | App doesn't crush|
|App is correctly recovered when the device is charged|
| 2. Overload the device way over its limits so that an app crashes |App is correctly recovered after the crush|
||All users data is saved|

### 2.10 Accessibility Testing

**Scenario 78:** Check accessibility for people with poor sight  
**Business proirity:** Medium  
**Type:** Manual  

| Steps | Expected results |
| ------ | ------ |
| 1. Check the text on every page of the app |Text can be easily recognized|
| | Correct operation of the Zoom-in and Zoom-out system where it is implemented|

### 2.11 Localization Testing

**Scenario 79:** Check that translation to all the supported languages is correct  
**Business proirity:** Medium  
**Type:** Manual (done by a linguist)  
**Expected result:** Translation to every supported language is grammatically correct and is in accordance with the theme of the application  

**Scenario 80:** Check that different time zones are supported  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:** Check that changing time zones on the device doesn't change the date displayed for every income or expanse operation  

### 2.12 Back-end Testing

**Scenario 81:** Check that correct requests are sent and received when user is doing any actions in the app  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Requests are correct acccording to provided documentation

**Scenario 82:** Check that correct data is sent and recieved via API    
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Received and sent data is in correct format and is presented correctly according to Documentation and is not corrupted  

**Scenario 83:** Check API responses when there is a Back-end error 
**Business proirity:** High  
**Type:** Automated  
**Expected result:** Understandable responses with correct errors are received when API has an error  

**Scenario 84:** Check how long it takes for data to load  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** It must not take too much time while loading data  

**Scenario 85:** Check number of calls from application  
**Business proirity:** Medium  
**Type:** Automated  
**Expected result:** The number of calls from App under test to the server generated from app should be less   

**Scenario 86:** Check application behaviur during server down time  
**Business proirity:** High  
**Type:** Automated  
**Expected result:** In case of server downtime data can be saved  in the native database or correct error is displayed for the user

## 3. Automation Tools

Appium and Experitest can be used for automation of test cases.



