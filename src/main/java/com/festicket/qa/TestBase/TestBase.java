package com.festicket.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.festicket.TestUtil.TestUtil;

public class TestBase {
	    public static WebDriver driver;
	    public static Properties prop;
	    public static String projectpath = System.getProperty("user.dir");

	    public TestBase() {
	        try {
	            prop = new Properties();
	            FileInputStream fis = new FileInputStream(projectpath + "//src/main/java/com/festicket/qa/config/config.properties");
	            prop.load(fis);

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	    public static void intialization() {
	        String browserName = prop.getProperty("browser");
	        if (browserName.equalsIgnoreCase("chrome")) {
	            System.setProperty("webdriver.chrome.driver", projectpath + "//Drivers/Chromedriver/chromedriver.exe");
	            driver = (WebDriver) new ChromeDriver();	        
	        }

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	        String url=prop.getProperty("url");
	        driver.get(url);


	    }
	}

