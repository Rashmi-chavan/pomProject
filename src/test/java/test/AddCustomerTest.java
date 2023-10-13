package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	//logindata
	String userName="demo@techfios.com";
	String password="abc123";
	//testdata
	String dashboard="Dashboard";
	String addCustomer="Add Contact";
	String fullName="Selenium";
	String company="Techfios";
	String email="demo@techfios.com";
	String phone="123456";
	String country="USA";
	
	
@Test
	public void userShouldBeAbleAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();
    LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
    //loginpage.performLoign(userName, password);
    loginpage.insertUserName(userName);
    loginpage.insertPassword(password);
    loginpage.clickSigninButton();
   
    DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
    dashboardPage.varifyDashboardPage(dashboard);
    dashboardPage.clickOnCustomerMenuButton();
    dashboardPage.clickOnAddCustomerMenuButton();
    
    AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
    addCustomerPage.varifyAddCustomer(addCustomer);
    addCustomerPage.insertFullName(fullName);
    addCustomerPage.insetCompany(company);
    addCustomerPage.insertEmail(email);
    

    
    
	}

}
