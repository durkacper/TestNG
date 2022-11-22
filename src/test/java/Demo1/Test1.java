package Demo1;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {

    @Parameters({"URL"})
    @Test
    public void testURL(String urlName){
        System.out.println(urlName);
    }

    //Tests are executed in alphabetic order as default - but here first will be DdemoTest111 and after that, AdemoTest01110
    @Test(dependsOnMethods = {"DdemoTest111"})
    public void AdemoTest01110(){
        System.out.println("test01110");
    }

    //grouping tests from different classes
    @Test(groups = {"Smoke"})
    public void BdemoTest1(){
        System.out.println("test1");
    }

    //It will wait 40 second to finish execution of only this test
    @Test(timeOut = 40000)
    public void DdemoTest1110(){
        System.out.println("test1110");
    }

    @Test //fail test for Listeners
    public void CdemoTest11(){
        System.out.println("test11");

        //failing the test - just for show how Listeners works
        Assert.assertTrue(false);
    }

    @Test
    public void DdemoTest111(){
        System.out.println("test111");
    }

    //this test will be skipped because of annotation
    @Test(enabled = false)
    public void DdemoTest000(){
        System.out.println("test000");
    }




    @BeforeTest
    public void beforeTest(){
        System.out.println("This will be executed before tests");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will be executed after tests");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will be executed before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will be executed after suite");
    }
}
