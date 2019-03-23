package com.festicket.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.festicket.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	 //Page Factory
    @FindBy(xpath="//input[@id='emailInput']")
    WebElement email;

    @FindBy(xpath = "//input[@id='passwordInput']")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']//span[@class='sc-kGXeez jCrMHp'][contains(text(),'Log in')]")
    WebElement loginButton;
    
    
  //Page Factory Intitiazation

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    

  //Actions
  public String validateLoginPageTitle()
  {
      return driver.getTitle();
  }
 
  public HomePage login(String userName, String passWord ){
      email.sendKeys(userName);
      password.sendKeys(passWord);
      loginButton.click();
      return new HomePage();
    
    
}

}