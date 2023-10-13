package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage{

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	// element
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']")WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[text()='Customers']")WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Customer']")WebElement ADD_CUSTOMER_MENU_ELEMENT;
	
	

	public void varifyDashboardPage(String dashboard) {
    	Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(),dashboard,"Dashboard page not found");
	}
	public void clickOnCustomerMenuButton() throws InterruptedException	{
		Thread.sleep(1000);
		CUSTOMER_MENU_ELEMENT.click();
		
	}

	public void clickOnAddCustomerMenuButton() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}
			
			
			

	
}