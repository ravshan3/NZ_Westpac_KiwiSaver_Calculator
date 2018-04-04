package nz.com.assignment.steps.serenity;

import nz.com.assignment.pages.NZ_HomePage;
import nz.com.assignment.pages.NZ_KiwiSaverRetirementCalculatorPage;
import nz.com.assignment.pages.NZ_WestpacKiwisaver_SRP_RP_Page;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {
	NZ_HomePage HomePage;
	NZ_WestpacKiwisaver_SRP_RP_Page  WestpacKiwisaver_SRP_RP_Page;
    NZ_KiwiSaverRetirementCalculatorPage KiwiSaverRetirementCalculatorPage;
    
   
    
    @Step
    public void Click_getstarted1() {
    	WestpacKiwisaver_SRP_RP_Page.Getstarted();
    	
    }
    
    @Step
    public void is_the_home_page1() {
    	HomePage.open();
    	
    	
    }
    @Step
    public String NZ_Home_getText()
    {
    	return HomePage.NZ_Home_getText();
    }
    @Step
    public void navigatetotheURL1() throws InterruptedException {
    	HomePage.Navigate_To_required_URL();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(KiwiSaverRetirementCalculatorPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
    	KiwiSaverRetirementCalculatorPage.open();
    }

    @Step
    public void verifyandclick_help_icon_currentAge() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_currentAge();
    	
    	
    }
    
    @Step
    public String getHelptext() {
    	
     return KiwiSaverRetirementCalculatorPage.getHelptext();
    }

    @Step
    public void click_RetirementProjection_button() {
    	KiwiSaverRetirementCalculatorPage.click_RetirementProjection_button();
    }
    
    @Step
    public String getText_RetirementProjection_result() {
    	return KiwiSaverRetirementCalculatorPage.getText_RetirementProjection_result();
    }
    
    @Step
    public void EnterText_currentAge(String value) {
    	KiwiSaverRetirementCalculatorPage.EnterText_currentAge(value);
    	
    }
    
    
    @Step
    public void verifyandclick_help_icon_EmploymentStatus() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_EmploymentStatus();
    	
    }
    
    @Step
    public void ClickonDropdown_EmploymentStatus() {
    	KiwiSaverRetirementCalculatorPage.ClickonDropdown_EmploymentStatus();
    	
    }
    
    
    @Step
    public void verifyandclick_help_icon_PIRRate() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_PIRRate();
    }
    
    @Step
    public void ClickonDropdown_PIRRate() {
    	KiwiSaverRetirementCalculatorPage.ClickonDropdown_PIRRate();
    	
    }
    
    @Step
    public void verifyandclick_help_icon_KiwiSaverBalanc() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_KiwiSaverBalanc();
    	
    }
    
    @Step
    public void EnterText_KiwiSaverBalanc(String balance) {
    	KiwiSaverRetirementCalculatorPage.EnterText_KiwiSaverBalanc(balance);
    	
    }
    
    @Step
    public void verifyandclick_help_icon_VoluntaryContributions() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_VoluntaryContributions();
    	
    }
    
    @Step
    public void ClickonDropdown_VoluntaryContributions() {
    	KiwiSaverRetirementCalculatorPage.ClickonDropdown_VoluntaryContributions();
    	
    }
    
    @Step
    public void EnterText_VoluntaryContributions(String VCB) {
    	KiwiSaverRetirementCalculatorPage.EnterText_VoluntaryContributions(VCB);
    	
    }
    
    @Step
    public void verifyandclick_help_icon_RiskProfiles() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_RiskProfiles();
    	
    }
    
    @Step
    public void click_RadioButton_High_RiskProfiles() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_High_RiskProfiles();
    	
    }
    
    @Step
    public void click_RadioButton_medium_RiskProfiles() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_medium_RiskProfiles();
    	
    }
    
    @Step
    public void click_RadioButton_low_RiskProfiles() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_low_RiskProfiles();
    	
    }
    
    @Step
    public void verifyandclick_help_icon_SavingsGoal() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_SavingsGoal();
    	
    }
    
    @Step
    public void EnterText_SavingsGoal(String SavingGoal) {
    	KiwiSaverRetirementCalculatorPage.EnterText_SavingsGoal(SavingGoal);
    	
    }
    
    
    @Step
    public void verifyandclick_help_icon_AnnualIncome() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_AnnualIncome();
    	
    }
    
    @Step
    public void EnterText_AnnualIncome(String SavingGoal) {
    	KiwiSaverRetirementCalculatorPage.EnterText_AnnualIncome(SavingGoal);
    	
    }
    
    
    @Step
    public void verifyandclick_help_icon_KiwiSaverMemberContributions() {
    	KiwiSaverRetirementCalculatorPage.verifyandclick_help_icon_KiwiSaverMemberContributions();
    	
    }
    
    @Step
    public void click_RadioButton_3_KSMC() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_3_KSMC();
    	
    }
    
    @Step
    public void click_RadioButton_4_KSMC() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_4_KSMC();
    	
    }
    
    @Step
    public void click_RadioButton_8_KSMC() {
    	KiwiSaverRetirementCalculatorPage.click_RadioButton_8_KSMC();
    	
    }
    
    @Step
    public void SelectfromdropdownvaluePIR(String Dropdownvalue ){
    
    KiwiSaverRetirementCalculatorPage.SelectfromdropdownvaluePIR(Dropdownvalue);
    }
   
   
    @Step
    public void SwithctoKiwiSaverCalculator() {
    	KiwiSaverRetirementCalculatorPage.SwithctoKiwiSaverCalculator();
    }
    
    @Step
  public void Selectfromdropdownvalue(String Dropdownvalue )
    
    {
	  KiwiSaverRetirementCalculatorPage.Selectfromdropdownvalue(Dropdownvalue);
    }
    
}