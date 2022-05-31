package basiccommandspkg;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcel {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Trial");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Rohini");
		sheet.getRow(0).createCell(1).setCellValue(23);
		sheet.getRow(0).createCell(2).setCellValue("TVM");
		sheet.getRow(0).createCell(3).setCellValue(false);
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Robin");
		sheet.getRow(1).createCell(1).setCellValue(25);
		sheet.getRow(1).createCell(2).setCellValue("Kochi");
		sheet.getRow(1).createCell(3).setCellValue(true);
		File file = new File("D:\\Automation Project\\TrialTest2.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();

	}

}
