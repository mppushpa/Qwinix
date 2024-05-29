package com.ornagehrm.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
@FindBy(xpath ="//span[text()='PIM']")
private WebElement pim;
	
@FindBy(xpath ="//a[text()='Add Employee']")
private WebElement addemp;

@FindBy(xpath = "//input[@name='firstName']")
private WebElement fistname;

@FindBy(xpath ="//input[@name='middleName']")
private WebElement midname;

@FindBy(xpath ="//input[@name='lastName']")
private WebElement lasname;

@FindBy(xpath ="//button[text()=' Save ']")
private WebElement save;

public Homepage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement PIM()
{
	return pim;
}

public WebElement Addemp()
{
	return addemp;
}

public WebElement Fistname()
{
	return fistname;
}

public WebElement Midname()
{
	return midname;
}

public WebElement Lastname()
{
	return lasname;
}

public WebElement savebtn()
{
	return save;
}

}


