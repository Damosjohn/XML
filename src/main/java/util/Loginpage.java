package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver= driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USERNAME_FIELDELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELDELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_FIELDELEMENT;
	
	public void insertusername(String username) {
		USERNAME_FIELDELEMENT.sendKeys(username);
	}
	public void insertpassword(String password) {
		USERNAME_FIELDELEMENT.sendKeys(password);
	}
	public void clickonsigninbutton() {
		USERNAME_FIELDELEMENT.click();
	}

}
