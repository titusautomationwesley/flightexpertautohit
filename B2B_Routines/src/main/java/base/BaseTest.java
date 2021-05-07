package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
	public static ExtentTest test ;	
	public static ExtentReports reports;



	public BaseTest() throws IOException{
		
		// init the prop file
	if(prop==null){
		prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//Config//config.properties");
		prop.load(fs);			
				}
		}
	
	
	public static void init() {	
		switch(prop.getProperty("Browser")){
			case "Chrome":
			{
			String workingDirectory = System.getProperty("user.dir");			
			String ChromeDirectory = workingDirectory+"\\Config\\chromedriver.exe";			
			System.setProperty("webdriver.chrome.driver", ChromeDirectory);						
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("disable-infobars");
			options.addArguments("--start-maximized");
			//options.setExperimentalOption("useAutomationExtension", true);
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);		
			
			}
			break;
			case "Mozilla":
			{
			String workingDirectory = System.getProperty("user.dir");			
			String MozillaDirectory = workingDirectory+"\\Config\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",MozillaDirectory);
			driver = new FirefoxDriver();				
			}						
		}
		
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	
	}
	
	
	
	public void takeScreenshot() throws IOException {
		Date d = new Date();
		String screenShotfile = d.toString().replace(":", "_").replace(" ", "_")+".png";		
		String folderpath = ExtentManager.screenshotFolderPath;
		String filepath = folderpath+screenShotfile;
		//System.out.println(filepath);		
		File srcFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(filepath));				
		test.log(Status.INFO, filepath, MediaEntityBuilder.createScreenCaptureFromPath(filepath).build());						
	}

	public static String generateRandomName() {		
		String aToZ= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; 		
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 7; i++) {
	       int randIndex=rand.nextInt(aToZ.length()); 
	       res.append(aToZ.charAt(randIndex));            
	    }		    
	    return res.toString();
	}
	
	public boolean isElementPresent(List<WebElement> elementList){		
		if (elementList.size()==0)
			return false;
		else
			return true;		
	}
	
	
	
	
	
	
	}
	

