import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Userdataprovider {
	
	static XSSFWorkbook Userlist;
	static XSSFSheet sheet;
	
	public  Userdataprovider() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Robi\\Documents\\Eclipse\\Seleniummaven1\\Data\\Userlist.xlsx");
		Userlist = new XSSFWorkbook(file);
		sheet = Userlist.getSheet("Users");
	}

	public int getRowCount() {
		
		return sheet.getLastRowNum() ;
	}

	public int getColumnCount() {
		
		return sheet.getRow(0).getLastCellNum();
	}
	
	
}
