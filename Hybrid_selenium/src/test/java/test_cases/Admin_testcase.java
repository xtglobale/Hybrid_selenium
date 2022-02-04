package test_cases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_class.Library_class;
import pages.Admin_page;
import pages.Login_page;

public class Admin_testcase extends  Library_class{
	
Login_page face;
Admin_page abc;
	
	@BeforeMethod
	public void Launchapp() throws IOException
	{
	LaunchApplication();
	}

	@Test
	public void loginpage()
	{
	face=new Login_page(driver);
	face.loginfacebook("Admin", "admin123");
	face.button();
	}
	@Test
	public void adminpage()
	{
		abc.button();
	}
	

	@AfterMethod
	public void closeapp() {
	teardown();
	}
	

}



















