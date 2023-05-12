package Com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

        public class FileLibrary {
	    //public static void main(String[] args) throws IOException {
		
		public String readdatafrompropertyfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		}

		public String readdatafromexcel( String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String value= wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		return value;
		}


}