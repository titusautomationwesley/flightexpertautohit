package pages;

import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

import base.BaseTest;
import reports.ExtentManager;


public class FlightPage extends BaseTest {	
	
		
	Actions actions = new Actions(driver);

	WebDriverWait wait = new WebDriverWait(driver, 25);	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(how = How.ID, using = "oneway") 
	private WebElement oneway;
	
	@FindBy(how = How.ID, using = "AgentId2") 
	private WebElement selectAgent;
	
	@FindBy(xpath="//*[@id=\"searchpage\"]/div[2]/div[1]/div/div/a")
	private WebElement AgentSearchButton;
	
	@FindBy(xpath="//*[@id=\"AgencyList\"]/label[1]/a")
	private WebElement firstSAgentFromSearchButton;
	
	@FindBy(xpath="//li[@class='ui-menu-item']/div[1]")
	private WebElement firstAgent;
		
	@FindBy(id="Origin")
	private WebElement origin;

	@FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']")
	List<WebElement> selectFirstCityfromtheList;
	
	@FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'][3]/li/div")
	private WebElement firstSourceCity;
		
	//@FindBy(xpath="//div[contains(.,'DEL')]")
	
	@FindBy(id="Destination")
	private WebElement destination;
	
	@FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'][4]/li/div")
	private WebElement firstDestinationCity;
	
	@FindBy(id="DepDate")
	private WebElement departureDate;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[7]/a")
	private WebElement selectDate;
	
