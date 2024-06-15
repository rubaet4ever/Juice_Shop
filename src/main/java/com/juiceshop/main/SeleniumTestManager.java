package com.juiceshop.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.juiceshop.ui.Login;
import com.juiceshop.ui.SearchItem;
import graphql.org.antlr.v4.runtime.misc.Utils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumTestManager {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");

		//	static WebDriver driver;
		//	static ExtentReports report;
		//	static ExtentTest test;
	static	WebDriver driver = null;

	   @Before 
		public static void main (String[] args) throws InterruptedException {
			try {

				//WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new ChromeDriver();
				final String SERVER_URL = "https://juice-shop.herokuapp.com/#/login";
				

				driver.get(SERVER_URL); 

				//WebDriver driver = getFirefoxDriver(SERVER_URL);          
			
				//Login.createLoginTest(driver);
				SearchItem.createSearchItemTest(driver);
				//ExtentReportsWithTestNG.createExtentReportsWithTestNG(driver);
				

			}
			catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}
			//login(driver);

		}

	   @Test
		private static WebDriver getChromeDriver(String serverUrl)throws InterruptedException {

			final String DRIVER_NAME = "webdriver.chrome.driver";
		    System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			//final String DRIVER_URL =  "F:\\My Work\\Work Tools\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
            
			//System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

//			report = new ExtentReports("C:\\Users\\Rubaet\\eclipse-workspace\\DemoWebAutomation\\report\\report.html", true);
//			test = report.startTest("Extent report demo");

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);    
			
			System.out.println("Chrome driver found");
			return driver;
		}

		private static WebDriver getFirefoxDriver(String serverUrl) {

			final String DRIVER_NAME = "webdriver.gecko.driver";
			//final String DRIVER_URL = "F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\geckodriver.exe";

			//System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);

			return driver;
		}

//		@BeforeTest
//		public void BeforeTest() {
//			extent.attachReporter(spark);
//		}
	//
//		@AfterSuite
//		public void AfterTest() {
	//
//			extent.flush();
//		}

		//	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
		//	{
		//		TakesScreenshot ts = (TakesScreenshot)driver;
		//		File source = ts.getScreenshotAs(OutputType.FILE);
		//		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		//		FileUtils.copyFile(source, file);
		//		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		//	}
		@After
		public void tearDownTest() {
			//close browser
			driver.close();
			driver.quit();
			System.out.println("Test Completed Successfully");
		}
		

	}

