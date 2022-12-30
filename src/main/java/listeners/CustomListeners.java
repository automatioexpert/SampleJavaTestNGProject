package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners  implements ITestListener {

    public void onStart(ITestContext context){
        System.out.println("Started test execution: "+context.getName());
    }

    public void onFinish(ITestContext context){
        System.out.println("Finished test execution: "+context.getName());
    }


    public void onTestStart(ITestResult context){
        System.out.println("Started test execution: "+context.getName());
    }

    public void onTestSkipped(ITestResult context){
        System.out.println("Skipped tests execution: "+context.getName());
    }

    public  void onTestFailure(ITestResult result){
        System.out.println("TEST FAILED: "+result.getMethod().getMethodName());
    }

}
