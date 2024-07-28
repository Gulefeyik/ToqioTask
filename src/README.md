# *****Toqio Task *****

Here you can find the automation tests of the assignment

Project is made basically using:
  - Java (version 8)
  - Cucumber
  - Junit
  - Selenium
  - Maven
 
I used IntelliJ IDE, and the project can be run either:
- Running directly the features or scenarios (will run features or scenarios on demand)
- Running the test cases from CukesRunner by providing tagging on demand i.e:tags = "@toqioCase" or simply click on the green button to run all the automated scenarios under the feature folder

Please note that project is made by:
 - Behavior Driven Development (BDD) choosing Cucumber as one of the most popular and supported tools for that.
 - Java, because is a well known and strong language.
 - Page Object Model and Singleton design pattern have been used for Cucumber automation framework, and the test cases have been written in Gherkin language. 

In Selenium part, I have used Page Object Model and for that purpose;
- I have created Pages folder.
- Under Resources -> feature folder, there are only one feature file which is used for 
  selenium;  that is (toqioCase.feature). I have written all the required steps in one scenario. 
  Implementation part of that scenario can be found under the step_definitions folder with the 
  name of teamMembers_Step_Definitions and contentLanguage_Step_Definitions
  For some cases I need to write some methods which I have stored in a folder called 
  BrowserUtils which can be seen under Utilities folder.



In addition, the project is created by using Maven and pom.xml file can be found all the dependencies which required. 
There is a configuration properties file which I have put URLs and configuration reader to get those properties.

Regards.

