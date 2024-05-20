package Demo;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class ExcelHandeling2 { 
	public static void main(String[] args) throws IOException { 
 
		// connection to the excel --- 
 
		// To read the file -- 
		FileInputStream fs = new FileInputStream("C:\\Users\\bhagy\\Desktop\\java programs Sheet.xlsx"); 
 
		// connect workboobxokk--data read 
		XSSFWorkbook workbook = new XSSFWorkbook(fs); 
 
		// sheet -- 
		XSSFSheet sheet = workbook.getSheetAt(2); 
 
		for (int i = 0; i <=sheet.getLastRowNum();  i++) { 
			Row row = sheet.getRow(i); 
			Cell cell1 = row.getCell(0); 
			System.out.println(cell1); 
 
		} 
	} 
}