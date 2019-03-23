package com.festicket.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.festicket.qa.Pages.HomePage;
import com.festicket.qa.Pages.LoginPage;
import com.festicket.qa.TestBase.TestBase;

public class HomepageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();

	}

	@Test
	public void verifyCorrectUser() {
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage homepage = new HomePage();
		String LoggedInUser = homepage.verifyCorrectUser();
		Assert.assertEquals(LoggedInUser, "Mahesh Vaddegani");
		homepage.logout();

	}

	@AfterMethod
	public void tearDown() {
		 driver.close();
		 driver.quit();
	}

}
