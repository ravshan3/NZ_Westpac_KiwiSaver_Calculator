/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains Web elements and common methods for NZ_Homepage
 */

package nz.com.assignment.pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class NZ_HomePage extends PageObject{

    @FindBy(xpath="//*[@id='ubermenu-ps']/ul/li[6]")
    private WebElementFacade  Kiwiseverbutton;
    
    @FindBy(linkText="KiwiSaver calculators")
    private WebElementFacade  Kiwisevercalculatorbutton;
    
    @FindBy(xpath="//*[@id='ubermenu-ps']/ul/li[1]/a")
    private WebElementFacade  HomePage_Heading;
    
    
    public void Navigate_To_required_URL() throws InterruptedException {
    	Wait(Kiwiseverbutton);
        Actions action= new Actions(getDriver());
        action.moveToElement(Kiwiseverbutton).perform();
        Wait(Kiwisevercalculatorbutton);
        Kiwisevercalculatorbutton.click();
        
    }
    
    public void Wait(WebElementFacade e)
    {
    	WebDriverWait wait = new WebDriverWait(getDriver(),10);
    	wait.until(ExpectedConditions.visibilityOf(e));
    }
    
    
    
    public String NZ_Home_getText()
    {
  	getDriver().manage().window().maximize();
  	Wait(HomePage_Heading);
    	return HomePage_Heading.getText();
    }
}
