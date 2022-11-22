package Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    //@Parameters - global parameter from XML TestNG file
    //groups - just grouping test cases in XML TestNG file
    @Parameters({"URL"})
    @Test
    public void Test2(String urlName) {
        System.out.println("test2");
        System.out.println(urlName);
    }

    @Test(groups = {"Smoke"})
    public void Test2smoke() {
        System.out.println("test2smoke");
    }
}

