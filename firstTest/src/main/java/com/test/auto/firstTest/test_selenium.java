package com.test.auto.firstTest;

	import org.openqa.selenium.WebDriver;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class test_selenium {
		
	public static void main(String[] args) {
		// System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");  
		
		System.setProperty("webdriver.gecko.driver", ".\\resources\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();  
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
		driver.get("https://www.baidu.com");  
		//driver.get("http://192.168.11.122:8080/grid/login;"); 
 
		
//				WebElement element_username = driver.findElement(By.id("username"));
//				element_username.clear();
//				element_username.sendKeys("ygzj001");
//				driver.findElement(By.id("password")).clear();
//				driver.findElement(By.id("password")).sendKeys("123456");
//				
//				driver.findElement(By.className("login_btn")).click();
//				driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  

//				System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());  

//				driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div/ul/li[2]/ul/li[2]"));
//				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);  
//				driver.findElement(By.xpath("//*[@id=\"operateDiv\"]/a"));
//				driver.switchTo().frame("eventWinWindowFrame");

//				driver.findElement(By.id("eventName"));
//				driver.findElement(By.id("eventName")).clear();
//				driver.findElement(By.id("eventName")).sendKeys("testHD01");

//				driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[4]/span")).click();
//				driver.findElement(By.id("_easyui_combobox_i1_1")).click();
//				
//				//requiredNum  contactMan  contactPhone

//				driver.findElement(By.id("requiredNum"));
//				driver.findElement(By.id("requiredNum")).clear();
//				driver.findElement(By.id("requiredNum")).sendKeys("1");

//				driver.findElement(By.id("contactMan"));
//				driver.findElement(By.id("contactMan")).clear();
//				driver.findElement(By.id("contactMan")).sendKeys("test_1");

//				driver.findElement(By.id("contactPhone"));
//				driver.findElement(By.id("contactPhone")).clear();
//				driver.findElement(By.id("contactPhone")).sendKeys("18419970007");
//			
		driver.quit();  
	}
}


