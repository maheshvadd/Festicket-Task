package com.festicket.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.festicket.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//ul[@class='app-components-menus-HorizontalMenu-styles__list']//span[@class='sc-iAyFgw eGPYzx'][contains(text(),'M')]")
	WebElement userLoginLabel;
	
	@FindBy(xpath="//div[@class='sc-cvbbAY hiQMyw']//h3[@class='sc-VigVT iVnnoe'][contains(text(),'Mahesh Vaddegani')]")
     WebElement loggedAsUser;
	
	//Page Factory Initialisation

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    
    public String verifyCorrectUser(){
    	userLoginLabel.click();
    	String loggedInUserName=loggedAsUser.getText();
		return loggedInUserName;
    	
    	
    }
	
}
