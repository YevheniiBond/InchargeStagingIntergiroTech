package incharge.test.listeners;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    Logger log = LogManager.getLogger(TestListener.class);

    public void onTestSuccess(ITestResult tr) {
        String str = "Test " + tr.getTestContext().getCurrentXmlTest().getName() + " success";
        log.info(str);
    }

    public void onTestFailure(ITestResult tr, ITestResult result) {
        String str = "Test " + tr.getTestContext().getCurrentXmlTest().getName() + " failure";
        String str1 = "Failed because of - " + result.getThrowable();
        log.info(str);
        log.info(str1);
    }

    public void onTestSkipped(ITestResult tr, ITestResult result) {
        String str = "Test " + tr.getTestContext().getCurrentXmlTest().getName() + " skipped";
        String str1 = "Skipped because of - " + result.getThrowable();
        log.info(str);
        log.info(str1);
    }

    public void onStart(ITestContext testContext) {
        String str = "Test " + testContext.getCurrentXmlTest().getName() + " start";
        log.info(str);
    }

    public void onFinish(ITestContext testContext) {
        String str = "Test " + testContext.getCurrentXmlTest().getName() + " finish";
        log.info(str);
    }
}