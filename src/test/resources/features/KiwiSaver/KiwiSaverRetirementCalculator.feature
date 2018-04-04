#@TestKiwiSaver

Feature: Kiwisaver Retirement Calculator
  
@TestKiwiSaver
  Scenario: TC001_Verify help icon text against each field_IE_case
    Given the user is on the WestpacNZ home page
    When the user Navigate to retierment calculator page
    When the user cliks on get started button on retierment calculator page
    Then User verify RetirementCalculatorPage
    Then User Enters the value for the field 'EmploymentStatus'
    When User verify help icons for the field 'CurrentAge,EmploymentStatus,SalaryPerYear,KSMC,PIR,CurrentKiwiSaverBalance,VoluntaryContribution,RiskProfile,SavingGoal'
   
   
  Scenario: TC002_Verify help text against field_IE_case
    Given the user is on the WestpacNZ home page
    When the user Navigate to retierment calculator page
    When the user cliks on get started button on retierment calculator page
    Then User verify RetirementCalculatorPage
    When User verify help icons for the field 'CurrentAge' 
    Then User Verify helpText for the field 'CurrentAge'
    
    
   Scenario: TC003_Calculate projected balance at retirement_IE_case
    Given the user is on the WestpacNZ home page
    When the user Navigate to retierment calculator page
    When the user cliks on get started button on retierment calculator page
    Then User verify RetirementCalculatorPage
    When User Enters the value for the field 'CurrentAge,EmploymentStatus,SalaryPerYear,KSMC,PIR,RiskProfile'
    Then User Clicks on KiwiSaver Retirement Projection
    Then User Verifies KiwiSaver Retirement Projection
    

    
     Scenario Outline: <TestName>_Calculate projected balance at retirement_IE_case
    Given the user is on the WestpacNZ home page
    When the user Navigate to retierment calculator page
    When the user cliks on get started button on retierment calculator page
    Then User verify RetirementCalculatorPage
    When User Enters the value for the field 'CurrentAge,EmploymentStatus,PIR,CurrentKiwiSaverBalance,VoluntaryContribution,RiskProfile,SavingGoal'
    Then User Clicks on KiwiSaver Retirement Projection
    Then User Verifies KiwiSaver Retirement Projection
Examples:
|TestName|
|TC004|
|TC005|


 