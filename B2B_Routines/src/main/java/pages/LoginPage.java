package pages;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.lang.model.element.ExecutableElement;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;
import reports.ExtentManager;


public class LoginPage extends BaseTest {
	
	Actions actions = new Actions(driver);
	Statement stmt;
	Connection con;
	
	
	@FindBy(id= "LoginName")
	WebElement LoginName;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id= "Login")
	WebElement Submit;
	
	@FindBy(id="Button1")
	WebElement Login;
	
	@FindBy(id="LoginImage")
	WebElement LoginImage;
	
	@FindBy(xpath="//*[@id=\"accountdtl\"]/b")
	private List<WebElement> accountName;
	
	@FindBy(xpath="//*[@id=\"mainHeader\"]/div[3]/nav/ul/li[5]/a")
	private WebElement AdminMenu;
	
	@FindBy(xpath="//*[@id=\"AdminBox\"]/ul/li")
	private List<WebElement> AdminMenuList;
	
	@FindBy(xpath="//*[@id=\"Active\"]/td[1]/a")
	private List<WebElement> CustomerList;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id="Save")
	private WebElement SaveButton;
	
	@FindBy(xpath="//*[@id=\"memberoptions\"]/li[2]/a")
	private WebElement Logout;
	
	

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public FlightPage login(String userName, String password) throws IOException, ClassNotFoundException, SQLException, InterruptedException {
		reports = ExtentManager.getReports();
		test =  reports.createTest("Access Flight Expert every 30 Minutes ");
		test.log(Status.INFO, "Opening URL: "+prop.getProperty("URL") );
		System.out.println("Opened the URL: " + prop.getProperty("URL"));		
		Thread.sleep(1000);
		takeScreenshot();
		LoginName.sendKeys(userName);
		Password.sendKeys(password);
		takeScreenshot();
		LoginImage.click();
		
//		switch(prop.getProperty("URL").trim()) {		
//		case "https://blisstourismb2b.techmaster.in/demo2.aspx":
//		{ Submit.click(); } break;
//		
//		case "https://bestdreamsb2b.techmaster.in/bestdreamb2b.aspx":
//		{ Login.click(); }break;
//		
//		case "https://gtsb2b.techmaster.in/GTS.aspx":
//		{ LoginImage.click(); }break;
//		
//		case "https://flightexpertb2b.techmaster.in/B2BLogin.aspx":
//		{ LoginImage.click(); }break;
//		
//		case "https://feadmincontrol.flightexpert.com/B2BLogin.aspx":
//		{ LoginImage.click(); }break;
//		
//		default :
//		{ Submit.click(); }
//		
//		}
		reports.flush();
		return new FlightPage();
		
		
	}
	
	
	
	
		
	
}
