package Demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

    @Test(groups = {"Smoke"})
    public void Test3(){
        System.out.println("test3");
    }

    @Parameters({"URL", "userName"})
    @Test
    public void Test33(String urlName, String userName){
        System.out.println("test33");
        System.out.println(urlName);
        System.out.println(userName);
    }
}
