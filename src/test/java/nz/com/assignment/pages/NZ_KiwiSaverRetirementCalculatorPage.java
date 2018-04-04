/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Web elements and common methods for NZ_KiwiSaverRetirementCalculatorPage
 */

package nz.com.assignment.pages;

import ch.lambdaj.function.convert.Converter;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;


import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class NZ_KiwiSaverRetirementCalculatorPage extends PageObject {


    
    @FindBy(xpath="//div[@class='calculator-embed']/iframe")
    private WebElementFacade Frame_calculator;
    
    @FindBy(xpath="//div[@model='ctrl.data.CurrentAge']/div/div/div/input")
    private WebElementFacade  CurrentageTextfield;
    @FindBy(xpath="//div[@help-id='CurrentAge']/button")
    private WebElementFacade  CurrentageHelpbutton;
    
    @FindBy(xpath="//div[@ng-model='ctrl.data.EmploymentStatus']/descendant::div[@ng-bind-html='selectedContent']")
    private WebElementFacade  EmploymentStatusdropdown;
    @FindBy(xpath="//div[@help-id='EmploymentStatus']/button")
    private WebElementFacade  EmploymentStatusHelpbutton;
    
    @FindBy(xpath="//div[@ng-model='ctrl.data.PIRRate']/div/div")
    private WebElementFacade  PIRRateStatusdropdown;
    @FindBy(xpath="//div[@help-id='PIRRate']/button")
    private WebElementFacade  PIRRateHelpbutton;
    
    
    @FindBy(xpath="//div[@model='ctrl.data.KiwiSaverBalance']/div/div/div/input")
    private WebElementFacade  KiwiSaverBalancetextbox;
    @FindBy(xpath="//div[@help-id='KiwiSaverBalance']/button")
    private WebElementFacade  KiwiSaverBalancHelpebutton;
  
    
    @FindBy(xpath="//div[@model='ctrl.data.VoluntaryContributions']/div/div/div/input")
    private WebElementFacade  VoluntaryContributionstextbox;
    @FindBy(xpath="//div[@model='ctrl.data.VoluntaryContributions']/div/div[2]/div/div")
    private WebElementFacade  VCFdropdown;
    @FindBy(xpath="//div[@help-id='VoluntaryContributions']/button")
    private WebElementFacade  VoluntaryContributionsHelpbutton;
    
    @FindBy(xpath="//div[@ng-show='dropDownRevealed']/ul/li")
    private WebElementFacade Dropdownlist;
    
    
    @FindBy(xpath="//div[@help-id='RiskProfile']/button")
    private WebElementFacade  RiskProfilesHelpbutton;
    
    @FindBy(xpath="//div[@ng-model='ctrl.data.RiskProfile']/descendant::input[@value='low']")
    private WebElementFacade  RF_low_Radiobutton;
    @FindBy(xpath="//div[@ng-model='ctrl.data.RiskProfile']/descendant::input[@value='medium']")
    private WebElementFacade  RF_medium_Radiobutton;
    @FindBy(xpath="//div[@ng-model='ctrl.data.RiskProfile']/descendant::input[@value='high']")
    private WebElementFacade  RF_high_Radiobutton;
    
    
    @FindBy(xpath="//div[@help-id='SavingsGoal']/button")
    public WebElementFacade  SavingsGoalHelpbutton;
    @FindBy(xpath="//div[@model='ctrl.data.SavingsGoal']/div/div/div/input")
    private WebElementFacade  SavingsGoaltextbox;
    
    @FindBy(xpath="//div[@help-id='AnnualIncome']/button")
    private WebElementFacade  AnnualIncomeHelpbutton;
    @FindBy(xpath="//div[@model='ctrl.data.AnnualIncome']/div/div/div/input")
    private WebElementFacade  AnnualIncometextbox;
    
    @FindBy(xpath="//div[@help-id='KiwiSaverMemberContribution']/button")
    private WebElementFacade  KiwiSaverMemberContributionHelpbutton;
    
    @FindBy(xpath="//div[@ng-model='ctrl.data.KiwiSaverMemberContribution']/descendant::input[@value='3']")
    private WebElementFacade  KSMC_3_Radiobutton;
    @FindBy(xpath="//div[@ng-model='ctrl.data.KiwiSaverMemberContribution']/descendant::input[@value='4']")
    private WebElementFacade  KSMC_4_Radiobutton;
    @FindBy(xpath="//div[@ng-model='ctrl.data.KiwiSaverMemberContribution']/descendant::input[@value='8']")
    private WebElementFacade  KSMC_8_Radiobutton;
    
    @FindBy(xpath="//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")
    private WebElementFacade  KS_RetirementProjection;
    
    @FindBy(xpath="//div[@class='field-group-set results-field-group-set']/descendant::span[@class='result-value result-currency ng-binding']")
    private WebElementFacade  KS_RetirementProjection_result;
  
    @FindBy(xpath="//div[@class='message-row ng-scope']/div/p")
    private WebElementFacade  Helptext;
    
    


    
    public void click_RetirementProjection_button() {
    	KS_RetirementProjection.click();
    	Wait(KS_RetirementProjection_result);
    	
    }
    
   
    
    public String getText_RetirementProjection_result() {
    	return KS_RetirementProjection_result.getText();
    }
    public void EnterText_currentAge(String value) {
    	CurrentageTextfield.sendKeys(value);
    	
    }
    
    public void verifyandclick_help_icon_currentAge() {
    	CurrentageHelpbutton.isDisplayed();
    	CurrentageHelpbutton.click();
    	
    }
    
    public void verifyandclick_help_icon_EmploymentStatus() {
    	EmploymentStatusHelpbutton.isDisplayed();
    	EmploymentStatusHelpbutton.click();
    	
    }
    
    public void ClickonDropdown_EmploymentStatus() {
    	EmploymentStatusdropdown.click();
    	
    }
    
    
    
    public void verifyandclick_help_icon_PIRRate() {
    	PIRRateHelpbutton.isDisplayed();
    	PIRRateHelpbutton.click();
    	
    }
    
    public void ClickonDropdown_PIRRate() {
    	PIRRateStatusdropdown.click();
    	
    }
    
    public void verifyandclick_help_icon_KiwiSaverBalanc() {
    	KiwiSaverBalancHelpebutton.isDisplayed();
    	KiwiSaverBalancHelpebutton.click();
    	
    }
    
    public void EnterText_KiwiSaverBalanc(String balance) {
    	KiwiSaverBalancetextbox.sendKeys(balance);
    	
    }
    
    
    public void verifyandclick_help_icon_VoluntaryContributions() {
    	VoluntaryContributionsHelpbutton.isDisplayed();
    	VoluntaryContributionsHelpbutton.click();
    	
    }
    
    public void ClickonDropdown_VoluntaryContributions() {
    	VCFdropdown.click();
    	
    }
    
    public void EnterText_VoluntaryContributions(String VCB) {
    	VoluntaryContributionstextbox.sendKeys(VCB);
    	
    }
    
    public void verifyandclick_help_icon_RiskProfiles() {
    	RiskProfilesHelpbutton.isDisplayed();
    	RiskProfilesHelpbutton.click();
    	
    }
    
    public void click_RadioButton_High_RiskProfiles() {
    	RF_high_Radiobutton.click();
    	
    }
    
    public void click_RadioButton_medium_RiskProfiles() {
    	RF_medium_Radiobutton.click();
    	
    }
    
    public void click_RadioButton_low_RiskProfiles() {
    	RF_low_Radiobutton.click();
    	
    }
    
    
    public void verifyandclick_help_icon_SavingsGoal() {
    	SavingsGoalHelpbutton.isDisplayed();
    	SavingsGoalHelpbutton.click();
    	
    }
    
    public void EnterText_SavingsGoal(String SavingGoal) {
    	SavingsGoaltextbox.sendKeys(SavingGoal);
    	
    }
    
    
    
    public void verifyandclick_help_icon_AnnualIncome() {
    	AnnualIncomeHelpbutton.isDisplayed();
    	AnnualIncomeHelpbutton.click();
    	
    }
    
    
    public void EnterText_AnnualIncome(String SavingGoal) {
    	AnnualIncometextbox.sendKeys(SavingGoal);
    	
    }
    
    
    
    public void verifyandclick_help_icon_KiwiSaverMemberContributions() {
    	KiwiSaverMemberContributionHelpbutton.isDisplayed();
    	KiwiSaverMemberContributionHelpbutton.click();
    	
    }
    
    public void click_RadioButton_3_KSMC() {
    	KSMC_3_Radiobutton.click();
    	
    }
    public void click_RadioButton_4_KSMC() {
    	KSMC_4_Radiobutton.click();
    	
    }
    public void click_RadioButton_8_KSMC() {
    	KSMC_8_Radiobutton.click();
    	
    }
    
 
   
    
    public String getHelptext() {
    	
    	return Helptext.getText();
    }
    
    public void SwithctoKiwiSaverCalculator() {
    	Wait(Frame_calculator);
    	getDriver().switchTo().frame(Frame_calculator);
    }
    
  public void Selectfromdropdownvalue(String Dropdownvalue )
    
    {
    	 List<WebElement> autoSuggest = getDriver().findElements(By
		            .xpath("//div[@ng-show='dropDownRevealed']/ul/li"));
		    for (WebElement a : autoSuggest){
		        if(a.getText().contains(Dropdownvalue.trim()))
		        	{a.click();
		        break;}
		      
		    }
    }

  public void SelectfromdropdownvaluePIR(String Dropdownvalue )
  
  {
  	 List<WebElement> autoSuggest = getDriver().findElements(By
		            .xpath("//div[@ng-show='dropDownRevealed']/ul/div/li"));
		    for (WebElement a : autoSuggest){
		        if(a.getText().contains(Dropdownvalue.trim()))
		        	{a.click();
		        break;}
		       // .replace(" ", "").toLowerCase()
		    }
  }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }
    
  

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
    
    public void Wait(WebElementFacade e)
    {
    	WebDriverWait wait = new WebDriverWait(getDriver(),10);
    	wait.until(ExpectedConditions.visibilityOf(e));
    }
}