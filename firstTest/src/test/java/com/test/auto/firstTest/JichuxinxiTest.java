package com.test.auto.firstTest;

import org.testng.annotations.Test;

import com.test.auto.TestSuiteBase.testelementfuzhi;
import com.test.auto.webdriver.BrowserEngine;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class JichuxinxiTest {
	WebDriver driver;
	testelementfuzhi testInput;
 
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  BrowserEngine browserEngine = new BrowserEngine();  
	  browserEngine.initConfigData();  
	  driver=browserEngine.getBrowser();  
	  testInput = new testelementfuzhi(driver); 
	  testInput.login_test( "sxzhz",  "123456");
	  testInput.sleep(2);
	  testInput.idFuzhiClick("menuLiDatabase");
	  testInput.sleep(1);
  }
  @DataProvider(name = "testname")
  

  
  @Test
  /**户籍录入数据(必填)**/
  public void jichuxinxluruTest01() {

		testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[1]/li[2]/ul/li[1]");
		testInput.sleep(1);
		testInput.xpathFuzhiClick("//*[@id=\"queryDiv\"]/div[1]/div/div[1]/a[1]");
		testInput.swith_toIframe("addPeopleWinWindowFrame");
		//cardNum 330104198001010010
		//name 
		testInput.idFuzhi("cardNum", "330104198001010053");
		testInput.sleep(1);
		testInput.idFuzhi("name", "huji003");
		testInput.sleep(1);
		testInput.nameFuzhiClick("submitBtn");
		testInput.sleep(1);
		
  }
  /**户籍录入数据(详细)**/
  public void jichuxinxluruTest02() {
	  testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul[1]/li[2]/ul/li[1]");
		testInput.sleep(1);
		testInput.xpathFuzhiClick("//*[@id=\"queryDiv\"]/div[1]/div/div[1]/a[1]");
		testInput.swith_toIframe("addPeopleWinWindowFrame");
		//cardNum 330104198001010010
		//name 
		testInput.idFuzhi("cardNum", "330104198001010053");
		testInput.sleep(1);
		testInput.idFuzhi("name", "huji003");
		testInput.sleep(1);
		//曾用名 oldName  
		
		
		//性别 name=sex
		//重点类型
		//民政残联类型
		//民族
		//政治面貌
		//文化程度
		//血型
		//身高(CM)
		//宗教信仰
		//婚姻状况
		//联系电话
		//联系手机
		//电子邮箱
		//关注程度
		//房屋编号
		//无房原因
		//工作单位
		//户籍地
		//户籍类型
		//管控归属
		//居住地
		//居住地详址
		//居住地派出所
		//户籍派出所
		//户籍详址
		//其他地址
		//备注
		// 人户信息xpath  //*[@id="peopleTabs"]/div[1]/div[3]/ul/li[2]/a
		
		testInput.nameFuzhiClick("submitBtn");
		testInput.sleep(1);
}
  
  @AfterMethod
  public void afterMethod() {
	  
  }

}
