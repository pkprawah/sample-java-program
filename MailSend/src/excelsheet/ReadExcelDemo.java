package excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelDemo {
 
	
	public static void main(String[] args) {
		 List<StudentDTO> studentList = new ArrayList<>();
		try
        {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\pawan.kumar\\Documents\\studentRecord.xls"));
            DataFormatter formatter = new DataFormatter();
            Random random = new Random();
 
            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
           
            StudentDTO  student;
            while (rowIterator.hasNext())
            {
            	student = new StudentDTO();
                Row row = rowIterator.next();
                int rownumber=row.getRowNum();
                if(rownumber==0){
                	continue;
                }
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                   // int rowIndex=cell.getRowIndex();
                    int columnIndex = cell.getColumnIndex();
                    System.out.println("columnIndex :: "+ columnIndex);
                    
                    
                    //Check the cell type and format accordingly
                    switch (columnIndex)
                    {
                    	case 0:
                    		String name = formatter.formatCellValue(cell);
                    		student.setName(name);
                    		System.out.println("Name ::::::::"+name);
                            break;
                        case 1:
                        	
                        	String mobileNo = formatter.formatCellValue(cell);
                        	student.setMobileNo(mobileNo);
                        	System.out.println("MobileNo ::::::::"+mobileNo);
                            break;
                        case 2:
                        	String address = formatter.formatCellValue(cell);
                        	student.setAddress(address);
                        	System.out.println("Address ::::::::"+address);
                            break;
                    }
                }
                
                
                int id = random.nextInt(99999) + 17;
                System.out.println("id :::::::::::;"+id);
                student.setStudentId(id);
                studentList.add(student);
                System.out.println("student details :: "+student);
            }
            file.close();
            
           String studentXml= convert2XML(studentList);
           System.out.println("Resultant Value is  :: "+studentXml);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

	}

	private static String convert2XML(List<StudentDTO> studentList) {
		String xmlString=null;
		try{
			JAXBContext jaxbContext;
			Marshaller jaxbMarshaller;
			StringWriter sw = new StringWriter();
			
			for(StudentDTO student:studentList ){
				jaxbContext = JAXBContext.newInstance(StudentDTO.class);
				jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(student, sw);
				xmlString = sw.toString();
			}
			System.out.println("XML values :::::::: "+xmlString);
		}catch(Exception e){
			e.printStackTrace();
		}
		return xmlString;
		
	}

	

}
