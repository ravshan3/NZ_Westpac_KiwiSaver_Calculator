package nz.com.assignment;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/KiwiSaver/KiwiSaverRetirementCalculator.feature",
tags = {"@TestKiwiSaver","~@Ignore"}, monochrome=true)
public class DefinitionTestSuite {}


