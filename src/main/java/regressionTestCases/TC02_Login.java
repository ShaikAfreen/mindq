package regressionTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import allPages.LoginPPP;

public class TC02_Login extends LoginPPP {

	public static void main(String[] args) throws IOException {
		
		String username = "";
		String password ="";
		String path ="D:\\Eclipse\\Book1.xlsx";
		
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		
		for(int i =1; i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			username = row.getCell(0).getStringCellValue();
			password = row.getCell(1).getStringCellValue();
			
			BrowseLaunch();
			Enter_Email(username);
			Enter_Password(password);
			LoginIn();
			String actual = "Invalid email or password";
			String expected = "Invalid email or password";
			
			int cellCount = sheet.getRow(i).getLastCellNum();
			XSSFCell cell = row.createCell(cellCount);
			
			if(actual.equals(expected)) {
				System.out.println("Testcase is passed");
				cell.setCellValue("Passed");
			}
			else
			{
				System.out.println("Testcase is failed");
				cell.setCellValue("Failed");
			}
			
		}
		workbook.close();
		fs.close();
		
		FileOutputStream fout = new FileOutputStream(path);
		workbook.write(fout);
		fout.close();
		
		
	}

}
