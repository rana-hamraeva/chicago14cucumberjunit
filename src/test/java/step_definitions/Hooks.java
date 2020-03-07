package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.Log;

public class Hooks {

    @Before // works before every scenario
    public void setup(Scenario scenario){

        Log.start(scenario.getName());
        // anything that you want to run before each scenario
    }
    @After // when the scenario is done it will - all information about test will be stored in java object
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            ExtentReport.fail(scenario.getName());
        }else {

            ExtentReport.pass(scenario.getName());
        }
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        // Driver.quitDriver();

    }
}
