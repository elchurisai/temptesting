package com.o2.framework.helpers;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.SystemUtils;

import java.io.File;
import java.util.Date;

public class ReportManager {


    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static ExtentReports getInstance() {

        Date dp = new Date();

        String extentReportPath = SystemUtils.getUserDir().toString()+
                                    ""
                                    +dp.toString().replaceAll(" ","_").replaceAll(":","_")+".html";
            if (extentReports==null){

                extentReports= new ExtentReports(extentReportPath,false, DisplayOrder.OLDEST_FIRST);

                extentReports.loadConfig(new File(SystemUtils.getUserDir()+"/src/main/resources/profiles.REPORT/configreport.xml"));

            }
        return extentReports;
    }

    public static ExtentTest startTesting(String testName,String testDescription)
    {

        extentTest =extentReports.startTest(testName,testDescription);

        return extentTest;
    }

    public static void reportInfo(String reportInformation) {

        extentTest.log(LogStatus.INFO,reportInformation);

    }

    public static void testFailed(String  reportInformation) {

        extentTest.log(LogStatus.FAIL,reportInformation);
    }

    public static void testPassed(String reportInformation) {

        extentTest.log(LogStatus.PASS,reportInformation);
    }

    public static void stopReport(ExtentTest extentTest) {

        extentReports.endTest(extentTest);
        extentReports.flush();
    }



}
