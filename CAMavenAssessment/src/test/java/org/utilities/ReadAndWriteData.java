package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteData {
	public static List<Map> ReadValueFromExcelSheet() {
		List<Map> studentList = new ArrayList();
		Map<String, String> m = new LinkedHashMap();
		String property = System.getProperty("user.dir");
		try (FileInputStream fis = new FileInputStream(property + "\\TestData\\TestData.xlsx");
				Workbook workbook = new XSSFWorkbook(fis)) {
			Sheet sheet = workbook.getSheetAt(0);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					if(i == 0)
						continue;
					m.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
				}
				studentList.add(m);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return !studentList.isEmpty() ? studentList : null;
	}
}
