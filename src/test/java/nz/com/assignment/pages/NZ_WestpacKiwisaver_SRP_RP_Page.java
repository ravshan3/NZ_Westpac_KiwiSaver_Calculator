/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Web elements and common methods for NZ_WestpacKiwisaver_SRP_RP_Page 
 */

package nz.com.assignment.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class NZ_WestpacKiwisaver_SRP_RP_Page  extends PageObject{
	
	  @FindBy(xpath="//*[@id='content-ps']/div[2]/div/section/p[4]/a")
	    private WebElementFacade Getstarted;
	  
	  public void Getstarted() {
		  Wait(Getstarted);
		  Getstarted.isDisplayed();
	    	Getstarted.click();
	    	
	    }
	  public void Wait(WebElementFacade e)
	    {
	    	WebDriverWait wait = new WebDriverWait(getDriver(),10);
	    	wait.until(ExpectedConditions.visibilityOf(e));
	    }
}
