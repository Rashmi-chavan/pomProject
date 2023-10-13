package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	// elements:@Findbyhow,using)(annotation)
	@FindBy(how = How.XPATH, using = "//input[@id='username']")	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")	WebElement SIGNIN_ELEMENT;

	// Intractable methods(parameterizing the value)
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);

	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void clickSigninButton() {
		SIGNIN_ELEMENT.click();

	}
	public void performLoign(String userName,String password) {
		USERNAME_ELEMENT.sendKeys( userName);
		PASSWORD_ELEMENT.sendKeys( password);
		PASSWORD_ELEMENT.click();
		
	}

}
