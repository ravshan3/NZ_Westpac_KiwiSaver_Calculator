/**
 * @author Ravi Shankar
 * @version 1.0
 * This class contains common functions
 */

package nz_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WebActions {
	
	public static boolean scenarioResultFlag = true;
	public static boolean SearchFlag = false;
	public static String ScenarioName="";
	public static String TestDataIdentifier="";
	public static boolean  isTestCompleted;
	
	public static int TimeOut = 10;
	public static HashMap<String,String> testData=new HashMap<String,String> ();
	
	/*
	 * the below method read the property file
	 */
	
	public static String ReadPropertiesFile(String FileName, String Key) {
		String value = null;
		try {
			File file = new File(FileName);
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);

			fileInput.close();
			value = properties.getProperty(Key);

			System.out.println(Key + ": " + value);
			return value;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void unconditionalWait(int seconds) throws Exception {
		Thread.sleep(seconds * 1000);
	}
	
	/*
	 * the below method read the data from Excel sheet
	 */

	public static HashMap<String, String> getData(String sheetName,
			String rowKeyword) throws Exception {
		HashMap<String, String> inputData = new HashMap<String, String>();

		
		
		FileInputStream file = new FileInputStream(new File("TestData/NZ_Assignment_Testdata.xls"));
		
		// Get the workbook instance for XLS file
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		
		// Get first sheet from the workbook
		HSSFSheet sheet = workbook.getSheet(sheetName);
		System.out.println("SheetNAme:"+sheetName);
		// Get row and column count
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Form Hashmap with column name and value.
		for (int i = 0; i < rowCount; i++) {
			if (sheet.getRow(i).getCell(0).toString().equals(rowKeyword)) {
				for (int k = 0; k < columnCount; k++) {
					System.out.println(sheet.getRow(i).getCell(k).getStringCellValue());
					inputData.put(sheet.getRow(0).getCell(k).toString(), sheet.getRow(i).getCell(k).getStringCellValue());
				}
				break;
			}
		}
		file.close();
		System.out.println("Read complete");
		workbook.close();
		return inputData;	
	}
}
