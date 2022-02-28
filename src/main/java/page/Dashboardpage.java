package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.testng.Assert;

public class Dashboardpage {
	WebDriver driver;
	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
	}
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[2]/a")
	WebElement DASHBOARDHEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMERHEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADDCUSTOMER_ELEMENT;;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LISTCUSTOMER_ELEMENT;
	public void verifydshboardheader() {
		String dashboartitle = DASHBOARDHEADER_ELEMENT.getText();
		System.out.println("................."+dashboartitle );
	Assert.assertEquals(dashboartitle , "Dashboard","wrong page!!!");
	}
	public void clickcustomerheader() {
		CUSTOMERHEADER_ELEMENT.click();
	}
	public void clickaddcustomer() {
		ADDCUSTOMER_ELEMENT.click();
		
	}
	public void clicklistcustomer() {
		LISTCUSTOMER_ELEMENT.click();
	}
}
