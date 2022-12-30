package TestCases;

import org.testng.annotations.*;

public class TC2 {


    @BeforeClass
    public void beforeClass(){
        System.out.println("This is executed before any class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is executed After any class");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every method");

    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }

    @Test
    public void test3(){
        System.out.println("Executing test3");
    }


}
