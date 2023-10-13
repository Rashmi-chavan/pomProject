package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	String userName="demo@techfios.com";
	String password="abc123";	
	String dashboard="Dashboard";	
	
	

	@Test
	public void validUserShouldBeAbletoLogin() {
		driver = BrowserFactory.init();
		// LoginPage loginPage=new Loginpage();creating an object for transferring an
		// object from one page to another
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashboardPage(dashboard);
		
		BrowserFactory.tearDown();

	}

}
