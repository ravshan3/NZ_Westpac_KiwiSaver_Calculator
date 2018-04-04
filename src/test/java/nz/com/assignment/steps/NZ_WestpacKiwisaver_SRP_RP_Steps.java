/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Step defination for NZ_WestpacKiwisaver_SRP_RP page
 */

package nz.com.assignment.steps;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import nz.com.assignment.steps.serenity.EndUserSteps;
import nz_assignment.WebActions;

public class NZ_WestpacKiwisaver_SRP_RP_Steps extends WebActions {
	 @Steps
	    EndUserSteps NZ_asses;
	 
	 
	 @When("the user cliks on get started button on retierment calculator page")
	    public void Click_GetstartedButton()  {
		 
	    	NZ_asses.Click_getstarted1();
	    	
	    }
}
