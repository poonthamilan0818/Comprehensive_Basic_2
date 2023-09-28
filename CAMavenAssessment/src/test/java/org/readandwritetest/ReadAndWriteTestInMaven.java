package org.readandwritetest;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.utilities.ReadAndWriteData;

public class ReadAndWriteTestInMaven {
	@Test
	private void readDataFromExcel() {
		System.out.println("Read Data From Excel");
		List<Map> data = ReadAndWriteData.ReadValueFromExcelSheet();
		System.out.println(data.toString());
		System.out.println("-------------------------------------------------------------------------");
	}
}
