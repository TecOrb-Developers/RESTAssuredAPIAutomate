package com.api.Utilities;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelReadUtil {

	public static String getDataFromExcelSheet(String sheetName, String id, String columnName) {
		String cellData = null;
		String file = System.getProperty("user.dir")+File.separator+"resourceFile"+File.separator+"TestDataSheet.xlsx";

		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(file);
			String strQuery = "Select * from "+ sheetName +" where ID = '" + id + "'";
			Recordset recordset = connection.executeQuery(strQuery);

			while (recordset.next()) {
				cellData = recordset.getField(columnName);
			}
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		}
		
		return cellData;
	}

}
