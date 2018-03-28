package com.stta.SuiteOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;

//SuiteOneCaseOne 类 继承自  SuiteOneBase 类.
public class SuiteOneCaseOne extends SuiteOneBase{
Read_XLS FilePath = null;   
String TestCaseName = null; 
WebDriver driver;

@BeforeTest
public void checkCaseToRun() throws IOException{
    //调用SuiteBase类的init()来初始化.xls文件
    init(); 
    FilePath = TestCaseListExcelOne;
    System.out.println("FilePath Is : "+FilePath);
    TestCaseName = this.getClass().getSimpleName(); 
    System.out.println("TestCaseName Is : "+TestCaseName);
    
}

//在每个迭代中接收4列的数据.
@Test(dataProvider="SuiteOneCaseOneData")
public void SuiteOneCaseOneTest(String DataCol1,String DataCol2,String DataCol3,String ExpectedResult){
    System.out.println("Value Of DataCol1 = "+DataCol1);
    System.out.println("Value Of DataCol2 = "+DataCol2);
    System.out.println("Value Of DataCol3 = "+DataCol3);
    System.out.println("Value Of ExpectedResult = "+ExpectedResult);        
}   

//data provider回在每个迭代中一个一个返回4列数据
@DataProvider
public Object[][] SuiteOneCaseOneData(){
    //To retrieve data from Data 1 Column,Data 2 Column,Data 3 Column and Expected Result column of SuiteOneCaseOne data Sheet.
    //Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically when reading test data.
    return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
    }
}
