package excelsheet;

import java.io.File;
import java.io.IOException;

import com.sun.javafx.scene.layout.region.BorderStyleConverter;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class MergeCellsTest {

	/**
	   * @param args
	   * @throws IOException 
	   * @throws IOException 
	   * @throws WriteException 
	   * @throws BiffException 
	   */
	
	
	  public static void main(String[] args) throws IOException, WriteException {
	    //Creates a writable workbook with the given file name
	    WritableWorkbook workbook = Workbook.createWorkbook(new File("D:\\excelsheetJar\\Mergexlsx.xlsx"));
	    WritableSheet sheet = workbook.createSheet("CompanyXM", 0);
	    
	    // Create cell font and format
	    WritableFont cellFont = new WritableFont(WritableFont.TIMES, 10);
	    //cellFont.setColour(Colour.BLUE);
	    
	    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
	    //cellFormat.setBackground(Colour.ORANGE);
	    cellFormat.setAlignment(Alignment.CENTRE);
	    cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
	    cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
	    cellFormat.setBorder(Border.BOTTOM, BorderLineStyle.MEDIUM);
	    
	    
	    //Merge col[0-3] and row[1]
	    sheet.mergeCells(0, 0, 5, 0);
	    Label lable = new Label(0, 0,"CENTRAL BANK OF NIGERIA", cellFormat);
	    sheet.addCell(lable);
	    
	  
	   
	    sheet.mergeCells(0, 1, 5, 1);
	    lable= new Label(0, 1, "TRADE AND EXCHANGE DEPARTMENT", cellFormat);
	    sheet.addCell(lable);
	    
	   
	    sheet.mergeCells(0,2,5,2);
	    lable = new Label(0, 2, "DAILY RETURNS ON INTERNATIONAL MONEY TRANSFER ON BANK BASIS", cellFormat);
	    sheet.addCell(lable);
	    
	   
	    sheet.mergeCells(0, 3, 5, 3);
	    lable= new Label(0, 3, "IMTO NAME : Xpress Money Services Limited ", cellFormat);
	    sheet.addCell(lable);
	    
	    
	   
	    sheet.mergeCells(0, 4, 5, 4);
	    lable= new Label(0, 4, "DATE : 21.02.2019 ", cellFormat);
	    sheet.addCell(lable);
	    
	   
	    sheet.mergeCells(0, 5, 0, 6);
	    lable= new Label(0, 5, "S/NO", cellFormat);
	    sheet.addCell(lable);
	    
	    
	   
	    sheet.mergeCells(1, 5, 1, 6);
	    lable= new Label(1, 5, "INTERNATIONAL MONEY TRNASFER OPERATOR", cellFormat);
	    sheet.addCell(lable);
	    
	    
	 
	    sheet.mergeCells(2, 5, 4, 5);
	    lable= new Label(2, 5, "INBOUND REMITANCE", cellFormat);
	    sheet.addCell(lable);
	    
	    
	 
	    //sheet.mergeCells(2, 5, 5, 5);
	    lable= new Label(2, 6, "DAYS", cellFormat);
	    sheet.addCell(lable);
	    
	    
	 
	    //sheet.mergeCells(2, 5, 4, 5);
	    lable= new Label(3, 6, "TXNS COUNT", cellFormat);
	    sheet.addCell(lable);
	    
	 
	    //sheet.mergeCells(2, 5, 4, 5);
	    lable= new Label(4, 6, "TXNS VALUES", cellFormat);
	    sheet.addCell(lable);
	    
	    
	   
	   // sheet.mergeCells(2, 5, 4, 5);
	    lable= new Label(5, 5, "REMARKS", cellFormat);
	    sheet.addCell(lable);
	    
	    
	    //Writes out the data held in this workbook in Excel format
	    workbook.write(); 
	    
	    //Close and free allocated memory 
	    workbook.close(); 
	    System.out.println("successfully");
	  }
	
	
}
