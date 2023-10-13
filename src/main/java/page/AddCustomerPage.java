package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Add Contact']")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;

	public void varifyAddCustomer(String addCustomer) {
		Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), addCustomer, "Add customer page not found");
	}

	public void insertFullName(String fullName) {
		generateRandomNum(99999);
		FULL_NAME_ELEMENT.sendKeys(fullName + generateRandomNum(99999));

	}

	public void insetCompany(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
		

	}

	

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(99999) + email);

	}

}
