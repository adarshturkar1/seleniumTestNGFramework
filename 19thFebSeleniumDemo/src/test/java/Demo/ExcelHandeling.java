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
 
public class ExcelHandeling { 
	public static void main(String[] args) throws IOException { 
	 
		 
		//connection to the  excel --- 
		 
		//To read the file -- 
		FileInputStream fs = new FileInputStream("C:\\Users\\bhagy\\Desktop\\java programs Sheet.xlsx"); 
		 
		 
		 
		//connect workboobxokk--data read 
		XSSFWorkbook workbook = new XSSFWorkbook(fs); 
		 
		 
		//sheet -- 
		XSSFSheet sheet = workbook.getSheetAt(2); 
		 
	 
		Row row = sheet.getRow(1); 
		 
		Cell cell1 = row.getCell(0); 
		 
		System.out.println(cell1); 
		 
		Cell cell2 = row.getCell(1); 
		 
		System.out.println(cell2); 
		 
			 
		 
	 
	WebDriver driver=new ChromeDriver(); 
		 
		driver.get("https://login.salesforce.com/?locale=in"); 
		 
		 
		driver.findElement(By.id("username")).sendKeys(cell1.toString()); 
		 
		driver.findElement(By.name("pw")).sendKeys(cell2.toString()); 
		 
		driver.findElement(By.id("Login")).click(); 
		 
		 
		 
		 
	} 
}
