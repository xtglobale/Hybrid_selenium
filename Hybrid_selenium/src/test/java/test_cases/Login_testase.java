package test_cases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base_class.Library_class;
import pages.Login_page;

public class Login_testase extends Library_class {
WebDriver driver;
	Login_page face;
	
	@BeforeMethod
	public void Launchapp() throws IOException
	{
	LaunchApplication();
	}

	@Test
	public void loginfacebook1()
	{
	face=new Login_page(driver);
	face.loginfacebook("Admin", "admin123");
	face.button();
	}

	@AfterMethod
	public void closeapp() {
	teardown();
	}

	}




















