import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.DataProvider;

public class Exceldataprovider {

	@DataProvider(name= "Excel-user-data")
	Object[][] excelDataSet() throws IOException{
	
	Userdataprovider excel = new Userdataprovider();
	
	int rowCount = excel.getRowCount();
	int colCount = excel.getColumnCount();
	
	Object[][] data= new Object[rowCount][colCount];
	
	for(int row = 1; row <= rowCount; row++) {
		XSSFRow currentRow= Userdataprovider.sheet.getRow(row);
		
		for(int col=0; col<colCount; col++) {
			String celdata = currentRow.getCell(col).toString();
			data[row-1][col]=celdata;
		}
		
	}
	
	return data;	
	}
}
