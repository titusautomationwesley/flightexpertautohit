package base;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) throws IOException {
		  //String aToZ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // 36 letter.
		  //String randomStr=generateRandom(aToZ);
		 // System.out.println(randomStr);
		
		//System.out.println(generateRandom());
		
//		String filePath = "E:\\TestingTitus\\Wesley";
//	      //Creating the File object
//	      File file = new File(filePath);
//	      FileUtils.forceDelete(file);
//	    // deleteFolder(file);
//	      System.out.println("Files deleted........");

		String reportpath = "C:\\Users\\wesley\\eclipse-workspace\\B2B_Routines\\reports_Wed_Mar_10_13_33_10_IST_2021";
		String screenshotPatch = reportpath+"\\screenshots";
		System.out.println("screenshotPatch: "+screenshotPatch);
		}
	
	 static void deleteFolder(File file){
	      for (File subFile : file.listFiles()) {
	         if(subFile.isDirectory()) {
	            deleteFolder(subFile);
	         } else {
	            subFile.delete();
	         }
	      }
	      file.delete();
	   }

		private static String generateRandom() {
			
			String aToZ= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // 36 letter.			
		    Random rand=new Random();
		    StringBuilder res=new StringBuilder();
		    for (int i = 0; i < 7; i++) {
		       int randIndex=rand.nextInt(aToZ.length()); 
		       res.append(aToZ.charAt(randIndex));            
		    }		    
		    return res.toString();
		}
	

}
