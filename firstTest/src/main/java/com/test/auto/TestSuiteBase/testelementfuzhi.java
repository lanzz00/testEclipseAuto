package com.test.auto.TestSuiteBase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.test.auto.webdriver.BrowserEngine;

public class testelementfuzhi {
		WebDriver driver;

		//结构化
		public testelementfuzhi (WebDriver driver) {  
	        this.driver = driver;  
	    }  
		//通过ID找元素
		public void idFuzhi(String idtest,String inputtest) {
			driver.findElement(By.id(idtest)).clear();
			driver.findElement(By.id(idtest)).sendKeys(inputtest);
		}
		//通过name找元素
		public void nameFuzhi(String nametest,String inputtest) {
			driver.findElement(By.name(nametest)).clear();
			driver.findElement(By.name(nametest)).sendKeys(inputtest);
		}
		//通过className找元素
		public void classNameFuzhi(String classNametest,String inputtest) {
			driver.findElement(By.className(classNametest)).clear();
			driver.findElement(By.className(classNametest)).sendKeys(inputtest);
		}
		//通过xpath找元素
		public void xpathFuzhi(String xpathtest,String inputtest) {
			driver.findElement(By.xpath(xpathtest)).clear();
			driver.findElement(By.xpath(xpathtest)).sendKeys(inputtest);
		}
		
		//通过ID找元素点击
		public void idFuzhiClick(String idtest) {
			driver.findElement(By.id(idtest)).click();
		}
		//通过name找元素点击
		public void nameFuzhiClick(String nametest) {
			driver.findElement(By.name(nametest)).click();
		}
		//通过className找元素点击
		public void classNameFuzhiClick(String classNametest) {
			driver.findElement(By.className(classNametest)).click();
			}
		//通过xpath找元素点击
		public void xpathFuzhiClick(String xpathtest) {
			driver.findElement(By.xpath(xpathtest)).click();
		}
		//焦点定位到iframe
		
		public void swith_toIframe(String iframeStr) {
			driver.switchTo().frame(iframeStr);
		}
		
		//上传图片
		public void upload_file(String fileId, String filePath) {
			driver.findElement(By.id(fileId)).clear();
			driver.findElement(By.id(fileId)).sendKeys(filePath);

		}
		//等待时间
		public void sleep(int seconds) {
			try {
				Thread.sleep(seconds * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//登录
		public void login_test(String nameStr,String pwdStr) {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(nameStr);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(pwdStr);
			driver.findElement(By.className("login_btn")).click();
			
		}
		
}
