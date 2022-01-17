package UserDefinedBinaries;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport {

    private static ExtentReports report=null;

    public static ExtentReports getReport(String name) {
        if(report==null) {
            String reportName=name+".html";
            String path=System.getProperty("user.dir")+"\\target\\Report\\"+reportName;
            ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(path);
            htmlReporter.config().setTimeStampFormat("hh:mm:ss");
            report=new ExtentReports();
            report.attachReporter(htmlReporter);
        }

        return report;
    }
}
