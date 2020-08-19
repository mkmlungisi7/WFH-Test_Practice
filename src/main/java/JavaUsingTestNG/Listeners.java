package JavaUsingTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // not implemented
    }

    @Override
    public void onTestSuccess(ITestResult result) {
System.out.println("sucessfully works # LIstener"+ result.getName());
        }

    @Override
    public void onTestFailure(ITestResult result) {
        // not implemented
        //response if API Test fail
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // not implemented
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }


    public void onStart(ITestContext context) {
        // not implemented
    }

    public void onFinish(ITestContext context) {
        // not implemented
    }
}
