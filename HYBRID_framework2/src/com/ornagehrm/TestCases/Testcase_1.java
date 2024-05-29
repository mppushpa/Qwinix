package com.ornagehrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.basicTest.BasePage;
import com.orangehrm.basicTest.DatadrivenTesting_ReadExcel;

public class Testcase_1 extends BasePage

{
//@Test
//public void runappln()
//{
//HP.PIM().click();
//HP.Addemp().click();
//HP.Fistname().sendKeys(pro.getProperty("F1"));
//HP.Midname().sendKeys(pro.getProperty("M1"));;
//HP.Lastname().sendKeys(pro.getProperty("L1"));
//HP.savebtn().click();
//}


@Test
public void runappln1() throws Exception
{
HP.PIM().click();
HP.Addemp().click();
HP.Fistname().sendKeys(DatadrivenTesting_ReadExcel.Readdata("Sheet1", 1,0));
HP.Midname().sendKeys(DatadrivenTesting_ReadExcel.Readdata("Sheet1", 1,1));
HP.Lastname().sendKeys(DatadrivenTesting_ReadExcel.Readdata("Sheet1", 1,2));
HP.savebtn().click();
Assert.fail();
}

}
