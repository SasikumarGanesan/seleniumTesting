package excel;

import config.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileLocation = System.getProperty("user.dir");
		ExcelDataConfig excel = new ExcelDataConfig(fileLocation + "\\data\\employee_details.xlsx");
		System.out.println(excel.getData(0, 1, 0) +"  "+ excel.getData(0, 1, 1));
	}

}
