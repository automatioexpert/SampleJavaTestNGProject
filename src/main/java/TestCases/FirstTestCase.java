package TestCases;
/*
1.setup - open browser  and application
2.login
3.close application

 */

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 0)
    public void setup(){
        System.out.println("This is setup test");
    }

    @Test(priority = 1)
    public void login(){
        System.out.println("This is login test");

    }

    @Test
    public void tearDown(){
        System.out.println("Closing browser");
    }
}