	@FindBy(id="Search")
	private WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"PublishFare-0\"]/a/span")
	private WebElement selectFlight;
		
	@FindBy(id="titlePax-1") 
	private WebElement TitlePax1;  @FindBy(id="titlePax-2") private WebElement TitlePax2;  @FindBy(id="titlePax-3") private WebElement TitlePax3; 	@FindBy(id="titlePax-4") private WebElement TitlePax4; @FindBy(id="titlePax-5") private WebElement TitlePax5; @FindBy(id="titlePax-6") private WebElement TitlePax6;	@FindBy(id="titlePax-7") private WebElement TitlePax7; @FindBy(id="titlePax-8") private WebElement TitlePax8; @FindBy(id="titlePax-9") private WebElement TitlePax9;
	
	@FindBy(id="FirstName1") 
	private WebElement FirstName1;	 @FindBy(id="FirstName2") private WebElement FirstName2;	@FindBy(id="FirstName3") private WebElement FirstName3;	@FindBy(id="FirstName4") private WebElement FirstName4;	@FindBy(id="FirstName5") private WebElement FirstName5;	@FindBy(id="FirstName6") private WebElement FirstName6;	@FindBy(id="FirstName7") private WebElement FirstName7;	@FindBy(id="FirstName8") private WebElement FirstName8;	@FindBy(id="FirstName9") private WebElement FirstName9;
	
	@FindBy(id="LastName1") 
	private WebElement LastName1;	 @FindBy(id="LastName2") private WebElement LastName2;	@FindBy(id="LastName3") private WebElement LastName3;	@FindBy(id="LastName4") private WebElement LastName4;	@FindBy(id="LastName5") private WebElement LastName5;	@FindBy(id="LastName6") private WebElement LastName6;	@FindBy(id="LastName7") private WebElement LastName7;	@FindBy(id="LastName8") private WebElement LastName8;	@FindBy(id="LastName9") private WebElement LastName9;
	
	@FindBy(id="DOBDay1") 
	private WebElement DOBDay1;	     @FindBy(id="DOBDay2") private WebElement DOBDay2;	@FindBy(id="DOBDay3") private WebElement DOBDay3;	@FindBy(id="DOBDay4") private WebElement DOBDay4;	@FindBy(id="DOBDay5") private WebElement DOBDay5;	@FindBy(id="DOBDay6") private WebElement DOBDay6;	@FindBy(id="DOBDay7") private WebElement DOBDay7;	@FindBy(id="DOBDay8") private WebElement DOBDay8;	@FindBy(id="DOBDay9") private WebElement DOBDay9;
	
	@FindBy(id="DOBMonth1") 
	private WebElement DOBMonth1; 	@FindBy(id="DOBMonth2") private WebElement DOBMonth2;	@FindBy(id="DOBMonth3") private WebElement DOBMonth3;	@FindBy(id="DOBMonth4") private WebElement DOBMonth4;	@FindBy(id="DOBMonth5") private WebElement DOBMonth5;	@FindBy(id="DOBMonth6") private WebElement DOBMonth6;	@FindBy(id="DOBMonth7") private WebElement DOBMonth7;	@FindBy(id="DOBMonth8") private WebElement DOBMonth8;	@FindBy(id="DOBMonth9") private WebElement DOBMonth9;
		
	@FindBy(id="DOBYear1") 
	private WebElement DOBYear1;	@FindBy(id="DOBYear2") private WebElement DOBYear2;	@FindBy(id="DOBYear3") private WebElement DOBYear3;	@FindBy(id="DOBYear4") private WebElement DOBYear4;	@FindBy(id="DOBYear5") private WebElement DOBYear5;	@FindBy(id="DOBYear6") private WebElement DOBYear6;	@FindBy(id="DOBYear7") private WebElement DOBYear7;	@FindBy(id="DOBYear8") private WebElement DOBYear8;	@FindBy(id="DOBYear9") private WebElement DOBYear9;
	
	
	@FindBy(id="Email1")
	private WebElement Email1;
	
	@FindBy(id="Phone1")
	private WebElement Phone1;
	
	@FindBy(id="AddressLine11")
	private WebElement AddressLine11;
	
	@FindBy(id="City1")
	private WebElement City1;
		
	@FindBy(id="CountryCode1")
	private WebElement CountryCode1;
	
	@FindBy(id="Nationality1")
	private WebElement Nationality1;
	
	@FindBy(id="passportNo1") 
	private WebElement passportNo1; @FindBy(id="passportNo2") private WebElement passportNo2; @FindBy(id="passportNo3") private WebElement passportNo3;	@FindBy(id="passportNo4") private WebElement passportNo4;	@FindBy(id="passportNo5") private WebElement passportNo5;	@FindBy(id="passportNo6") private WebElement passportNo6;	@FindBy(id="passportNo7") private WebElement passportNo7;	@FindBy(id="passportNo8") private WebElement passportNo8;	@FindBy(id="passportNo9") private WebElement passportNo9;
	
	
	@FindBy(id="passExpDay1") 
	private WebElement passExpDay1;	@FindBy(id="passExpDay2") private WebElement passExpDay2;	@FindBy(id="passExpDay3") private WebElement passExpDay3;	@FindBy(id="passExpDay4") private WebElement passExpDay4;	@FindBy(id="passExpDay5") private WebElement passExpDay5;	@FindBy(id="passExpDay6") private WebElement passExpDay6;	@FindBy(id="passExpDay7") private WebElement passExpDay7;	@FindBy(id="passExpDay8") private WebElement passExpDay8;	@FindBy(id="passExpDay9") private WebElement passExpDay9;
	
	@FindBy(id="passExpMonth1") 
	private WebElement passExpMonth1;	@FindBy(id="passExpMonth2") private WebElement passExpMonth2;	@FindBy(id="passExpMonth3") private WebElement passExpMonth3;	@FindBy(id="passExpMonth4") private WebElement passExpMonth4;	@FindBy(id="passExpMonth5") private WebElement passExpMonth5;	@FindBy(id="passExpMonth6") private WebElement passExpMonth6;	@FindBy(id="passExpMonth7") private WebElement passExpMonth7;	@FindBy(id="passExpMonth8") private WebElement passExpMonth8;	@FindBy(id="passExpMonth9") private WebElement passExpMonth9;	
	
	@FindBy(id="passExpYear1") 
	private WebElement passExpYear1; @FindBy(id="passExpYear2") private WebElement passExpYear2;	@FindBy(id="passExpYear3") private WebElement passExpYear3;	@FindBy(id="passExpYear4") private WebElement passExpYear4;	@FindBy(id="passExpYear5") private WebElement passExpYear5;	@FindBy(id="passExpYear6") private WebElement passExpYear6;	@FindBy(id="passExpYear7") private WebElement passExpYear7;	@FindBy(id="passExpYear8") private WebElement passExpYear8;	@FindBy(id="passExpYear9") private WebElement passExpYear9;

	@FindBy(id="remarks")
	private WebElement bookingRemarks;
	
	@FindBy(xpath="//*[@id=\"PaxDetail\"]/div[4]/a")
	private WebElement Proceed_to_Review_Booking_button;
	
	@FindBy(xpath="/html/body/main/div[1]/div[2]/div[1]/h1")
	private WebElement BookingOnBehalfOfAgent;
	
	@FindBy(id="TermsAccepted")
	private WebElement TermsAccepted;
	
	@FindBy(id="TicketButton")
	private WebElement TicketButton;
	
	@FindBy(xpath="//*[@id=\"ConfirmBookingLoad\"]/div[4]/input[1]")
	private WebElement confirmBoookingYesButton ;
	
	// Return Search
	@FindBy(id="returnway")
	private WebElement returntab;
	
	@FindBy(id="ReturnDate")
	private WebElement ReturnDate;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[7]/a")
	private WebElement selectReturnDate;
	
	@FindBy(id="multiStop")
	private WebElement multistoptab;
	
	@FindBy(id="from")
	private WebElement fromCity1Multistop;
	
	@FindBy(xpath="//li[@class='autoAirItem ui-menu-item']/div")	
	private WebElement selectfirstFromCityMultistop1;
	

	@FindBy(id="to")
	private WebElement toCity1Multistop;
	
	//@FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'][2]/li/div")
	//@FindBy(xpath="/html/body/ul[2]/li[1]/div")
	@FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'][2]/li[1]/div/text()[2]")
	private WebElement selectfirstToCityMultistop1;	
	
	@FindBy(xpath="//li[@class='autoAirItem ui-menu-item']/div/text()")
	private List<WebElement> listOfCities;
	
	@FindBy(id="depTime")
	private WebElement depDateMultistop1;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[7]/a")
	private WebElement selectDateMultistop1;
	
	@FindBy(id="addItenary")
	private WebElement addItenaryButton;
	
	
	@FindBy(xpath="//label[@for='from']/span")
	private WebElement whereFrom;
	
	@FindBy(xpath="//ul[@tabindex=\"0\"][1]")
	private WebElement divDestination;
	
	@FindBy(xpath="//*[@id=\"searchRes\"]/div[2]/div[2]/small")
	private WebElement BookingOnBehalfOf;
	
	@FindBy(id="SessionIdSort")
	private WebElement sessionid;
	
	@FindBy(xpath="//*[@id=\"Form2\"]/div[9]/div[1]/b[1]")
	private WebElement AirlineRefLabel;
	
	@FindBy(xpath="//div[@class='vchrheader']/mark")
	private WebElement BookingStatus;
	
	@FindBy(xpath="//div[@class='vchrheader']/span[1]")
	private WebElement PNR;
	
	@FindBy(xpath="//*[@id='mainHeader']/div[3]/nav/ul/li[1]/a")
	private WebElement flightMenu;
	
	@FindBy(xpath="//*[@id='Flightbox']/ul/li[1]/a")
	private WebElement flightSearch;
	
	@FindBy(xpath="//*[@id=\"Flightbox\"]/ul/li")
	private List <WebElement> FlightmenuItems;
	
	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard1\"]") 
	private List <WebElement> Baggages1; 	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard2\"]") private List <WebElement> Baggages2;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard3\"]") private List <WebElement> Baggages3;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard4\"]") private List <WebElement> Baggages4;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard5\"]") private List <WebElement> Baggages5;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard6\"]") private List <WebElement> Baggages6;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard7\"]") private List <WebElement> Baggages7;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard8\"]") private List <WebElement> Baggages8;	@FindBy(xpath="//*[@id=\"BaggagePreferenceOutWard9\"]") private List <WebElement> Baggages9;	
	
	@FindBy(id="lblPassport")
	List<WebElement> lblPassport;
	
	@FindBy(id="lblPassportIssueDate")
	List<WebElement> lblPassportIssueDate;
	
	@FindBy(id="lblPassportExpiry")
	List<WebElement> lblPassportExpiry;
	
	@FindBy(id="lblPassportCountry")
	List<WebElement> lblPassportCountry;

	@FindBy(id="passIssueDay1") 
	private WebElement passIssueDateDay1;	@FindBy(id="passIssueDay2") private WebElement passIssueDateDay2;	@FindBy(id="passIssueDay3") private WebElement passIssueDateDay3;	@FindBy(id="passIssueDay4") private WebElement passIssueDateDay4;	@FindBy(id="passIssueDay5") private WebElement passIssueDateDay5;	@FindBy(id="passIssueDay6") private WebElement passIssueDateDay6;	@FindBy(id="passIssueDay7") private WebElement passIssueDateDay7;	@FindBy(id="passIssueDay8") private WebElement passIssueDateDay8;	@FindBy(id="passIssueDay9") private WebElement passIssueDateDay9;
	
	@FindBy(id="passIssueMonth1") 
	private WebElement passIssueDateMonth1; @FindBy(id="passIssueMonth2") private WebElement passIssueDateMonth2;	@FindBy(id="passIssueMonth3") private WebElement passIssueDateMonth3;	@FindBy(id="passIssueMonth4") private WebElement passIssueDateMonth4;	@FindBy(id="passIssueMonth5") private WebElement passIssueDateMonth5;	@FindBy(id="passIssueMonth6") private WebElement passIssueDateMonth6;	@FindBy(id="passIssueMonth7") private WebElement passIssueDateMonth7;	@FindBy(id="passIssueMonth8") private WebElement passIssueDateMonth8;	@FindBy(id="passIssueMonth9") private WebElement passIssueDateMonth9;
	
	@FindBy(id="passIssueYear1") 
	private WebElement passIssueDateYear1; 	@FindBy(id="passIssueYear2") private WebElement passIssueDateYear2;	@FindBy(id="passIssueYear3") private WebElement passIssueDateYear3;	@FindBy(id="passIssueYear4") private WebElement passIssueDateYear4;	@FindBy(id="passIssueYear5") private WebElement passIssueDateYear5;	@FindBy(id="passIssueYear6") private WebElement passIssueDateYear6;	@FindBy(id="passIssueYear7") private WebElement passIssueDateYear7; @FindBy(id="passIssueYear8") private WebElement passIssueDateYear8;	@FindBy(id="passIssueYear9") private WebElement passIssueDateYear9;
	
	@FindBy(id="PassportCountry1") 
	private WebElement PassportCountry1; @FindBy(id="PassportCountry2") private WebElement PassportCountry2;	@FindBy(id="PassportCountry3") private WebElement PassportCountry3;	@FindBy(id="PassportCountry4") private WebElement PassportCountry4;	@FindBy(id="PassportCountry5") private WebElement PassportCountry5;	@FindBy(id="PassportCountry6") private WebElement PassportCountry6;	@FindBy(id="PassportCountry7") private WebElement PassportCountry7;	@FindBy(id="PassportCountry8") private WebElement PassportCountry8;	@FindBy(id="PassportCountry9") private WebElement PassportCountry9;
		
	@FindBy(id="PaxClass")
	private WebElement PaxClassAndNumberOfPax;
	
	@FindBy(id="BookingClass")
	private WebElement BookingClass;
	
	@FindBy(id="Adult")
	private WebElement AdultPax;
	
	@FindBy(id="Child")
	private WebElement ChildPax;
	
	@FindBy(id="Infant")
	private WebElement InfantPax;
	
	@FindBy(id="PreferredAirlineAuto")
	private WebElement PreferredAirline;
	
	@FindBy(xpath="//*[@id=\"selectUnselectSource\"]/a[2]")
	//List<WebElement> UnselectSources;
	private WebElement UnselectSources;
	
	@FindBy(xpath="//*[@id=\"SelectAll\"]")
	private WebElement SelectAllSources;
	
	
	@FindBy(xpath="//*[@id=\"Amadeus\"]/span")
	private WebElement AmadeusLabel;
	
	@FindBy(xpath="//*[@id=\"TBOAir\"]/span")
	private WebElement TBOAirLabel;
	
	@FindBy(xpath="//*[@id=\"TBOAirIntl\"]/span")
	private WebElement TBOAirIntlLabel;
	
	
	
	
	

	public FlightPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	public void flightbooking() throws IOException, InterruptedException, AWTException {
				
		test =  reports.createTest("Flight Search");		
		wait.until(ExpectedConditions.visibilityOf(flightMenu));
		actions.moveToElement(flightMenu).build().perform();
		//flightMenu.click();
		//Thread.sleep(1000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", FlightmenuItems.get(0) );
		Thread.sleep(1000);
		for(int i=0;i<FlightmenuItems.size();i++) {
			if (FlightmenuItems.get(i).getText().equalsIgnoreCase("Search"))
				FlightmenuItems.get(i).click();
		}
		takeScreenshot();

//		wait.until(ExpectedConditions.visibilityOf(flightSearch));
//		actions.moveToElement(flightSearch).build().perform();
//		flightSearch.click();
		
		
				
//		switch(prop.getProperty("JourneyType").trim()) {
//		
//			case "Oneway":
//			{	
//				
//				test.log(Status.INFO, "Oneway Search");
//				oneway.click();
//				//selectAgent.click();
//				//selectAgent.sendKeys(prop.getProperty("AgentName"));	
//				AgentSearchButton.click();
//				firstSAgentFromSearchButton.click();
//				//firstAgent.click();
//				origin.click();
//				origin.sendKeys(prop.getProperty("sourceCity"));
//				Thread.sleep(1000);
//				if (isElementPresent(selectFirstCityfromtheList)) {
//					Thread.sleep(1000);
//					origin.sendKeys(Keys.ENTER);}								
//				else {
//					wait.until(ExpectedConditions.visibilityOf(firstSourceCity));
//					firstSourceCity.click();}			
//				destination.click();
//				destination.sendKeys(prop.getProperty("DestinationCity"));
//				Thread.sleep(1000);
//				destination.sendKeys(Keys.ENTER);
//				//wait.until(ExpectedConditions.visibilityOf(firstDestinationCity));
//				//firstDestinationCity.click();	
//				
//				departureDate.click();
//				selectDate.click();
//				reports.flush();
//			}
//			break;
//			
//			
//			case "Return":
//			{			
//				test.log(Status.INFO, "Return Search");
//				returntab.click();
//				selectAgent.click();
//				selectAgent.sendKeys(prop.getProperty("AgentName"));			
//				firstAgent.click();
//				origin.click();
//				origin.sendKeys(prop.getProperty("sourceCity"));
//				wait.until(ExpectedConditions.visibilityOf(firstSourceCity));
//				firstSourceCity.click();			
//				destination.click();
//				destination.sendKeys(prop.getProperty("DestinationCity"));
//				wait.until(ExpectedConditions.visibilityOf(firstDestinationCity));
//				firstDestinationCity.click();			
//				departureDate.click();
//				selectDate.click();
//				ReturnDate.click();
//				selectReturnDate.click();
//				reports.flush();
//				
//			}
//			break;
//			
//			case "Multistop":
//			{		
//				test.log(Status.INFO, "Multistop Search");
//				multistoptab.click();
//				wait.until(ExpectedConditions.visibilityOf(addItenaryButton));
//				wait.until(ExpectedConditions.visibilityOf(selectAgent));
//				selectAgent.click();
//				selectAgent.sendKeys(prop.getProperty("AgentName"));			
//				firstAgent.click();		
//									
//				fromCity1Multistop.sendKeys(prop.getProperty("sourceCity"));
//				wait.until(ExpectedConditions.visibilityOf(selectfirstFromCityMultistop1));
//				System.out.println("selectfirstFromCityMultistop1: "+selectfirstFromCityMultistop1.getText());
//				selectfirstFromCityMultistop1.click();	
//				
//			
//				toCity1Multistop.sendKeys(prop.getProperty("DestinationCity"));
//				//System.out.println("selectfirstToCityMultistop1: "+selectfirstToCityMultistop1.getText());
//				//ystem.out.println("List of Cities  :"+listOfCities.get(3).getText().toString()); 
//				Thread.sleep(2000);
//				//JavascriptExecutor js = (JavascriptExecutor) driver;
//				//js.executeScript("arguments[0].scrollIntoView(true);",selectfirstToCityMultistop1 );	
//				WebElement testcity = driver.findElement(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'][2]/li[1]/div/text()[2]"));
//				System.out.println("Test City "+testcity.toString());
//				
//				//actions.moveToElement(selectfirstToCityMultistop1).build().perform();
//				System.out.println("selectfirstToCityMultistop1: "+selectfirstToCityMultistop1);
//				//wait.until(ExpectedConditions.visibilityOf(selectfirstToCityMultistop1.getText()));			
//				selectfirstToCityMultistop1.click();
//
//				//wait.until(ExpectedConditions.visibilityOf(selectfirstToCityMultistop1));
//				//actions.moveToElement(selectfirstToCityMultistop1).build().perform();
//				//wait.until(ExpectedConditions.elementToBeClickable(selectfirstToCityMultistop1));						
//				//actions.doubleClick(selectfirstToCityMultistop1).perform();
//				//actions.moveToElement(divDestination).build().perform();				
//				//selectfirstToCityMultistop1.sendKeys(Keys.ENTER);
//
//				depDateMultistop1.click();
//				selectDateMultistop1.click();
//				addItenaryButton.click();
//				toCity1Multistop.click();
//				toCity1Multistop.sendKeys(prop.getProperty("DestinationCity1Multistop"));
//				wait.until(ExpectedConditions.visibilityOf(selectfirstToCityMultistop1));
//				selectfirstToCityMultistop1.click();
//				depDateMultistop1.click();
//				selectDateMultistop1.click();
//				addItenaryButton.click();
//				reports.flush();
//			}
//			break;		
//		}
//		
//		if(prop.getProperty("ChangeBookingClassAndAdultChildInfantPaxNumbers").equalsIgnoreCase("Yes")){
//			js.executeScript("window.scrollBy(0,1000)");
//			actions.moveToElement(PaxClassAndNumberOfPax).build().perform();
//			PaxClassAndNumberOfPax.click();
//			Select bookingClass = new Select(BookingClass);
//			bookingClass.selectByVisibleText(prop.getProperty("BookingClass"));
//			AdultPax.click();
//			Select NumberOfAdult = new Select(AdultPax);
//			NumberOfAdult.selectByVisibleText(prop.getProperty("AdultCount"));
//			Select NumberOfChild = new Select(ChildPax);
//			NumberOfChild.selectByVisibleText(prop.getProperty("ChildCount"));
//			Select NumberOfInfant = new Select(InfantPax);
//			NumberOfInfant.selectByVisibleText(prop.getProperty("InfantCount"));
//			
//			Thread.sleep(2000);
//			//actions.moveToElement(PreferredAirline).build().perform();
//			PreferredAirline.click();
//		}
//		
//		
//		//if(isElementPresent(UnselectSources))
//			//UnselectSources.get(0).click();
//		if(UnselectSources.isDisplayed()) 
//		{
//			UnselectSources.click();
//			switch(prop.getProperty("Source").trim()) {
//			
//				case "AllSources":{
//					SelectAllSources.click();}break;
//			
//				case "Amadeus":{
//					AmadeusLabel.click();}break;
//				
//				case "TBOAir":{
//					TBOAirLabel.click();}break;
//				
//				case "TBoAirInternational":{
//					TBOAirIntlLabel.click();}break;}
//		}
//		Thread.sleep(3000);
//		searchButton.click();		
//		wait.until(ExpectedConditions.visibilityOf(BookingOnBehalfOf));
//		System.out.println("sessionid: "+sessionid.getAttribute("value"));
//		test.log(Status.INFO, "Session Id:"+sessionid.getAttribute("value"));
//		test.log(Status.PASS, "Flight Results Page");
//		takeScreenshot();
//		selectFlight.click();
//		wait.until(ExpectedConditions.visibilityOf(TitlePax1));		
//		test.log(Status.PASS, "Flight Pax Page");		
//		takeScreenshot();
//		reports.flush();
//				
//		Select title = new Select(TitlePax1);		
//		title.selectByVisibleText(prop.getProperty("NameTitle"));
//		FirstName1.clear();		
//		FirstName1.sendKeys(generateRandomName());
//		LastName1.clear();
//		LastName1.sendKeys(generateRandomName());		
//		DOBDay1.clear();
//		DOBDay1.sendKeys(prop.getProperty("DOBDate1"));		
//		Select selectMonthDOB1 = new Select(DOBMonth1);
//		selectMonthDOB1.selectByVisibleText(prop.getProperty("DOBMonth"));
//		DOBYear1.clear();
//		DOBYear1.sendKeys(prop.getProperty("DOBYear"));
//		Email1.clear();
//		Email1.sendKeys(prop.getProperty("Email"));
//		Phone1.clear();
//		Phone1.sendKeys(prop.getProperty("MobileNo"));
//		AddressLine11.clear();
//		AddressLine11.sendKeys(prop.getProperty("Address"));
//		City1.clear();
//		City1.sendKeys(prop.getProperty("City"));
//		
//		Select country = new Select(CountryCode1);
//		country.selectByVisibleText(prop.getProperty("Country"));		
//		Select nationality = new Select(Nationality1);
//		nationality.selectByVisibleText(prop.getProperty("Nationality"));
//		js.executeScript("window.scrollBy(0,1000)");
//		
//		if(isElementPresent(lblPassport)) {			
//				passportNo1.clear();				
//				passportNo1.sendKeys(prop.getProperty("PassportNo"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay1.clear();
//					passExpDay1.sendKeys(prop.getProperty("passExpDateDayPax1"));
//					selectDropdown(passExpMonth1, prop.getProperty("passExpDateMonthPax1"));			
//					passExpYear1.clear();
//					passExpYear1.sendKeys(prop.getProperty("passExpDateYearPax1"));}}
//				
//		if(prop.getProperty("Source").trim().equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay1.clear();
//				passIssueDateDay1.sendKeys(prop.getProperty("PassportIssueDateDayPax1"));
//				selectDropdown(passIssueDateMonth1, prop.getProperty("PassportIssueDateMonthPax1"));
//				passIssueDateYear1.clear();
//				passIssueDateYear1.sendKeys(prop.getProperty("PassportIssueDateYearPax1"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry1, prop.getProperty("PassportIssueCountryPax1"));}
//			if(isElementPresent(Baggages1)) {
//				Select selectBaggage = new Select(Baggages1.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}
//		
//		
//		
//		if(prop.getProperty("ChangeBookingClassAndAdultChildInfantPaxNumbers").equalsIgnoreCase("Yes")) {
//			switch (prop.getProperty("AdultCount").trim()) {
//		
//			case "2":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}				
//			}break;
//				
//			
//			case "3":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//			
//			}break;
//			
//			case "4":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//			
//			}break;
//			
//			case "5":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//	
//	
//	Select titlePax5 = new Select(TitlePax5);		
//	titlePax5.selectByVisibleText(prop.getProperty("NameTitle5"));
//	FirstName5.clear();		
//	FirstName5.sendKeys(generateRandomName());
//	LastName5.clear();
//	LastName5.sendKeys(generateRandomName());		
//	DOBDay5.clear();
//	DOBDay5.sendKeys(prop.getProperty("DOBDate5"));		
//	Select selectMonthDOB5 = new Select(DOBMonth5);
//	selectMonthDOB5.selectByVisibleText(prop.getProperty("DOBMonth5"));
//	DOBYear5.clear();
//	DOBYear5.sendKeys(prop.getProperty("DOBYear5")); 
//	if(isElementPresent(lblPassport)) {			
//		passportNo5.clear();				
//		passportNo5.sendKeys(prop.getProperty("PassportNo5"));
//		if(isElementPresent(lblPassportExpiry)){
//			passExpDay5.clear();
//			passExpDay5.sendKeys(prop.getProperty("passExpDateDayPax5"));
//			selectDropdown(passExpMonth5, prop.getProperty("passExpDateMonthPax5"));			
//			passExpYear5.clear();
//			passExpYear5.sendKeys(prop.getProperty("passExpDateYearPax5"));}}					
//if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//	if(isElementPresent(lblPassportIssueDate)) {
//		passIssueDateDay5.clear();
//		passIssueDateDay5.sendKeys(prop.getProperty("PassportIssueDateDayPax5"));
//		selectDropdown(passIssueDateMonth5, prop.getProperty("PassportIssueDateMonthPax5"));
//		passIssueDateYear5.clear();
//		passIssueDateYear5.sendKeys(prop.getProperty("PassportIssueDateYearPax5"));	}
//	if(isElementPresent(lblPassportCountry)) {
//		selectDropdown(PassportCountry5, prop.getProperty("PassportIssueCountryPax5"));}
//	if(isElementPresent(Baggages5)) {
//		Select selectBaggage = new Select(Baggages5.get(0));
//		selectBaggage.selectByVisibleText("No baggage required");}}			
//			}break;
//			
//			case "6":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//	
//	
//		Select titlePax5 = new Select(TitlePax5);		
//		titlePax5.selectByVisibleText(prop.getProperty("NameTitle5"));
//		FirstName5.clear();		
//		FirstName5.sendKeys(generateRandomName());
//		LastName5.clear();
//		LastName5.sendKeys(generateRandomName());		
//		DOBDay5.clear();
//		DOBDay5.sendKeys(prop.getProperty("DOBDate5"));		
//		Select selectMonthDOB5 = new Select(DOBMonth5);
//		selectMonthDOB5.selectByVisibleText(prop.getProperty("DOBMonth5"));
//		DOBYear5.clear();
//		DOBYear5.sendKeys(prop.getProperty("DOBYear5")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo5.clear();				
//			passportNo5.sendKeys(prop.getProperty("PassportNo5"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay5.clear();
//				passExpDay5.sendKeys(prop.getProperty("passExpDateDayPax5"));
//				selectDropdown(passExpMonth5, prop.getProperty("passExpDateMonthPax5"));			
//				passExpYear5.clear();
//				passExpYear5.sendKeys(prop.getProperty("passExpDateYearPax5"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay5.clear();
//			passIssueDateDay5.sendKeys(prop.getProperty("PassportIssueDateDayPax5"));
//			selectDropdown(passIssueDateMonth5, prop.getProperty("PassportIssueDateMonthPax5"));
//			passIssueDateYear5.clear();
//			passIssueDateYear5.sendKeys(prop.getProperty("PassportIssueDateYearPax5"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry5, prop.getProperty("PassportIssueCountryPax5"));}
//		if(isElementPresent(Baggages5)) {
//			Select selectBaggage = new Select(Baggages5.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//
//
//		Select titlePax6 = new Select(TitlePax6);		
//		titlePax6.selectByVisibleText(prop.getProperty("NameTitle6"));
//		FirstName6.clear();		
//		FirstName6.sendKeys(generateRandomName());
//		LastName6.clear();
//		LastName6.sendKeys(generateRandomName());		
//		DOBDay6.clear();
//		DOBDay6.sendKeys(prop.getProperty("DOBDate6"));		
//		Select selectMonthDOB6 = new Select(DOBMonth6);
//		selectMonthDOB6.selectByVisibleText(prop.getProperty("DOBMonth6"));
//		DOBYear6.clear();
//		DOBYear6.sendKeys(prop.getProperty("DOBYear6")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo6.clear();				
//			passportNo6.sendKeys(prop.getProperty("PassportNo6"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay6.clear();
//				passExpDay6.sendKeys(prop.getProperty("passExpDateDayPax6"));
//				selectDropdown(passExpMonth6, prop.getProperty("passExpDateMonthPax6"));			
//				passExpYear6.clear();
//				passExpYear6.sendKeys(prop.getProperty("passExpDateYearPax6"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay6.clear();
//			passIssueDateDay6.sendKeys(prop.getProperty("PassportIssueDateDayPax6"));
//			selectDropdown(passIssueDateMonth6, prop.getProperty("PassportIssueDateMonthPax6"));
//			passIssueDateYear6.clear();
//			passIssueDateYear6.sendKeys(prop.getProperty("PassportIssueDateYearPax6"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry6, prop.getProperty("PassportIssueCountryPax6"));}
//		if(isElementPresent(Baggages6)) {
//			Select selectBaggage = new Select(Baggages6.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//			}break;
//			
//			case "7":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//	
//	
//		Select titlePax5 = new Select(TitlePax5);		
//		titlePax5.selectByVisibleText(prop.getProperty("NameTitle5"));
//		FirstName5.clear();		
//		FirstName5.sendKeys(generateRandomName());
//		LastName5.clear();
//		LastName5.sendKeys(generateRandomName());		
//		DOBDay5.clear();
//		DOBDay5.sendKeys(prop.getProperty("DOBDate5"));		
//		Select selectMonthDOB5 = new Select(DOBMonth5);
//		selectMonthDOB5.selectByVisibleText(prop.getProperty("DOBMonth5"));
//		DOBYear5.clear();
//		DOBYear5.sendKeys(prop.getProperty("DOBYear5")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo5.clear();				
//			passportNo5.sendKeys(prop.getProperty("PassportNo5"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay5.clear();
//				passExpDay5.sendKeys(prop.getProperty("passExpDateDayPax5"));
//				selectDropdown(passExpMonth5, prop.getProperty("passExpDateMonthPax5"));			
//				passExpYear5.clear();
//				passExpYear5.sendKeys(prop.getProperty("passExpDateYearPax5"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay5.clear();
//			passIssueDateDay5.sendKeys(prop.getProperty("PassportIssueDateDayPax5"));
//			selectDropdown(passIssueDateMonth5, prop.getProperty("PassportIssueDateMonthPax5"));
//			passIssueDateYear5.clear();
//			passIssueDateYear5.sendKeys(prop.getProperty("PassportIssueDateYearPax5"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry5, prop.getProperty("PassportIssueCountryPax5"));}
//		if(isElementPresent(Baggages5)) {
//			Select selectBaggage = new Select(Baggages5.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//
//
//		Select titlePax6 = new Select(TitlePax6);		
//		titlePax6.selectByVisibleText(prop.getProperty("NameTitle6"));
//		FirstName6.clear();		
//		FirstName6.sendKeys(generateRandomName());
//		LastName6.clear();
//		LastName6.sendKeys(generateRandomName());		
//		DOBDay6.clear();
//		DOBDay6.sendKeys(prop.getProperty("DOBDate6"));		
//		Select selectMonthDOB6 = new Select(DOBMonth6);
//		selectMonthDOB6.selectByVisibleText(prop.getProperty("DOBMonth6"));
//		DOBYear6.clear();
//		DOBYear6.sendKeys(prop.getProperty("DOBYear6")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo6.clear();				
//			passportNo6.sendKeys(prop.getProperty("PassportNo6"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay6.clear();
//				passExpDay6.sendKeys(prop.getProperty("passExpDateDayPax6"));
//				selectDropdown(passExpMonth6, prop.getProperty("passExpDateMonthPax6"));			
//				passExpYear6.clear();
//				passExpYear6.sendKeys(prop.getProperty("passExpDateYearPax6"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay6.clear();
//			passIssueDateDay6.sendKeys(prop.getProperty("PassportIssueDateDayPax6"));
//			selectDropdown(passIssueDateMonth6, prop.getProperty("PassportIssueDateMonthPax6"));
//			passIssueDateYear6.clear();
//			passIssueDateYear6.sendKeys(prop.getProperty("PassportIssueDateYearPax6"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry6, prop.getProperty("PassportIssueCountryPax6"));}
//		if(isElementPresent(Baggages6)) {
//			Select selectBaggage = new Select(Baggages6.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		Select titlePax7 = new Select(TitlePax7);		
//		titlePax7.selectByVisibleText(prop.getProperty("NameTitle7"));
//		FirstName7.clear();		
//		FirstName7.sendKeys(generateRandomName());
//		LastName7.clear();
//		LastName7.sendKeys(generateRandomName());		
//		DOBDay7.clear();
//		DOBDay7.sendKeys(prop.getProperty("DOBDate7"));		
//		Select selectMonthDOB7 = new Select(DOBMonth7);
//		selectMonthDOB7.selectByVisibleText(prop.getProperty("DOBMonth7"));
//		DOBYear7.clear();
//		DOBYear7.sendKeys(prop.getProperty("DOBYear7")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo7.clear();				
//			passportNo7.sendKeys(prop.getProperty("PassportNo7"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay7.clear();
//				passExpDay7.sendKeys(prop.getProperty("passExpDateDayPax7"));
//				selectDropdown(passExpMonth7, prop.getProperty("passExpDateMonthPax7"));			
//				passExpYear7.clear();
//				passExpYear7.sendKeys(prop.getProperty("passExpDateYearPax7"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay7.clear();
//			passIssueDateDay7.sendKeys(prop.getProperty("PassportIssueDateDayPax7"));
//			selectDropdown(passIssueDateMonth7, prop.getProperty("PassportIssueDateMonthPax7"));
//			passIssueDateYear7.clear();
//			passIssueDateYear7.sendKeys(prop.getProperty("PassportIssueDateYearPax7"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry7, prop.getProperty("PassportIssueCountryPax7"));}
//		if(isElementPresent(Baggages7)) {
//			Select selectBaggage = new Select(Baggages7.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}			
//			}break;
//			
//			case "8":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//	
//	
//		Select titlePax5 = new Select(TitlePax5);		
//		titlePax5.selectByVisibleText(prop.getProperty("NameTitle5"));
//		FirstName5.clear();		
//		FirstName5.sendKeys(generateRandomName());
//		LastName5.clear();
//		LastName5.sendKeys(generateRandomName());		
//		DOBDay5.clear();
//		DOBDay5.sendKeys(prop.getProperty("DOBDate5"));		
//		Select selectMonthDOB5 = new Select(DOBMonth5);
//		selectMonthDOB5.selectByVisibleText(prop.getProperty("DOBMonth5"));
//		DOBYear5.clear();
//		DOBYear5.sendKeys(prop.getProperty("DOBYear5")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo5.clear();				
//			passportNo5.sendKeys(prop.getProperty("PassportNo5"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay5.clear();
//				passExpDay5.sendKeys(prop.getProperty("passExpDateDayPax5"));
//				selectDropdown(passExpMonth5, prop.getProperty("passExpDateMonthPax5"));			
//				passExpYear5.clear();
//				passExpYear5.sendKeys(prop.getProperty("passExpDateYearPax5"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay5.clear();
//			passIssueDateDay5.sendKeys(prop.getProperty("PassportIssueDateDayPax5"));
//			selectDropdown(passIssueDateMonth5, prop.getProperty("PassportIssueDateMonthPax5"));
//			passIssueDateYear5.clear();
//			passIssueDateYear5.sendKeys(prop.getProperty("PassportIssueDateYearPax5"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry5, prop.getProperty("PassportIssueCountryPax5"));}
//		if(isElementPresent(Baggages5)) {
//			Select selectBaggage = new Select(Baggages5.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//
//
//		Select titlePax6 = new Select(TitlePax6);		
//		titlePax6.selectByVisibleText(prop.getProperty("NameTitle6"));
//		FirstName6.clear();		
//		FirstName6.sendKeys(generateRandomName());
//		LastName6.clear();
//		LastName6.sendKeys(generateRandomName());		
//		DOBDay6.clear();
//		DOBDay6.sendKeys(prop.getProperty("DOBDate6"));		
//		Select selectMonthDOB6 = new Select(DOBMonth6);
//		selectMonthDOB6.selectByVisibleText(prop.getProperty("DOBMonth6"));
//		DOBYear6.clear();
//		DOBYear6.sendKeys(prop.getProperty("DOBYear6")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo6.clear();				
//			passportNo6.sendKeys(prop.getProperty("PassportNo6"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay6.clear();
//				passExpDay6.sendKeys(prop.getProperty("passExpDateDayPax6"));
//				selectDropdown(passExpMonth6, prop.getProperty("passExpDateMonthPax6"));			
//				passExpYear6.clear();
//				passExpYear6.sendKeys(prop.getProperty("passExpDateYearPax6"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay6.clear();
//			passIssueDateDay6.sendKeys(prop.getProperty("PassportIssueDateDayPax6"));
//			selectDropdown(passIssueDateMonth6, prop.getProperty("PassportIssueDateMonthPax6"));
//			passIssueDateYear6.clear();
//			passIssueDateYear6.sendKeys(prop.getProperty("PassportIssueDateYearPax6"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry6, prop.getProperty("PassportIssueCountryPax6"));}
//		if(isElementPresent(Baggages6)) {
//			Select selectBaggage = new Select(Baggages6.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		Select titlePax7 = new Select(TitlePax7);		
//		titlePax7.selectByVisibleText(prop.getProperty("NameTitle7"));
//		FirstName7.clear();		
//		FirstName7.sendKeys(generateRandomName());
//		LastName7.clear();
//		LastName7.sendKeys(generateRandomName());		
//		DOBDay7.clear();
//		DOBDay7.sendKeys(prop.getProperty("DOBDate7"));		
//		Select selectMonthDOB7 = new Select(DOBMonth7);
//		selectMonthDOB7.selectByVisibleText(prop.getProperty("DOBMonth7"));
//		DOBYear7.clear();
//		DOBYear7.sendKeys(prop.getProperty("DOBYear7")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo7.clear();				
//			passportNo7.sendKeys(prop.getProperty("PassportNo7"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay7.clear();
//				passExpDay7.sendKeys(prop.getProperty("passExpDateDayPax7"));
//				selectDropdown(passExpMonth7, prop.getProperty("passExpDateMonthPax7"));			
//				passExpYear7.clear();
//				passExpYear7.sendKeys(prop.getProperty("passExpDateYearPax7"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay7.clear();
//			passIssueDateDay7.sendKeys(prop.getProperty("PassportIssueDateDayPax7"));
//			selectDropdown(passIssueDateMonth7, prop.getProperty("PassportIssueDateMonthPax7"));
//			passIssueDateYear7.clear();
//			passIssueDateYear7.sendKeys(prop.getProperty("PassportIssueDateYearPax7"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry7, prop.getProperty("PassportIssueCountryPax7"));}
//		if(isElementPresent(Baggages7)) {
//			Select selectBaggage = new Select(Baggages7.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax8 = new Select(TitlePax8);		
//		titlePax8.selectByVisibleText(prop.getProperty("NameTitle8"));
//		FirstName8.clear();		
//		FirstName8.sendKeys(generateRandomName());
//		LastName8.clear();
//		LastName8.sendKeys(generateRandomName());		
//		DOBDay8.clear();
//		DOBDay8.sendKeys(prop.getProperty("DOBDate8"));		
//		Select selectMonthDOB8 = new Select(DOBMonth8);
//		selectMonthDOB8.selectByVisibleText(prop.getProperty("DOBMonth8"));
//		DOBYear8.clear();
//		DOBYear8.sendKeys(prop.getProperty("DOBYear8")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo8.clear();				
//			passportNo8.sendKeys(prop.getProperty("PassportNo8"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay8.clear();
//				passExpDay8.sendKeys(prop.getProperty("passExpDateDayPax8"));
//				selectDropdown(passExpMonth8, prop.getProperty("passExpDateMonthPax8"));			
//				passExpYear8.clear();
//				passExpYear8.sendKeys(prop.getProperty("passExpDateYearPax8"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay8.clear();
//			passIssueDateDay8.sendKeys(prop.getProperty("PassportIssueDateDayPax8"));
//			selectDropdown(passIssueDateMonth8, prop.getProperty("PassportIssueDateMonthPax8"));
//			passIssueDateYear8.clear();
//			passIssueDateYear8.sendKeys(prop.getProperty("PassportIssueDateYearPax8"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry8, prop.getProperty("PassportIssueCountryPax8"));}
//		if(isElementPresent(Baggages8)) {
//			Select selectBaggage = new Select(Baggages8.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//			}break;
//			
//			case "9":{
//				Select titlePax2 = new Select(TitlePax2);		
//				titlePax2.selectByVisibleText(prop.getProperty("NameTitle2"));
//				FirstName2.clear();		
//				FirstName2.sendKeys(generateRandomName());
//				LastName2.clear();
//				LastName2.sendKeys(generateRandomName());		
//				DOBDay2.clear();
//				DOBDay2.sendKeys(prop.getProperty("DOBDate2"));		
//				Select selectMonthDOB2 = new Select(DOBMonth2);
//				selectMonthDOB2.selectByVisibleText(prop.getProperty("DOBMonth2"));
//				DOBYear2.clear();
//				DOBYear2.sendKeys(prop.getProperty("DOBYear2")); 
//				if(isElementPresent(lblPassport)) {			
//					passportNo2.clear();				
//					passportNo2.sendKeys(prop.getProperty("PassportNo2"));
//					if(isElementPresent(lblPassportExpiry)){
//						passExpDay2.clear();
//						passExpDay2.sendKeys(prop.getProperty("passExpDateDayPax2"));
//						selectDropdown(passExpMonth2, prop.getProperty("passExpDateMonthPax2"));			
//						passExpYear2.clear();
//						passExpYear2.sendKeys(prop.getProperty("passExpDateYearPax2"));}}					
//			if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//				if(isElementPresent(lblPassportIssueDate)) {
//					passIssueDateDay2.clear();
//					passIssueDateDay2.sendKeys(prop.getProperty("PassportIssueDateDayPax2"));
//					selectDropdown(passIssueDateMonth2, prop.getProperty("PassportIssueDateMonthPax2"));
//					passIssueDateYear2.clear();
//					passIssueDateYear2.sendKeys(prop.getProperty("PassportIssueDateYearPax2"));	}
//				if(isElementPresent(lblPassportCountry)) {
//					selectDropdown(PassportCountry2, prop.getProperty("PassportIssueCountryPax2"));}
//				if(isElementPresent(Baggages2)) {
//					Select selectBaggage = new Select(Baggages2.get(0));
//					selectBaggage.selectByVisibleText("No baggage required");}}		
//			
//			
//			
//			Select titlePax3 = new Select(TitlePax3);		
//			titlePax3.selectByVisibleText(prop.getProperty("NameTitle3"));
//			FirstName3.clear();		
//			FirstName3.sendKeys(generateRandomName());
//			LastName3.clear();
//			LastName3.sendKeys(generateRandomName());		
//			DOBDay3.clear();
//			DOBDay3.sendKeys(prop.getProperty("DOBDate3"));		
//			Select selectMonthDOB3 = new Select(DOBMonth3);
//			selectMonthDOB3.selectByVisibleText(prop.getProperty("DOBMonth3"));
//			DOBYear3.clear();
//			DOBYear3.sendKeys(prop.getProperty("DOBYear3")); 
//			if(isElementPresent(lblPassport)) {			
//				passportNo3.clear();				
//				passportNo3.sendKeys(prop.getProperty("PassportNo3"));
//				if(isElementPresent(lblPassportExpiry)){
//					passExpDay3.clear();
//					passExpDay3.sendKeys(prop.getProperty("passExpDateDayPax3"));
//					selectDropdown(passExpMonth3, prop.getProperty("passExpDateMonthPax3"));			
//					passExpYear3.clear();
//					passExpYear3.sendKeys(prop.getProperty("passExpDateYearPax3"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//			if(isElementPresent(lblPassportIssueDate)) {
//				passIssueDateDay3.clear();
//				passIssueDateDay3.sendKeys(prop.getProperty("PassportIssueDateDayPax3"));
//				selectDropdown(passIssueDateMonth3, prop.getProperty("PassportIssueDateMonthPax3"));
//				passIssueDateYear3.clear();
//				passIssueDateYear3.sendKeys(prop.getProperty("PassportIssueDateYearPax3"));	}
//			if(isElementPresent(lblPassportCountry)) {
//				selectDropdown(PassportCountry3, prop.getProperty("PassportIssueCountryPax3"));}
//			if(isElementPresent(Baggages3)) {
//				Select selectBaggage = new Select(Baggages3.get(0));
//				selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax4 = new Select(TitlePax4);		
//		titlePax4.selectByVisibleText(prop.getProperty("NameTitle4"));
//		FirstName4.clear();		
//		FirstName4.sendKeys(generateRandomName());
//		LastName4.clear();
//		LastName4.sendKeys(generateRandomName());		
//		DOBDay4.clear();
//		DOBDay4.sendKeys(prop.getProperty("DOBDate4"));		
//		Select selectMonthDOB4 = new Select(DOBMonth4);
//		selectMonthDOB4.selectByVisibleText(prop.getProperty("DOBMonth4"));
//		DOBYear4.clear();
//		DOBYear4.sendKeys(prop.getProperty("DOBYear4")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo4.clear();				
//			passportNo4.sendKeys(prop.getProperty("PassportNo4"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay4.clear();
//				passExpDay4.sendKeys(prop.getProperty("passExpDateDayPax4"));
//				selectDropdown(passExpMonth4, prop.getProperty("passExpDateMonthPax4"));			
//				passExpYear4.clear();
//				passExpYear4.sendKeys(prop.getProperty("passExpDateYearPax4"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay4.clear();
//			passIssueDateDay4.sendKeys(prop.getProperty("PassportIssueDateDayPax4"));
//			selectDropdown(passIssueDateMonth4, prop.getProperty("PassportIssueDateMonthPax4"));
//			passIssueDateYear4.clear();
//			passIssueDateYear4.sendKeys(prop.getProperty("PassportIssueDateYearPax4"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry4, prop.getProperty("PassportIssueCountryPax4"));}
//		if(isElementPresent(Baggages4)) {
//			Select selectBaggage = new Select(Baggages4.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}
//	
//	
//		Select titlePax5 = new Select(TitlePax5);		
//		titlePax5.selectByVisibleText(prop.getProperty("NameTitle5"));
//		FirstName5.clear();		
//		FirstName5.sendKeys(generateRandomName());
//		LastName5.clear();
//		LastName5.sendKeys(generateRandomName());		
//		DOBDay5.clear();
//		DOBDay5.sendKeys(prop.getProperty("DOBDate5"));		
//		Select selectMonthDOB5 = new Select(DOBMonth5);
//		selectMonthDOB5.selectByVisibleText(prop.getProperty("DOBMonth5"));
//		DOBYear5.clear();
//		DOBYear5.sendKeys(prop.getProperty("DOBYear5")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo5.clear();				
//			passportNo5.sendKeys(prop.getProperty("PassportNo5"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay5.clear();
//				passExpDay5.sendKeys(prop.getProperty("passExpDateDayPax5"));
//				selectDropdown(passExpMonth5, prop.getProperty("passExpDateMonthPax5"));			
//				passExpYear5.clear();
//				passExpYear5.sendKeys(prop.getProperty("passExpDateYearPax5"));}}					
//	if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay5.clear();
//			passIssueDateDay5.sendKeys(prop.getProperty("PassportIssueDateDayPax5"));
//			selectDropdown(passIssueDateMonth5, prop.getProperty("PassportIssueDateMonthPax5"));
//			passIssueDateYear5.clear();
//			passIssueDateYear5.sendKeys(prop.getProperty("PassportIssueDateYearPax5"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry5, prop.getProperty("PassportIssueCountryPax5"));}
//		if(isElementPresent(Baggages5)) {
//			Select selectBaggage = new Select(Baggages5.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//
//
//		Select titlePax6 = new Select(TitlePax6);		
//		titlePax6.selectByVisibleText(prop.getProperty("NameTitle6"));
//		FirstName6.clear();		
//		FirstName6.sendKeys(generateRandomName());
//		LastName6.clear();
//		LastName6.sendKeys(generateRandomName());		
//		DOBDay6.clear();
//		DOBDay6.sendKeys(prop.getProperty("DOBDate6"));		
//		Select selectMonthDOB6 = new Select(DOBMonth6);
//		selectMonthDOB6.selectByVisibleText(prop.getProperty("DOBMonth6"));
//		DOBYear6.clear();
//		DOBYear6.sendKeys(prop.getProperty("DOBYear6")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo6.clear();				
//			passportNo6.sendKeys(prop.getProperty("PassportNo6"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay6.clear();
//				passExpDay6.sendKeys(prop.getProperty("passExpDateDayPax6"));
//				selectDropdown(passExpMonth6, prop.getProperty("passExpDateMonthPax6"));			
//				passExpYear6.clear();
//				passExpYear6.sendKeys(prop.getProperty("passExpDateYearPax6"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay6.clear();
//			passIssueDateDay6.sendKeys(prop.getProperty("PassportIssueDateDayPax6"));
//			selectDropdown(passIssueDateMonth6, prop.getProperty("PassportIssueDateMonthPax6"));
//			passIssueDateYear6.clear();
//			passIssueDateYear6.sendKeys(prop.getProperty("PassportIssueDateYearPax6"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry6, prop.getProperty("PassportIssueCountryPax6"));}
//		if(isElementPresent(Baggages6)) {
//			Select selectBaggage = new Select(Baggages6.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		Select titlePax7 = new Select(TitlePax7);		
//		titlePax7.selectByVisibleText(prop.getProperty("NameTitle7"));
//		FirstName7.clear();		
//		FirstName7.sendKeys(generateRandomName());
//		LastName7.clear();
//		LastName7.sendKeys(generateRandomName());		
//		DOBDay7.clear();
//		DOBDay7.sendKeys(prop.getProperty("DOBDate7"));		
//		Select selectMonthDOB7 = new Select(DOBMonth7);
//		selectMonthDOB7.selectByVisibleText(prop.getProperty("DOBMonth7"));
//		DOBYear7.clear();
//		DOBYear7.sendKeys(prop.getProperty("DOBYear7")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo7.clear();				
//			passportNo7.sendKeys(prop.getProperty("PassportNo7"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay7.clear();
//				passExpDay7.sendKeys(prop.getProperty("passExpDateDayPax7"));
//				selectDropdown(passExpMonth7, prop.getProperty("passExpDateMonthPax7"));			
//				passExpYear7.clear();
//				passExpYear7.sendKeys(prop.getProperty("passExpDateYearPax7"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay7.clear();
//			passIssueDateDay7.sendKeys(prop.getProperty("PassportIssueDateDayPax7"));
//			selectDropdown(passIssueDateMonth7, prop.getProperty("PassportIssueDateMonthPax7"));
//			passIssueDateYear7.clear();
//			passIssueDateYear7.sendKeys(prop.getProperty("PassportIssueDateYearPax7"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry7, prop.getProperty("PassportIssueCountryPax7"));}
//		if(isElementPresent(Baggages7)) {
//			Select selectBaggage = new Select(Baggages7.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		
//		Select titlePax8 = new Select(TitlePax8);		
//		titlePax8.selectByVisibleText(prop.getProperty("NameTitle8"));
//		FirstName8.clear();		
//		FirstName8.sendKeys(generateRandomName());
//		LastName8.clear();
//		LastName8.sendKeys(generateRandomName());		
//		DOBDay8.clear();
//		DOBDay8.sendKeys(prop.getProperty("DOBDate8"));		
//		Select selectMonthDOB8 = new Select(DOBMonth8);
//		selectMonthDOB8.selectByVisibleText(prop.getProperty("DOBMonth8"));
//		DOBYear8.clear();
//		DOBYear8.sendKeys(prop.getProperty("DOBYear8")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo8.clear();				
//			passportNo8.sendKeys(prop.getProperty("PassportNo8"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay8.clear();
//				passExpDay8.sendKeys(prop.getProperty("passExpDateDayPax8"));
//				selectDropdown(passExpMonth8, prop.getProperty("passExpDateMonthPax8"));			
//				passExpYear8.clear();
//				passExpYear8.sendKeys(prop.getProperty("passExpDateYearPax8"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay8.clear();
//			passIssueDateDay8.sendKeys(prop.getProperty("PassportIssueDateDayPax8"));
//			selectDropdown(passIssueDateMonth8, prop.getProperty("PassportIssueDateMonthPax8"));
//			passIssueDateYear8.clear();
//			passIssueDateYear8.sendKeys(prop.getProperty("PassportIssueDateYearPax8"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry8, prop.getProperty("PassportIssueCountryPax8"));}
//		if(isElementPresent(Baggages8)) {
//			Select selectBaggage = new Select(Baggages8.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//		
//		Select titlePax9 = new Select(TitlePax9);		
//		titlePax9.selectByVisibleText(prop.getProperty("NameTitle9"));
//		FirstName9.clear();		
//		FirstName9.sendKeys(generateRandomName());
//		LastName9.clear();
//		LastName9.sendKeys(generateRandomName());		
//		DOBDay9.clear();
//		DOBDay9.sendKeys(prop.getProperty("DOBDate9"));		
//		Select selectMonthDOB9 = new Select(DOBMonth9);
//		selectMonthDOB9.selectByVisibleText(prop.getProperty("DOBMonth9"));
//		DOBYear9.clear();
//		DOBYear9.sendKeys(prop.getProperty("DOBYear9")); 
//		if(isElementPresent(lblPassport)) {			
//			passportNo9.clear();				
//			passportNo9.sendKeys(prop.getProperty("PassportNo9"));
//			if(isElementPresent(lblPassportExpiry)){
//				passExpDay9.clear();
//				passExpDay9.sendKeys(prop.getProperty("passExpDateDayPax9"));
//				selectDropdown(passExpMonth9, prop.getProperty("passExpDateMonthPax9"));			
//				passExpYear9.clear();
//				passExpYear9.sendKeys(prop.getProperty("passExpDateYearPax9"));}}					
//		if(prop.getProperty("Source").equalsIgnoreCase("TBoAirInternational")){
//		if(isElementPresent(lblPassportIssueDate)) {
//			passIssueDateDay9.clear();
//			passIssueDateDay9.sendKeys(prop.getProperty("PassportIssueDateDayPax9"));
//			selectDropdown(passIssueDateMonth9, prop.getProperty("PassportIssueDateMonthPax9"));
//			passIssueDateYear9.clear();
//			passIssueDateYear9.sendKeys(prop.getProperty("PassportIssueDateYearPax8"));	}
//		if(isElementPresent(lblPassportCountry)) {
//			selectDropdown(PassportCountry8, prop.getProperty("PassportIssueCountryPax9"));}
//		if(isElementPresent(Baggages9)) {
//			Select selectBaggage = new Select(Baggages9.get(0));
//			selectBaggage.selectByVisibleText("No baggage required");}}	
//			}break;
//			}
//			
//			switch (prop.getProperty("ChildCount").trim()) {
//			case "1":{}break;
//			
//			case "2":{}break;
//			
//			case "3":{}break;
//			
//			case "4":{}break;
//			
//			case "5":{}break;
//			
//			case "6":{}break;
//			
//			case "7":{}break;
//			
//			case "8":{}break;
//					
//			}
//			
//			switch (prop.getProperty("InfantCount").trim()) {
//			case "1":{}break;
//			
//			case "2":{}break;
//			
//			case "3":{}break;
//			
//			case "4":{}break;
//			
//			case "5":{}break;
//			
//			case "6":{}break;
//			
//			case "7":{}break;
//			
//			case "8":{}break;
//					
//			}
//			
//		}
//		
//		
//		
//		bookingRemarks.clear();
//		bookingRemarks.sendKeys(prop.getProperty("BookingRemarks"));
//		Proceed_to_Review_Booking_button.click();	
//		while(!isDisplayed(BookingOnBehalfOfAgent)) {
//			 Thread.sleep(3000);
//		     System.out.println("Element is not visible yet");
//		}
//		
//		//if(BookingOnBehalfOfAgent.isDisplayed())
//		//wait.until(ExpectedConditions.visibilityOf(BookingOnBehalfOfAgent));	
//		test.log(Status.PASS, "Flight Confirmation Page");
//		takeScreenshot();
//		reports.flush();
//		js.executeScript("window.scrollBy(0,1000)");
//		TermsAccepted.click();
//		TicketButton.click();
//		wait.until(ExpectedConditions.visibilityOf(confirmBoookingYesButton));
//		//js.executeScript("window.scrollBy(1220,-300)");
//		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", confirmBoookingYesButton );
//		js.executeScript("arguments[0].scrollIntoView();", confirmBoookingYesButton); 
//		test.log(Status.PASS, "Confirm Popup");
//		Thread.sleep(2000);
//		js.executeScript("scroll(250, 0)"); 
//		confirmBoookingYesButton.click();
//		wait.until(ExpectedConditions.visibilityOf(AirlineRefLabel));
//		if(BookingStatus.getText().equalsIgnoreCase("Ticketed"))
//			test.log(Status.PASS, "Booking Success: "+PNR.getText());
//		takeScreenshot();	
		Thread.sleep(2000);
		reports.flush();
	}
	
	private boolean isDisplayed(WebElement bookingOnBehalfOfAgent2) {
		if(bookingOnBehalfOfAgent2.isDisplayed())
            return bookingOnBehalfOfAgent2.isDisplayed();
		return false;
		
	}

	public boolean isElementPresent(List<WebElement> elementList){		
		if (elementList.size()==0)
			return false;
		else
			return true;		
	}
	
	public void selectDropdown(WebElement element, String selectItem) {
		Select dropdownelement = new Select(element);
		dropdownelement.selectByVisibleText(selectItem);
	}
	

	}
	
	
	
	

