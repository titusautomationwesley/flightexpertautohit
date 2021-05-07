package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import pages.FlightPage;
import pages.LoginPage;
import reports.ExtentManager;


public class FlightPageTest extends BaseTest {
	LoginPage  loginpage;
	FlightPage flightpage;
	ExtentTest test;
	ExtentReports reports;
	
	public FlightPageTest() throws IOException {
		super();		
	}
	
	@BeforeMethod
	public void setup() throws IOException, ClassNotFoundException, SQLException, InterruptedException {		
		init();
		loginpage = new LoginPage();
		flightpage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));		
	}
	
	
	@Test
	public void flightsearch() throws IOException, InterruptedException, AWTException {
		
		//flightpage.onewaySearch();
		flightpage.flightbooking();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
