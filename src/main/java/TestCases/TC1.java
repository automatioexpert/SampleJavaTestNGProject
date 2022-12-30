package TestCases;

import org.testng.annotations.*;

public class TC1 {

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

    @Test
    public void test1(){
        System.out.println("This is test1");
}

@Test
public void test2(){
        System.out.println("This is test2");
}

}
