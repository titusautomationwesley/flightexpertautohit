package testcases;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.codehaus.plexus.util.FileUtils;
import org.testng.annotations.Test;

import reports.ExtentManager;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

 

public class ZipAndSendMail extends ExtentManager
{
	Properties emailProperties;
	Session mailSession;
	MimeMessage emailMessage;
	static String[] toEmails = { "alok@techmaster.in","abhineet@travelboutiqueonline.com","wesley@travelboutiqueonline.com"};
	//static String[] toEmails = { "wesley@travelboutiqueonline.com"};
	static String fromUser = "tflautomationtesting@gmail.com";// imap on, other devices on, no recovery phone
	static String password = "Tech@123";
	static String ScreenshotName = null;
	@Test(priority=1)
    public static void mail() throws Exception
    {
    	
		//report folder - extent reports
		
		
		System.out.println("screenshotPath :"+screenshotFolderPath);
		
 	    
 	   File directoryPath = new File(screenshotFolderPath);
 	   
       //List of all files and directories
       String contents[] = directoryPath.list();
       System.out.println("List of files and directories in the specified directory:");
       for(int i=0; i<contents.length; i++) {
          System.out.println(contents[i]);
          ScreenshotName=contents[i];
          System.out.println("ScreenshotName: "+ScreenshotName);
       }
 	    
//    	// find latest folder

                
        	    
        	//zip
		//Zip.zipDir(reportsFolderPath, System.getProperty("user.dir")+"\\Reports"+".zip");
        
            //mail
                
                Mail javaEmail = new Mail();

        		javaEmail.setMailServerProperties();
        		

        		javaEmail.createEmailMessage(
        				"URL --  https://feadmincontrol.flightexpert.com/B2BLogin.aspx  -- Hit", // subject
        				"Please find the reports in attachment.", // body
        				screenshotFolderPath+ScreenshotName,
        				//screenshotFolderPath+folderName+".PNG",
        				//System.getProperty("user.dir")+"\\Reports"+".zip", // attachment path
        				"Screenshot.PNG", // name of attachment
        				toEmails// receivers
        				);
        		javaEmail.sendEmail(fromUser,password);
        		
        	String filePath = reportPath;
        	
        	System.out.println("filePath: "+filePath);
      	      //Creating the File object
      	      File file = new File(filePath);
      	      FileUtils.forceDelete(file);
      	    // deleteFolder(file);
      	      System.out.println("Files deleted........");
        		
      }
	
	 static void deleteFolder(File file){ // Not using this Method instead using FileUtils.forceDelete
	      for (File subFile : file.listFiles()) {
	    	  System.out.println("Inside For: "+ file.getName());
	         if(subFile.isDirectory()) {
	        	 System.out.println("Inside if: "+ subFile.getName());
	            deleteFolder(subFile);
	         } else {
	        	System.out.println("subFile delete " +subFile.getName());
	            subFile.delete();
	         }
	      }
	      System.out.println("file delete: " +file.getName());
	      file.delete();
	   }
    



 
 

}