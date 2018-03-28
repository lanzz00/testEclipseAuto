package com.stta.TestSuiteBase;

import java.io.IOException;
import com.stta.utility.Read_XLS;

public class SuiteBase {

public static Read_XLS TestSuiteListExcel=null;
public static Read_XLS TestCaseListExcelOne=null;
public static Read_XLS TestCaseListExcelTwo=null;

public void init() throws IOException{
//代码中文件路径根据实际情况填写
//使用Read_XLS工具类初始化测试测试套件列表TestSuiteList.xls
	//F:\lzz\eclipse-workspace\testAuto\src\main\java\com\stta\ExcelFiles
TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"/src/main/java/com/stta/ExcelFiles/TestSuiteList.xls");
//使用Read_XLS工具类初始化测试套件一SuiteOne.xls
TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"/src/main/java/com/stta/ExcelFiles/SuiteOne.xls");
//使用Read_XLS工具类初始化测试套件二SuiteTwo.xls
TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"/src/main/java/com/stta/ExcelFiles/SuiteTwo.xls");
}
}
