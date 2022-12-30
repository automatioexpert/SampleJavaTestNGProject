package ParallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;
    String browser = "chrome";

    @Test
    public void logoTest() {
        if (driver == null) {

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else {

                System.out.println("Invalid browser was provided..Pls enter the correct one.For Ex: Chrome ,firefox or ie");
            }
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            Assert.assertEquals(driver.getTitle(),"Google");
            try {
                Thread.sleep(5000);
            }
            catch(Exception e){

            }
        }


    }
    @Test(priority = 1)
    public void pageSourceTest(){
       String pageSrc= driver.getPageSource();
        Assert.assertTrue(pageSrc.contains("Google"));
    }



    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
