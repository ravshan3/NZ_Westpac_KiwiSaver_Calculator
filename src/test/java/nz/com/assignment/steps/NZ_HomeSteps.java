/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Step defination for NZ_HomeSteps  page
 */

package nz.com.assignment.steps;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import nz.com.assignment.steps.serenity.EndUserSteps;
import nz_assignment.WebActions;

public class NZ_HomeSteps extends WebActions {
	
	 @Steps
	    EndUserSteps NZ_asses;
	 
	  @Before
		public void StartRecording(Scenario Name) throws Exception{
			WebActions.TimeOut = Integer.parseInt(WebActions.ReadPropertiesFile("serenity.properties","serenity.timeout"));
			/*
			 * the below function Sets the System property for the Browser
			 */
			Path currentRelativePath = Paths.get("");
			File file = new File(currentRelativePath.toAbsolutePath().toString()+"/ExternalJar/IEDriverServer/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			
//			Path currentRelativePath = Paths.get("");
//			File file = new File(currentRelativePath.toAbsolutePath().toString()+"/ExternalJar/ChromeDriver/chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			

			isTestCompleted = false;
			ScenarioName = Name.getName();
			TestDataIdentifier = ScenarioName.substring(0, ScenarioName.lastIndexOf("_"));
			

			/*
			 * the below function is for test data selection
			 */
			
				testData = getData("Assignment", TestDataIdentifier);
		
			}
	 
	 @Given("the user is on the WestpacNZ home page")
	    public void givenTheUserWestpacNZHomePage() {
	    	NZ_asses.is_the_home_page1();
	    	
	    }

	    @When("the user Navigate to retierment calculator page")
	    public void whenTheUserNavigatetoretirementCalculatorPage() throws Exception {
	    	NZ_asses.navigatetotheURL1();
	    	
	    }

}
