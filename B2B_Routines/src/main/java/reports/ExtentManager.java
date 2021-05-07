package reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	
	static ExtentReports reports;
	static ExtentTest test ;
	public static String screenshotFolderPath;
	public static String reportPath;
	public static String folderName;
	
	public static ExtentReports getReports() {
		
		if(reports==null) {
			reports = new ExtentReports();
			
			Date d=new Date();
			folderName=d.toString().replace(":", "_").replace(" ", "_");
			reportPath = System.getProperty("user.dir")+"\\reports";
			// directory of the Report Folder
			new File(reportPath+"_"+folderName+"\\screenshots").mkdirs();
			reportPath = reportPath+"_"+folderName+"\\";
			screenshotFolderPath=reportPath+"screenshots\\";
    		//System.out.println(reportPath+fileName);
			ExtentSparkReporter sparkreporter = new ExtentSparkReporter(reportPath);
			//ExtentSparkReporter sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports");
			sparkreporter.config().setReportName("Regression Testing Reports");
			sparkreporter.config().setDocumentTitle("Automation Reports");
			sparkreporter.config().setTheme(Theme.STANDARD);
			sparkreporter.config().setEncoding("utf-8");
			reports.attachReporter(sparkreporter);
			
		}
		return reports;
		
	}

}
