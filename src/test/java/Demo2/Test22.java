package Demo2;

import org.testng.annotations.*;

public class Test22 {

    //when we add dataProvider , the test will be executed 3 times with all three data sets
    @Test(dataProvider = "getData")
    public void demoTest22(String user, String pass) {
        System.out.println("test22");
        System.out.println(user);
        System.out.println(pass);
    }


    @Test(groups = {"Smoke"})
    public void Test222() {
        System.out.println("test222");
    }

    @DataProvider
    public Object[][] getData() {
        //we want to get test data combination like:
        // 1st - username1 and password1 (e.g. client with good credit history)
        // 2nd - username2 and password2 (e.g. client with no credit history)
        // 3rd - username3 and password3 (e.g. client with bad credit history)

        Object[][] data = new Object[3][2];
        // 3 combinations (rows) and 2 values for each (columns)

        //1st
        data[0][0] = "user1";
        data[0][1] = "pass1";
        //2nd
        data[1][0] = "user2";
        data[1][1] = "pass2";
        //3rd
        data[2][0] = "user3";
        data[2][1] = "pass3";

        return data;
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will be executed before methods in Test22 class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will be executed after methods in Test22 class");
    }

}
