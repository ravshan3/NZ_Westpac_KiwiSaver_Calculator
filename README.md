Prerequisites: 
1.	JDK 1.8 should be installed and Path Variable should be configured. 
•	Verify running java –version in cmd
2.	Maven 3.3.9 should be downloaded and extracted to local. Path Variable should be configured.
•	Verify running mvn –version in cmd
3.	Eclipse should be installed and maven settings to be configured in Eclipse.
4.	Cucumber Plugin should be configured.
5.	Git Should be installed in your system
6.	One should have access to GitHub
=================================================

Step: 1
   Download copy of automation Project from github using git.
•	Open CMD
•	Cd to the folder where one wants to download the project.
•	Git clone  https://github.com/serenity-bdd/NZ_Assignment/nz_assignment.git
Step: 2
    Import the project in eclipse as Maven project.
Step: 3
    Modify Maven Setting.xml file
•	Traverse to conf file of apache maven.
•	Edit Setting.xml file with attached one and update your username and Password
Step: 4 Execute the Scripts through cmd
•	To run all script in one go. DefinitionTestSuite.java with below code.
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber"}, tags = {"~@Ignore"}, monochrome=true)

•	To run all script for selected test cases. Update CucumberIT.java with below code.
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber"}, tags = {"@test","~@Ignore"}, monochrome=true)

•	Update the tag name to the test case in feature file to be executed.
•	Cd to the project path
•	mvn clean verify or  mvn clean install > log.txt (to verify the log after execution)

Steps: 6 Verify Serenity report.
By default reports will be saved at below path.
C:\QTP\AFC_FRAMEWORK\NZ_Assignment\nz_assignment\target\site\serenity
Navigate to Serenity folder using above path.
Open index file in browser.
