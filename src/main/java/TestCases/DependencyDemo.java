package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {

    @Test
    public void startCar(){
    System.out.println("Car started");
        Assert.fail("Deliberately failing the test for DEMO");
    }

    @Test(dependsOnMethods = "startCar")
    public void driveCar(){
        System.out.println("Driving Car");
    }

    @Test(dependsOnMethods = "driveCar")
    public void parkCar(){
    System.out.println("Parked the car");
    }
    @Test(dependsOnMethods = {"parkCar","driveCar"},alwaysRun = true)
    public void stopCar(){
        System.out.println("Car stopped");
    }
}

