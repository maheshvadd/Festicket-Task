package com.festicket.qa.TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.festicket.qa.Pages.HomePage;
import com.festicket.qa.Pages.LoginPage;
import com.festicket.qa.TestBase.TestBase;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        intialization();
     
    }
 
    
    @Test
    public void loginTest(){
   loginPage=new LoginPage();
       homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
      

    }
@AfterMethod
    public void tearDown()
{
     driver.close();
     driver.quit();
}


}
