package TestCases;

import org.testng.annotations.Test;

public class GroupingDemo {

    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("Running test1");
    }
    @Test(groups = {"sanity"})
    public void test2(){
        System.out.println("Running test2");
    }
    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("Running test3");
    }
    @Test(groups = {"regression","sanity"})
    public void test4(){
        System.out.println("Running test4");
    }
}
