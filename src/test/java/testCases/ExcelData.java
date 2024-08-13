package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Users\\myfut\\eclipse-workspace\\avictionProject2024\\src\\test\\resources\\testdata\\updatedTestCases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = 	workbook.getSheet("login");
		int totalRows =	sheet.getLastRowNum();
		int totalCells = sheet.getRow(9).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCells);

		for(int i=0;i<=totalRows;i++)
		{

		}
	}

}
