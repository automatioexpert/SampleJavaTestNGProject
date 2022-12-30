package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListeners.class)
public class TestDemo {

    @Test
    public void demo1(){
        System.out.println("Executing demo1 test");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "demo1")
    public void demo2(){
        System.out.println("Executing demo2 test");
        Assert.assertTrue(true);
    }
    @Test
    public void demo3(){
        System.out.println("Executing demo3 test");
        Assert.assertTrue(true);
    }

}
