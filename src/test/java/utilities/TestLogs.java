package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestLogs {
    public static void main(String[] args) {


//        System.out.println("test started");
//        Log.info("start of test");
//        System.out.println("user on amazon");
//        Log.warn("login in to amazon ");
//        System.out.println("user loged out");
//        Log.error("user loged out");


        ExtentHtmlReporter config = new ExtentHtmlReporter("./extentReport/report.html");
        ExtentReports reports = new ExtentReports();

        config.config().setTheme(Theme.DARK);
        reports.attachReporter(config);

        System.out.println("start test");
        ExtentTest extentTest = reports.createTest("Google Search");

        extentTest.pass("Its passing");
        extentTest.fail("didnt match.fail");
        reports.flush();
        System.out.println("compleated");

    }
}
