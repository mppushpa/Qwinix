package com.ornagehrm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
@FindBy(name="username")
private WebElement usn;

@FindBy(name="password")
private WebElement psw;

@FindBy(xpath ="//button[ text()=' Login ']")
private WebElement button;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement enterusn()
{
	return usn;
}
public WebElement pass()
{
	
return psw;	
}
public WebElement click()
{
	return button;
}


}
