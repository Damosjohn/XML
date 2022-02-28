package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import util.BrowserFactory;
import util.Loginpage;

public class LoginTest {
	WebDriver driver;
	
	@Test
@Parameters({"username","password"})
	public void userShouldBeableToLogin(String username,String password) {
     driver= BrowserFactory.init();
     Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);
     loginpage.insertusername(username);
     loginpage.insertpassword(password);
     loginpage.clickonsigninbutton();
     
	}

}
