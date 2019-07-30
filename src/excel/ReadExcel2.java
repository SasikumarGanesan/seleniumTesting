package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fileLocation = System.getProperty("user.dir");
		File src = new File(fileLocation + "\\data\\employee_details.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		System.out.println("Total rows "+ rowCount);
		for(int i = 1; i < rowCount; i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from xl: " + data0);
		}
		wb.close();
	}

}
