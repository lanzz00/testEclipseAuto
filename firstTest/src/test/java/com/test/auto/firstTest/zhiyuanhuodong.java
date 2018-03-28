package com.test.auto.firstTest;

import org.testng.annotations.Test;

import com.test.auto.TestSuiteBase.testelementfuzhi;
import com.test.auto.webdriver.BrowserEngine;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class zhiyuanhuodong {
		WebDriver driver;
		
		@BeforeClass
		public void setUp() throws IOException{  
		     
		  BrowserEngine browserEngine = new BrowserEngine();  
		  browserEngine.initConfigData();  
		  driver=browserEngine.getBrowser();  
		  
		  }  
		@Test
		public void test_case1() throws InterruptedException {
		
			testelementfuzhi testInput = new testelementfuzhi(driver); 
			testInput.idFuzhi("username", "ygzj001");
			testInput.idFuzhi("password", "123456");
			testInput.classNameFuzhiClick("login_btn");
			testInput.sleep(2);
			testInput.xpathFuzhiClick("//*[@id=\"mainDiv\"]/div[1]/div/ul/li[2]/ul/li[2]");
			testInput.sleep(1);
			testInput.idFuzhiClick("operateDiv");
			//定位到iframe
			testInput.swith_toIframe("eventWinWindowFrame");
			
			testInput.sleep(1);
		  
			//活动名称 eventName
			testInput.idFuzhi("eventName", "test_1");
			testInput.sleep(1);
			//活动类型	eventType
			testInput.xpathFuzhiClick("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[4]/span/input[1]");
			Thread.sleep(1000);
			testInput.idFuzhiClick("_easyui_combobox_i1_0");
			//需求人数 requiredNum
			testInput.idFuzhi("requiredNum", "1");
			testInput.sleep(1);
			//是否对外开放 openSpan
			
			//联系人 contactMan
			testInput.idFuzhi("contactMan", "test_pop1");
			testInput.sleep(1);
			//联系电话 contactPhone
			testInput.idFuzhi("contactPhone", "13919971111");
			testInput.sleep(1);
			//活动地点 addressUid
			testInput.xpathFuzhiClick("//*[@id=\"addForm\"]/table/tbody/tr[4]/td[2]/span/input[1]");
			Thread.sleep(1000);
			testInput.idFuzhiClick("_easyui_combobox_i2_1");
			//活动详址 address
			testInput.idFuzhi("address", "测试_详址01");
			testInput.sleep(1);
			//活动时长 eventLength
			String timeLen = "1";
			testInput.idFuzhi("eventLength", timeLen);
			testInput.sleep(1);
			//活动积分 eventScore
			testInput.idFuzhi("eventScore", "1");
			testInput.sleep(1);
			//活动时间段  name=eventTimeType
			
			//招募开始时间--结束时间
	//		JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
	         //remove readonly attribute
//	        removeAttribute.executeScript("var setDate=document.getElementById(\"recruitStartTime\");setDate.removeAttribute('readonly');") ;
//			testInput.idFuzhi("recruitStartTime", "2018-03-20 16:19:10");
			//testInput.idFuzhi("recruitEndTime", "2018-03-21 15:20:53");

			testInput.sleep(1);
			//活动开始时间--结束时间 eventStartTime_d 2018-03-22 15:21:32 eventEndTime_d
//			testInput.idFuzhi("eventStartTime", "2018-03-22 15:21:32");
//			testInput.idFuzhi("eventEndTime", "2018-03-22 16:21:32");
			testInput.sleep(1);
			//服务对象 serviceObject
			testInput.idFuzhi("serviceObject", "服务对象1");
			testInput.sleep(1);
			//招募照片
			testInput.upload_file("fcupload", "F:\\兰珍珍\\综合业务部\\测试附件\\城管照片模板\\城管照片模板\\暴露垃圾\\20131008090948.jpg");
			//招募说明
			testInput.sleep(3);
	  }	
	
	
	  @AfterClass
	  public void tearDown(){  
	      
	      driver.quit();  
	  }  
}
