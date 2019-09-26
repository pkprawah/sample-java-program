package excelsheet;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelsheetCellDemo {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		//Set Header Font
		XSSFFont headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 12);

		//Set Header Style for Text
		CellStyle   headerStyle = workbook.createCellStyle();
		headerStyle.setAlignment(headerStyle.getAlignment().CENTER);
		headerStyle.setBorderLeft(BorderStyle.MEDIUM);
		headerStyle.setBorderRight(BorderStyle.MEDIUM);
		headerStyle.setBorderTop(BorderStyle.MEDIUM);
		headerStyle.setBorderBottom(BorderStyle.MEDIUM);
		headerStyle.setFont(headerFont);
		
		// Set amount format for number
		CellStyle  amountFormat = workbook.createCellStyle();
		amountFormat.setAlignment(headerStyle.getAlignment().RIGHT);
		//amountFormat.setDataFormat(BuiltinFormats.getBuiltinFormat(2));
		headerStyle.setFont(headerFont);
		
		// Set Header Style
		CellStyle headerTextAlignment = workbook.createCellStyle();
		headerTextAlignment.setAlignment(headerTextAlignment.getAlignment().LEFT);
		headerTextAlignment.setFont(headerFont);
		
		Row header0=sheet.createRow(0);
		Cell cell0=header0.createCell(0);
		cell0.setCellValue("CENTRAL BANK OF NIGERIA");
		cell0.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 0, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 5));
		
		Row header1=sheet.createRow(1);
		Cell cell1=header1.createCell(0);
		cell1.setCellValue("TRADE AND EXCHANGE DEPARTMENT");
		cell1.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 0, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 5));
		
		 sheet.setColumnWidth(1, 25);
		 
		 
		//Set Header Style for Text
			XSSFCellStyle   rowformat3border = workbook.createCellStyle();
			rowformat3border.setAlignment(headerStyle.getAlignment().CENTER);
			rowformat3border.setBorderBottom(BorderStyle.MEDIUM);
			rowformat3border.setFont(headerFont);
		 
		Row header2=sheet.createRow(2);
		Cell cell2=header2.createCell(0);
		cell2.setCellValue("DAILY RETURNS ON INTERNATIONAL MONEY TRANSFER ON BANK BASIS");
		cell2.setCellStyle(rowformat3border);
		sheet.setColumnWidth((short) 0, (short) 6000);
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 5));
		
		Row header3=sheet.createRow(3);
		Cell cell3=header3.createCell(0);
		cell3.setCellValue("IMTO NAME : Xpress Money Services Limited");
		cell3.setCellStyle(headerTextAlignment);
		sheet.setColumnWidth((short) 0, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(3, 3, 0, 5));
		
		Row header4=sheet.createRow(4);
		Cell cell4=header4.createCell(0);
		cell4.setCellValue("DATE : 21.02.2019");
		cell4.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 0, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 5));
		
		
		Row header5=sheet.createRow(5);
		Cell cell5=header5.createCell(0);
		cell5.setCellValue(" ");
		cell5.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 0, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(5, 6, 0, 0));
		
		
		Cell cell6=header5.createCell(1);
		cell6.setCellValue("INTERNATIONAL MONEY TRNASFER OPERATOR");
		cell6.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 1, (short) 15000 );
		sheet.addMergedRegion(new CellRangeAddress(5, 6, 1, 1));
		
		Cell cell7=header5.createCell(2);
		cell7.setCellValue("INBOUND REMITANCE");
		cell7.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 2, (short) 6000 );
		sheet.addMergedRegion(new CellRangeAddress(5, 5, 2, 4));
		
		
		Row header6=sheet.createRow(6);
		Cell cell8=header6.createCell(2);
		cell8.setCellValue("DAYS");
		cell8.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 2, (short) 6000 );
		//sheet.addMergedRegion(new CellRangeAddress(6, 6, 2, 2));
		
		
		
		Cell cell9=header6.createCell(3);
		cell9.setCellValue("TXNS COUNT");
		cell9.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 3, (short) 6000 );
				
		
		
		Cell cell10=header6.createCell(4);
		cell10.setCellValue("TXNS VALUES");
		cell10.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 4, (short) 6000 );
		XSSFDataFormat hssfDataFormat = workbook.createDataFormat(); 
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		String cellVal = "2500.354";
		//cellStyle.setDataFormat(hssfDataFormat.getFormat("############.###"));
		//cell9.setCellStyle(cellStyle);
		cell9.setCellValue(new Double(cellVal));
		cell9.setCellType(CellType.NUMERIC);
	
		
		
		Cell cell11=header5.createCell(5);
		cell11.setCellValue("REMARKS");
		cell11.setCellStyle(headerStyle);
		sheet.setColumnWidth((short) 5, (short) 6000 );
		
		
		Row header10=sheet.createRow(10);
		Cell cellTotal=header10.createCell(0);
		cellTotal.setCellValue("");
		cellTotal.setCellStyle(headerStyle);
		//sheet.setColumnWidth((short) 3, (short) 6000 );
		
		Cell cellTotal1=header10.createCell(1);
		cellTotal1.setCellValue("Total");
		cellTotal1.setCellStyle(headerStyle);
		//sheet.setColumnWidth((short) 3, (short) 6000 );
		
		Cell cellTotal2=header10.createCell(2);
		cellTotal2.setCellValue("Days");
		cellTotal2.setCellStyle(headerStyle);
		//sheet.setColumnWidth((short) 3, (short) 6000 );
		
		
		Cell cellTotal3=header10.createCell(3);
		cellTotal3.setCellValue("TXN Count");
		cellTotal3.setCellStyle(headerStyle);
		//sheet.setColumnWidth((short) 3, (short) 6000 );
		
		
		
		
		
		
	/*	Row row4Cell=null;
		Cell headerText=null;
		int columnWidth=0;
		int columnStyle=0;
		for(int row=0;row<7;row++){
			row4Cell=sheet.createRow(row);
			headerText=row4Cell.createCell(row-row);
			if(row==0){
			headerText.setCellValue("CENTRAL BANK OF NIGERIA");
			if(columnWidth==0){
				headerText.setCellStyle(headerStyle);
				sheet.setColumnWidth((row-row),6000 );
				columnWidth++;
			}
			sheet.addMergedRegion(new CellRangeAddress(row, row, 0, 5));
			}
			if(row==1){
				headerText.setCellValue("TRADE AND EXCHANGE DEPARTMENT");
				headerText.setCellStyle(headerStyle);
				sheet.addMergedRegion(new CellRangeAddress(row, row, 0, 5));
			}
				
			if(row==2){
				headerText.setCellValue("DAILY RETURNS ON INTERNATIONAL MONEY TRANSFER ON BANK BASIS");
				headerText.setCellStyle(headerStyle);
				sheet.addMergedRegion(new CellRangeAddress(row, row, 0, 5));
			}
				
				
			if(row==3){
				headerText.setCellValue("IMTO NAME : Xpress Money Services Limited");
				if(columnStyle==0)
					headerText.setCellStyle(headerTextAlignment);
					sheet.addMergedRegion(new CellRangeAddress(row, row, 0, 5));
					columnStyle++;
			}
			
			if(row==4){
				headerText.setCellValue("DATE : 21.02.2019");
				headerText.setCellStyle(headerStyle);
				sheet.addMergedRegion(new CellRangeAddress(row, row, 0, 5));
			}
			if(row==5){
				for(int col=0;col<6;col++){
					headerText=row4Cell.createCell(col);
					if(col==0){
					headerText.setCellValue("SL/NO");
					headerText.setCellStyle(headerStyle);
					sheet.addMergedRegion(new CellRangeAddress(5, 6, 0, 0));
					}
					
					if(col==1){
						headerText.setCellValue("INTERNATIONAL MONEY TRNASFER OPERATOR");
						sheet.setColumnWidth(col,15000 );
						headerText.setCellStyle(headerStyle);
						
						sheet.addMergedRegion(new CellRangeAddress(5, 6, 1, 1));
					}else{
						sheet.setColumnWidth(col,6000 );
					}
					if(col==2){
						headerText.setCellValue("INBOUND REMITANCE");
						headerText.setCellStyle(headerStyle);
						sheet.addMergedRegion(new CellRangeAddress(5, 5, 2, 4));
					}
					if(col==3 || col==4)
						continue;
					if(col==5){
						headerText.setCellValue("REMARKS");
						headerText.setCellStyle(headerStyle);
					}
				
				}
			}
			
			if(row==6){
				for(int col=2;col<5;col++){
					headerText=row4Cell.createCell(col);
					if(col==2){
						headerText.setCellValue("DAYS");
						headerText.setCellStyle(headerStyle);
					}
					
					if(col==3){
						headerText.setCellValue("TXNS COUNT");
						headerText.setCellStyle(headerStyle);
					}
					
					if(col==4){
						headerText.setCellValue("TXNS Value");
						headerText.setCellStyle(headerStyle);
					}
				}
			}
			
			
		}
		   */
		
	
	 try
     {
         //Write the workbook in file system
         FileOutputStream out = new FileOutputStream(new File("D:\\excelsheetJar\\CBN\\DailyRecord.xlsx"));
         workbook.write(out);
         out.close();
         System.out.println("DailyRecord written successfully on disk.");
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
	}
}

