package sdet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWrite {
	  public static void main(String[] args) throws IOException {
	        // Read data from the Excel sheet
	        List<String[]> exceldata = readExcelFile();
	        
	    }
		public static List<String[]> readExcelFile() throws IOException {
			 
		        List<String[]> exceldata = new ArrayList<>();

		        FileInputStream file = new FileInputStream("C:\\Users\\VIJAY\\Downloads\\Testdata.xlsx");
		        Workbook workbook = new XSSFWorkbook(file);
                Sheet sheet = workbook.getSheetAt(0);
                int rows=sheet.getLastRowNum();
                int cols=sheet.getRow(1).getLastCellNum();
                
                for(int i=0; i<=rows ;i++)
                {
                	Row row = sheet.getRow(i);
                	for(int j=0; j<cols; j++)
                	{
                		Cell cell =row.getCell(j);
                		System.out.print(cell);
                		System.out.print(" | ");
                	}
                	System.out.println();
                	
                }
                
		        return exceldata;
		 }

	}

