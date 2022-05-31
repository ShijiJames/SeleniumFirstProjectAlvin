package basiccommandspkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\Automation Project\\TrialTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("User");
		String name = sheet.getRow(0).getCell(0).getStringCellValue();
		String age = sheet.getRow(0).getCell(1).getStringCellValue();

		System.out.println(name);
		System.out.println(age);
		workbook.close();
		fis.close();
	}

}
