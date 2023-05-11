package com.irshadproject.qa.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

//ExtentReports5.0.0
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {
	public static WebDriver driver;
	public static Properties prob;
	public static String properties_path=System.getProperty("user.dir")+"//config//config.properties";
	public static BufferedReader reader;
	
	public Base() 
	{
		try {
		reader=new BufferedReader(new FileReader(properties_path));
		prob=new Properties();
		prob.load(reader);
		}
		catch(FileNotFoundException f) 
		{
			System.out.println("please check the file location");
		}
		catch(IOException e) 
		{
			System.out.println("please check read and write permission");
		}
	}
	public void setup() 
	{
		String browserName=prob.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			
			
		     driver = new ChromeDriver();
		
						
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("please check the driver name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(prob.getProperty("url"));
		
	}
	
	/*@BeforeSuite
	public static ExtentReports extentReporter()
	{
		ExtentReports htmlReports = new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("AutomationReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report Demo");
		htmlReports.attachReporter(spark);
		return htmlReports;
	}*/

}
