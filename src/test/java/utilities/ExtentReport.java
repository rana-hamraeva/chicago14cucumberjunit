package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {



    private static ExtentHtmlReporter config;
    private static ExtentReports reports;
    private static ExtentTest extentTest;

    static {
        config=new ExtentHtmlReporter("./extentReport/report.html");
        config.config().setTheme(Theme.DARK);
        config.config().setDocumentTitle("B14 extent report");
        reports = new ExtentReports();
        reports.attachReporter(config);

    }
    public static void startTest(String testName){
        extentTest=reports.createTest(testName);

    }
    public static void pass(String name){
        extentTest.pass("pass");

    }
    public static void fail(String name){
        extentTest.fail("fail");

    }
    public static void  end(){
        reports.flush();
    }
}
