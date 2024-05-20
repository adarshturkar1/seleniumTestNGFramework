package Demo;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
 
public class writeToEXcel { 
	public static void main(String[] args) throws IOException { 
 
		String path = "C:\\Users\\bhagy\\Desktop\\java programs Sheet.xlsx"; 
		FileInputStream fs = new FileInputStream(path); 
 
		Workbook wb = new XSSFWorkbook(fs); 
		 
		Sheet sheet1 = wb.getSheetAt(3); 
		 
		Row row=sheet1.createRow(10000); 
		int lastRow = sheet1.getLastRowNum(); 
		System.out.println(lastRow); 
		 
     /* 
		 
		 
		 
		for (int i = 0; i <= lastRow ; i++) { 
			 
			Cell cell = row.createCell(2); 
 
			cell.setCellValue("10"); 
 
		}*/ 
 
		FileOutputStream fos = new FileOutputStream(path); 
		wb.write(fos); 
		fos.close(); 
 
	} 
 
}
