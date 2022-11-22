import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener - it is an interface which implements TestNG listeners
public class Listeners implements ITestListener {


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("ERROR IN CODE k " + result.getName());
    }
}
