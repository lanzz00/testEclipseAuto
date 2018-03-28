package com.stta.SuiteOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stta.utility.IdCardGenerator;
import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;
import com.stta.webdriver.BrowserEngine;

import com.stta.TestSuiteBase.testelementfuzhi;

//SuiteOneCaseOne 类 继承自  SuiteOneBase 类.
public class SuiteOneCase3 extends SuiteOneBase{
Read_XLS FilePath = null;   
String TestCaseName = null; 
WebDriver driver;
testelementfuzhi testInput;
IdCardGenerator testCardNum;

@BeforeTest
public void checkCaseToRun() throws IOException{
    //调用SuiteBase类的init()来初始化.xls文件
    init(); 
    FilePath = TestCaseListExcelOne;
    System.out.println("FilePath Is : "+FilePath);
    TestCaseName = this.getClass().getSimpleName(); 
    System.out.println("TestCaseName Is : "+TestCaseName);
	  BrowserEngine browserEngine = new BrowserEngine();  
	  browserEngine.initConfigData();  
	  driver=browserEngine.getBrowser();  
	  testInput = new testelementfuzhi(driver); 
	  testCardNum = new IdCardGenerator();
	  testInput.login_test( "sxzhz",  "123456");
	  testInput.sleep(2);
	  testInput.idFuzhiClick("menuLiDatabase");
	  testInput.sleep(1);
    
}

//在每个迭代中接收4列的数据.
//@Test(dataProvider="SuiteOneCase3Data")
//public void SuiteOneCase3Test(String DataCol1,String DataCol2){
//	
//	testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[1]/li[2]/ul/li[1]");
//	testInput.sleep(1);
//	testInput.xpathFuzhiClick("//*[@id=\"queryDiv\"]/div[1]/div/div[1]/a[1]");
//	testInput.swith_toIframe("addPeopleWinWindowFrame");
//
//	testInput.idFuzhi("cardNum", DataCol2);
//	testInput.sleep(1);
//	testInput.idFuzhi("name", DataCol1);
//	testInput.sleep(1);
//	testInput.nameFuzhiClick("submitBtn");
//	testInput.sleep(1);
//	driver.switchTo().defaultContent();
//	
//    System.out.println("Value Of DataCol1 = "+DataCol1);
//    System.out.println("Value Of DataCol2 = "+DataCol2);
//
//}   
/**
 * 吸毒人员信息录入
 * @param DataCol1
 * @param DataCol2
 */
@Test(dataProvider="SuiteOneCase3Data")
public void testXD(String DataCol1,String DataCol2) {

	DataCol2 = testCardNum.generate();
	//*[@id="mainDiv"]/div[1]/div/ul[2]
	//点击重点人员
	testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[2]");
	testInput.sleep(1);

	//点击吸毒人员
	testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[2]/li[2]/ul/li[4]");
	testInput.sleep(1);
	//点击新增按钮
	testInput.xpathFuzhiClick("//*[@id=\"queryDiv\"]/div[1]/div/div[1]/a[1]");
	testInput.swith_toIframe("addPeopleWinWindowFrame");
	  //身份证
	testInput.idFuzhi("cardNum", DataCol2);
	testInput.sleep(1);
	//姓名
	testInput.idFuzhi("name", DataCol1);
	testInput.sleep(1);
	//户籍地  户籍类型  管控归属(浙江(_easyui_combobox_i1_10)-金华-义乌-本地-本地管控)
	//户籍地：浙江///html/body/form/div[1]/div/div[2]/div[1]/div/table/tbody/tr[17]/td[2]/span[1]/input[1]
	//
	testInput.xpathFuzhiClick("//*[@id=\"peopleTabs\"]/div[2]/div[1]/div/table/tbody/tr[17]/td[2]/span[1]/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i1_10");
	testInput.sleep(1);
	//户籍地：金华
	testInput.xpathFuzhiClick("/html/body/form/div[1]/div/div[2]/div[1]/div/table/tbody/tr[17]/td[2]/span[2]/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i25_6");
	testInput.sleep(1);
	//户籍地：义乌
	testInput.xpathFuzhiClick("/html/body/form/div[1]/div/div[2]/div[1]/div/table/tbody/tr[17]/td[2]/span[3]/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i27_7");
	testInput.sleep(1);
	//本地类型
	testInput.xpathFuzhiClick("/html/body/form/div[1]/div/div[2]/div[1]/div/table/tbody/tr[18]/td[2]/span/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i50_0");
	testInput.sleep(1);
	//本地管控
	testInput.xpathFuzhiClick("/html/body/form/div[1]/div/div[2]/div[1]/div/table/tbody/tr[18]/td[4]/span/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i51_0");
	testInput.sleep(1);
	//吸毒信息-吸毒被查1-3--社会面
	testInput.xpathFuzhiClick("//*[@id=\"peopleTabs\"]/div[1]/div[3]/ul/li[3]/a");
	testInput.sleep(1);
	testInput.xpathFuzhiClick("//*[@id=\"peopleTabs\"]/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/span/input[1]");
	testInput.sleep(1);
	testInput.idFuzhiClick("_easyui_combobox_i18_2");
	testInput.sleep(1);

	testInput.nameFuzhiClick("submitBtn");
	testInput.sleep(1);
	driver.switchTo().defaultContent();
	//退出登录
//	testInput.xpathFuzhiClick("//*[@id=\"indexDiv\"]/div[1]/div/div/div[1]/ul/li[2]/div/a");
//	testInput.login_test( "sxzx001",  "123456");
//	testInput.sleep(2);
//	testInput.idFuzhiClick("menuLiDatabase");
//	testInput.sleep(1);
//	testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[2]");
//	testInput.sleep(1);
//	testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[2]/li[2]/ul/li[4]");
//	testInput.sleep(1);
	
}

@AfterTest
public void LogOut(){
	
	
}
//data provider回在每个迭代中一个一个返回4列数据
@DataProvider
public Object[][] SuiteOneCase3Data(){
    //To retrieve data from Data 1 Column,Data 2 Column,Data 3 Column and Expected Result column of SuiteOneCaseOne data Sheet.
    //Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically when reading test data.
    return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
    }
}
