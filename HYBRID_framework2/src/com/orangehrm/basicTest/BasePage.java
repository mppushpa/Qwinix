package com.orangehrm.basicTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ornagehrm.PageObjects.Homepage;
import com.ornagehrm.PageObjects.Loginpage;
import com.ornagehrm.PageObjects.Logout;

public class BasePage implements FrameworkConstants

{
  public static WebDriver driver;
  public Properties pro;
  public FileInputStream fis;
  Loginpage lp;
  public Homepage HP;
  static Logout Log;
@BeforeClass 
public void openAppln() throws IOException, InterruptedException
{
	 
	 System.setProperty(Chrome_Key,Chrome_Value);
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 pro = new Properties();
	 fis = new FileInputStream("./Property/Test.properties");
	 pro.load(fis);
	 driver.get(pro.getProperty("url"));
	 
	lp = new Loginpage(driver);
	
	lp.enterusn().sendKeys(pro.getProperty("usn"));
	lp.pass().sendKeys(pro.getProperty("psw"));
	 lp.click().click();
	 
	 HP = new Homepage(driver);
}

@BeforeMethod
public void login()
{
	System.out.println("admin");
}

@AfterMethod
public static void logout(ITestResult result)
{
	if(result.FAILURE==result.getStatus())
	{
		Frames_Screen_Shots.defect(driver,result.getName());
	}
 Log=new Logout(driver);
 Log.clicklogout().click();
 Log.clicklogbtn().click();
}

@AfterClass
public void closeapp()
{
	driver.close();
}
}

