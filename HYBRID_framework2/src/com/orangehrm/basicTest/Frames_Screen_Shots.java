package com.orangehrm.basicTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames_Screen_Shots implements FrameworkConstants
{
public static  void defect(WebDriver driver,String Filename)
{
	Date d = new Date();
	String d1 = d.toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File(Defect_path+Filename+d1+".png");
	try {
		FileHandler.copy(temp, perm);
	} 
	catch (IOException e) 
	{
		
		System.out.println("Screen Shot is captured");
	}
	
}
}
