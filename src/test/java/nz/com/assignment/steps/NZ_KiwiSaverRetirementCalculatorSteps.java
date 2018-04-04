/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Step defination for NZ_KiwiSaverRetirementCalculator page
 */

package nz.com.assignment.steps;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import nz.com.assignment.steps.serenity.EndUserSteps;
import nz_assignment.WebActions;



public class NZ_KiwiSaverRetirementCalculatorSteps extends WebActions {
	
	

    @Steps
    EndUserSteps NZ_asses;

    @Then("User verify RetirementCalculatorPage")
    public void UserVerifyRetirementCalculatorPage() {
    	
    	NZ_asses.SwithctoKiwiSaverCalculator();
    }
    
    @When("User verify help icons for the field '(.*)'")
    public void UserVerifyhelpiconsofthefields(String key) {
		String keys[] = key.split(",");
		System.out.println(keys.length);
		for (int i = 0; i < keys.length; i++) {
    	switch (keys[i]) {
		case "CurrentAge":
			
			NZ_asses.verifyandclick_help_icon_currentAge();
			break;
			
		case "EmploymentStatus":
			NZ_asses.verifyandclick_help_icon_EmploymentStatus();
			break;
			
		case "PIR":
			NZ_asses.verifyandclick_help_icon_PIRRate();
			break;
			
		case "CurrentKiwiSaverBalance":
			NZ_asses.verifyandclick_help_icon_KiwiSaverBalanc();
			break;
			
		case "VoluntaryContribution":
			NZ_asses.verifyandclick_help_icon_VoluntaryContributions();
			break;
			
		case "RiskProfile":
			NZ_asses.verifyandclick_help_icon_RiskProfiles();
			break;
			
		case "SavingGoal":
			NZ_asses.verifyandclick_help_icon_SavingsGoal();
			break;
			
		case "SalaryPerYear":
			NZ_asses.verifyandclick_help_icon_AnnualIncome();
			
			break;
			
		case "KSMC":
			NZ_asses.verifyandclick_help_icon_KiwiSaverMemberContributions();
			
			break;
			
			
    }
		}
    }
    
    @Then("User Verify helpText for the field '(.*)'")
    public void UserverifyHelpTextForThefields(String key) {
    	Assert.assertTrue("HelpTextis not matching",(testData.get("HelpText")).contains(NZ_asses.getHelptext()) );
    }
    	
    
    @When("User Enters the value for the field '(.*)'")
    public void UserEntersTheValueForThefields(String key) {
		String keys[] = key.split(",");
		for (int i = 0; i < keys.length; i++) {
    	switch (keys[i]) {
		case "CurrentAge":
			NZ_asses.EnterText_currentAge(testData.get("CurrentAge"));
			break;
			
		case "EmploymentStatus":
			NZ_asses.ClickonDropdown_EmploymentStatus();
			NZ_asses.Selectfromdropdownvalue(testData.get("EmploymentStatus"));
			break;
			
		case "PIR":
			NZ_asses.ClickonDropdown_PIRRate();
			NZ_asses.SelectfromdropdownvaluePIR(testData.get("PIRRate"));
			break;
			
		case "CurrentKiwiSaverBalance":
			NZ_asses.EnterText_KiwiSaverBalanc(testData.get("CurrentKiwiSaverBal"));
			
		
			break;
			
		case "VoluntaryContribution":
			NZ_asses.EnterText_VoluntaryContributions(testData.get("VoluntryContribution"));
			NZ_asses.ClickonDropdown_VoluntaryContributions();
			NZ_asses.Selectfromdropdownvalue(testData.get("FreqVoluntryContribution"));
			break;
			
		case "RiskProfile":
			if(testData.get("RiskProfile").equals("high"))
			{
				NZ_asses.click_RadioButton_High_RiskProfiles();
			}
			else if(testData.get("RiskProfile").equals("medium"))
			{
				NZ_asses.click_RadioButton_medium_RiskProfiles();
			}
			else
			{
				NZ_asses.click_RadioButton_low_RiskProfiles();
			}
			break;
			
		case "SavingGoal":
			NZ_asses.EnterText_SavingsGoal(testData.get("SavingGoal"));
			break;
			
		case "SalaryPerYear":
			NZ_asses.EnterText_AnnualIncome(testData.get("AnnualIncome"));
			
			break;
			
		case "KSMC":
			if(testData.get("KSMC").equals("eight"))
			{
				NZ_asses.click_RadioButton_8_KSMC();
			}
			else if(testData.get("KSMC").equals("four"))
			{
				NZ_asses.click_RadioButton_4_KSMC();
			}
			else
			{
				NZ_asses.click_RadioButton_3_KSMC();
			}
			break;
			
			
			
			
    }
		}
    }

    @Then("User Clicks on KiwiSaver Retirement Projection")
    public void Click_KiwiSaverRetirementProjection(){
    	NZ_asses.click_RetirementProjection_button();
    	
    }
    
    @Then("User Verifies KiwiSaver Retirement Projection")
    public void Verify_KiwiSaverRetirementProjection() {
    	System.out.println(NZ_asses.getText_RetirementProjection_result());
    	NZ_asses.getText_RetirementProjection_result();
    	
    }
}
