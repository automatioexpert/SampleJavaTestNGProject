package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][]  data=  { {"user@sd.com","asd"},{"uer78@dsd.com","dsd78"}
        ,{"usere3747734@nsdsd.con","assjdsdsndsjdsdjdjsjdjdsdjdjsdjsj"}};

        return data;
    }

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String password){
    System.out.println("Email: "+email+" password: "+password);
    }
}
