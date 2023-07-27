package sportingbull.com;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import sportingbull.com.propertyreader.PropertyReader;
import sportingbull.com.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility {

    //open browser
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    //close browser
    @After
    public void tearDown(Scenario scenario){
        //take screenshot when test fail
        if(scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }
}
