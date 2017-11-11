package test_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static FileInputStream load_file() throws IOException{
		 fis= new FileInputStream("/Users/karthik/zillowscrap/src/main/java/test_data/test_data.xlsx");
		return fis;
		
	}
	public String get_celldata(int row_number,int cell_number) throws IOException{
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(row_number);
		cell = row.getCell(cell_number);
		String cell_data = cell.getStringCellValue();
		fis.close();
		return cell_data;
		
	}
	public String get_email(FileInputStream fis) throws IOException{
		String email= get_celldata(0,0);
		return email;
	}
	public String get_password(FileInputStream fis) throws IOException{
		String password= get_celldata(0,1);
		return password;
		
	}
	public String get_query(FileInputStream fis) throws IOException{
		String query= get_celldata(1,0);
		return query;
	}
}
