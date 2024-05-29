package com.ornagehrm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
@FindBy(xpath="//img[@alt='profile picture' and @src='/web/index.php/pim/viewPhoto/empNumber/7']")
private WebElement logimg;

@FindBy(xpath="//a[text()='Logout']")
private WebElement logbtn;

public  Logout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement clicklogout()
{
	return logimg;
}

public WebElement clicklogbtn()
{
	return logbtn;
}

}
