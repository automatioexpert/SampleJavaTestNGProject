package TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 0)
    public void testOne(){
         System.out.println("Running testOne");
    }

    @Test(priority = 1)
    public void testTwo(){
        System.out.println("Running testTwo");
    }

    @Test(priority = 2,enabled = false)
    public void testThree(){
        System.out.println("Running testThree");
    }

    @Test
    public void testFour(){
        throw new SkipException("Skipping this test as currently Developer is fixing this defect.");
        //System.out.println("Running testFour");
    }
}

