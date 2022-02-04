package base_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library_class {
	 public static WebDriver driver;
	public static Properties prop;
	public void LaunchApplication()  throws IOException

	{
	FileInputStream File=new FileInputStream("C:\\Users\\dpparimi\\git\\Hybrid_selenium\\Hybrid_selenium\\src\\test\\resources\\config.prop\\config.prop");
	prop=new Properties();
	prop.load(File);
	String browser = prop.getProperty("browser");


	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
	WebDriverManager.chromedriver().setup();

	driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));

	}

	public void teardown()
	{
	driver.quit();
	}
	} 
	


