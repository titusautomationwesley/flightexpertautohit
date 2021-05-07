package testcases;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestNGRunner {

	public static void main(String[] args) {

		// CustomListeners CL=new CustomListeners();
		TestNG test=new TestNG();
		// test.setTestClasses(new Class[] {TLLogin.class,TLAirBookingQueue.class});
		// test.add(CL);
		List<String> suites = Lists.newArrayList();
		
		//suites.add("E:\\TFL\\testng.xml");
		suites.add("testng.xml");

		test.setTestSuites(suites);
		test.run();

	}

}
