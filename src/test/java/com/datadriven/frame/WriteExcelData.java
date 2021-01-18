package com.datadriven.frame;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sht = wb.createSheet("Sheet1");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "case no", "email", "password" });
		data.put("2", new Object[] { "101", "abcgmail.com", "123" });
		data.put("3", new Object[] { "102", "defgmail.com", "456" });
		data.put("4", new Object[] { "103", "ghigmail.com", "789" });
		
		Set<String> keysets = data.keySet();
		int rownum = 0;
		for (String key : keysets) {
			Row rw = sht.createRow(rownum++);
			Object[] objects = data.get(key);
			int colnum = 0;
			for (Object ob : objects) {
				Cell cl = rw.createCell(colnum++);
				if (ob instanceof String)
					cl.setCellValue((String) ob);
				if (ob instanceof Integer)
					cl.setCellValue((Integer) ob);
			}
		}

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\PropertyFile\\WriteFile.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("successfully inserted");
	}

}
