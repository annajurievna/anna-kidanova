# How to prepare your machine for running automated test cases
Here you can find an instruction on how to prepare your computer to run automated test cases. The steps presented in this section are the same that I did on my macbook that had nothing installed on it in the begining. 

## 1. Install Android SDK
Android SDK is a part of Android Studio, which can be downloaded from here: https://developer.android.com/studio/ 
Run .dmg file to install Android Studio on your mac

## 2. Install JDK
JDK can be downloaded from here: https://www.oracle.com/technetwork/java/javase/downlo..
Run .dmg file to install JDK on your mac

## 3. Install Eclipse
Eclipse can be downloaded from here:
http://www.eclipse.org/downloads/
## 4. Prepare Eclipse prodect for running test cases
### 4.1 Install TestNg for Eclipse
1. Open Eclipse and create a new project 
2. Then click on Help -> Install new software
3. In "work with" field select "http://beust.com/eclipse/6.14.0"
4. Click on "Add"
5. Name: TestNG, Location: http://beust.com/eclipse/6.14.0
6. Click on Add
7. Select TestNG in the presented table
8. Click on Finish

### 4.2 Install Selenium Server JAR an java_client JAR
Download Selenium Server JAR: https://www.seleniumhq.org/download/  
Download java_client JAR: https://mvnrepository.com/artifact/io.appium/java-cli..

### 4.3 Update the APIs
1. Open Eclipse
2. Click on Window in the Eclipse Menu
3. Select Android SDK manager
4. Download necessary APIs and Android versions. I was using Android 4.4.2 and API 19 in my test cases.

## 5. Switch java to 1.8 version on your computer
It is neccessary to switch to java 1.8 version to work with UIAutomatorViewer
1. Open terminal and enter
```sh
$ java -version
```
2. If version is 1.8 then go to the next step number 6. If the version is wrong then eneter 
```sh
$ vi ~/.bash_profile
```
3. Add a line "export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)"  
4. Save changes using ":wq" command  
5. Enter in the terminal:  
```sh
$ source ~/.bash_profile
$ java -version
```
6. Version should be 1.8  

## 6. Install Node.js
Download Node.js and install from here: https://nodejs.org/en/download/

## 7. Set the ANDROID_HOME path and JAVA_HOME path
1. Open terminal and enter 
```sh
$ vi ~/.bash_profile
```
2. Add two lines:
```sh
export ANDROID_HOME=<PATH_TO_SDK> 
export PATH=$PATH:$JAVA_HOME/bin:$ANDROID_HOME:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools
```
<PATH_TO_SDK> - is your path to sdk on your computer, mine is "/Users/annakidanova/Library/Android/sdk"  
3. Save changes using ":wq" command  
4. Enter in the terminal:  
```sh
$ source ~/.bash_profile
```
## 8. Install Appium Desktopy
Download and install from here: https://github.com/appium/appium-desktop/releases/tag/1.8.0

## 9. Download .apk file
I have downloaded CoCoin.apk from attechments in a letter from a Recruiter

## 10. Preparing Android Virtual Device for Automation
1. Open Eclipse and click on 'Android Virtual Device Manager' icon  
2. Click on 'Create AVD' button, which will launch the create new AVD screen  
3. I have selected the following:  

| Field | Value |
| ------ | ------ |
|AVD Name| Nexus_5_API_19|
|Device| Nexus 5|
|Target| Android 4.4 - API Level 19|
|CBU/ABI| Intel Atom (x86) |
|Skin| None |  

4. Click on 'OK' button  
5. Created AVD gets added into 'Android Virtual Device' tab  
6. Select the recently created AVD device and then click on 'Start' button  

## 11. Installing CoCoin app on created emulator
1. Run "Nexus_5_API_19" using AVD manager  
2. Open terminal and enter  
```sh
$ adb devices
```
3. The device that is currntly runing should be displayed. In my case the name is  
```sh
emulator-5554 device
```
4. Enter in the terminal:
```sh
$  ./adb install <PATH_TO_THE_APP>/CoCoin.apk
```
5. Wait till terminal says "Success", which will mean that the app was installed on the emulator

## 12. Finding appPackage and appActivity
1. To run test cases using Appium we will need appPackage and appActivity parametrs that we should get from CoCoin application.  
I used "APK Info" application to find this parametrs.  
"APK Info" application can be downloaded from here: https://apkpure.com/apk-info/com.intelloware.apkinfo
2. To istall this app run in the terminal while emulator is running:  
```sh
$  ./adb install <PATH_TO_THE_APP>/APK.apk
```
3. Open "APK Info" application on emulator
4. Search for "CoCoin" appication
5. Long press on CoCoin application -> Detailed information
6. You should see something like this:
<p align="center">
<img src="https://image.ibb.co/iW8FDL/2.jpg" width="300px" >
</p>

<p align="center">
<img src="https://image.ibb.co/imKu7f/1.jpg" width="300px" >
</p>
7. appPackage is "com.nightonke.cocoin" and main appActivity is "com.nightonke.saver.activity.MainActivity"

## 13. Locate Elements using UIAutomatorViewer
1. Open a terminal and go to:
```sh
$  cd <PATH_TO_SDK>/tools/bin
```
2. Run
```sh
$  ./uiautomatorviewr
```
3. UIAutomatorViewer should be opened
4. Click on the second button from the left. It should uplode an image of an opened screen of emulator ti UIAutomatorViewer
5. Click on different elements and find Name, Id, Class and etc of every element.

## 14. Import .java files from this repository to your Eclipse project
I have created seperate .java files for every test because it was impossible to run tests one after another is one file because emulator was very slow and was always crashing. 

## 15. Run Appium server
1. Open Appium from Applications folder
2. Leave dafault Host and Port and click on"start server". My default host is "0.0.0.0", port "4723"

## 16. Run test case usng TestNG
1. Check that emulator devise is running and application is installed on it
2. Open imported .java file in Eclipse
3. Right mouse click -> Run as -> TestNG
4. This should start the test. You can find logs in Appium Server terminal and in Eclipse Console

# P.S.:
Because I don't have any android device and access to services like BrowserStack, I had to run all the tests on avd emulator on my MacBook. It was to hard for my MacBook to run appium and emulator together, that's why all the proceses were slow and emulator was crushing all the time. Due to emulator crushing during every 1 of 2 tests it was impossible for me to run any cases one after another ad also run cases with swipe activity. Even when I was doing swipes manually on the emulator the application was crushing. Because I could not run swipes on the first screen of an app, I could automate only those cases that can run on different available appActivities.



