package testcases;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import pages.LoginPage;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest extends BaseTest {
	LoginPage loginpage;
	
	
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		init();
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
  @Test(priority=1)
  public void doLogin() throws IOException, ClassNotFoundException, SQLException, InterruptedException {
	  loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
  }
  


}
