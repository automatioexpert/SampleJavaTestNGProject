package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProviderDemo {
    /*
    Calling data provider from different class
    We have to provide two parameter here in case we are calling data provider from different class

    1.DataProvider name 2.DataProviderClass
     */


    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProviderDemo.class)
    public void loginTest(String email,String password)
    {
     System.out.println("Email: "+email+" password: "+password);

    }
}
