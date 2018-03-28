package com.stta.utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.filechooser.FileSystemView;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class testPOIDome {
	public static void creatExcel() throws IOException {
		//获取桌面路径
		FileSystemView fsv = FileSystemView.getFileSystemView();
		String desktop = fsv.getHomeDirectory().getPath();
		String filePath = desktop + "/temp.xls";
		File file = new File(filePath);
		OutputStream ops = new FileOutputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("testSheet1");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("name");
		row.createCell(2).setCellValue("cardNum");
		row.createCell(3).setCellValue("sex");
		row.setHeightInPoints(30);
		
		HSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("1");
		row1.createCell(1).setCellValue("lili");
		row1.createCell(2).setCellValue("330124199002250658");
		row1.createCell(3).setCellValue("男");
		
		workbook.setActiveSheet(0);
		workbook.write(ops);
		ops.close();
	}
	//按照行读取
	public static void readExcel() throws IOException {
		FileSystemView fsv = FileSystemView.getFileSystemView();
	    String desktop = fsv.getHomeDirectory().getPath();
	    String filePath = desktop + "/temp.xls";
	    FileInputStream fis = new FileInputStream(filePath);
	    BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
	    POIFSFileSystem fileSystem = new POIFSFileSystem(bufferedInputStream);
	    HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
	    HSSFSheet sheet = workbook.getSheet("testSheet1");
	    int lastRowIndex = sheet.getLastRowNum();
	    System.out.println(lastRowIndex);
	    //构建json
	    JsonArray array=new JsonArray();
	    String[] arraytop =  new String[8];
		 for(int i = 0;i <= lastRowIndex;i++) {
			
			 JsonObject jsonStr=new JsonObject();
			 HSSFRow row = sheet.getRow(i);
			 
			 short lastCellNum = row.getLastCellNum();
			 if(i == 0) {
				 for(int n=0;n<lastCellNum;n++) {
					 String cellValue =row.getCell(n).getStringCellValue();
					 arraytop[n] = cellValue;
					
				 } 
			 }else if(i > 0) {
				 //arraytop.length
				 for(int j=0,m=0;j<lastCellNum;j++,m++) {
					 
					 String cellValue =row.getCell(j).getStringCellValue();
					 jsonStr.addProperty(arraytop[j], cellValue);
				 }
				 array.add(jsonStr);
			 }else {
				break;
			}
			 }
		 System.out.println(array);
		 }
		
	//按照列读取
	public static void colReadExcel() throws IOException {
		FileSystemView fsv = FileSystemView.getFileSystemView();
	    String desktop = fsv.getHomeDirectory().getPath();
	    String filePath = desktop + "/temp.xls";
	    FileInputStream fis = new FileInputStream(filePath);
	    BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
	    POIFSFileSystem fileSystem = new POIFSFileSystem(bufferedInputStream);
	    HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
	    HSSFSheet sheet = workbook.getSheet("testSheet1");
	    int lastRowIndex = sheet.getLastRowNum();
      
           
        }
    
	public static void main(String[] args) throws IOException {
		readExcel();
		//colReadExcel();
	}
}
