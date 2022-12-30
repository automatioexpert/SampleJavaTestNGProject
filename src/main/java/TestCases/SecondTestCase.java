package TestCases;
/*
1.setup - open browser  and application
2.login
3.close application

 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 0)
    public void setup(){

       // Assert.fail("Failing the  Setup test from seconds test case!!");

        System.out.println("This is setup test from second test case");
    }

    @Test(priority = 1)
    public void login(){
        System.out.println("This is login test from second test case");
        Assert.assertEquals(1,1);

    }

    @Test
    public void tearDown(){
        System.out.println("Closing browser from second test case");
    }
}
