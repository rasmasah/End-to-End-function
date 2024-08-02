package app.baseset;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import app.databaseutility.DataBaseUtility;
import app.fileutility.ExcelUtility;
import app.fileutility.FileUtility;
import app.webdriverutility.JavaUtility;
import app.webdriverutility.WebdriverUtility;

public class BaseClass{
	public DataBaseUtility dlip=new DataBaseUtility();
	public FileUtility flip=new FileUtility();
	public JavaUtility jlip=new JavaUtility();
	public WebdriverUtility wllip=new WebdriverUtility();
	public ExcelUtility elip=new ExcelUtility();
	public WebDriver driver;

	@BeforeSuite
	public void confiqBS() throws SQLException {
		System.out.println("connect to db , report confiq");
		dlip.getDbconnection();
	}
    @BeforeClass
   	public void confiqBc() throws Exception {
	System.out.println("launch browser");
	String BROWSER=System.getProperty("browser");
	
	if (BROWSER.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	} 
	else if (BROWSER.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();  
	} 
	else if (BROWSER.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver(); 
	}
	else {
		driver = new ChromeDriver();
	}
   }
   

   
	@AfterClass
	public void confiqAC() {
	System.out.println("close browser");
	driver.quit();
	}
	
	@AfterSuite
	public void confiqAS() throws SQLException {
	System.out.println("close db , report backup");
	dlip.closeDbconnection();
	}
}
