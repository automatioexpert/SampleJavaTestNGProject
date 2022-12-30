package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumDemo {

    @Parameters({"url"})
    @Test
    public void launchTest(String url){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String title=driver.getTitle();
        System.out.println("Page title is: "+title);
        Assert.assertEquals(title,"Google");
        driver.quit();
    }
}
