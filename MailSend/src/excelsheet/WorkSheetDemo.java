package excelsheet;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkSheetDemo {

	 public static void main(String[] args)
	    {
	        //Blank workbook
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("EmployeeData");
	        
	        
	        sheet.addMergedRegion(new CellRangeAddress(0,0,0,6)); 
	        sheet.addMergedRegion(new CellRangeAddress(1,1,0,6));
	        sheet.addMergedRegion(new CellRangeAddress(2,2,0,6));
	        
	        sheet.addMergedRegion(new CellRangeAddress(3,4,0,0));
	        sheet.addMergedRegion(new CellRangeAddress(3,4,1,1));
	        sheet.addMergedRegion(new CellRangeAddress(3,4,2,2));
	        sheet.addMergedRegion(new CellRangeAddress(3,4,3,5));
	        sheet.addMergedRegion(new CellRangeAddress(3,4,6,6));
	        
	        
	        
	        //Set Header Font
	        XSSFFont headerFont = workbook.createFont();
	        headerFont.setBold(true);
	        headerFont.setFontHeightInPoints((short) 12);
	  
	        
	      //Set Header Style
	        CellStyle headerStyle = workbook.createCellStyle();
	        headerStyle.setAlignment(HorizontalAlignment.CENTER);
	        headerStyle.setFont(headerFont);
	        headerStyle.setBorderTop(BorderStyle.MEDIUM);
	        headerStyle.setBorderBottom(BorderStyle.MEDIUM);
	        headerStyle.setBorderLeft(BorderStyle.MEDIUM);
	        headerStyle.setBorderRight(BorderStyle.MEDIUM);
	        Row header;
	        Cell cell ;
	        for(int j = 0;j<7; j++) {
	        	header = sheet.createRow(j);
	        		for(int i = 0;j<7; i++) {
	        			cell = header.createCell(0);
	        			if(j==0)
	        				cell.setCellValue("Regulatory Report");
	        			if(j==1)
	        				cell.setCellValue("Unimoni India");
	        			if(j==2)
	        				cell.setCellValue("Central Bank of Nigeria");
	        			if(j==3){
	        				cell.setCellValue("SL No.");
	            	}
	            		
	            	if(j==4){
	            		  cell.setCellValue("Company");
	            		  //cell1.setCellStyle(headerStyle);
	            	}
	            cell.setCellStyle(headerStyle);
	           
	        }}
	        
	        try
	        {
	            //Write the workbook in file system
	            FileOutputStream out = new FileOutputStream(new File("D:\\excelsheetJar\\XpressMoney.xlsx"));
	            workbook.write(out);
	            out.close();
	            workbook.close();
	            System.out.println("XpressMoney.xlsx saved Successfully");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

}
