package excel_fetching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xl {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\selenium\\files\\testdata.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
	  String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	  System.out.println(data);
	  System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
	  
		
	}

}
