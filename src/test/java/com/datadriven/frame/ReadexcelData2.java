package com.datadriven.frame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadexcelData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\PropertyFile\\ReadFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet2");
		Iterator<Row> rowIterator = sht.rowIterator();
		while (rowIterator.hasNext()) {
			Row rw = rowIterator.next();

			Iterator<Cell> cellIterator = rw.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cl = cellIterator.next();
				System.out.println(cl.getStringCellValue());
			}
		}
		fis.close();
	}

}
